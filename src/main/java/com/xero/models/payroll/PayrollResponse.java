package com.xero.models.payroll;

import java.util.List;
import java.util.UUID;

import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.JsonAdapter;
import com.xero.api.CustomListObjectDeserialiser;
import com.xero.model.Elements;

/**
 * PayrollResponse
 */

public class PayrollResponse {

 @JsonProperty("Id")
 protected UUID id;
 @JsonProperty("employeeID")
 protected UUID employeeID;
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
 @JsonProperty("Benefit")
 protected Benefit benefit;
 @JsonProperty("Benefits")
 protected List<Benefit> benefits;
 @JsonProperty("Employee")
 protected Employee employee;
 @JsonProperty("Employees")
 protected List<Employee> employees;
 @JsonProperty("EmployeeTax")
 protected EmployeeTax employeeTax;
 @JsonProperty("OpeningBalances")
 protected OpeningBalances openingBalances;
 @JsonAdapter(CustomListObjectDeserialiser.class)
 @JsonProperty("Leave")
 protected List<Leave> leave;
 @JsonProperty("LeaveBalance")
 protected LeaveBalance leaveBalance;
 @JsonProperty("LeaveBalances")
 protected List<LeaveBalance> leaveBalances;
 @JsonProperty("StatutoryLeaves")
 protected List<StatutoryLeave> statutoryLeaves;
 @JsonProperty("StatutorySickLeave")
 protected StatutorySickLeave statutorySickLeave;
 @JsonProperty("LeavePeriods")
 protected List<LeavePeriod> leavePeriods;
 @JsonProperty("LeaveType")
 protected LeaveType leaveType;
 @JsonProperty("LeaveTypes")
 protected List<LeaveType> leaveTypes;
 @JsonProperty("earningTemplates")
 protected List<EarningsTemplate> earningTemplates;
 @JsonProperty("deductionTemplates")
 protected List<EarningsTemplate> deductionTemplates;
 @JsonProperty("benefitTemplates")
 protected List<EarningsTemplate> benefitTemplates;
 @JsonProperty("reimbursementTemplates")
 protected List<EarningsTemplate> reimbursementTemplates;
 @JsonProperty("Deduction")
 protected Deduction deduction;
 @JsonProperty("Deductions")
 protected List<Deduction> deductions;
 @JsonProperty("StatutoryDeduction")
 protected StatutoryDeduction statutoryDeduction;
 @JsonProperty("StatutoryDeductions")
 protected List<StatutoryDeduction> statutoryDeductions;
 @JsonProperty("EarningsRate")
 protected EarningsRate earningsRate;
 @JsonProperty("EarningsRates")
 protected List<EarningsRate> earningsRates;
 @JsonProperty("Reimbursement")
 protected Reimbursement reimbursement;
 @JsonProperty("Reimbursements")
 protected List<Reimbursement> reimbursements;
 @JsonProperty("Timesheet")
 protected Timesheet timesheet;
 @JsonProperty("Timesheets")
 protected List<Timesheet> timesheets;
 @JsonProperty("PaymentMethod")
 protected PaymentMethod paymentMethod;
 @JsonProperty("PayRunCalendar")
 protected PayRunCalendar payRunCalendar;
 @JsonProperty("PayRunCalendars")
 protected List<PayRunCalendar> payRunCalendars;
 @JsonAdapter(CustomListObjectDeserialiser.class)
 @JsonProperty("SalaryAndWages")
 protected List<SalaryAndWage> salaryAndWages;
 @JsonProperty("PayRun")
 protected PayRun payRun;
 @JsonProperty("PayRuns")
 protected List<PayRun> payRuns;
 @JsonProperty("PaySlip")
 protected PaySlip paySlip;
 @JsonProperty("PaySlips")
 protected List<PaySlip> paySlips;
 @JsonProperty("Settings")
 protected Accounts settings;
 @JsonProperty("Accounts")
 protected List<Account> accounts;
 @JsonProperty("ApiException")
 protected Elements apiException;
 @JsonProperty("TrackingCategories")
 protected TrackingCategories trackingCategories;

 
 public UUID getId() {
     return id;
 }
 public void setId(UUID value) {
     this.id = value;
 }


