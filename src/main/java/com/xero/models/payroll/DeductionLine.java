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
 * DeductionLine
 */

public class DeductionLine {
	
  @JsonProperty("deductionTypeID")
  private UUID deductionTypeID;
  
  @JsonProperty("amount")
  private Double amount;
  
  @JsonProperty("subjectToTax")
  private Boolean subjectToTax;
  
  @JsonProperty("percentage")
  private Double percentage;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public DeductionLine deductionTypeID(UUID deductionTypeID) {
	 this.deductionTypeID = deductionTypeID;
	 return this;
  }
  /**
	* Xero identifier for payroll deduction
	* @return deductionTypeID
  **/
  @ApiModelProperty(value = "Xero identifier for payroll deduction")
  public UUID getDeductionTypeID() {
	 return deductionTypeID;
  }
  public void setDeductionTypeID(UUID deductionTypeID) {
	 this.deductionTypeID = deductionTypeID;
  }
  
  public DeductionLine amount(Double amount) {
	 this.amount = amount;
	 return this;
  }
  /**
    * The amount of the deduction line
	* @return amount
  **/
  @ApiModelProperty(value = "The amount of the deduction line")
  public Double getAmount() {
	 return amount;
  }
  public void setAmount(Double amount) {
	 this.amount = amount;
  } 
  
  public DeductionLine subjectToTax(Boolean subjectToTax) {
	 this.subjectToTax = subjectToTax;
	 return this;
  }
  /**
    * Identifies if the deduction is subject to tax
	* @return subjectToTax
  **/
  @ApiModelProperty(value = "Identifies if the deduction is subject to tax")
  public Boolean getSubjectToTax() {
	 return subjectToTax;
  }
  public void setSubjectToTax(Boolean subjectToTax) {
	 this.subjectToTax = subjectToTax;
  } 
  
  public DeductionLine percentage(Double percentage) {
	 this.percentage = percentage;
	 return this;
  }
  /**
    * Deduction rate percentage
	* @return percentage
  **/
  @ApiModelProperty(required = false, value = "Deduction rate percentage")
  public Double getPercentage() {
	 return percentage;
  }
  public void setPercentage(Double percentage) {
	 this.percentage = percentage;
  } 
 
  public DeductionLine validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public DeductionLine addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    DeductionLine deductionLine = (DeductionLine) o;
    return Objects.equals(this.deductionTypeID, deductionLine.deductionTypeID) &&
        Objects.equals(this.amount, deductionLine.amount) &&
        Objects.equals(this.subjectToTax, deductionLine.subjectToTax) &&
        Objects.equals(this.percentage, deductionLine.percentage) &&
        Objects.equals(this.validationErrors, deductionLine.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductionTypeID, amount, subjectToTax, percentage, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeductionLine {\n");
    
    sb.append("    deductionTypeID: ").append(toIndentedString(deductionTypeID)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    subjectToTax: ").append(toIndentedString(subjectToTax)).append("\n");
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

