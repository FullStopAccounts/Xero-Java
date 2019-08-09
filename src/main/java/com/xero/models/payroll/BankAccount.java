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

/**
 * BankAccount
 */

public class BankAccount {
	
  @JsonProperty("accountName")
  private String accountName;
  
  @JsonProperty("accountNumber")
  private String accountNumber;
  
  @JsonProperty("sortCode")
  private String sortCode;
 
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public BankAccount accountName(String accountName) {
	 this.accountName = accountName;
	 return this;
  }
  /**
	* Bank account name
	* @return accountName
  **/
  @ApiModelProperty(value = "Bank account name")
  public String getAccountName() {
	 return accountName;
  }
  public void setAccountName(String accountName) {
	 this.accountName = accountName;
  }
  
  public BankAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }
  /**
   * Bank account number
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Bank account number")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  
  public BankAccount sortCode(String sortCode) {
    this.sortCode = sortCode;
    return this;
  }
  /**
   * Bank account sort code
   * @return sortCode
  **/
  @ApiModelProperty(value = "Bank account sort code")
  public String getSortCode() {
    return sortCode;
  }
  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }
  
  public BankAccount validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }
  public BankAccount addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    BankAccount bankAccount = (BankAccount) o;
    return Objects.equals(this.accountName, bankAccount.accountName) &&
        Objects.equals(this.accountNumber, bankAccount.accountNumber) &&
        Objects.equals(this.sortCode, bankAccount.sortCode) &&
        Objects.equals(this.validationErrors, bankAccount.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountNumber, sortCode, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccount {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
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