 public UUID getEmployeeID() {
	 return employeeID;
 }
 public void setEmployeeID(UUID employeeID) {
	 this.employeeID = employeeID;
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
 
 
 public Benefit getBenefit() {
	 return benefit;
 }
 public void setBenefit(Benefit benefit) {
	 this.benefit = benefit;
 }

 
 public List<Benefit> getBenefits() {
	 return benefits;
 }
 public void setBenefits(List<Benefit> benefits) {
	 this.benefits = benefits;
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

 
 public EmployeeTax getEmployeeTax() {
	 return employeeTax;
 }
 public void setEmployeeTax(EmployeeTax employeeTax) {
	 this.employeeTax = employeeTax;
 }
 
 
 public OpeningBalances getOpeningBalances() {
	 return openingBalances;
 }
 public void setOpeningBalances(OpeningBalances openingBalances) {
	 this.openingBalances = openingBalances;
 }
 
 
 public List<Leave> getLeave() {
	 return leave;
 }
 public void setLeave(List<Leave> leave) {
	 this.leave = leave;
 }
 
 
 public LeaveBalance getLeaveBalance() {
	 return leaveBalance;
 }
 public void setLeaveBalance(LeaveBalance leaveBalance) {
	 this.leaveBalance = leaveBalance;
 }
 
 
 public List<LeaveBalance> getLeaveBalances() {
	 return leaveBalances;
 }
 public void setLeaveBalances(List<LeaveBalance> leaveBalances) {
	 this.leaveBalances = leaveBalances;
 }
 
 
 public List<StatutoryLeave> getStatutoryLeaves() {
	 return statutoryLeaves;
 }
 public void setStatutoryLeaves(List<StatutoryLeave> statutoryLeaves) {
	 this.statutoryLeaves = statutoryLeaves;
 }
 
 
 public StatutorySickLeave getStatutorySickLeave() {
	 return statutorySickLeave;
 }
 public void setStatutorySickLeave(StatutorySickLeave statutorySickLeave) {
	 this.statutorySickLeave = statutorySickLeave;
 }
 
 
 public List<LeavePeriod> getLeavePeriods() {
	 return leavePeriods;
 }
 public void setLeavePeriods(List<LeavePeriod> leavePeriods) {
	 this.leavePeriods = leavePeriods;
 }
 

 public List<EarningsTemplate> getEarningTemplates() {
	 return earningTemplates;
 }
 public void setEarningTemplates(List<EarningsTemplate> earningTemplates) {
	 this.earningTemplates = earningTemplates;
 }
 
 
 public List<EarningsTemplate> getDeductionTemplates() {
	 return deductionTemplates;
 }
 public void setDeductionTemplates(List<EarningsTemplate> deductionTemplates) {
	 this.deductionTemplates = deductionTemplates;
 }
 
 
 public List<EarningsTemplate> getBenefitTemplates() {
	 return benefitTemplates;
 }
 public void setBenefitTemplates(List<EarningsTemplate> benefitTemplates) {
	 this.benefitTemplates = benefitTemplates;
 }
 
 
 public List<EarningsTemplate> getReimbursementTemplates() {
	 return reimbursementTemplates;
 }
 public void setReimbursementTemplates(List<EarningsTemplate> reimbursementTemplates) {
	 this.reimbursementTemplates = reimbursementTemplates;
 }
 
 
 public Reimbursement getReimbursement() {
	 return reimbursement;
 }
 public void setReimbursement(Reimbursement reimbursement) {
	 this.reimbursement = reimbursement;
 }
 
 
 public List<Reimbursement> getReimbursements() {
	 return reimbursements;
 }
 public void setReimbursements(List<Reimbursement> reimbursements) {
	 this.reimbursements = reimbursements;
 }
 
 
 public List<Deduction> getDeductions() {
	 return deductions;
 }
 public void setDeductions(List<Deduction> deductions) {
	 this.deductions = deductions;
 }
 
 
 public Deduction getDeduction() {
	 return deduction;
 }
 public void setDeduction(Deduction deduction) {
	 this.deduction = deduction;
 }
 
 
 public StatutoryDeduction getStatutoryDeduction() {
	 return statutoryDeduction;
 }
 public void setStatutoryDeduction(StatutoryDeduction statutoryDeduction) {
	 this.statutoryDeduction = statutoryDeduction;
 }
 
 
 public List<StatutoryDeduction> getStatutoryDeductions() {
	 return statutoryDeductions;
 }
 public void setStatutoryDeductions(List<StatutoryDeduction> statutoryDeductions) {
	 this.statutoryDeductions = statutoryDeductions;
 }
 
 
 public EarningsRate getEarningsRate() {
	 return earningsRate;
 }
 public void setEarningsRate(EarningsRate earningsRate) {
	 this.earningsRate = earningsRate;
 }
 
 
 public List<EarningsRate> getEarningsRates() {
	 return earningsRates;
 }
 public void setEarningsRates(List<EarningsRate> earningsRates) {
	 this.earningsRates = earningsRates;
 }
 
 
 public LeaveType getLeaveType() {
	 return leaveType;
 }
 public void setLeaveType(LeaveType leaveType) {
	 this.leaveType = leaveType;
 }
 
 
 public List<LeaveType> getLeaveTypes() {
	 return leaveTypes;
 }
 public void setLeaveTypes(List<LeaveType> leaveTypes) {
	 this.leaveTypes = leaveTypes;
 }
 
 
 public Timesheet getTimesheet() {
	 return timesheet;
 }
 public void setTimesheet(Timesheet timesheet) {
	 this.timesheet = timesheet;
 } 
 
 
 public List<Timesheet> getTimesheets() {
	 return timesheets;
 }
 public void setTimesheets(List<Timesheet> timesheets) {
	 this.timesheets = timesheets;
 }
 
 
 public PaymentMethod getPaymentMethod() {
	 return paymentMethod;
 }
 public void setPaymentMethod(PaymentMethod paymentMethod) {
	 this.paymentMethod = paymentMethod;
 }
 
 
 public PayRunCalendar getPayRunCalendar() {
	 return payRunCalendar;
 }
 public void setPayRunCalendar(PayRunCalendar payRunCalendar) {
	 this.payRunCalendar = payRunCalendar;
 }
 
 
 public List<PayRunCalendar> getPayRunCalendars() {
     return payRunCalendars;
 }
 public void setPayRunCalendars(List<PayRunCalendar> value) {
     this.payRunCalendars = value;
 }
 
 
 public List<SalaryAndWage> getSalaryAndWages() {
	 return salaryAndWages;
 }
 public void setSalaryAndWages(List<SalaryAndWage> salaryAndWages) {
	 this.salaryAndWages = salaryAndWages;
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
 
 
 public Accounts getSettings() {
	 return settings;
 }
 public void setSettings(Accounts settings) {
	 this.settings = settings;
 }
 
 
 public List<Account> getAccounts() {
	 return accounts;
 }
 public void setAccounts(List<Account> accounts) {
	 this.accounts = accounts;
 }
 
 
 public Elements getApiException() {
     return apiException;
 }
 public void setApiException(Elements value) {
     this.apiException = value;
 }

 
 public TrackingCategories getTrackingCategories() {
     return trackingCategories;
 }
 public void setTrackingCategories(TrackingCategories value) {
     this.trackingCategories = value;
 }
}