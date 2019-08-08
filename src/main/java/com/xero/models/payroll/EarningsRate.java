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

/**
 * EarningsRate
 */

public class EarningsRate {
	
  @JsonProperty("earningsRateID")
  private UUID earningsRateID;
  
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("earningsType")
  private String earningsType;
  
  @JsonProperty("rateType")
  private String rateType;
  
  @JsonProperty("typeOfUnits")
  private String typeOfUnits;
  
  @JsonProperty("currentRecord")
  private Boolean currentRecord;
  
  @JsonProperty("expenseAccountID")
  private UUID expenseAccountID;
  
  @JsonProperty("ratePerUnit")
  private Double ratePerUnit;
  
  @JsonProperty("multipleOfOrdinaryEarningsRate")
  private Double multipleOfOrdinaryEarningsRate;
  
  @JsonProperty("fixedAmount")
  private Double fixedAmount;
	
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public EarningsRate earningsRateID(UUID earningsRateID) {
	 this.earningsRateID = earningsRateID;
	 return this;
  }
  /**
	* Xero unique identifier for an earning rate
	* @return earningsRateID
  **/
  @ApiModelProperty(required = true, value = "Xero unique identifier for an earning rate")
  public UUID getEarningsRateID() {
	 return earningsRateID;
  }
  public void setEarningsRateID(UUID earningsRateID) {
	 this.earningsRateID = earningsRateID;
  }
  
  public EarningsRate name(String name) {
    this.name = name;
    return this;
  }
  /**
   * Name of the earning rate
   * @return name
  **/
  @ApiModelProperty(value = "Name of the earning rate")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public EarningsRate earningsType(String earningsType) {
    this.earningsType = earningsType;
    return this;
  }
  /**
   * Indicates how an employee will be paid when taking this type of earning
   * @return earningsType
  **/
  @ApiModelProperty(value = "Indicates how an employee will be paid when taking this type of earning")
  public String getEarningsType() {
    return earningsType;
  }
  public void setEarningsType(String earningsType) {
    this.earningsType = earningsType;
  }
  
  public EarningsRate rateType(String rateType) {
    this.rateType = rateType;
    return this;
  }
  /**
   * Indicates the type of the earning rate
   * @return rateType
  **/
  @ApiModelProperty(value = "Indicates the type of the earning rate")
  public String getRateType() {
    return rateType;
  }
  public void setRateType(String rateType) {
    this.rateType = rateType;
  }
  
  public EarningsRate typeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
    return this;
  }
  /**
   * The type of units used to record earnings
   * @return typeOfUnits
  **/
  @ApiModelProperty(required = false, value = "The type of units used to record earnings")
  public String getTypeOfUnits() {
    return typeOfUnits;
  }
  public void setTypeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
  }
  
  public EarningsRate currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }
  /**
   * Indicates whether an earning type is active
   * @return currentRecord
  **/
  @ApiModelProperty(value = "Indicates whether an earning type is active")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }
  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }
  
  public EarningsRate expenseAccountID(UUID expenseAccountID) {
    this.expenseAccountID = expenseAccountID;
    return this;
  }
  /**
   * The account that will be used for the earnings rate
   * @return expenseAccountID
  **/
  @ApiModelProperty(required = true, value = "The account that will be used for the earnings rate")
  public UUID getExpenseAccountID() {
    return expenseAccountID;
  }
  public void setExpenseAccountID(UUID expenseAccountID) {
    this.expenseAccountID = expenseAccountID;
  }
  
  public EarningsRate ratePerUnit(Double ratePerUnit) {
	 this.ratePerUnit = ratePerUnit;
	 return this;
  }
  /**
    * Default rate per unit (optional). Only applicable if RateType is RatePerUnit
	* @return ratePerUnit
  **/
  @ApiModelProperty(required = false, value = "Default rate per unit (optional). Only applicable if RateType is RatePerUnit")
  public Double getRatePerUnit() {
	 return ratePerUnit;
  }
  public void setRatePerUnit(Double ratePerUnit) {
	 this.ratePerUnit = ratePerUnit;
  } 
  
  public EarningsRate multipleOfOrdinaryEarningsRate(Double multipleOfOrdinaryEarningsRate) {
    this.multipleOfOrdinaryEarningsRate = multipleOfOrdinaryEarningsRate;
    return this;
  }
  /**
   * This is the multiplier used to calculate the rate per unit, based on the employee’s ordinary earnings rate. For example, for time and a half enter 1.5. Only applicable if RateType is MultipleOfOrdinaryEarningsRate
   * @return multipleOfOrdinaryEarningsRate
  **/
  @ApiModelProperty(required = false, value = "This is the multiplier used to calculate the rate per unit, based on the employee’s ordinary earnings rate. For example, for time and a half enter 1.5. Only applicable if RateType is MultipleOfOrdinaryEarningsRate")
  public Double getMultipleOfOrdinaryEarningsRate() {
    return multipleOfOrdinaryEarningsRate;
  }
  public void setMultipleOfOrdinaryEarningsRate(Double multipleOfOrdinaryEarningsRate) {
    this.multipleOfOrdinaryEarningsRate = multipleOfOrdinaryEarningsRate;
  }
  
  public EarningsRate fixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
    return this;
  }
  /**
   * Optional Fixed Rate Amount. Applicable for FixedAmount Rate 
   * @return fixedAmount
  **/
  @ApiModelProperty(required = false, value = "Optional Fixed Rate Amount. Applicable for FixedAmount Rate")
  public Double getFixedAmount() {
    return fixedAmount;
  }
  public void setFixedAmount(Double fixedAmount) {
    this.fixedAmount = fixedAmount;
  }
  
  public EarningsRate validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public EarningsRate addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    EarningsRate earningsRate = (EarningsRate) o;
    return Objects.equals(this.earningsRateID, earningsRate.earningsRateID) &&
        Objects.equals(this.name, earningsRate.name) &&
        Objects.equals(this.earningsType, earningsRate.earningsType) &&
        Objects.equals(this.rateType, earningsRate.rateType) &&
        Objects.equals(this.typeOfUnits, earningsRate.typeOfUnits) &&
        Objects.equals(this.currentRecord, earningsRate.currentRecord) &&
        Objects.equals(this.expenseAccountID, earningsRate.expenseAccountID) &&
        Objects.equals(this.ratePerUnit, earningsRate.ratePerUnit) &&
        Objects.equals(this.multipleOfOrdinaryEarningsRate, earningsRate.multipleOfOrdinaryEarningsRate) &&
        Objects.equals(this.fixedAmount, earningsRate.fixedAmount) &&
        Objects.equals(this.validationErrors, earningsRate.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsRateID, name, earningsType, rateType, typeOfUnits, currentRecord, expenseAccountID, ratePerUnit, multipleOfOrdinaryEarningsRate, fixedAmount, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsRate {\n");
    
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    earningsType: ").append(toIndentedString(earningsType)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    typeOfUnits: ").append(toIndentedString(typeOfUnits)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
    sb.append("    expenseAccountID: ").append(toIndentedString(expenseAccountID)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    multipleOfOrdinaryEarningsRate: ").append(toIndentedString(multipleOfOrdinaryEarningsRate)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
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

