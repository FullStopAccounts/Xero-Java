/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.models.accounting.ValidationError;

import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * TrackingCategories
 */

public class TrackingCategories {
	
  @JsonProperty("employeeGroupsTrackingCategoryID")
  private UUID employeeGroupsTrackingCategoryID;
  
  @JsonProperty("timesheetTrackingCategoryID")
  private UUID timesheetTrackingCategoryID;
 
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public TrackingCategories employeeGroupsTrackingCategoryID(UUID employeeGroupsTrackingCategoryID) {
	 this.employeeGroupsTrackingCategoryID = employeeGroupsTrackingCategoryID;
	 return this;
  }
  /**
	* The Xero identifier for Employee groups tracking category
	* @return employeeGroupsTrackingCategoryID
  **/
  @ApiModelProperty(value = "The Xero identifier for Employee groups tracking category")
  public UUID getEmployeeGroupsTrackingCategoryID() {
	 return employeeGroupsTrackingCategoryID;
  }
  public void setEmployeeGroupsTrackingCategoryID(UUID employeeGroupsTrackingCategoryID) {
	 this.employeeGroupsTrackingCategoryID = employeeGroupsTrackingCategoryID;
  }
  
  public TrackingCategories timesheetTrackingCategoryID(UUID timesheetTrackingCategoryID) {
	 this.timesheetTrackingCategoryID = timesheetTrackingCategoryID;
	 return this;
  }
  /**
	* The Xero identifier for Timesheet tracking category
	* @return timesheetTrackingCategoryID
  **/
  @ApiModelProperty(value = "The Xero identifier for Timesheet tracking category")
  public UUID getTimesheetTrackingCategoryID() {
	 return timesheetTrackingCategoryID;
  }
  public void setTimesheetTrackingCategoryID(UUID timesheetTrackingCategoryID) {
	 this.timesheetTrackingCategoryID = timesheetTrackingCategoryID;
  }
  
  public TrackingCategories validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }
  public TrackingCategories addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    TrackingCategories trackingCategories = (TrackingCategories) o;
    return Objects.equals(this.employeeGroupsTrackingCategoryID, trackingCategories.employeeGroupsTrackingCategoryID) &&
        Objects.equals(this.timesheetTrackingCategoryID, trackingCategories.timesheetTrackingCategoryID) &&
        Objects.equals(this.validationErrors, trackingCategories.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeGroupsTrackingCategoryID, timesheetTrackingCategoryID, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingCategories {\n");
    
    sb.append("    employeeGroupsTrackingCategoryID: ").append(toIndentedString(employeeGroupsTrackingCategoryID)).append("\n");
    sb.append("    timesheetTrackingCategoryID: ").append(toIndentedString(timesheetTrackingCategoryID)).append("\n");
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

