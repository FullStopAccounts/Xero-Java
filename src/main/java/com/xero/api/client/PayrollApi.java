package com.xero.api.client;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.OffsetDateTime;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xero.api.exception.XeroExceptionHandler;
import com.xero.model.*;
import com.xero.models.payroll.*;
import com.xero.api.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ws.rs.core.UriBuilder;

public class PayrollApi {
    private ApiClient apiClient;
    private XeroExceptionHandler xeroExceptionHandler;
    private Config config;
    private SignerFactory signerFactory;
    private String token = null;
    private String tokenSecret = null;
    final static Logger logger = LogManager.getLogger(XeroClient.class);
    protected static final DateFormat utcFormatter;
    private static Gson gson = new GsonBuilder()
			.setPrettyPrinting()
			.serializeNulls()
			.registerTypeAdapter(LocalDateTime.class, new CustomLocalDateTimeDeserializer())
			.registerTypeAdapter(LocalDate.class, new CustomLocalDateDeserializer())
			.create();

    static {
        utcFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    protected static final Pattern MESSAGE_PATTERN = Pattern.compile("<Message>(.*)</Message>");
    protected final ObjectFactory objFactory = new ObjectFactory();

    
    public PayrollApi(Config config) {
        this(config, new ConfigBasedSignerFactory(config));
        this.xeroExceptionHandler = new XeroExceptionHandler();
    }

    public PayrollApi(Config config, SignerFactory signerFactory) {
        this.config = config;
        this.signerFactory = signerFactory;
        this.xeroExceptionHandler = new XeroExceptionHandler();
    }

    public PayrollApi(ApiClient apiClient) {
        this(JsonConfig.getInstance());
        this.xeroExceptionHandler = new XeroExceptionHandler();
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setOAuthToken(String token, String tokenSecret) {
        this.token = token;
        this.tokenSecret = tokenSecret;
    }
    
    protected String DATA(String url, String body, Map<String, String> params, String method) throws IOException {
        return this.DATA(url,body,params,method,null, "application/json");
    }

    protected String DATA(String url, String body, Map<String, String> params, String method, OffsetDateTime ifModifiedSince) throws IOException {
        return this.DATA(url,body,params,method,ifModifiedSince,"application/json");
    }

    protected String DATA(String url, String body, Map<String, String> params, String method, String contentType) throws IOException {
        return this.DATA(url,body,params,method,null,contentType);
    }

    protected String DATA(String url, String body, Map<String, String> params, String method, OffsetDateTime ifModifiedSince, String contentType) throws IOException {
        
        OAuthRequestResource req = new OAuthRequestResource(
            config, 
            signerFactory, 
            url, 
            method, 
            body, 
            params,
            contentType,
            "application/json");
        
        req.setToken(token);
        req.setTokenSecret(tokenSecret);
        
        if (ifModifiedSince != null) {
            req.setIfModifiedSince(ifModifiedSince);
        }

        try {
            Map<String, String>  resp = req.execute();
            Object r = resp.get("content");
            return r.toString();
        } catch (IOException ioe) {
             throw xeroExceptionHandler.convertException(ioe);
        }
    }

    protected String DATA(String url, String body, Map<String, String> params, String method, String xeroApplicationId, String xeroTenantId, String xeroUserId) throws IOException {
        
        OAuthRequestResource req = new OAuthRequestResource(
            config, 
            signerFactory, 
            url, 
            method, 
            body, 
            params,
            null,
            "application/json");
        
        req.setToken(token);
        req.setTokenSecret(tokenSecret);
        
        //if (ifModifiedSince != null) {
        //    req.setIfModifiedSince(ifModifiedSince);
        //}

        try {
            Map<String, String>  resp = req.execute();
            Object r = resp.get("content");
            return r.toString();
        } catch (IOException ioe) {
             throw xeroExceptionHandler.convertException(ioe);
        }
    }

   
    protected ByteArrayInputStream FILE(String url, String body, Map<String, String> params, String method) throws IOException {
       return this.FILE(url,body,params,method,"application/octet-stream");
    }

    protected ByteArrayInputStream FILE(String url, String body, Map<String, String> params, String method, String accept) throws IOException {
        
        OAuthRequestResource req = new OAuthRequestResource(
            config, 
            signerFactory, 
            url, 
            method, 
            body, 
            params,
            accept,
            "application/json");
        
        req.setToken(token);
        req.setTokenSecret(tokenSecret);
        
        try {
            ByteArrayInputStream resp = req.executefile();
            return resp;
        } catch (IOException ioe) {
             throw xeroExceptionHandler.convertException(ioe);
        }
    }

    protected String FILE(String url, String body, Map<String, String> params, String method, byte[] byteBody) throws IOException {
        return this.FILE(url,body,params,method,byteBody,"application/octet-stream");
    }
    
    protected String FILE(String url, String body, Map<String, String> params, String method, byte[] byteBody, String contentType) throws IOException {
        
        OAuthRequestResource req = new OAuthRequestResource(
            config, 
            signerFactory, 
            url, 
            method,
            contentType,
            byteBody, 
            params,
            "application/json");
        
        req.setToken(token);
        req.setTokenSecret(tokenSecret);
       
        try {
            Map<String, String>  resp = req.execute();
            Object r = resp.get("content");
            return r.toString();
        } catch (IOException ioe) {
             throw xeroExceptionHandler.convertException(ioe);
        }
    }
	 
    /**
     * Allows you to retrieve benefits in a Xero organisation
     * <p><b>200</b> - Success - return response of type Benefits array with 0 to N Benefit
     * @param page e.g. page&#x3D;1 - Up to 100 benefits will be returned in a single API call.
     * @return Benefits
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Benefits getBenefits(Integer page) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/benefits";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.build().toString();
    		params = new HashMap<>();
    		if (page != null) {
    			addToMapIfNotNull(params, "page", page);
    		}

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		Benefits be = new Benefits();
    		be.setBenefits(pr.getBenefits());
    		
    		return be;             

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
	  
    /**
     * Allows you to retrieve deductions in a Xero organisation
     * <p><b>200</b> - Success - return response of type Deductions array with 0 to N Deduction
     * @param page e.g. page&#x3D;1 - Up to 100 deductions will be returned in a single API call.
     * @return Deductions
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Deductions getDeductions(Integer page) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/deductions";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.build().toString();
    		params = new HashMap<>();
    		if (page != null) {
    			addToMapIfNotNull(params, "page", page);
    		}

    		String response = this.DATA(url, strBody, params, "GET");

            PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
            Deductions de = new Deductions();
    		de.setDeductions(pr.getDeductions());
    		
    		return de;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }

    /**
     * Allows you to retrieve earningsRates in a Xero organisation
     * <p><b>200</b> - Success - return response of type EarningsRates array with 0 to N EarningsRate
     * @param page e.g. page&#x3D;1 - Up to 100 earningsRates will be returned in a single API call.
     * @return EarningsRates
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public EarningsRates getEarningsRates(Integer page) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/earningsRates";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.build().toString();
    		params = new HashMap<>();
    		if (page != null) {
    			addToMapIfNotNull(params, "page", page);
    		}

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		EarningsRates er = new EarningsRates();
    		er.setEarningsRates(pr.getEarningsRates());
    		
    		return er;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve employees in a Xero organisation
     * <p><b>200</b> - Success - return response of type Employees array with 0 to N Employee
     * @param page e.g. page&#x3D;1 - Up to 100 employees will be returned in a single API call.
     * @return Employees
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Employees getEmployees(Integer page) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.build().toString();
    		params = new HashMap<>();
    		if (page != null) {
    			addToMapIfNotNull(params, "page", page);
    		}

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		Employees emp = new Employees();
    		emp.setEmployees(pr.getEmployees());
    		
    		return emp;           

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }

    /**
     * Allows you to retrieve Leave Balances for an employee
     * <p><b>200</b> - Success - return response of type LeaveBalances array with all LeaveBalance for specific Employee
     * @param employeeID Unique identifier for an Employee
     * @return LeaveBalances
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public LeaveBalances getLeaveBalances(UUID employeeID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees/{EmployeeID}/leaveBalances";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{EmployeeID}/leaveBalances";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("EmployeeID", employeeID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		LeaveBalances lb = new LeaveBalances();
    		lb.setLeaveBalances(pr.getLeaveBalances());
    		
    		return lb;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }

    /**
     * Allows you to retrieve all Leave Types
     * <p><b>200</b> - Success - return response of type LeaveTypes array with all LeaveType
     * @param page e.g. page&#x3D;1 - Up to 100 leave types will be returned in a single API call.
     * @return LeaveTypes
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public LeaveTypes getLeaveTypes(Integer page) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/leaveTypes";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.build().toString();
    		params = new HashMap<>();
    		if (page != null) {
    			addToMapIfNotNull(params, "page", page);
    		}

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		LeaveTypes lt = new LeaveTypes();
    		lt.setLeaveTypes(pr.getLeaveTypes());
    		
    		return lt;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve PayRun in a Xero organisation
     * <p><b>200</b> - Success - return response of type PayRun
     * @param payRunID Unique identifier for a PayRun
     * @return PayRun
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
     public PayRun getPayRun(UUID payRunID) throws IOException {
         try {
             String strBody = null;
             Map<String, String> params = null;
             String correctPath = "/payRuns/{PayRunID}";
             // Hacky path manipulation to support different return types from same endpoint
             String path = "/payRuns/{PayRunID}";
             String type = "/pdf";
             if(path.toLowerCase().contains(type.toLowerCase()))
             {
                 correctPath = path.replace("/pdf","");
             } 

             // create a map of path variables
             final Map<String, String> uriVariables = new HashMap<String, String>();
             uriVariables.put("PayRunID", payRunID.toString());
             UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
             String url = uriBuilder.buildFromMap(uriVariables).toString();

             
             String response = this.DATA(url, strBody, params, "GET");
             
             PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);

     		 return pr.getPayRun();          

         } catch (IOException e) {
             throw xeroExceptionHandler.handleBadRequest(e.getMessage());
         } catch (XeroApiException e) {
             throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
         }
     }
    
    /**
     * Allows you to retrieve all PayRuns
     * <p><b>200</b> - Success - return response of type PayRuns array with all PayRun
     * @param ifModifiedSince Only records created or modified since this timestamp will be returned
     * @param where Filter by an any element
     * @param order Order by an any element
     * @param page e.g. page&#x3D;1 - Up to 100 PayRuns will be returned in a single API call.
     * @return PayRuns
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public PayRuns getPayRuns(OffsetDateTime ifModifiedSince, String where, String order, Integer page) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/payRuns";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
            String url = uriBuilder.build().toString();
            
            params = new HashMap<>();
            if (where != null) {
                addToMapIfNotNull(params, "where", where);
            }if (order != null) {
                addToMapIfNotNull(params, "order", order);
            }if (page != null) {
                addToMapIfNotNull(params, "page", page);
            }

    		String response = this.DATA(url, strBody, params, "GET", ifModifiedSince);
    		
    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		PayRuns prs = new PayRuns();
    		prs.setPayRuns(pr.getPayRuns());
    		
    		return prs;           

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }

    /**
     * Allows you to retrieve all Pay Run Calendars
     * <p><b>200</b> - Success - return response of type PayRunCalendars array with all PayRunCalendar
     * @param page e.g. page&#x3D;1 - Up to 100 Pay Run Calendars will be returned in a single API call.
     * @return PayRunCalendars
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public PayRunCalendars getPayRunCalendars(Integer page) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/payRunCalendars";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.build().toString();
    		params = new HashMap<>();
    		if (page != null) {
    			addToMapIfNotNull(params, "page", page);
    		}

    		String response = this.DATA(url, strBody, params, "GET");
    		
    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		PayRunCalendars prcs = new PayRunCalendars();
    		prcs.setPayRunCalendars(pr.getPayRunCalendars());

    		return prcs;
    		
    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
	
    /**
     * Allows you to retrieve PaySlips in a Xero organisation
     * <p><b>200</b> - Success - return response of type PaySlips array with a unique PaySlip
     * @param paySlipID Unique identifier for a PaySlip
     * @return PaySlips
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
     public PaySlip getPaySlip(UUID paySlipID) throws IOException {
         try {
             String strBody = null;
             Map<String, String> params = null;
             String correctPath = "/paySlips/{PaySlipID}";
             // Hacky path manipulation to support different return types from same endpoint
             String path = "/paySlips/{PaySlipID}";
             String type = "/pdf";
             if(path.toLowerCase().contains(type.toLowerCase())) {
                 correctPath = path.replace("/pdf","");
             } 

             // create a map of path variables
             final Map<String, String> uriVariables = new HashMap<String, String>();
             uriVariables.put("PaySlipID", paySlipID.toString());
             UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
             String url = uriBuilder.buildFromMap(uriVariables).toString();

             String response = this.DATA(url, strBody, params, "GET");

             PayrollResponse pr = gson.fromJson(response, PayrollResponse.class); 
     		
     		 return pr.getPaySlip();                    

         } catch (IOException e) {
             throw xeroExceptionHandler.handleBadRequest(e.getMessage());
         } catch (XeroApiException e) {
             throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
         }
     }
     
     
     /**
      * Allows you to retrieve detailed information for payslips in the payrun
      * <p><b>200</b> - Success - return response of type PaySlips array
      * @param payrunId Filter by
      * @return PaySlips
      * @throws IOException if an error occurs while attempting to invoke the API
      **/
      public PaySlips getPaySlips(String payrunId) throws IOException {
          try {
              String strBody = null;
              Map<String, String> params = null;
              String correctPath = "/paySlips";
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
              String url = uriBuilder.build().toString();
              params = new HashMap<>();
              if (payrunId != null) {
                  addToMapIfNotNull(params, "payrunId", payrunId);
              }

              String response = this.DATA(url, strBody, params, "GET");

              PayrollResponse pr = gson.fromJson(response, PayrollResponse.class); 
              
              PaySlips ps = new PaySlips();
      		  ps.setPaySlips(pr.getPaySlips());
      		
      		  return ps;                    

          } catch (IOException e) {
              throw xeroExceptionHandler.handleBadRequest(e.getMessage());
          } catch (XeroApiException e) {
              throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
          }
      }
     
      
     /**
      * Allows you to retrieve SalaryAndWages for an employee
      * <p><b>200</b> - Success - return response of type SalaryAndWages array with a unique SalaryAndWage
      * @param employeeID Unique identifier for an employee
      * @param page e.g. page&#x3D;1 - Up to 100 Salary And Wages will be returned in a single API call.
      * @return SalaryAndWages
      * @throws IOException if an error occurs while attempting to invoke the API
      **/
      public SalaryAndWages getSalaryAndWages(UUID employeeID, Integer page) throws IOException {
          try {
              String strBody = null;
              Map<String, String> params = null;
              String correctPath = "/employees/{EmployeeID}/salaryAndWages";
              // Hacky path manipulation to support different return types from same endpoint
              String path = "/employees/{EmployeeID}/salaryAndWages";
              String type = "/pdf";
              if(path.toLowerCase().contains(type.toLowerCase())) {
                  correctPath = path.replace("/pdf","");
              } 
              params = new HashMap<>();
              if (page != null) {
                  addToMapIfNotNull(params, "page", page);
              }

              // create a map of path variables
              final Map<String, String> uriVariables = new HashMap<String, String>();
              uriVariables.put("EmployeeID", employeeID.toString());
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
              String url = uriBuilder.buildFromMap(uriVariables).toString();

              String response = this.DATA(url, strBody, params, "GET");

              PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
       		
      		  SalaryAndWages sw = new SalaryAndWages();
      		  sw.setSalaryAndWages(pr.getSalaryAndWages());
      		
      		  return sw;          

          } catch (IOException e) {
              throw xeroExceptionHandler.handleBadRequest(e.getMessage());
          } catch (XeroApiException e) {
              throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
          }
      }

    protected void addToMapIfNotNull(Map<String, String> map, String key, Object value) {
        if (value != null) {
            map.put(key, value.toString());
        }
    }
    
    protected String correctJson(String content) {
    	Pattern pattern = Pattern.compile("\"[a-zA-Z]+\":");
    	Matcher matcher = pattern.matcher(content);

    	while (matcher.find()) {
    		System.out.println("start : " + matcher.start() + " end : " + matcher.end() + " group : " + matcher.group());
    	    content = content.substring(0, matcher.start() + 1) + content.substring(matcher.start() + 1, matcher.start() + 2).toUpperCase() + content.substring(matcher.start() + 2);
    	}
    	
    	return content;
    }

}

