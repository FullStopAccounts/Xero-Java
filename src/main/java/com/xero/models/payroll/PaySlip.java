/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.models.accounting.ValidationError;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * PaySlip
 */

public class PaySlip {
	
  @JsonProperty("PaySlipID")
  private UUID paySlipID;
  
  @JsonProperty("EmployeeID")
  private UUID employeeID;
  
  @JsonProperty("PayRunID")
  private UUID payRunID;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("LastEdited")
  private LocalDateTime lastEdited;
  
  @JsonProperty("FirstName")
  private String firstName;
  
  @JsonProperty("LastName")
  private String lastName;
  
  @JsonProperty("TotalEarnings")
  private Double totalEarnings;
  
  @JsonProperty("GrossEarnings")
  private Double grossEarnings;
  
  @JsonProperty("TotalPay")
  private Double totalPay;
  
  @JsonProperty("TotalEmployerTaxes")
  private Double totalEmployerTaxes;
  
  @JsonProperty("TotalEmployeeTaxes")
  private Double totalEmployeeTaxes;
  
  @JsonProperty("TotalDeductions")
  private Double totalDeductions;
  
  @JsonProperty("TotalReimbursements")
  private Double totalReimbursements;
  
  @JsonProperty("TotalCourtOrders")
  private Double totalCourtOrders;
  
  @JsonProperty("TotalBenefits")
  private Double totalBenefits;
  
  @JsonProperty("TotalStatutoryDeductions")
  private Double totalStatutoryDeductions;
  
  @JsonProperty("BacsHash")
  private String bacsHash;
  
  @JsonProperty("PaymentMethod")
  private String paymentMethod;
  
  @JsonProperty("EarningsLines")
  private List<EarningsLine> earningsLines;
  
  @JsonProperty("LeaveEarningsLines")
  private List<EarningsLine> leaveEarningsLines;
  
  @JsonProperty("TimesheetEarningsLines")
  private List<EarningsLine> timesheetEarningsLines;
  
  @JsonProperty("DeductionLines")
  private List<DeductionLine> deductionLines;
  
  @JsonProperty("ReimbursementLines")
  private List<ReimbursementLine> reimbursementLines;
  
  @JsonProperty("LeaveAccrualLines")
  private List<LeaveAccrualLine> leaveAccrualLines;
  
  @JsonProperty("BenefitLines")
  private List<BenefitLine> benefitLines;
  
  @JsonProperty("PaymentLines")
  private List<PaymentLine> paymentLines;
  
  @JsonProperty("EmployeeTaxLines")
  private List<TaxLine> employeeTaxLines;
  
  @JsonProperty("EmployerTaxLines")
  private List<TaxLine> employerTaxLines;
  
  @JsonProperty("CourtOrderLines")
  private List<CourtOrderLine> courtOrderLines;
	
  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public PaySlip paySlipID(UUID paySlipID) {
	 this.paySlipID = paySlipID;
	 return this;
  }
  /**
	* The Xero identifier for a Payslip
	* @return paySlipID
  **/
  @ApiModelProperty(value = "The Xero identifier for a Payslip")
  public UUID getPaySlipID() {
	 return paySlipID;
  }
  public void setPaySlipID(UUID paySlipID) {
	 this.paySlipID = paySlipID;
  }
  
  public PaySlip employeeID(UUID employeeID) {
	 this.employeeID = employeeID;
	 return this;
  }
  /**
    * The Xero identifier for payroll employee
	* @return payrollCalendarID
  **/
  @ApiModelProperty(value = "The Xero identifier for payroll employee")
  public UUID getEmployeeID() {
	 return employeeID;
  }
  public void setEmployeeID(UUID employeeID) {
	 this.employeeID = employeeID;
  } 
  
  public PaySlip payRunID(UUID payRunID) {
	this.payRunID = payRunID;
	return this;
  }
  /**
	* The Xero identifier for the associated payrun
	* @return payRunID
  **/
  @ApiModelProperty(required = false, value = "The Xero identifier for the associated payrun")
  public UUID getPayRunID() {
	return payRunID;
  }
  public void setPayRunID(UUID payRunID) {
	this.payRunID = payRunID;
  } 
  
  public PaySlip lastEdited(LocalDateTime lastEdited) {
	this.lastEdited = lastEdited;
	return this;
  }
  /**
   * The date payslip was last updated
   * @return lastEdited
  **/
  @ApiModelProperty(value = "The date payslip was last updated")
  public LocalDateTime getLastEdited() {
    return lastEdited;
  }
  public void setLastEdited(LocalDateTime lastEdited) {
	this.lastEdited = lastEdited;
  } 
  
  
  public PaySlip firstName(String firstName) {
	this.firstName = firstName;
	return this;
  }
  /**
   * Employee first name
   * @return firstName
  **/
  @ApiModelProperty(value = "Employee first name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
	this.firstName = firstName;
  } 
  
