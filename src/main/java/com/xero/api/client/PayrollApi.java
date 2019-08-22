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
import com.xero.models.payroll.Employee;
import com.xero.models.payroll.TrackingCategories;
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
        
    	Boolean getSuccess = false;
    	while (!getSuccess) {
	    	try {
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
		            getSuccess = true;
		            return r.toString();
		        } catch (IOException ioe) {
		             throw xeroExceptionHandler.convertException(ioe);
		        }
	    	} catch (XeroClientException e) {
	    		System.out.println(e.getMessage());
	    	}
    	}
		return null;
    }

    protected String DATA(String url, String body, Map<String, String> params, String method, String xeroApplicationId, String xeroTenantId, String xeroUserId) throws IOException {
        
    	Boolean getSuccess = false;
    	while (!getSuccess) {
	    	try {
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
		            getSuccess = true;
		            return r.toString();
		        } catch (IOException ioe) {
		             throw xeroExceptionHandler.convertException(ioe);
		        }
	    	} catch (XeroClientException e) {
	    		System.out.println(e.getMessage());
	    	}
    	}
		return null;
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
    
    // GET INDIVIDUAL OBJECTS
    
    /**
     * Allows you to retrieve details of an employer pension in a Xero organisation
     * <p><b>200</b> - Success - return response of type Benefit
     * @param benefitID - Unique identifier for an Benefit
     * @return Benefit
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Benefit getBenefit(UUID benefitID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/benefits/{employerPensionID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/benefits/{employerPensionID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 
    		
    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("employerPensionID", benefitID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		return pr.getBenefit();                  

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve details of a payroll employee in a Xero organisation
     * <p><b>200</b> - Success - return response of type Employee
     * @param employeeID - Unique identifier for an Employee
     * @return Employee
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Employee getEmployee(UUID employeeID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees/{EmployeeID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{EmployeeID}";
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
    		
    		return pr.getEmployee();           

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve tax in Payroll for an employee in a Xero organisation
     * <p><b>200</b> - Success - return response of type EmployeeTax for specific Employee
     * @param employeeID - Unique identifier for an Employee
     * @return EmployeeTax
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public EmployeeTax getEmployeeTax(UUID employeeID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees/{EmployeeID}/tax";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{EmployeeID}/tax";
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

    		return pr.getEmployeeTax();          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to get current employee opening balances in Payroll
     * <p><b>200</b> - Success - return response of type OpeningBalances
     * @param employeeID - Unique identifier for an Employee
     * @return OpeningBalances
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public OpeningBalances getEmployeeOpeningBalances(UUID employeeID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees/{EmployeeID}/ukopeningbalances";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{EmployeeID}/ukopeningbalances";
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

    		return pr.getOpeningBalances();    
    		
    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve a leave in Payroll for an employee in a Xero organisation
     * <p><b>200</b> - Success - return response of type Leave
     * @param employeeID - Unique identifier for an Employee
     * @param leaveID - Unique identifier for a Leave
     * @return Leave
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Leave getEmployeeLeaveByID(UUID employeeID, UUID leaveID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees/{EmployeeID}/leave/{LeaveID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{EmployeeID}/leave/{LeaveID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("EmployeeID", employeeID.toString());
    		uriVariables.put("LeaveID", leaveID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");
    		
    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		Leave lv = new Leave();
    		if(pr.getLeave() != null && pr.getLeave().size() > 0) {
    			lv = pr.getLeave().get(0);
    		}

    		return lv;    
    		
    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve a leave in Payroll for an employee in a Xero organisation
     * <p><b>200</b> - Success - return response of type LeaveBalance
     * @param employeeID - Unique identifier for an Employee
     * @param leaveType - The type of statutory leave
     * @param asOfDate - Optional. The date from which to calculate balance remaining in form yyyy-MM-dd
     * @return LeaveBalance
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public LeaveBalance getEmployeeStatutoryLeaveBalance(UUID employeeID, String leaveType, String asOfDate) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		
    		String correctPath = "/employees/{EmployeeID}/statutoryleaveBalance";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{EmployeeID}/statutoryleaveBalance";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 
    		
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("EmployeeID", employeeID.toString());
    		
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
            String url = uriBuilder.build().toString();
            
            params = new HashMap<>();
            if (leaveType != null) {
                addToMapIfNotNull(params, "leaveType", leaveType);
            }if (asOfDate != null) {
                addToMapIfNotNull(params, "asOfDate", asOfDate);
            }

    		String response = this.DATA(url, strBody, params, "GET");
    		
    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);

    		return pr.getLeaveBalance();    
    		
    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve a statutory sick leave for a specified employee in Payroll
     * <p><b>200</b> - Success - return response of type StatutorySickLeave
     * @param statutorySickLeaveID - Unique identifier for the Statutory Sick Leave
     * @return StatutorySickLeave
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public StatutorySickLeave getEmployeeStatutorySickLeave(UUID statutorySickLeaveID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		
    		String correctPath = "/statutoryleaves/sick/{StatutorySickLeaveID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/statutoryleaves/sick/{StatutorySickLeaveID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 
    		
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("StatutorySickLeaveID", statutorySickLeaveID.toString());
    		
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
            String url = uriBuilder.build().toString();

    		String response = this.DATA(url, strBody, params, "GET");
    		
    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);

    		return pr.getStatutorySickLeave();    
    		
    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve the collection of pay templates in Payroll for an employee in a Xero organisation
     * <p><b>200</b> - Success - return response of type PayTemplate
     * @param employeeID - Unique identifier for an Employee
     * @return PayTemplate
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public PayTemplate getEmployeePayTemplate(UUID employeeID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees/{EmployeeID}/paytemplates";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{EmployeeID}/paytemplates";
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
    		
    		PayTemplate pt = new PayTemplate();
    		pt.setEmployeeID(pr.getEmployeeID());
    		pt.setEarningTemplates(pr.getEarningTemplates());
    		pt.setDeductionTemplates(pr.getDeductionTemplates());
    		pt.setBenefitTemplates(pr.getBenefitTemplates());
    		pt.setReimbursementTemplates(pr.getReimbursementTemplates());
    		
    		return pt;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(), JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve details of a deduction in a Xero organisation
     * <p><b>200</b> - Success - return response of type Deduction
     * @param deductionID - Unique identifier for a Deduction
     * @return Deduction
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Deduction getDeduction(UUID deductionID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/deductions/{deductionID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/deductions/{deductionID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("deductionID", deductionID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		return pr.getDeduction();          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(), JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve details of an earnings order (statutory deduction) in a Xero organisation
     * <p><b>200</b> - Success - return response of type StatutoryDeduction
     * @param earningsOrderID - Unique identifier for a EarningOrder
     * @return StatutoryDeduction
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public StatutoryDeduction getEarningOrder(UUID earningsOrderID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/earningsorder/{EarningsOrderID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/earningsorder/{EarningsOrderID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("EarningsOrderID", earningsOrderID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		return pr.getStatutoryDeduction();          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(), JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve details of an earning rate in a Xero organisation
     * <p><b>200</b> - Success - return response of type EarningsRate
     * @param earningsRateID - Unique identifier for a EarningsRate
     * @return EarningsRate
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public EarningsRate getEarningRate(UUID earningsRateID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/earningsRates/{EarningsRateID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/earningsRates/{EarningsRateID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("EarningsRateID", earningsRateID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		return pr.getEarningsRate();        

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(), JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve details of a leave type in a Xero organisation 
     * <p><b>200</b> - Success - return response of type LeaveType
     * @param leavetypeID - Unique identifier for a LeaveType
     * @return LeaveType
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public LeaveType getLeaveType(UUID leavetypeID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/leaveTypes/{leavetypeID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/leaveTypes/{leavetypeID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("leavetypeID", leavetypeID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		return pr.getLeaveType();      

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(), JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve details of a reimbursement in a Xero organisation 
     * <p><b>200</b> - Success - return response of type Reimbursement
     * @param reimbursementID - Unique identifier for a Reimbursement
     * @return Reimbursement
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Reimbursement getReimbursement(UUID reimbursementID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/reimbursements/{ReimbursementID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/reimbursements/{ReimbursementID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("ReimbursementID", reimbursementID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		return pr.getReimbursement();      

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(), JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve a Payroll Timesheet in a Xero organisation using timesheet identifier
     * <p><b>200</b> - Success - return response of type Timesheet
     * @param timesheetID - Unique identifier for a Timesheet
     * @return Timesheet
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Timesheet getTimesheet(UUID timesheetID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/Timesheet/{TimesheetID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/Timesheet/{TimesheetID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("TimesheetID", timesheetID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		return pr.getTimesheet();      

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(), JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve payment method for a payroll employee
     * <p><b>200</b> - Success - return response of type PaymentMethod
     * @param employeeID - Unique identifier for an employee
     * @return PaymentMethod
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public PaymentMethod getPaymentMethod(UUID employeeID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees/{employeeID}/paymentMethods";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{employeeID}/paymentMethods";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("employeeID", employeeID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		return pr.getPaymentMethod();      

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(), JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve details of a pay run calendar in a Xero organisation
     * <p><b>200</b> - Success - return response of type PayRunCalendar
     * @param payruncalendarID Unique identifier for a PayRunCalendar
     * @return PayRunCalendar
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public PayRunCalendar getPayRunCalendar(UUID payruncalendarID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/payRunCalendars/{payruncalendarID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/payRunCalendars/{payruncalendarID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase()))
    		{
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("payruncalendarID", payruncalendarID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);

    		return pr.getPayRunCalendar();          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve detailed information of a salary and wages record for an employee by its unique identifier
     * <p><b>200</b> - Success - return response of type SalaryAndWage
     * @param employeeID - Unique identifier for an Employee
     * @param salaryandwagesID - Unique identifier for a SalaryAndWage
     * @return SalaryAndWage
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public SalaryAndWage getSalaryAndWageByID(UUID employeeID, UUID salaryandwagesID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees/{EmployeeID}/salaryAndWages/{salaryandwagesID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{EmployeeID}/salaryAndWages/{salaryandwagesID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase()))
    		{
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("EmployeeID", employeeID.toString());
    		uriVariables.put("salaryandwagesID", salaryandwagesID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		SalaryAndWage sw = new SalaryAndWage();
    		if(pr.getSalaryAndWages() != null && pr.getSalaryAndWages().size() > 0) {
    			sw = pr.getSalaryAndWages().get(0);
    		}

    		return sw;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve details of a pay run in a Xero organisation
     * <p><b>200</b> - Success - return response of type PayRun
     * @param payRunID - Unique identifier for a PayRun
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
      * Allows you to retrieve a specific PaySlip in a Xero organisation
      * <p><b>200</b> - Success - return response of type PaySlip
      * @param paySlipID - Unique identifier for a PaySlip
      * @return PaySlip
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
     
    
	// GET ARRAY OBJECTS
    
    /**
     * Allows you to retrieve all the employer pensions in Payroll for a Xero organisation
     * <p><b>200</b> - Success - return response of type Benefits array with 0 to N Benefit
     * @param page - Up to 100 benefits will be returned in a single API call.
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
     * Allows you to retrieve payroll employees in a Xero organisation 
     * <p><b>200</b> - Success - return response of type Employees array with 0 to N Employee
     * @param page - Up to 100 employees will be returned in a single API call.
     * @param firstName - string for employee first name
     * @param lastName - string for employee last name
     * @return Employees
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Employees getEmployees(Integer page, String firstName, String lastName) throws IOException {
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
    		
    		if (firstName != null && lastName != null) {
    			String filter = "firstName==" + firstName + ",lastName==" + lastName + "";
                addToMapIfNotNull(params, "filter", filter);
            } else if (firstName != null) {
            	String filter = "firstName==" + firstName + "";
                addToMapIfNotNull(params, "filter", filter);
            } else if (lastName != null) {
            	String filter = "lastName==" + lastName + "";
                addToMapIfNotNull(params, "filter", filter);
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
     * Allows you to retrieve all the leaves in Payroll for an employee in a Xero organisation
     * <p><b>200</b> - Success - return response of type Leaves array with all Leaves for specific Employee
     * @param employeeID - Unique identifier for an Employee
     * @return Leaves
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Leaves getEmployeeLeave(UUID employeeID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees/{EmployeeID}/leave";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{EmployeeID}/leave";
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
    		
    		Leaves ls = new Leaves();
    		ls.setLeaves(pr.getLeave());
    		
    		return ls;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve leave balances in Payroll for an employee in a Xero organisation
     * <p><b>200</b> - Success - return response of type LeaveBalances array with all LeaveBalance for specific Employee
     * @param employeeID - Unique identifier for an Employee
     * @return LeaveBalances
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public LeaveBalances getEmployeeLeaveBalances(UUID employeeID) throws IOException {
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
     * Allows you to retrieve a summary of all or only active statutory leaves for a specified employee in Payroll
     * <p><b>200</b> - Success - return response of type StatutoryLeaves array with all StatutoryLeave for specific Employee
     * @param employeeID - Unique identifier for an Employee
     * @param activeOnly - Optional. Filter response with leaves that are currently active or yet to be taken
     * @return StatutoryLeaves
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public StatutoryLeaves getEmployeeStatutoryLeavesSummary(UUID employeeID, Boolean activeOnly) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/statutoryleaves/summary/{EmployeeID}";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/statutoryleaves/summary/{EmployeeID}";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("EmployeeID", employeeID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();
    		
    		params = new HashMap<>();
    		if (activeOnly != null) {
    			addToMapIfNotNull(params, "activeOnly", activeOnly);
    		}

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		StatutoryLeaves sl = new StatutoryLeaves();
    		sl.setStatutoryLeaves(pr.getStatutoryLeaves());
    		
    		return sl;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(), JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve the leave periods for a specified employee in a Xero organisation given a start and end date
     * <p><b>200</b> - Success - return response of type LeavePeriods array with all LeavePeriod for specific Employee
     * @param employeeID - Unique identifier for an Employee
     * @param startDate - Start date of the leave in form YYYY-MM-DD
     * @param endDate - End date of the leave in form YYYY-MM-DD
     * @return LeavePeriods
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public LeavePeriods getEmployeeLeavePeriods(UUID employeeID, String startDate, String endDate) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees/{EmployeeID}/leavePeriods";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{EmployeeID}/leavePeriods";
    		String type = "/pdf";
    		if(path.toLowerCase().contains(type.toLowerCase())) {
    			correctPath = path.replace("/pdf","");
    		} 

    		// create a map of path variables
    		final Map<String, String> uriVariables = new HashMap<String, String>();
    		uriVariables.put("EmployeeID", employeeID.toString());
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.buildFromMap(uriVariables).toString();
    		
    		params = new HashMap<>();
    		if (startDate != null) {
    			addToMapIfNotNull(params, "startDate", startDate);
    		}if (endDate != null) {
    			addToMapIfNotNull(params, "endDate", endDate);
    		}

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		LeavePeriods lp = new LeavePeriods();
    		lp.setLeavePeriods(pr.getLeavePeriods());
    		
    		return lp;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(), JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve assigned leave types in Payroll for an employee in a Xero organisation
     * <p><b>200</b> - Success - return response of type LeaveTypes array with all LeaveType for specific Employee
     * @param employeeID - Unique identifier for an Employee
     * @return LeaveTypes
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public LeaveTypes getEmployeeLeaveTypes(UUID employeeID) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/employees/{EmployeeID}/leaveTypes";
    		// Hacky path manipulation to support different return types from same endpoint
    		String path = "/employees/{EmployeeID}/leaveTypes";
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
    		
    		LeaveTypes lt = new LeaveTypes();
    		lt.setLeaveTypes(pr.getLeaveTypes());
    		
    		return lt;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(), JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
	  
    /**
     * Allows you to retrieve deductions in a Xero organisation
     * <p><b>200</b> - Success - return response of type Deductions array with 0 to N Deduction
     * @param page - Up to 100 deductions will be returned in a single API call.
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
     * Allows you to retrieve all the earnings orders (statutory deductions) in Payroll for a Xero organisation
     * <p><b>200</b> - Success - return response of type StatutoryDeductions array with 0 to N StatutoryDeduction
     * @param page - Up to 100 StatutoryDeductions will be returned in a single API call.
     * @return StatutoryDeductions
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public StatutoryDeductions getEarningsOrders(Integer page) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/earningsOrders";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.build().toString();
    		params = new HashMap<>();
    		if (page != null) {
    			addToMapIfNotNull(params, "page", page);
    		}

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		StatutoryDeductions sd = new StatutoryDeductions();
    		sd.setStatutoryDeductions(pr.getStatutoryDeductions());
    		
    		return sd;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }

    /**
     * Allows you to retrieve payroll earning rates in a Xero organisation
     * <p><b>200</b> - Success - return response of type EarningsRates array with 0 to N EarningsRate
     * @param page - Up to 100 earningsRates will be returned in a single API call.
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
     * Allows you to retrieve payroll leave types in a Xero organisation
     * <p><b>200</b> - Success - return response of type LeaveTypes array with all LeaveType
     * @param page - Up to 100 leave types will be returned in a single API call.
     * @param activeOnly - It filters leave types by active status.
     * @return LeaveTypes
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public LeaveTypes getLeaveTypes(Integer page, Boolean activeOnly) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/leaveTypes";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.build().toString();
    		params = new HashMap<>();
    		if (page != null) {
    			addToMapIfNotNull(params, "page", page);
    		}if (activeOnly != null) {
    			addToMapIfNotNull(params, "activeOnly", activeOnly);
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
     * Allows you to retrieve payroll all reimbursements in a Xero organisation 
     * <p><b>200</b> - Success - return response of type Reimbursements array with all Reimbursements
     * @param page - Up to 100 reimbursements will be returned in a single API call.
     * @return Reimbursements
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Reimbursements getReimbursements(Integer page) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/reimbursements";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.build().toString();
    		params = new HashMap<>();
    		if (page != null) {
    			addToMapIfNotNull(params, "page", page);
    		}

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		Reimbursements r = new Reimbursements();
    		r.setReimbursements(pr.getReimbursements());
    		
    		return r;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve payroll all reimbursements in a Xero organisation 
     * <p><b>200</b> - Success - return response of type Timesheets array with all Timesheets
     * @param page - Up to 100 timesheets will be returned in a single API call.
     * @param employeeId - gets only the timesheets of a particular employee
     * @param payrollCalendarId - filters the timesheets by payroll calendar id
     * @return Timesheets
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public Timesheets getTimesheets(Integer page, UUID employeeId, UUID payrollCalendarId) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/timesheets";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
    		String url = uriBuilder.build().toString();
    		params = new HashMap<>();
    		if (page != null) {
    			addToMapIfNotNull(params, "page", page);
    		}if (employeeId != null) {
    			addToMapIfNotNull(params, "employeeId", employeeId);
    		}if (payrollCalendarId != null) {
    			addToMapIfNotNull(params, "payrollCalendarId", payrollCalendarId);
    		}

    		String response = this.DATA(url, strBody, params, "GET");

    		PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);
    		
    		Timesheets ts = new Timesheets();
    		ts.setTimesheets(pr.getTimesheets());
    		
    		return ts;          

    	} catch (IOException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage());
    	} catch (XeroApiException e) {
    		throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
    	}
    }
    
    /**
     * Allows you to retrieve all Pay Run Calendars
     * <p><b>200</b> - Success - return response of type PayRunCalendars array with all PayRunCalendar
     * @param page - Up to 100 Pay Run Calendars will be returned in a single API call.
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
     * Allows you to retrieve SalaryAndWages for an employee
     * <p><b>200</b> - Success - return response of type SalaryAndWages array with a unique SalaryAndWage
     * @param employeeID - Unique identifier for an employee
     * @param page - Up to 100 Salary And Wages will be returned in a single API call.
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
    
    /**
     * Allows you to retrieve all PayRuns
     * <p><b>200</b> - Success - return response of type PayRuns array with all PayRun
     * @param page - Up to 100 PayRuns will be returned in a single API call.
     * @param status - filter the payruns by status
     * @return PayRuns
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
    public PayRuns getPayRuns(Integer page, String status) throws IOException {
    	try {
    		String strBody = null;
    		Map<String, String> params = null;
    		String correctPath = "/payRuns";
    		UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
            String url = uriBuilder.build().toString();
            
            params = new HashMap<>();
            if (page != null) {
                addToMapIfNotNull(params, "page", page);
            }if (status != null) {
                addToMapIfNotNull(params, "status", status);
            }

    		String response = this.DATA(url, strBody, params, "GET");
    		
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
      * Allows you to retrieve detailed information for payslips in the payrun
      * <p><b>200</b> - Success - return response of type PaySlips array
      * @param payrunId - PayrunID which specifies the containing payrun of payslips to retrieve
      * @param page - Up to 100 PaySlips will be returned in a single API call
      * @return PaySlips
      * @throws IOException if an error occurs while attempting to invoke the API
      **/
    public PaySlips getPaySlipsByPayrunID(String payrunId, Integer page) throws IOException {
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
      * Allows you to get Account Settings information from a Xero organisation 
      * <p><b>200</b> - Success - return response of type Settings
      * @return Settings
      * @throws IOException if an error occurs while attempting to invoke the API
      **/
    public Settings getSettings() throws IOException {
		try {
			String strBody = null;
			Map<String, String> params = null;
			String correctPath = "/Settings";
			UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
			String url = uriBuilder.build().toString();

			String response = this.DATA(url, strBody, params, "GET");

			PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);

			Settings s = new Settings();
			s.setAccounts(pr.getSettings().getAccounts());

			return s;

		} catch (IOException e) {
			throw xeroExceptionHandler.handleBadRequest(e.getMessage());
		} catch (XeroApiException e) {
			throw xeroExceptionHandler.handleBadRequest(e.getMessage(), e.getResponseCode(),JSONUtils.isJSONValid(e.getMessage()));
		}
    }
    
    /**
     * Allows you to get a tracking categories information from a Xero organisation 
     * <p><b>200</b> - Success - return response of type TrackingCategories
     * @return TrackingCategories
     * @throws IOException if an error occurs while attempting to invoke the API
     **/
   public TrackingCategories getTrackingCategories() throws IOException {
		try {
			String strBody = null;
			Map<String, String> params = null;
			String correctPath = "/settings/trackingCategories";
			UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + correctPath);
			String url = uriBuilder.build().toString();

			String response = this.DATA(url, strBody, params, "GET");

			PayrollResponse pr = gson.fromJson(response, PayrollResponse.class);

			return pr.getTrackingCategories();

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

