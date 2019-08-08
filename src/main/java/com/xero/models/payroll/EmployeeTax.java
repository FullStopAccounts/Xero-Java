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

import org.threeten.bp.LocalDate;
/**
 * EmployeeTax
 */

public class EmployeeTax {
	
  @JsonProperty("starterType")
  private String starterType;
  
  @JsonProperty("starterDeclaration")
  private String starterDeclaration;
  
  @JsonProperty("taxCode")
  private String taxCode;

  @JsonProperty("w1M1")
  private Boolean w1M1;
  
  @JsonProperty("previousTaxablePay")
  private Double previousTaxablePay;
  
  @JsonProperty("previousTaxPaid")
  private Double previousTaxPaid;
  
  @JsonProperty("studentLoanDeduction")
  private String studentLoanDeduction;
  
  @JsonProperty("hasPostGraduateLoans")
  private Boolean hasPostGraduateLoans;
  
  @JsonProperty("isDirector")
  private Boolean isDirector;
  
  @JsonProperty("directorshipStartDate")
  private LocalDate directorshipStartDate;
  
  @JsonProperty("nicCalculationMethod")
  private String nicCalculationMethod;
	
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public EmployeeTax starterType(String starterType) {
	 this.starterType = starterType;
	 return this;
  }
  /**
	* The Starter type
	* @return starterType
  **/
  @ApiModelProperty(value = "The Starter type")
  public String getStarterType() {
	 return starterType;
  }
  public void setStarterType(String starterType) {
	 this.starterType = starterType;
  }
  
  public EmployeeTax starterDeclaration(String starterDeclaration) {
    this.starterDeclaration = starterDeclaration;
    return this;
  }
  /**
   * Starter declaration
   * @return starterDeclaration
  **/
  @ApiModelProperty(value = "Starter declaration")
  public String getStarterDeclaration() {
    return starterDeclaration;
  }
  public void setStarterDeclaration(String starterDeclaration) {
    this.starterDeclaration = starterDeclaration;
  }
  
