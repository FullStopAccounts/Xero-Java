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
 * OpeningBalances
 */

public class OpeningBalances {
	
  @JsonProperty("statutoryAdoptionPay")
  private Double statutoryAdoptionPay;
  
  @JsonProperty("statutoryMaternityPay")
  private Double statutoryMaternityPay;
  
  @JsonProperty("statutoryPaternityPay")
  private Double statutoryPaternityPay;
  
  @JsonProperty("statutorySharedParentalPay")
  private Double statutorySharedParentalPay;
  
  @JsonProperty("statutorySickPay")
  private Double statutorySickPay;
  
  @JsonProperty("priorEmployeeNumber")
  private String priorEmployeeNumber;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public OpeningBalances statutoryAdoptionPay(Double statutoryAdoptionPay) {
	 this.statutoryAdoptionPay = statutoryAdoptionPay;
	 return this;
  }
  /**
	* The total accumulated statutory adoption pay amount received by the employee for current fiscal year to date
	* @return statutoryAdoptionPay
  **/
  @ApiModelProperty(required = false, value = "The total accumulated statutory adoption pay amount received by the employee for current fiscal year to date")
  public Double getStatutoryAdoptionPay() {
	 return statutoryAdoptionPay;
  }
  public void setStatutoryAdoptionPay(Double statutoryAdoptionPay) {
	 this.statutoryAdoptionPay = statutoryAdoptionPay;
  }
  
  public OpeningBalances statutoryMaternityPay(Double statutoryMaternityPay) {
    this.statutoryMaternityPay = statutoryMaternityPay;
    return this;
  }
  /**
   * The total accumulated statutory maternity pay amount received by the employee for current fiscal year to date
   * @return statutoryMaternityPay
  **/
  @ApiModelProperty(required = false, value = "The total accumulated statutory maternity pay amount received by the employee for current fiscal year to date")
  public Double getStatutoryMaternityPay() {
    return statutoryMaternityPay;
  }
  public void setStatutoryMaternityPay(Double statutoryMaternityPay) {
    this.statutoryMaternityPay = statutoryMaternityPay;
  }
  
  public OpeningBalances statutoryPaternityPay(Double statutoryPaternityPay) {
    this.statutoryPaternityPay = statutoryPaternityPay;
    return this;
  }
  /**
   * The total accumulated statutory paternity pay amount received by the employee for current fiscal year to date
   * @return statutoryPaternityPay
  **/
  @ApiModelProperty(required = false, value = "The total accumulated statutory paternity pay amount received by the employee for current fiscal year to date")
  public Double getStatutoryPaternityPay() {
    return statutoryPaternityPay;
  }
  public void setStatutoryPaternityPay(Double statutoryPaternityPay) {
    this.statutoryPaternityPay = statutoryPaternityPay;
  }
  
  public OpeningBalances statutorySharedParentalPay(Double statutorySharedParentalPay) {
    this.statutorySharedParentalPay = statutorySharedParentalPay;
    return this;
  }
  /**
   * The total accumulated statutory shared parental pay amount received by the employee for current fiscal year to date
   * @return statutorySharedParentalPay
  **/
  @ApiModelProperty(required = false, value = "The total accumulated statutory shared parental pay amount received by the employee for current fiscal year to date")
  public Double getStatutorySharedParentalPay() {
    return statutorySharedParentalPay;
  }
  public void setStatutorySharedParentalPay(Double statutorySharedParentalPay) {
    this.statutorySharedParentalPay = statutorySharedParentalPay;
  }
  
  public OpeningBalances statutorySickPay(Double statutorySickPay) {
    this.statutorySickPay = statutorySickPay;
    return this;
  }
  /**
   * The total accumulated statutory sick pay amount received by the employee for current fiscal year to date
   * @return statutorySickPay
  **/
  @ApiModelProperty(required = false, value = "The total accumulated statutory sick pay amount received by the employee for current fiscal year to date")
  public Double getStatutorySickPay() {
    return statutorySickPay;
  }
  public void setStatutorySickPay(Double statutorySickPay) {
    this.statutorySickPay = statutorySickPay;
  }
  
  public OpeningBalances priorEmployeeNumber(String priorEmployeeNumber) {
    this.priorEmployeeNumber = priorEmployeeNumber;
    return this;
  }
  /**
   * The unique employee number issued by the employee's former employer
   * @return priorEmployeeNumber
  **/
  @ApiModelProperty(required = false, value = "The unique employee number issued by the employee's former employer")
  public String getPriorEmployeeNumber() {
    return priorEmployeeNumber;
  }
  public void setPriorEmployeeNumber(String priorEmployeeNumber) {
    this.priorEmployeeNumber = priorEmployeeNumber;
  }
  
  public OpeningBalances validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public OpeningBalances addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    OpeningBalances openingBalances = (OpeningBalances) o;
    return Objects.equals(this.statutoryAdoptionPay, openingBalances.statutoryAdoptionPay) &&
        Objects.equals(this.statutoryMaternityPay, openingBalances.statutoryMaternityPay) &&
        Objects.equals(this.statutoryPaternityPay, openingBalances.statutoryPaternityPay) &&
        Objects.equals(this.statutorySharedParentalPay, openingBalances.statutorySharedParentalPay) &&
        Objects.equals(this.statutorySickPay, openingBalances.statutorySickPay) &&
        Objects.equals(this.priorEmployeeNumber, openingBalances.priorEmployeeNumber) &&
        Objects.equals(this.validationErrors, openingBalances.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statutoryAdoptionPay, statutoryMaternityPay, statutoryPaternityPay, statutorySharedParentalPay, statutorySickPay, priorEmployeeNumber, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpeningBalances {\n");
    
    sb.append("    statutoryAdoptionPay: ").append(toIndentedString(statutoryAdoptionPay)).append("\n");
    sb.append("    statutoryMaternityPay: ").append(toIndentedString(statutoryMaternityPay)).append("\n");
    sb.append("    statutoryPaternityPay: ").append(toIndentedString(statutoryPaternityPay)).append("\n");
    sb.append("    statutorySharedParentalPay: ").append(toIndentedString(statutorySharedParentalPay)).append("\n");
    sb.append("    statutorySickPay: ").append(toIndentedString(statutorySickPay)).append("\n");
    sb.append("    priorEmployeeNumber: ").append(toIndentedString(priorEmployeeNumber)).append("\n");
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

