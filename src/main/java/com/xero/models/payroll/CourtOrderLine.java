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
 * CourtOrderLine
 */

public class CourtOrderLine {
	
  @JsonProperty("courtOrderTypeID")
  private UUID courtOrderTypeID;
  
  @JsonProperty("amount")
  private Double amount;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public CourtOrderLine courtOrderTypeID(UUID courtOrderTypeID) {
	 this.courtOrderTypeID = courtOrderTypeID;
	 return this;
  }
  /**
	* Xero identifier for payroll court order type
	* @return courtOrderTypeID
  **/
  @ApiModelProperty(value = "Xero identifier for payroll court order type")
  public UUID getCourtOrderTypeID() {
	 return courtOrderTypeID;
  }
  public void setCourtOrderTypeID(UUID courtOrderTypeID) {
	 this.courtOrderTypeID = courtOrderTypeID;
  }
  
  public CourtOrderLine amount(Double amount) {
	 this.amount = amount;
	 return this;
  }
  /**
    * The amount of the court order line
	* @return amount
  **/
  @ApiModelProperty(value = "The amount of the court order line")
  public Double getAmount() {
	 return amount;
  }
  public void setAmount(Double amount) {
	 this.amount = amount;
  } 
 
  public CourtOrderLine validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public CourtOrderLine addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    CourtOrderLine courtOrderLine = (CourtOrderLine) o;
    return Objects.equals(this.courtOrderTypeID, courtOrderLine.courtOrderTypeID) &&
        Objects.equals(this.amount, courtOrderLine.amount) &&
        Objects.equals(this.validationErrors, courtOrderLine.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courtOrderTypeID, amount, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourtOrderLine {\n");
    
    sb.append("    courtOrderTypeID: ").append(toIndentedString(courtOrderTypeID)).append("\n");
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