  public EmployeeTax taxCode(String taxCode) {
    this.taxCode = taxCode;
    return this;
  }
  /**
   * The Tax Code
   * @return taxCode
  **/
  @ApiModelProperty(value = "The Tax code")
  public String getTaxCode() {
    return taxCode;
  }
  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }
  
  public EmployeeTax w1M1(Boolean w1M1) {
    this.w1M1 = w1M1;
    return this;
  }
  /**
   * describes whether the tax settings is W1M1
   * @return w1M1
  **/
  @ApiModelProperty(value = "describes whether the tax settings is W1M1")
  public Boolean getW1M1() {
    return w1M1;
  }
  public void setW1M1(Boolean w1M1) {
    this.w1M1 = w1M1;
  }
  
  public EmployeeTax previousTaxablePay(Double previousTaxablePay) {
    this.previousTaxablePay = previousTaxablePay;
    return this;
  }
  /**
   * The previous taxable pay
   * @return previousTaxablePay
  **/
  @ApiModelProperty(value = "The previous taxable pay")
  public Double getPreviousTaxablePay() {
	return previousTaxablePay;
  }
  public void setPreviousTaxablePay(Double previousTaxablePay) {
	this.previousTaxablePay = previousTaxablePay;
  }
	

  public EmployeeTax previousTaxPaid(Double previousTaxPaid) {
    this.previousTaxPaid = previousTaxPaid;
    return this;
  }
  /**
   * The tax amount previously paid
   * @return previousTaxPaid
  **/
  @ApiModelProperty(value = "The tax amount previously paid")
  public Double getPreviousTaxPaid() {
	return previousTaxPaid;
  }
  public void setPreviousTaxPaid(Double previousTaxPaid) {
	this.previousTaxPaid = previousTaxPaid;
  }
	
	
  public EmployeeTax studentLoanDeduction(String studentLoanDeduction) {
    this.studentLoanDeduction = studentLoanDeduction;
    return this;
  }
  /**
   * The employee's student loan deduction type
   * @return studentLoanDeduction
  **/
  @ApiModelProperty(value = "The employee's student loan deduction type")
  public String getStudentLoanDeduction() {
	return studentLoanDeduction;
  }
  public void setStudentLoanDeduction(String studentLoanDeduction) {
	this.studentLoanDeduction = studentLoanDeduction;
  }
	
	
  public EmployeeTax hasPostGraduateLoans(Boolean hasPostGraduateLoans) {
    this.hasPostGraduateLoans = hasPostGraduateLoans;
    return this;
  }
  /**
   * Boolean - describes whether the employee has post graduate loans
   * @return hasPostGraduateLoans
  **/
  @ApiModelProperty(value = "Boolean - describes whether the employee has post graduate loans")
  public Boolean getHasPostGraduateLoans() {
	return hasPostGraduateLoans;
  }
  public void setHasPostGraduateLoans(Boolean hasPostGraduateLoans) {
	this.hasPostGraduateLoans = hasPostGraduateLoans;
  }
	
	
  public EmployeeTax isDirector(Boolean isDirector) {
    this.isDirector = isDirector;
    return this;
  }
  /**
   * Boolean - describes whether the employee is director
   * @return isDirector
  **/
  @ApiModelProperty(value = "Boolean - describes whether the employee is director")
  public Boolean getIsDirector() {
	return isDirector;
  }
  public void setIsDirector(Boolean isDirector) {
	this.isDirector = isDirector;
  }
	
	
  public EmployeeTax directorshipStartDate(LocalDate directorshipStartDate) {
    this.directorshipStartDate = directorshipStartDate;
    return this;
  }
  /**
   * The directorship start date
   * @return directorshipStartDate
  **/
  @ApiModelProperty(value = "The directorship start date")
  public LocalDate getDirectorshipStartDate() {
	return directorshipStartDate;
  }
  public void setDirectorshipStartDate(LocalDate directorshipStartDate) {
    this.directorshipStartDate = directorshipStartDate;
  }
	
	
  public EmployeeTax nicCalculationMethod(String nicCalculationMethod) {
    this.nicCalculationMethod = nicCalculationMethod;
    return this;
  }
  /**
   * NICs calculation method
   * @return nicCalculationMethod
  **/
  @ApiModelProperty(value = "NICs calculation method")
  public String getNicCalculationMethod() {
	return nicCalculationMethod;
  }
  public void setNicCalculationMethod(String nicCalculationMethod) {
	this.nicCalculationMethod = nicCalculationMethod;
  }
  
  
  public EmployeeTax validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }
  public EmployeeTax addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    EmployeeTax employeeTax = (EmployeeTax) o;
    return Objects.equals(this.starterType, employeeTax.starterType) &&
        Objects.equals(this.starterDeclaration, employeeTax.starterDeclaration) &&
        Objects.equals(this.taxCode, employeeTax.taxCode) &&
        Objects.equals(this.w1M1, employeeTax.w1M1) &&
        Objects.equals(this.previousTaxablePay, employeeTax.previousTaxablePay) &&
        Objects.equals(this.previousTaxPaid, employeeTax.previousTaxPaid) &&
        Objects.equals(this.studentLoanDeduction, employeeTax.studentLoanDeduction) &&
        Objects.equals(this.hasPostGraduateLoans, employeeTax.hasPostGraduateLoans) &&
        Objects.equals(this.isDirector, employeeTax.isDirector) &&
        Objects.equals(this.directorshipStartDate, employeeTax.directorshipStartDate) &&
        Objects.equals(this.nicCalculationMethod, employeeTax.nicCalculationMethod) &&
        Objects.equals(this.validationErrors, employeeTax.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(starterType, starterDeclaration, taxCode, w1M1, previousTaxablePay, previousTaxPaid, studentLoanDeduction, hasPostGraduateLoans, isDirector, directorshipStartDate, nicCalculationMethod, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTax {\n");
    
    sb.append("    starterType: ").append(toIndentedString(starterType)).append("\n");
    sb.append("    starterDeclaration: ").append(toIndentedString(starterDeclaration)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    w1M1: ").append(toIndentedString(w1M1)).append("\n");
    sb.append("    previousTaxablePay: ").append(toIndentedString(previousTaxablePay)).append("\n");
    sb.append("    previousTaxPaid: ").append(toIndentedString(previousTaxPaid)).append("\n");
    sb.append("    studentLoanDeduction: ").append(toIndentedString(studentLoanDeduction)).append("\n");
    sb.append("    hasPostGraduateLoans: ").append(toIndentedString(hasPostGraduateLoans)).append("\n");
    sb.append("    isDirector: ").append(toIndentedString(isDirector)).append("\n");
    sb.append("    directorshipStartDate: ").append(toIndentedString(directorshipStartDate)).append("\n");
    sb.append("    nicCalculationMethod: ").append(toIndentedString(nicCalculationMethod)).append("\n");
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

