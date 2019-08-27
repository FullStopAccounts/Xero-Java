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

import org.threeten.bp.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * SalaryAndWage
 */

public class SalaryAndWage {
	
//  @JsonProperty("salaryAndWagesID")
//  private UUID salaryAndWagesID;
  
  @JsonProperty("earningsRateID")
  private UUID earningsRateID;
  
  @JsonProperty("numberOfUnitsPerWeek")
  private Double numberOfUnitsPerWeek;
  
  @JsonProperty("ratePerUnit")
  private Double ratePerUnit;
	
  @JsonProperty("numberOfUnitsPerDay")
  private Double numberOfUnitsPerDay;
  
  @JsonProperty("daysPerWeek")
  private Double daysPerWeek;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("effectiveFrom")
  private LocalDate effectiveFrom;
  
  @JsonProperty("annualSalary")
  private Double annualSalary;
  
  @JsonProperty("status")
  private String status;
  
  @JsonProperty("paymentType")
  private String paymentType;

  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
//  public SalaryAndWage salaryAndWagesID(UUID salaryAndWagesID) {
//	 this.salaryAndWagesID = salaryAndWagesID;
//	 return this;
//  }
//  /**
//	* Xero unique identifier for a salary and wages record
//	* @return salaryAndWagesID
//  **/
//  @ApiModelProperty(value = "Xero unique identifier for a salary and wages record")
//  public UUID getSalaryAndWagesID() {
//	 return salaryAndWagesID;
//  }
//  public void setSalaryAndWagesID(UUID salaryAndWagesID) {
//	 this.salaryAndWagesID = salaryAndWagesID;
//  }
  
  public SalaryAndWage earningsRateID(UUID earningsRateID) {
	 this.earningsRateID = earningsRateID;
	 return this;
  }
  /**
    * Xero unique identifier for an earnings rate
	* @return earningsRateID
  **/
  @ApiModelProperty(value = "Xero unique identifier for an earnings rate")
  public UUID getEarningsRateID() {
	 return earningsRateID;
  }
  public void setEarningsRateID(UUID earningsRateID) {
	 this.earningsRateID = earningsRateID;
  } 
  
  public SalaryAndWage numberOfUnitsPerWeek(Double numberOfUnitsPerWeek) {
	 this.numberOfUnitsPerWeek = numberOfUnitsPerWeek;
	 return this;
  }
  /**
    * The Number of Units per week for the corresponding salary and wages
	* @return numberOfUnitsPerWeek
  **/
  @ApiModelProperty(value = "The Number of Units per week for the corresponding salary and wages")
  public Double getNumberOfUnitsPerWeek() {
	 return numberOfUnitsPerWeek;
  }
  public void setNumberOfUnitsPerWeek(Double numberOfUnitsPerWeek) {
	 this.numberOfUnitsPerWeek = numberOfUnitsPerWeek;
  } 
  
  public SalaryAndWage ratePerUnit(Double ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
	return this;
  }
  /**
	* The rate of each unit for the corresponding salary and wages
	* @return ratePerUnit
  **/
  @ApiModelProperty(value = "The rate of each unit for the corresponding salary and wages")
  public Double getRatePerUnit() {
	return ratePerUnit;
  }
  public void setRatePerUnit(Double ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
  }
  
  public SalaryAndWage daysPerWeek(Double daysPerWeek) {
	this.daysPerWeek = daysPerWeek;
	return this;
  }
  /**
	* Number of days per week
	* @return daysPerWeek
  **/
  @ApiModelProperty(value = "Number of days per week")
  public Double getDaysPerWeek() {
	return daysPerWeek;
  }
  public void setDaysPerWeek(Double daysPerWeek) {
	this.daysPerWeek = daysPerWeek;
  }
  
