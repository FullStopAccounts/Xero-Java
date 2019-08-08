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
import org.threeten.bp.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Leave
 */

public class Leave {
	
  @JsonProperty("leaveID")
  private UUID leaveID;
  
  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;
  
  @JsonProperty("description")
  private String description;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("startDate")
  private LocalDate startDate;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("endDate")
  private LocalDate endDate;
  
  @JsonProperty("periods")
  private List<LeavePeriod> periods;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("updatedDateUTC")
  private LocalDateTime updatedDateUTC;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public Leave leaveID(UUID leaveID) {
	 this.leaveID = leaveID;
	 return this;
  }
  /**
	* The Xero identifier for the leave
	* @return leaveID
  **/
  @ApiModelProperty(required = true, value = "The Xero identifier for the leave")
  public UUID getLeaveID() {
	 return leaveID;
  }
  public void setLeaveID(UUID leaveID) {
	 this.leaveID = leaveID;
  }
  
  public Leave leaveTypeID(UUID leaveTypeID) {
	 this.leaveTypeID = leaveTypeID;
	 return this;
  }
  /**
    * The Xero identifier for the leaveTypeID
	* @return leaveTypeID
  **/
  @ApiModelProperty(value = "The Xero identifier for the leaveTypeID")
  public UUID getLeaveTypeID() {
	 return leaveTypeID;
  }
  public void setLeaveTypeID(UUID leaveTypeID) {
	 this.leaveTypeID = leaveTypeID;
  } 
  
  public Leave description(String description) {
    this.description = description;
    return this;
  }
  /**
   * The description of the leave
   * @return description
  **/
  @ApiModelProperty(required = false, value = "The description of the leave")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Leave startDate(LocalDate startDate) {
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
  
  public Leave endDate(LocalDate endDate) {
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
  
  public Leave periods(List<LeavePeriod> periods) {
    this.periods = periods;
    return this;
  }
  /**
   * The leave period information
   * @return periods
  **/
  @ApiModelProperty(value = "The leave period information")
  public List<LeavePeriod> getPeriods() {
    return periods;
  }
  public void setPeriods(List<LeavePeriod> periods) {
    this.periods = periods;
  }
  
  public Leave updatedDateUTC(LocalDateTime updatedDateUTC) {
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
  
  public Leave validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Leave addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    Leave leave = (Leave) o;
    return Objects.equals(this.leaveID, leave.leaveID) &&
        Objects.equals(this.leaveTypeID, leave.leaveTypeID) &&
        Objects.equals(this.description, leave.description) &&
        Objects.equals(this.startDate, leave.startDate) &&
        Objects.equals(this.endDate, leave.endDate) &&
        Objects.equals(this.periods, leave.periods) &&
        Objects.equals(this.updatedDateUTC, leave.updatedDateUTC) &&
        Objects.equals(this.validationErrors, leave.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveID, leaveTypeID, description, startDate, endDate, periods, updatedDateUTC, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leave {\n");
    
    sb.append("    leaveID: ").append(toIndentedString(leaveID)).append("\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
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