  public PaySlip lastName(String lastName) {
	this.lastName = lastName;
	return this;
  }
  /**
   * Employee last name
   * @return lastName
  **/
  @ApiModelProperty(value = "Employee last name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
	this.lastName = lastName;
  } 
  
  public PaySlip totalEarnings(Double totalEarnings) {
	this.totalEarnings = totalEarnings;
	return this;
  }
  /**
   * Total earnings before any deductions. Same as gross earnings for UK.
   * @return totalEarnings
  **/
  @ApiModelProperty(value = "Total earnings before any deductions. Same as gross earnings for UK.")
  public Double getTotalEarnings() {
    return totalEarnings;
  }
  public void setTotalEarnings(Double totalEarnings) {
	this.totalEarnings = totalEarnings;
  } 
  
  public PaySlip grossEarnings(Double grossEarnings) {
	this.grossEarnings = grossEarnings;
	return this;
  }
  /**
   * Total earnings before any deductions. Same as total earnings for UK.
   * @return grossEarnings
  **/
  @ApiModelProperty(value = "Total earnings before any deductions. Same as total earnings for UK.")
  public Double getGrossEarnings() {
    return grossEarnings;
  }
  public void setGrossEarnings(Double grossEarnings) {
	this.grossEarnings = grossEarnings;
  } 
  
  public PaySlip totalPay(Double totalPay) {
	this.totalPay = totalPay;
	return this;
  }
  /**
   * The employee net pay
   * @return totalPay
  **/
  @ApiModelProperty(value = "The employee net pay")
  public Double getTotalPay() {
    return totalPay;
  }
  public void setTotalPay(Double totalPay) {
	this.totalPay = totalPay;
  } 
  
  public PaySlip totalEmployerTaxes(Double totalEmployerTaxes) {
	this.totalEmployerTaxes = totalEmployerTaxes;
	return this;
  }
  /**
   * The employer's tax obligation
   * @return totalEmployerTaxes
  **/
  @ApiModelProperty(value = "The employer's tax obligation")
  public Double getTotalEmployerTaxes() {
    return totalEmployerTaxes;
  }
  public void setTotalEmployerTaxes(Double totalEmployerTaxes) {
	this.totalEmployerTaxes = totalEmployerTaxes;
  } 
  
  public PaySlip totalEmployeeTaxes(Double totalEmployeeTaxes) {
	this.totalEmployeeTaxes = totalEmployeeTaxes;
	return this;
  }
  /**
   * The part of an employee's earnings that is deducted for tax purposes
   * @return totalEmployeeTaxes
  **/
  @ApiModelProperty(value = "The part of an employee's earnings that is deducted for tax purposes")
  public Double getTotalEmployeeTaxes() {
    return totalEmployeeTaxes;
  }
  public void setTotalEmployeeTaxes(Double totalEmployeeTaxes) {
	this.totalEmployeeTaxes = totalEmployeeTaxes;
  } 
  
  public PaySlip totalDeductions(Double totalDeductions) {
	this.totalDeductions = totalDeductions;
	return this;
  }
  /**
   * Total amount subtracted from an employee's earnings to reach total pay
   * @return totalDeductions
  **/
  @ApiModelProperty(value = "Total amount subtracted from an employee's earnings to reach total pay")
  public Double getTotalDeductions() {
     return totalDeductions;
  }
  public void setTotalDeductions(Double totalDeductions) {
	this.totalDeductions = totalDeductions;
  } 
  
  public PaySlip totalReimbursements(Double totalReimbursements) {
	this.totalReimbursements = totalReimbursements;
	return this;
  }
  /**
   * Total reimbursements are nontaxable payments to an employee used to repay out-of-pocket expenses when the person incurs those expenses through employment
   * @return totalReimbursements
  **/
  @ApiModelProperty(value = "Total reimbursements are nontaxable payments to an employee used to repay out-of-pocket expenses when the person incurs those expenses through employment")
  public Double getTotalReimbursements() {
    return totalReimbursements;
  }
  public void setTotalReimbursements(Double totalReimbursements) {
	this.totalReimbursements = totalReimbursements;
  } 
  
