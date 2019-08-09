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
 * Reimbursement
 */

public class Reimbursement {
	
  @JsonProperty("reimbursementID")
  private UUID reimbursementID;
  
  @JsonProperty("name")
  private String name;

  @JsonProperty("accountID")
  private UUID accountID;
  
  @JsonProperty("currentRecord")
  private Boolean currentRecord;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public Reimbursement reimbursementID(UUID reimbursementID) {
	 this.reimbursementID = reimbursementID;
	 return this;
  }
  /**
	* Xero unique identifier for a reimbursement
	* @return reimbursementID
  **/
  @ApiModelProperty(value = "Xero unique identifier for a reimbursement")
  public UUID getReimbursementID() {
	 return reimbursementID;
  }
  public void setReimbursementID(UUID reimbursementID) {
	 this.reimbursementID = reimbursementID;
  }
  
  public Reimbursement name(String name) {
	 this.name = name;
	 return this;
  }
  /**
    * Name of the reimbursement
	* @return name
  **/
  @ApiModelProperty(value = "Name of the reimbursement")
  public String getName() {
	 return name;
  }
  public void setName(String name) {
	 this.name = name;
  } 
  
  public Reimbursement accountID(UUID accountID) {
	 this.accountID = accountID;
	 return this;
  }
  /**
	* Xero unique identifier for the account used for the reimbursement
	* @return accountID
  **/
  @ApiModelProperty(value = "Xero unique identifier for the account used for the reimbursement")
  public UUID getAccountID() {
	 return accountID;
  }
  public void setAccountID(UUID accountID) {
	 this.accountID = accountID;
  }
  
  public Reimbursement currentRecord(Boolean currentRecord) {
	 this.currentRecord = currentRecord;
	 return this;
  }
  /**
    * Indicates that whether the reimbursement is active
	* @return currentRecord
  **/
  @ApiModelProperty(value = "Indicates that whether the reimbursement is active")
  public Boolean getCurrentRecord() {
	 return currentRecord;
  }
  public void setCurrentRecord(Boolean currentRecord) {
	 this.currentRecord = currentRecord;
  } 
 
  public Reimbursement validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Reimbursement addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    Reimbursement reimbursement = (Reimbursement) o;
    return Objects.equals(this.reimbursementID, reimbursement.reimbursementID) &&
    	Objects.equals(this.name, reimbursement.name) &&
        Objects.equals(this.accountID, reimbursement.accountID) &&
        Objects.equals(this.currentRecord, reimbursement.currentRecord) &&
        Objects.equals(this.validationErrors, reimbursement.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reimbursementID, name, accountID, currentRecord, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reimbursement {\n");
    
    sb.append("    reimbursementID: ").append(toIndentedString(reimbursementID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
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

