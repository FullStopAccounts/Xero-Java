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
 * ReimbursementLine
 */

public class ReimbursementLine {
	
  @JsonProperty("reimbursementTypeID")
  private UUID reimbursementTypeID;
  
  @JsonProperty("description")
  private String description;
  
  @JsonProperty("amount")
  private Double amount;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public ReimbursementLine reimbursementTypeID(UUID reimbursementTypeID) {
	 this.reimbursementTypeID = reimbursementTypeID;
	 return this;
  }
  /**
	* Xero identifier for payroll reimbursement
	* @return reimbursementTypeID
  **/
  @ApiModelProperty(value = "Xero identifier for payroll reimbursement")
  public UUID getReimbursementTypeID() {
	 return reimbursementTypeID;
  }
  public void setReimbursementTypeID(UUID reimbursementTypeID) {
	 this.reimbursementTypeID = reimbursementTypeID;
  }
  
  public ReimbursementLine description(String description) {
	 this.description = description;
	 return this;
  }
  /**
    * Reimbursement line description
	* @return description
  **/
  @ApiModelProperty(required = false, value = "Reimbursement line description")
  public String getDescription() {
	 return description;
  }
  public void setDescription(String description) {
	 this.description = description;
  } 
  
  public ReimbursementLine amount(Double amount) {
	 this.amount = amount;
	 return this;
  }
  /**
    * Reimbursement amount
	* @return amount
  **/
  @ApiModelProperty(value = "Reimbursement amount")
  public Double getAmount() {
	 return amount;
  }
  public void setAmount(Double amount) {
	 this.amount = amount;
  } 
 
  public ReimbursementLine validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ReimbursementLine addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    ReimbursementLine reimbursementLine = (ReimbursementLine) o;
    return Objects.equals(this.reimbursementTypeID, reimbursementLine.reimbursementTypeID) &&
    	Objects.equals(this.description, reimbursementLine.description) &&
        Objects.equals(this.amount, reimbursementLine.amount) &&
        Objects.equals(this.validationErrors, reimbursementLine.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reimbursementTypeID, description, amount, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReimbursementLine {\n");
    
    sb.append("    reimbursementTypeID: ").append(toIndentedString(reimbursementTypeID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