  public PaySlip totalCourtOrders(Double totalCourtOrders) {
	this.totalCourtOrders = totalCourtOrders;
	return this;
  }
  /**
   * Total amounts required by law to subtract from the employee's earnings
   * @return totalCourtOrders
  **/
  @ApiModelProperty(value = "Total amounts required by law to subtract from the employee's earnings")
  public Double getTotalCourtOrders() {
    return totalCourtOrders;
  }
  public void setTotalCourtOrders(Double totalCourtOrders) {
	this.totalCourtOrders = totalCourtOrders;
  }
  
  public PaySlip totalBenefits(Double totalBenefits) {
	this.totalBenefits = totalBenefits;
	return this;
  }
  /**
   * Benefits (also called fringe benefits, perquisites or perks) are various non-earnings compensations provided to employees in addition to their normal earnings or salaries
   * @return totalBenefits
  **/
  @ApiModelProperty(value = "Benefits (also called fringe benefits, perquisites or perks) are various non-earnings compensations provided to employees in addition to their normal earnings or salaries")
  public Double getTotalBenefits() {
    return totalBenefits;
  }
  public void setTotalBenefits(Double totalBenefits) {
	this.totalBenefits = totalBenefits;
  }
  
  public PaySlip totalStatutoryDeductions(Double totalStatutoryDeductions) {
	this.totalStatutoryDeductions = totalStatutoryDeductions;
	return this;
  }
  /**
   * Total amount subtracted from an employee's earnings to reach total pay
   * @return totalStatutoryDeductions
  **/
  @ApiModelProperty(required = false, value = "Total amount subtracted from an employee's earnings to reach total pay")
  public Double getTotalStatutoryDeductions() {
    return totalStatutoryDeductions;
  }
  public void setTotalStatutoryDeductions(Double totalStatutoryDeductions) {
	this.totalStatutoryDeductions = totalStatutoryDeductions;
  }
  
  public PaySlip bacsHash(String bacsHash) {
	this.bacsHash = bacsHash;
	return this;
  }
  /**
   * BACS Service User Number
   * @return bacsHash
  **/
  @ApiModelProperty(required = false, value = "BACS Service User Number")
  public String getBacsHash() {
    return bacsHash;
  }
  public void setBacsHash(String bacsHash) {
	this.bacsHash = bacsHash;
  } 
  
