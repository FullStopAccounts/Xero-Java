/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.annotations.SerializedName;
import com.xero.models.accounting.ValidationError;

import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PaymentMethod
 */

public class PaymentMethod {
	
  /**
   * See Payment Method
   */
  public enum MethodEnum {
	@SerializedName("Cheque")
	CHEQUE("Cheque"),
	
	@SerializedName("Electronically")
	ELECTRONICALLY("Electronically"),
    
    @SerializedName("Manual")
	MANUAL("Manual");

    private String value;

    MethodEnum(String value) {
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
    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @SerializedName("paymentMethod")
  private MethodEnum paymentMethod = null;
  
  @JsonProperty("bankAccounts")
  private List<BankAccount> bankAccounts;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public PaymentMethod paymentMethod(MethodEnum paymentMethod) {
	 this.paymentMethod = paymentMethod;
	 return this;
  }
  /**
	* See Payment Method codes
	* @return paymentMethod
  **/
  @ApiModelProperty(value = "See Payment Method codes")
  public MethodEnum getPaymentMethod() {
	 return paymentMethod;
  }
  public void setPaymentMethod(MethodEnum paymentMethod) {
	 this.paymentMethod = paymentMethod;
  }
  
  public PaymentMethod bankAccounts(List<BankAccount> bankAccounts) {
	 this.bankAccounts = bankAccounts;
	 return this;
  }
  /**
    * A list of bank accounts for the payment method
	* @return bankAccounts
  **/
  @ApiModelProperty(value = "A list of bank accounts for the payment method")
  public List<BankAccount> getBankAccounts() {
	 return bankAccounts;
  }
  public void setBankAccounts(List<BankAccount> bankAccounts) {
	 this.bankAccounts = bankAccounts;
  } 
 
  public PaymentMethod validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }
  public PaymentMethod addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    PaymentMethod paymentMethodClass = (PaymentMethod) o;
    return Objects.equals(this.paymentMethod, paymentMethodClass.paymentMethod) &&
        Objects.equals(this.bankAccounts, paymentMethodClass.bankAccounts) &&
        Objects.equals(this.validationErrors, paymentMethodClass.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, bankAccounts, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    bankAccounts: ").append(toIndentedString(bankAccounts)).append("\n");
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