  public SalaryAndWage numberOfUnitsPerDay(Double numberOfUnitsPerDay) {
	this.numberOfUnitsPerDay = numberOfUnitsPerDay;
	return this;
  }
  /**
	* The Number of Units per day for the corresponding salary and wages
	* @return numberOfUnitsPerDay
  **/
  @ApiModelProperty(value = "The Number of Units per day for the corresponding salary and wages")
  public Double getNumberOfUnitsPerDay() {
	return numberOfUnitsPerDay;
  }
  public void setNumberOfUnitsPerDay(Double numberOfUnitsPerDay) {
	this.numberOfUnitsPerDay = numberOfUnitsPerDay;
  }
  
  public SalaryAndWage effectiveFrom(LocalDate effectiveFrom) {
	this.effectiveFrom = effectiveFrom;
	return this;
  }
  /**
    * The effective date of the corresponding salary and wages
	* @return effectiveFrom
  **/
  @ApiModelProperty(value = "The effective date of the corresponding salary and wages")
  public LocalDate getEffectiveFrom() {
	return effectiveFrom;
  }
  public void setEffectiveFrom(LocalDate effectiveFrom) {
	this.effectiveFrom = effectiveFrom;
  }
  
  public SalaryAndWage annualSalary(Double annualSalary) {
	this.annualSalary = annualSalary;
	return this;
  }
  /**
	* The annual salary
	* @return annualSalary
  **/
  @ApiModelProperty(value = "The annual salary")
  public Double getAnnualSalary() {
	return annualSalary;
  }
  public void setAnnualSalary(Double annualSalary) {
	this.annualSalary = annualSalary;
  }
  
  public SalaryAndWage status(String status) {
	this.status = status;
	return this;
  }
  /**
	* The current status of the corresponding salary and wages
	* @return status
  **/
  @ApiModelProperty(value = "The current status of the corresponding salary and wages")
  public String getStatus() {
	return status;
  }
  public void setStatus(String status) {
	this.status = status;
  }
  
  public SalaryAndWage paymentType(String paymentType) {
	this.paymentType = paymentType;
	return this;
  }
  /**
	* The type of the payment of the corresponding salary and wages
	* @return paymentType
  **/
  @ApiModelProperty(value = "The type of the payment of the corresponding salary and wages")
  public String getPaymentType() {
	return paymentType;
  }
  public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
  }
  
  public SalaryAndWage validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public SalaryAndWage addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    SalaryAndWage salaryAndWage = (SalaryAndWage) o;
    return 
    	//Objects.equals(this.salaryAndWagesID, salaryAndWage.salaryAndWagesID) &&
        Objects.equals(this.earningsRateID, salaryAndWage.earningsRateID) &&
        Objects.equals(this.numberOfUnitsPerWeek, salaryAndWage.numberOfUnitsPerWeek) &&
        Objects.equals(this.ratePerUnit, salaryAndWage.ratePerUnit) &&
        Objects.equals(this.numberOfUnitsPerDay, salaryAndWage.numberOfUnitsPerDay) &&
        Objects.equals(this.daysPerWeek, salaryAndWage.daysPerWeek) &&
        Objects.equals(this.effectiveFrom, salaryAndWage.effectiveFrom) &&
        Objects.equals(this.annualSalary, salaryAndWage.annualSalary) &&
        Objects.equals(this.status, salaryAndWage.status) &&
        Objects.equals(this.paymentType, salaryAndWage.paymentType) &&
        Objects.equals(this.validationErrors, salaryAndWage.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsRateID, numberOfUnitsPerWeek, ratePerUnit, numberOfUnitsPerDay, daysPerWeek, effectiveFrom, annualSalary, status, paymentType, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryAndWage {\n");
    
    //sb.append("    salaryAndWagesID: ").append(toIndentedString(salaryAndWagesID)).append("\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    numberOfUnitsPerWeek: ").append(toIndentedString(numberOfUnitsPerWeek)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    numberOfUnitsPerDay: ").append(toIndentedString(numberOfUnitsPerDay)).append("\n");
    sb.append("    daysPerWeek: ").append(toIndentedString(daysPerWeek)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    annualSalary: ").append(toIndentedString(annualSalary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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

