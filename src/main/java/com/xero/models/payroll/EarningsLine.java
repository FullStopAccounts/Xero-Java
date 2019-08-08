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
 * EarningsLine
 */

public class EarningsLine {
	
  @JsonProperty("earningsRateID")
  private UUID earningsRateID;
  
  @JsonProperty("ratePerUnit")
  private Double ratePerUnit;
  
  @JsonProperty("numberOfUnits")
  private Double numberOfUnits;
  
  @JsonProperty("fixedAmount")
  private Double fixedAmount;
  
  @JsonProperty("amount")
  private Double amount;
  
  @JsonProperty("isLinkedToTimesheet")
  private Boolean isLinkedToTimesheet;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public EarningsLine earningsRateID(UUID earningsRateID) {
	 this.earningsRateID = earningsRateID;
	 return this;
  }
  /**
	* Xero identifier for payroll earnings rate
	* @return earningsRateID
  **/
  @ApiModelProperty(value = "Xero identifier for payroll earnings rate")
  public UUID getEarningsRateID() {
	 return earningsRateID;
  }
  public void setEarningsRateID(UUID earningsRateID) {
	 this.earningsRateID = earningsRateID;
  }
  
  public EarningsLine ratePerUnit(Double ratePerUnit) {
	 this.ratePerUnit = ratePerUnit;
	 return this;
  }
  /**
    * Rate per unit for earnings line
	* @return ratePerUnit
  **/
  @ApiModelProperty(required = false, value = "Rate per unit for earnings line")
  public Double getRatePerUnit() {
	 return ratePerUnit;
  }
  public void setRatePerUnit(Double ratePerUnit) {
	 this.ratePerUnit = ratePerUnit;
  } 
  
  public EarningsLine numberOfUnits(Double numberOfUnits) {
	 this.numberOfUnits = numberOfUnits;
	 return this;
  }
  /**
    * Earnings number of units
	* @return numberOfUnits
  **/
  @ApiModelProperty(required = false, value = "Earnings number of units")
  public Double getNumberOfUnits() {
	 return numberOfUnits;
  }
  public void setNumberOfUnits(Double numberOfUnits) {
	 this.numberOfUnits = numberOfUnits;
  }
  
  public EarningsLine fixedAmount(Double fixedAmount) {
	 this.fixedAmount = fixedAmount;
	 return this;
  }
  /**
    * Earnings fixed amount. Only applicable if the EarningsRate RateType is Fixed
	* @return fixedAmount
  **/
  @ApiModelProperty(required = false, value = "Earnings fixed amount. Only applicable if the EarningsRate RateType is Fixed")
  public Double getFixedAmount() {
	 return fixedAmount;
  }
  public void setFixedAmount(Double fixedAmount) {
	 this.fixedAmount = fixedAmount;
  } 
  
  public EarningsLine amount(Double amount) {
	 this.amount = amount;
	 return this;
  }
  /**
    * The amount of the earnings line
	* @return amount
  **/
  @ApiModelProperty(value = "The amount of the earnings line")
  public Double getAmount() {
	 return amount;
  }
  public void setAmount(Double amount) {
	 this.amount = amount;
  } 
  
  public EarningsLine isLinkedToTimesheet(Boolean isLinkedToTimesheet) {
	 this.isLinkedToTimesheet = isLinkedToTimesheet;
	 return this;
  }
  /**
    * Identifies if the earnings is taken from the timesheet
	* @return isLinkedToTimesheet
  **/
  @ApiModelProperty(value = "Identifies if the earnings is taken from the timesheet")
  public Boolean getIsLinkedToTimesheet() {
	 return isLinkedToTimesheet;
  }
  public void setIsLinkedToTimesheet(Boolean isLinkedToTimesheet) {
	 this.isLinkedToTimesheet = isLinkedToTimesheet;
  } 
 
  public EarningsLine validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public EarningsLine addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    EarningsLine earningsLine = (EarningsLine) o;
    return Objects.equals(this.earningsRateID, earningsLine.earningsRateID) &&
        Objects.equals(this.ratePerUnit, earningsLine.ratePerUnit) &&
        Objects.equals(this.numberOfUnits, earningsLine.numberOfUnits) &&
        Objects.equals(this.fixedAmount, earningsLine.fixedAmount) &&
        Objects.equals(this.amount, earningsLine.amount) &&
        Objects.equals(this.isLinkedToTimesheet, earningsLine.isLinkedToTimesheet) &&
        Objects.equals(this.validationErrors, earningsLine.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsRateID, ratePerUnit, numberOfUnits, fixedAmount, amount, isLinkedToTimesheet, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsLine {\n");
    
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isLinkedToTimesheet: ").append(toIndentedString(isLinkedToTimesheet)).append("\n");
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

