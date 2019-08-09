/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.annotations.SerializedName;
import com.xero.models.accounting.ValidationError;

import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Account
 */

public class Account {
	
  @JsonProperty("accountID")
  private UUID accountID;
  
  /**
   * See Account Type
   */
  public enum TypeEnum {
	@SerializedName("WAGESPAYABLE")
	WAGESPAYABLE("WAGESPAYABLE"),
	
	@SerializedName("WAGESEXPENSES")
	WAGESEXPENSES("WAGESEXPENSES"),
	
	@SerializedName("PAYELIABILITY")
	PAYELIABILITY("PAYELIABILITY"),
	
	@SerializedName("NICLIABILITY")
	NICLIABILITY("NICLIABILITY"),
	
	@SerializedName("EMPLOYERSNIC")
	EMPLOYERSNIC("EMPLOYERSNIC"),
    
	@SerializedName("BANK")
	BANK("BANK");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @SerializedName("type")
  private TypeEnum type;
  
  @JsonProperty("code")
  private String code;

  @JsonProperty("name")
  private String name;
 
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public Account accountID(UUID accountID) {
	 this.accountID = accountID;
	 return this;
  }
  /**
	* The Xero identifier for Settings
	* @return accountID
  **/
  @ApiModelProperty(value = "The Xero identifier for Settings")
  public UUID getAccountID() {
	 return accountID;
  }
  public void setAccountID(UUID accountID) {
	 this.accountID = accountID;
  }
  
  public Account type(TypeEnum type) {
    this.type = type;
    return this;
  }
  /**
   * The assigned AccountType
   * @return type
  **/
  @ApiModelProperty(value = "The assigned AccountType")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
  
  public Account code(String code) {
    this.code = code;
    return this;
  }
  /**
   * A unique 3 digit number for each Account
   * @return code
  **/
  @ApiModelProperty(value = "A unique 3 digit number for each Account")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  
  public Account name(String name) {
    this.name = name;
    return this;
  }
  /**
   * Name of the Account
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Account")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public Account validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }
  public Account addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    Account account = (Account) o;
    return Objects.equals(this.accountID, account.accountID) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.code, account.code) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.validationErrors, account.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, type, code, name, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