  public PaySlip paymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
	return this;
  }
  /**
   * The method used to pay the employee
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "Payment Method")
  public String getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
  }
  
  public PaySlip earningsLines(List<EarningsLine> earningsLines) {
	this.earningsLines = earningsLines;
	return this;
  }
  /**
    * See EarningsLines
	* @return earningsLines
  **/
  @ApiModelProperty(required = false, value = "See EarningsLines")
  public List<EarningsLine> getEarningsLines() {
	return earningsLines;
  }
  public void setEarningsLines(List<EarningsLine> earningsLines) {
	this.earningsLines = earningsLines;
  }
  
  public PaySlip leaveEarningsLines(List<EarningsLine> leaveEarningsLines) {
	this.leaveEarningsLines = leaveEarningsLines;
	return this;
  }
  /**
    * See LeaveEarningsLines
	* @return leaveEarningsLines
  **/
  @ApiModelProperty(required = false, value = "See LeaveEarningsLines")
  public List<EarningsLine> getLeaveEarningsLines() {
	return leaveEarningsLines;
  }
  public void setLeaveEarningsLines(List<EarningsLine> leaveEarningsLines) {
	this.leaveEarningsLines = leaveEarningsLines;
  }
  
  public PaySlip timesheetEarningsLines(List<EarningsLine> timesheetEarningsLines) {
	this.timesheetEarningsLines = timesheetEarningsLines;
	return this;
  }
  /**
    * See TimesheetEarningsLines
	* @return timesheetEarningsLines
  **/
  @ApiModelProperty(required = false, value = "See TimesheetEarningsLines")
  public List<EarningsLine> getTimesheetEarningsLines() {
	return timesheetEarningsLines;
  }
  public void setTimesheetEarningsLines(List<EarningsLine> timesheetEarningsLines) {
	this.timesheetEarningsLines = timesheetEarningsLines;
  }
  
  public PaySlip deductionLines(List<DeductionLine> deductionLines) {
	this.deductionLines = deductionLines;
	return this;
  }
  /**
    * See DeductionLines
	* @return deductionLines
  **/
  @ApiModelProperty(required = false, value = "See DeductionLines")
  public List<DeductionLine> getDeductionLines() {
	return deductionLines;
  }
  public void setDeductionLines(List<DeductionLine> deductionLines) {
	this.deductionLines = deductionLines;
  }
  
  public PaySlip reimbursementLines(List<ReimbursementLine> reimbursementLines) {
	this.reimbursementLines = reimbursementLines;
	return this;
  }
  /**
    * See ReimbursementLines
	* @return reimbursementLines
  **/
  @ApiModelProperty(required = false, value = "See ReimbursementLines")
  public List<ReimbursementLine> getReimbursementLines() {
	return reimbursementLines;
  }
  public void setReimbursementLines(List<ReimbursementLine> reimbursementLines) {
	this.reimbursementLines = reimbursementLines;
  }
  
  public PaySlip leaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
	this.leaveAccrualLines = leaveAccrualLines;
	return this;
  }
  /**
    * See LeaveAccrualLines
	* @return leaveAccrualLines
  **/
  @ApiModelProperty(required = false, value = "See LeaveAccrualLines")
  public List<LeaveAccrualLine> getLeaveAccrualLines() {
	return leaveAccrualLines;
  }
  public void setLeaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
	this.leaveAccrualLines = leaveAccrualLines;
  }
  
  public PaySlip benefitLines(List<BenefitLine> benefitLines) {
	this.benefitLines = benefitLines;
	return this;
  }
  /**
    * See BenefitLines
	* @return benefitLines
  **/
  @ApiModelProperty(required = false, value = "See BenefitLines")
  public List<BenefitLine> getBenefitLines() {
	return benefitLines;
  }
  public void setBenefitLines(List<BenefitLine> benefitLines) {
	this.benefitLines = benefitLines;
  }
  
  public PaySlip paymentLines(List<PaymentLine> paymentLines) {
	this.paymentLines = paymentLines;
	return this;
  }
  /**
    * See PaymentLines
	* @return paymentLines
  **/
  @ApiModelProperty(required = false, value = "See PaymentLines")
  public List<PaymentLine> getPaymentLines() {
	return paymentLines;
  }
  public void setPaymentLines(List<PaymentLine> paymentLines) {
	this.paymentLines = paymentLines;
  }
  
  public PaySlip employeeTaxLines(List<TaxLine> employeeTaxLines) {
	this.employeeTaxLines = employeeTaxLines;
	return this;
  }
  /**
    * See EmployeeTaxLines
	* @return employeeTaxLines
  **/
  @ApiModelProperty(required = false, value = "See EmployeeTaxLines")
  public List<TaxLine> getEmployeeTaxLines() {
	return employeeTaxLines;
  }
  public void setEmployeeTaxLines(List<TaxLine> employeeTaxLines) {
	this.employeeTaxLines = employeeTaxLines;
  }
  
  public PaySlip employerTaxLines(List<TaxLine> employerTaxLines) {
	this.employerTaxLines = employerTaxLines;
	return this;
  }
  /**
    * See EmployerTaxLines
	* @return employerTaxLines
  **/
  @ApiModelProperty(required = false, value = "See EmployerTaxLines")
  public List<TaxLine> getEmployerTaxLines() {
	return employerTaxLines;
  }
  public void setEmployerTaxLines(List<TaxLine> employerTaxLines) {
	this.employerTaxLines = employerTaxLines;
  }
  
  public PaySlip courtOrderLines(List<CourtOrderLine> courtOrderLines) {
	this.courtOrderLines = courtOrderLines;
	return this;
  }
  /**
    * See CourtOrderLines
	* @return courtOrderLines
  **/
  @ApiModelProperty(required = false, value = "See CourtOrderLines")
  public List<CourtOrderLine> getCourtOrderLines() {
	return courtOrderLines;
  }
  public void setCourtOrderLines(List<CourtOrderLine> courtOrderLines) {
	this.courtOrderLines = courtOrderLines;
  }
  
  public PaySlip validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public PaySlip addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Displays array of validation error messages from the API
   * @return validationErrors
  **/
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaySlip paySlip = (PaySlip) o;
    return Objects.equals(this.paySlipID, paySlip.paySlipID) &&
        Objects.equals(this.employeeID, paySlip.employeeID) &&
        Objects.equals(this.payRunID, paySlip.payRunID) &&
        Objects.equals(this.lastEdited, paySlip.lastEdited) &&
        Objects.equals(this.firstName, paySlip.firstName) &&
        Objects.equals(this.lastName, paySlip.lastName) &&
        Objects.equals(this.totalEarnings, paySlip.totalEarnings) &&
        Objects.equals(this.grossEarnings, paySlip.grossEarnings) &&
        Objects.equals(this.totalPay, paySlip.totalPay) &&
        Objects.equals(this.totalEmployerTaxes, paySlip.totalEmployerTaxes) &&
        Objects.equals(this.totalEmployeeTaxes, paySlip.totalEmployeeTaxes) &&
        Objects.equals(this.totalDeductions, paySlip.totalDeductions) &&
        Objects.equals(this.totalReimbursements, paySlip.totalReimbursements) &&
        Objects.equals(this.totalCourtOrders, paySlip.totalCourtOrders) &&
        Objects.equals(this.totalBenefits, paySlip.totalBenefits) &&
        Objects.equals(this.totalStatutoryDeductions, paySlip.totalStatutoryDeductions) &&
        Objects.equals(this.bacsHash, paySlip.bacsHash) &&
        Objects.equals(this.paymentMethod, paySlip.paymentMethod) &&
        Objects.equals(this.earningsLines, paySlip.earningsLines) &&
        Objects.equals(this.leaveEarningsLines, paySlip.leaveEarningsLines) &&
        Objects.equals(this.timesheetEarningsLines, paySlip.timesheetEarningsLines) &&
        Objects.equals(this.deductionLines, paySlip.deductionLines) &&
        Objects.equals(this.reimbursementLines, paySlip.reimbursementLines) &&
        Objects.equals(this.leaveAccrualLines, paySlip.leaveAccrualLines) &&
        Objects.equals(this.benefitLines, paySlip.benefitLines) &&
        Objects.equals(this.paymentLines, paySlip.paymentLines) &&
        Objects.equals(this.employeeTaxLines, paySlip.employeeTaxLines) &&
        Objects.equals(this.employerTaxLines, paySlip.employerTaxLines) &&
        Objects.equals(this.courtOrderLines, paySlip.courtOrderLines) &&
        Objects.equals(this.validationErrors, paySlip.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paySlipID, employeeID, payRunID, lastEdited, firstName, lastName, totalEarnings, grossEarnings, totalPay, totalEmployerTaxes, totalEmployeeTaxes, totalDeductions, totalReimbursements, totalCourtOrders, totalBenefits, totalStatutoryDeductions, bacsHash, paymentMethod, earningsLines, leaveEarningsLines, timesheetEarningsLines, deductionLines, reimbursementLines, leaveAccrualLines, benefitLines, paymentLines, employeeTaxLines, employerTaxLines, courtOrderLines, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaySlip {\n");
    
    sb.append("    paySlipID: ").append(toIndentedString(paySlipID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    payRunID: ").append(toIndentedString(payRunID)).append("\n");
    sb.append("    lastEdited: ").append(toIndentedString(lastEdited)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    totalEarnings: ").append(toIndentedString(totalEarnings)).append("\n");
    sb.append("    grossEarnings: ").append(toIndentedString(grossEarnings)).append("\n");
    sb.append("    totalPay: ").append(toIndentedString(totalPay)).append("\n");
    sb.append("    totalEmployerTaxes: ").append(toIndentedString(totalEmployerTaxes)).append("\n");
    sb.append("    totalEmployeeTaxes: ").append(toIndentedString(totalEmployeeTaxes)).append("\n");
    sb.append("    totalDeductions: ").append(toIndentedString(totalDeductions)).append("\n");
    sb.append("    totalReimbursements: ").append(toIndentedString(totalReimbursements)).append("\n");
    sb.append("    totalCourtOrders: ").append(toIndentedString(totalCourtOrders)).append("\n");
    sb.append("    totalBenefits: ").append(toIndentedString(totalBenefits)).append("\n");
    sb.append("    totalStatutoryDeductions: ").append(toIndentedString(totalStatutoryDeductions)).append("\n");
    sb.append("    bacsHash: ").append(toIndentedString(bacsHash)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    earningsLines: ").append(toIndentedString(earningsLines)).append("\n");
    sb.append("    leaveEarningsLines: ").append(toIndentedString(leaveEarningsLines)).append("\n");
    sb.append("    timesheetEarningsLines: ").append(toIndentedString(timesheetEarningsLines)).append("\n");
    sb.append("    deductionLines: ").append(toIndentedString(deductionLines)).append("\n");
    sb.append("    reimbursementLines: ").append(toIndentedString(reimbursementLines)).append("\n");
    sb.append("    leaveAccrualLines: ").append(toIndentedString(leaveAccrualLines)).append("\n");
    sb.append("    benefitLines: ").append(toIndentedString(benefitLines)).append("\n");
    sb.append("    paymentLines: ").append(toIndentedString(paymentLines)).append("\n");
    sb.append("    employeeTaxLines: ").append(toIndentedString(employeeTaxLines)).append("\n");
    sb.append("    employerTaxLines: ").append(toIndentedString(employerTaxLines)).append("\n");
    sb.append("    courtOrderLines: ").append(toIndentedString(courtOrderLines)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}