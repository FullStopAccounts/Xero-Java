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
 * EarningsTemplate
 */

public class EarningsTemplate {
	
  @JsonProperty("payTemplateEarningID")
  private UUID payTemplateEarningID;
  
  @JsonProperty("ratePerUnit")
  private Double ratePerUnit;
  
  @JsonProperty("numberOfUnits")
  private Double numberOfUnits;
  
  @JsonProperty("fixedAmount")
  private Double fixedAmount;
  
  @JsonProperty("earningsRateID")
  private UUID earningsRateID;
  
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public EarningsTemplate payTemplateEarningID(UUID payTemplateEarningID) {
	 this.payTemplateEarningID = payTemplateEarningID;
	 return this;
  }
  /**
	* The Xero identifier for the pay template earning line
	* @return payTemplateEarningID
  **/
  @ApiModelProperty(value = "The Xero identifier for payroll employee")
  public UUID getPayTemplateEarningID() {
	 return payTemplateEarningID;
  }
  public void setPayTemplateEarningID(UUID payTemplateEarningID) {
	 this.payTemplateEarningID = payTemplateEarningID;
  }
  
  public EarningsTemplate ratePerUnit(Double ratePerUnit) {
	 this.ratePerUnit = ratePerUnit;
	 return this;
  }
  /**
    * The rate per unit
	* @return ratePerUnit
  **/
  @ApiModelProperty(value = "The rate per unit")
  public Double getRatePerUnit() {
	 return ratePerUnit;
  }
  public void setRatePerUnit(Double ratePerUnit) {
	 this.ratePerUnit = ratePerUnit;
  } 
  
  public EarningsTemplate numberOfUnits(Double numberOfUnits) {
	 this.numberOfUnits = numberOfUnits;
	 return this;
  }
  /**
    * The number of units
	* @return numberOfUnits
  **/
  @ApiModelProperty(value = "The number of units")
  public Double getNumberOfUnits() {
	 return numberOfUnits;
  }
  public void setNumberOfUnits(Double numberOfUnits) {
	 this.numberOfUnits = numberOfUnits;
  } 
  
  public EarningsTemplate fixedAmount(Double fixedAmount) {
	 this.fixedAmount = fixedAmount;
	 return this;
  }
  /**
    * The fixed amount per period
	* @return fixedAmount
  **/
  @ApiModelProperty(value = "The fixed amount per period")
  public Double getFixedAmount() {
	 return fixedAmount;
  }
  public void setFixedAmount(Double fixedAmount) {
	 this.fixedAmount = fixedAmount;
  } 
  
  public EarningsTemplate earningsRateID(UUID earningsRateID) {
	 this.earningsRateID = earningsRateID;
	 return this;
  }
  /**
	* The corresponding earnings rate identifier
	* @return earningsRateID
  **/
  @ApiModelProperty(value = "The Xero identifier for payroll employee")
  public UUID getEarningsRateID() {
	 return earningsRateID;
  }
  public void setEarningsRateID(UUID earningsRateID) {
	 this.earningsRateID = earningsRateID;
  }
  
  public EarningsTemplate name(String name) {
	 this.name = name;
	 return this;
  }
  /**
    * future
	* @return deductionTemplates
  **/
  @ApiModelProperty(value = "future")
  public String getName() {
	 return name;
  }
  public void setName(String name) {
	 this.name = name;
  } 
  
  public EarningsTemplate validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public EarningsTemplate addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    EarningsTemplate earningsTemplate = (EarningsTemplate) o;
    return Objects.equals(this.payTemplateEarningID, earningsTemplate.payTemplateEarningID) &&
        Objects.equals(this.ratePerUnit, earningsTemplate.ratePerUnit) &&
        Objects.equals(this.numberOfUnits, earningsTemplate.numberOfUnits) &&
        Objects.equals(this.fixedAmount, earningsTemplate.fixedAmount) &&
        Objects.equals(this.earningsRateID, earningsTemplate.earningsRateID) &&
        Objects.equals(this.name, earningsTemplate.name) &&
        Objects.equals(this.validationErrors, earningsTemplate.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payTemplateEarningID, ratePerUnit, numberOfUnits, fixedAmount, earningsRateID, name, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsTemplate {\n");
    
    sb.append("    payTemplateEarningID: ").append(toIndentedString(payTemplateEarningID)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

