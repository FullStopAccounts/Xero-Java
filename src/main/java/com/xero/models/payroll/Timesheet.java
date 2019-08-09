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
import java.util.UUID;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;

/**
 * Timesheet
 */

public class Timesheet {
	
  @JsonProperty("timesheetID")
  private UUID timesheetID;
  
  @JsonProperty("payrollCalendarID")
  private UUID payrollCalendarID;
  
  @JsonProperty("employeeID")
  private UUID employeeID;

  @JsonProperty("startDate")
  private LocalDate startDate;
  
  @JsonProperty("endDate")
  private LocalDate endDate;
  
  /**
   * See Timesheet Status
   */
  public enum StatusEnum {
	@SerializedName("Draft")
	DRAFT("Draft"),
	
	@SerializedName("Approved")
	APPROVED("Approved"),

	@SerializedName("Completed")
	COMPLETED("Completed");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @SerializedName("status")
  private StatusEnum status;
  
  @JsonProperty("totalHours")
  private Double totalHours;
  
  @JsonProperty("updatedDateUTC")
  private LocalDateTime updatedDateUTC;
  
  @JsonProperty("timesheetLines")
  private List<TimesheetLine> timesheetLines;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public Timesheet timesheetID(UUID timesheetID) {
	 this.timesheetID = timesheetID;
	 return this;
  }
  /**
	* The Xero identifier for a Timesheet
	* @return timesheetID
  **/
  @ApiModelProperty(required = true, value = "The Xero identifier for a Timesheet")
  public UUID getTimesheetID() {
	 return timesheetID;
  }
  public void setTimesheetID(UUID timesheetID) {
	 this.timesheetID = timesheetID;
  }
  
  public Timesheet payrollCalendarID(UUID payrollCalendarID) {
	 this.payrollCalendarID = payrollCalendarID;
	 return this;
  }
  /**
    * The Xero identifier for the Payroll Calandar that the Timesheet applies to
	* @return payrollCalendarID
  **/
  @ApiModelProperty(value = "The Xero identifier for the Payroll Calandar that the Timesheet applies to")
  public UUID getPayrollCalendarID() {
	 return payrollCalendarID;
  }
  public void setPayrollCalendarID(UUID payrollCalendarID) {
	 this.payrollCalendarID = payrollCalendarID;
  } 
  
  public Timesheet employeeID(UUID employeeID) {
	 this.employeeID = employeeID;
	 return this;
  }
  /**
    * The Xero identifier for the Employee that the Timesheet is for
	* @return employeeID
  **/
  @ApiModelProperty(value = "The Xero identifier for the Employee that the Timesheet is for")
  public UUID getEmployeeID() {
	 return employeeID;
  }
  public void setEmployeeID(UUID employeeID) {
	 this.employeeID = employeeID;
  } 
  
  public Timesheet startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
  /**
   * Start date of the leave (YYYY-MM-DD)
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date of the leave (YYYY-MM-DD)")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }
  
  public Timesheet endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }
  /**
   * End date of the leave (YYYY-MM-DD)
   * @return endDate
  **/
  @ApiModelProperty(value = "End date of the leave (YYYY-MM-DD)")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }
  
  public Timesheet status(StatusEnum status) {
    this.status = status;
    return this;
  }
  /**
   * See Timesheet Status codes
   * @return status
  **/
  @ApiModelProperty(value = "See Timesheet Status codes")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  
  public Timesheet totalHours(Double totalHours) {
    this.totalHours = totalHours;
    return this;
  }
  /**
   * The Total Hours of the Timesheet
   * @return totalHours
  **/
  @ApiModelProperty(value = "The Total Hours of the Timesheet")
  public Double getTotalHours() {
    return totalHours;
  }
  public void setTotalHours(Double totalHours) {
    this.totalHours = totalHours;
  }
  
  public Timesheet updatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }
  /**
   * The date the leave was last updated (YYYY-MM-DD)
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "The date the leave was last updated (YYYY-MM-DD)")
  public LocalDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  public void setUpdatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  public Timesheet timesheetLines(List<TimesheetLine> timesheetLines) {
    this.timesheetLines = timesheetLines;
    return this;
  }
  /**
   * The leave period information
   * @return periods
  **/
  @ApiModelProperty(value = "The leave period information")
  public List<TimesheetLine> getTimesheetLines() {
    return timesheetLines;
  }
  public void setTimesheetLines(List<TimesheetLine> timesheetLines) {
    this.timesheetLines = timesheetLines;
  }
  
  public Timesheet validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Timesheet addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    Timesheet leave = (Timesheet) o;
    return Objects.equals(this.timesheetID, leave.timesheetID) &&
        Objects.equals(this.payrollCalendarID, leave.payrollCalendarID) &&
        Objects.equals(this.employeeID, leave.employeeID) &&
        Objects.equals(this.startDate, leave.startDate) &&
        Objects.equals(this.endDate, leave.endDate) &&
        Objects.equals(this.status, leave.status) &&
        Objects.equals(this.totalHours, leave.totalHours) &&
        Objects.equals(this.updatedDateUTC, leave.updatedDateUTC) &&
        Objects.equals(this.timesheetLines, leave.timesheetLines) &&
        Objects.equals(this.validationErrors, leave.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheetID, payrollCalendarID, employeeID, startDate, endDate, status, totalHours, updatedDateUTC, timesheetLines, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leave {\n");
    
    sb.append("    timesheetID: ").append(toIndentedString(timesheetID)).append("\n");
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalHours: ").append(toIndentedString(totalHours)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    timesheetLines: ").append(toIndentedString(timesheetLines)).append("\n");
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

