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
 * LeaveAccrualLine
 */

public class LeaveAccrualLine {
	
  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;
  
  @JsonProperty("numberOfUnits")
  private Double numberOfUnits;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public LeaveAccrualLine leaveTypeID(UUID leaveTypeID) {
	 this.leaveTypeID = leaveTypeID;
	 return this;
  }
  /**
	* Xero generated unique identifier for leave type
	* @return leaveTypeID
  **/
  @ApiModelProperty(value = "Xero generated unique identifier for leave type")
  public UUID getLeaveTypeID() {
	 return leaveTypeID;
  }
  public void setLeaveTypeID(UUID leaveTypeID) {
	 this.leaveTypeID = leaveTypeID;
  }
  
  public LeaveAccrualLine numberOfUnits(Double numberOfUnits) {
	 this.numberOfUnits = numberOfUnits;
	 return this;
  }
  /**
    * Leave accrual number of units
	* @return numberOfUnits
  **/
  @ApiModelProperty(required = false, value = "Leave accrual number of units")
  public Double getNumberOfUnits() {
	 return numberOfUnits;
  }
  public void setNumberOfUnits(Double numberOfUnits) {
	 this.numberOfUnits = numberOfUnits;
  } 
 
  public LeaveAccrualLine validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public LeaveAccrualLine addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    LeaveAccrualLine leaveAccrualLine = (LeaveAccrualLine) o;
    return Objects.equals(this.leaveTypeID, leaveAccrualLine.leaveTypeID) &&
        Objects.equals(this.numberOfUnits, leaveAccrualLine.numberOfUnits) &&
        Objects.equals(this.validationErrors, leaveAccrualLine.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveTypeID, numberOfUnits, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveAccrualLine {\n");
    
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
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

