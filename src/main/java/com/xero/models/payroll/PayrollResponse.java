package com.xero.models.payroll;

import java.util.List;
import java.util.UUID;

import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.model.Elements;
import com.xero.models.accounting.TrackingCategories;

/**
 * PayrollResponse
 */

public class PayrollResponse {

 @JsonProperty("Id")
 protected UUID id;
 @JsonProperty("ProviderName")
 protected String providerName;
 @JsonProperty("DateTimeUTC")
 protected LocalDateTime dateTimeUTC;
 @JsonProperty("HttpStatusCode")
 protected String httpStatusCode;
 @JsonProperty("Pagination")
 protected Pagination pagination;
 @JsonProperty("Problem")
 protected String problem;
 @JsonProperty("Benefits")
 protected List<Benefit> benefits;
 @JsonProperty("Deductions")
 protected List<Deduction> deductions;
 @JsonProperty("EarningsRates")
 protected List<EarningsRate> earningsRates;
 @JsonProperty("Employee")
 protected Employee employee;
 @JsonProperty("Employees")
 protected List<Employee> employees;
 @JsonProperty("LeaveBalances")
 protected List<LeaveBalance> leaveBalances;
 @JsonProperty("LeavePeriods")
 protected List<LeavePeriod> leavePeriods;
 @JsonProperty("LeaveTypes")
 protected List<LeaveType> leaveTypes;
 @JsonProperty("OpeningBalances")
 protected OpeningBalances openingBalances;
 @JsonProperty("PayRun")
 protected PayRun payRun;
 @JsonProperty("PayRuns")
 protected List<PayRun> payRuns;
 @JsonProperty("PayRunCalendars")
 protected List<PayRunCalendar> payRunCalendars;
 @JsonProperty("PaySlip")
 protected PaySlip paySlip;
 @JsonProperty("PaySlips")
 protected List<PaySlip> paySlips;
 @JsonProperty("SalaryAndWages")
 protected List<SalaryAndWage> salaryAndWages;
 @JsonProperty("ApiException")
 protected Elements apiException;
 @JsonProperty("Options")
 protected TrackingCategories options;

 
 public UUID getId() {
     return id;
 }
 public void setId(UUID value) {
     this.id = value;
 }


 public String getProviderName() {
     return providerName;
 }
 public void setProviderName(String value) {
     this.providerName = value;
 }

 
 public LocalDateTime getDateTimeUTC() {
     return dateTimeUTC;
 }
 public void setDateTimeUTC(LocalDateTime value) {
     this.dateTimeUTC = value;
 }

 
 public String getHttpStatusCode() {
     return httpStatusCode;
 }
 public void setHttpStatusCode(String value) {
     this.httpStatusCode = value;
 }


 public Pagination getPagination() {
     return pagination;
 }
 public void setPagination(Pagination value) {
     this.pagination = value;
 }

 
 public String getProblem() {
     return problem;
 }
 public void setProblem(String value) {
     this.problem = value;
 }

 
 public List<Benefit> getBenefits() {
	 return benefits;
 }
 public void setBenefits(List<Benefit> benefits) {
	 this.benefits = benefits;
 }
 
 
 public List<Deduction> getDeductions() {
	 return deductions;
 }
 public void setDeductions(List<Deduction> deductions) {
	 this.deductions = deductions;
 }
 
 
 public List<EarningsRate> getEarningsRates() {
	 return earningsRates;
 }
 public void setEarningsRates(List<EarningsRate> earningsRates) {
	 this.earningsRates = earningsRates;
 }
 
 
 public Employee getEmployee() {
	 return employee;
 }
 public void setEmployee(Employee employee) {
	 this.employee = employee;
 }
 
 
 public List<Employee> getEmployees() {
	 return employees;
 }
 public void setEmployees(List<Employee> employees) {
	 this.employees = employees;
 }
 
 
 public List<LeaveBalance> getLeaveBalances() {
	 return leaveBalances;
 }
 public void setLeaveBalances(List<LeaveBalance> leaveBalances) {
	 this.leaveBalances = leaveBalances;
 }
 
 
 public List<LeavePeriod> getLeavePeriods() {
	 return leavePeriods;
 }
 public void setLeavePeriods(List<LeavePeriod> leavePeriods) {
	 this.leavePeriods = leavePeriods;
 }
 
 
 public List<LeaveType> getLeaveTypes() {
	 return leaveTypes;
 }
 public void setLeaveTypes(List<LeaveType> leaveTypes) {
	 this.leaveTypes = leaveTypes;
 }
 
 
 public OpeningBalances getOpeningBalances() {
	 return openingBalances;
 }
 public void setOpeningBalances(OpeningBalances openingBalances) {
	 this.openingBalances = openingBalances;
 }
 
 
 public PayRun getPayRun() {
	 return payRun;
 }
 public void setPayRun(PayRun payRun) {
	 this.payRun = payRun;
 }
 
 
 public List<PayRun> getPayRuns() {
     return payRuns;
 }
 public void setPayRuns(List<PayRun> value) {
     this.payRuns = value;
 }
 
 
 public List<PayRunCalendar> getPayRunCalendars() {
     return payRunCalendars;
 }
 public void setPayRunCalendars(List<PayRunCalendar> value) {
     this.payRunCalendars = value;
 }
 
 
 public PaySlip getPaySlip() {
	 return paySlip;
 } 
 public void setPaySlip(PaySlip paySlip) {
	 this.paySlip = paySlip;
 }
 
 
 public List<PaySlip> getPaySlips() {
	 return paySlips;
 }
 public void setPaySlips(List<PaySlip> paySlips) {
	 this.paySlips = paySlips;
 }
 
 
 public List<SalaryAndWage> getSalaryAndWages() {
	 return salaryAndWages;
 }
 public void setSalaryAndWages(List<SalaryAndWage> salaryAndWages) {
	 this.salaryAndWages = salaryAndWages;
 }
 
 
 public Elements getApiException() {
     return apiException;
 }
 public void setApiException(Elements value) {
     this.apiException = value;
 }

 
 public TrackingCategories getOptions() {
     return options;
 }
 public void setOptions(TrackingCategories value) {
     this.options = value;
 }
}