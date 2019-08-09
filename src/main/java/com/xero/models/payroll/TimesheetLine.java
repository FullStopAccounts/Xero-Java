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

import org.threeten.bp.LocalDate;

/**
 * TimesheetLine
 */

public class TimesheetLine {
	
  @JsonProperty("timesheetLineID")
  private UUID timesheetLineID;

  @JsonProperty("date")
  private LocalDate date;
  
  @JsonProperty("earningsRateID")
  private UUID earningsRateID;
  
  @JsonProperty("trackingItemID")
  private UUID trackingItemID;
  
  @JsonProperty("numberOfUnits")
  private Double numberOfUnits;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public TimesheetLine timesheetLineID(UUID timesheetLineID) {
	 this.timesheetLineID = timesheetLineID;
	 return this;
  }
  /**
	* The Xero identifier for a Timesheet Line
	* @return timesheetLineID
  **/
  @ApiModelProperty(required = true, value = "The Xero identifier for a Timesheet Line")
  public UUID getTimesheetLineID() {
	 return timesheetLineID;
  }
  public void setTimesheetID(UUID timesheetLineID) {
	 this.timesheetLineID = timesheetLineID;
  }
  
  public TimesheetLine date(LocalDate date) {
    this.date = date;
    return this;
  }
  /**
   * Start date of the leave (YYYY-MM-DD)
   * @return date
  **/
  @ApiModelProperty(value = "Start date of the leave (YYYY-MM-DD)")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  
  public TimesheetLine earningsRateID(UUID earningsRateID) {
	 this.earningsRateID = earningsRateID;
	 return this;
  }
  /**
    * The Xero identifier for the Payroll Calandar that the Timesheet applies to
	* @return earningsRateID
  **/
  @ApiModelProperty(value = "The Xero identifier for the Payroll Calandar that the Timesheet applies to")
  public UUID getEarningsRateID() {
	 return earningsRateID;
  }
  public void setEarningsRateID(UUID earningsRateID) {
	 this.earningsRateID = earningsRateID;
  } 
  
  public TimesheetLine trackingItemID(UUID trackingItemID) {
	 this.trackingItemID = trackingItemID;
	 return this;
  }
  /**
    * The Xero identifier for the Employee that the Timesheet is for
	* @return trackingItemID
  **/
  @ApiModelProperty(value = "The Xero identifier for the Employee that the Timesheet is for")
  public UUID getTrackingItemID() {
	 return trackingItemID;
  }
  public void setTrackingItemID(UUID trackingItemID) {
	 this.trackingItemID = trackingItemID;
  } 
  
  public TimesheetLine numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }
  /**
   * End date of the leave (YYYY-MM-DD)
   * @return numberOfUnits
  **/
  @ApiModelProperty(value = "End date of the leave (YYYY-MM-DD)")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }
  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public TimesheetLine addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    TimesheetLine timesheetLine = (TimesheetLine) o;
    return Objects.equals(this.timesheetLineID, timesheetLine.timesheetLineID) &&
        Objects.equals(this.date, timesheetLine.date) &&
        Objects.equals(this.earningsRateID, timesheetLine.earningsRateID) &&
        Objects.equals(this.trackingItemID, timesheetLine.trackingItemID) &&
        Objects.equals(this.numberOfUnits, timesheetLine.numberOfUnits) &&
        Objects.equals(this.validationErrors, timesheetLine.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheetLineID, date, earningsRateID, trackingItemID, numberOfUnits, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesheetLine {\n");
    
    sb.append("    timesheetLineID: ").append(toIndentedString(timesheetLineID)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    trackingItemID: ").append(toIndentedString(trackingItemID)).append("\n");
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

