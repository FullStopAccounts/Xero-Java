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
 * BenefitLine
 */

public class BenefitLine {
	
  @JsonProperty("benefitTypeID")
  private UUID benefitTypeID;
  
  @JsonProperty("displayName")
  private String displayName;
  
  @JsonProperty("amount")
  private Double amount;
  
  @JsonProperty("fixedAmount")
  private Double fixedAmount;
  
  @JsonProperty("percentage")
  private Double percentage;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public BenefitLine benefitTypeID(UUID benefitTypeID) {
	 this.benefitTypeID = benefitTypeID;
	 return this;
  }
  /**
	* Xero identifier for payroll benefit type
	* @return benefitTypeID
  **/
  @ApiModelProperty(value = "Xero identifier for payroll benefit type")
  public UUID getBenefitTypeID() {
	 return benefitTypeID;
  }
  public void setBenefitTypeID(UUID benefitTypeID) {
	 this.benefitTypeID = benefitTypeID;
  }
  
  public BenefitLine displayName(String displayName) {
	 this.displayName = displayName;
	 return this;
  }
  /**
    * Benefit display name
	* @return displayName
  **/
  @ApiModelProperty(value = "Benefit display name")
  public String getDisplayName() {
	 return displayName;
  }
  public void setDisplayName(String displayName) {
	 this.displayName = displayName;
  } 
  
  public BenefitLine amount(Double amount) {
	 this.amount = amount;
	 return this;
  }
  /**
    * The amount of the benefit line
	* @return amount
  **/
  @ApiModelProperty(value = "The amount of the benefit line")
  public Double getAmount() {
	 return amount;
  }
  public void setAmount(Double amount) {
	 this.amount = amount;
  } 
  
  public BenefitLine fixedAmount(Double fixedAmount) {
	 this.fixedAmount = fixedAmount;
	 return this;
  }
  /**
    * Benefit fixed amount
	* @return fixedAmount
  **/
  @ApiModelProperty(required = false, value = "Benefit fixed amount")
  public Double getFixedAmount() {
	 return fixedAmount;
  }
  public void setFixedAmount(Double fixedAmount) {
	 this.fixedAmount = fixedAmount;
  } 
  
  public BenefitLine percentage(Double percentage) {
	 this.percentage = percentage;
	 return this;
  }
  /**
    * Benefit rate percentage
	* @return percentage
  **/
  @ApiModelProperty(required = false, value = "Benefit rate percentage")
  public Double getPercentage() {
	 return percentage;
  }
  public void setPercentage(Double percentage) {
	 this.percentage = percentage;
  } 
 
  public BenefitLine validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public BenefitLine addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    BenefitLine benefitLine = (BenefitLine) o;
    return Objects.equals(this.benefitTypeID, benefitLine.benefitTypeID) &&
    	Objects.equals(this.displayName, benefitLine.displayName) &&
        Objects.equals(this.amount, benefitLine.amount) &&
        Objects.equals(this.fixedAmount, benefitLine.fixedAmount) &&
        Objects.equals(this.percentage, benefitLine.percentage) &&
        Objects.equals(this.validationErrors, benefitLine.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefitTypeID, displayName, amount, fixedAmount, percentage, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitLine {\n");
    
    sb.append("    benefitTypeID: ").append(toIndentedString(benefitTypeID)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

