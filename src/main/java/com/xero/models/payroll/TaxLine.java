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
 * TaxLine
 */

public class TaxLine {
	
  @JsonProperty("taxLineID")
  private UUID taxLineID;
  
  @JsonProperty("description")
  private String description;
  
  @JsonProperty("isEmployerTax")
  private Boolean isEmployerTax;
  
  @JsonProperty("manualAdjustment")
  private Boolean manualAdjustment;
  
  @JsonProperty("amount")
  private Double amount;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public TaxLine taxLineID(UUID taxLineID) {
	 this.taxLineID = taxLineID;
	 return this;
  }
  /**
	* Xero identifier for payroll tax line
	* @return taxLineID
  **/
  @ApiModelProperty(value = "Xero identifier for payroll tax line")
  public UUID getTaxLineID() {
	 return taxLineID;
  }
  public void setTaxLineID(UUID taxLineID) {
	 this.taxLineID = taxLineID;
  }
  
  public TaxLine description(String description) {
	 this.description = description;
	 return this;
  }
  /**
    * Tax line description
	* @return description
  **/
  @ApiModelProperty(value = "Tax line description")
  public String getDescription() {
	 return description;
  }
  public void setDescription(String description) {
	 this.description = description;
  } 
  
  public TaxLine isEmployerTax(Boolean isEmployerTax) {
	 this.isEmployerTax = isEmployerTax;
	 return this;
  }
  /**
    * Identifies if the amount is paid for by the employee or employer. True if employer pays the tax
	* @return isEmployerTax
  **/
  @ApiModelProperty(value = "Identifies if the amount is paid for by the employee or employer. True if employer pays the tax")
  public Boolean getIsEmployerTax() {
	 return isEmployerTax;
  }
  public void setIsEmployerTax(Boolean isEmployerTax) {
	 this.isEmployerTax = isEmployerTax;
  }
  
  public TaxLine manualAdjustment(Boolean manualAdjustment) {
	 this.manualAdjustment = manualAdjustment;
	 return this;
  }
  /**
    * Identifies if the amount is a manual adjustment
	* @return manualAdjustment
  **/
  @ApiModelProperty(value = "Identifies if the amount is a manual adjustment")
  public Boolean getManualAdjustment() {
	 return manualAdjustment;
  }
  public void setManualAdjustment(Boolean manualAdjustment) {
	 this.manualAdjustment = manualAdjustment;
  }
  
  public TaxLine amount(Double amount) {
	 this.amount = amount;
	 return this;
  }
  /**
    * The amount of the tax line
	* @return amount
  **/
  @ApiModelProperty(value = "The amount of the tax line")
  public Double getAmount() {
	 return amount;
  }
  public void setAmount(Double amount) {
	 this.amount = amount;
  } 
 
  public TaxLine validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public TaxLine addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    TaxLine taxLine = (TaxLine) o;
    return Objects.equals(this.taxLineID, taxLine.taxLineID) &&
    	Objects.equals(this.description, taxLine.description) &&
    	Objects.equals(this.isEmployerTax, taxLine.isEmployerTax) &&
        Objects.equals(this.amount, taxLine.amount) &&
        Objects.equals(this.validationErrors, taxLine.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxLineID, description, isEmployerTax, amount, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxLine {\n");
    
    sb.append("    taxLineID: ").append(toIndentedString(taxLineID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isEmployerTax: ").append(toIndentedString(isEmployerTax)).append("\n");
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

