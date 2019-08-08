/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.xero.models.accounting.ValidationError;

import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.threeten.bp.LocalDateTime;

/**
 * LeaveType
 */

public class LeaveType {
	
  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;
  
  /**
   * See ScheduleOfAccrual Codes
   */
  public enum CodesEnum {
	BEGINNINGOFCALENDARYEAR("BeginningOfCalendarYear"),
	
	ONANNIVERSARYDATE("OnAnniversaryDate"),
	
	EACHPAYPERIOD("EachPayPeriod"),
    
    ONHOURWORKED("OnHourWorked");

    private String value;

    CodesEnum(String value) {
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
    public static CodesEnum fromValue(String text) {
      for (CodesEnum b : CodesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("scheduleOfAccrual")
  private CodesEnum scheduleOfAccrual;
  
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("hoursAccruedAnnually")
  private Double hoursAccruedAnnually;
  
  @JsonProperty("maximumToAccrue")
  private Double maximumToAccrue;
  
  @JsonProperty("openingBalance")
  private Double openingBalance;
  
  @JsonProperty("rateAccruedHourly")
  private Double rateAccruedHourly;
  
  @JsonProperty("isPaidLeave")
  private Boolean isPaidLeave;
  
  @JsonProperty("showOnPayslip")
  private Boolean showOnPayslip;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("updatedDateUTC")
  private LocalDateTime updatedDateUTC;
  
  @JsonProperty("isStatutoryLeave")
  private Boolean isStatutoryLeave;
  
  @JsonProperty("isActive")
  private Boolean isActive;
 
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public LeaveType leaveTypeID(UUID leaveTypeID) {
	 this.leaveTypeID = leaveTypeID;
	 return this;
  }
  /**
    * The Xero identifier for leave type
	* @return leaveTypeID
  **/
  @ApiModelProperty(value = "The Xero identifier for leave type")
  public UUID getLeaveTypeID() {
	 return leaveTypeID;
  }
  public void setLeaveTypeID(UUID leaveTypeID) {
	 this.leaveTypeID = leaveTypeID;
  } 
  
  public LeaveType name(String name) {
	 this.name = name;
	 return this;
  }
  /**
    * Name of the leave type
	* @return name
  **/
  @ApiModelProperty(value = "Name of the leave type")
  public String getName() {
	 return name;
  }
  public void setName(String name) {
	 this.name = name;
  } 
	  
  public LeaveType scheduleOfAccrual(CodesEnum scheduleOfAccrual) {
	 this.scheduleOfAccrual = scheduleOfAccrual;
	 return this;
  }
  /**
	* See scheduleOfAccrual codes
	* @return scheduleOfAccrual
  **/
  @ApiModelProperty(value = "See scheduleOfAccrual codes")
  public CodesEnum getScheduleOfAccrual() {
	 return scheduleOfAccrual;
  }
  public void setScheduleOfAccrual(CodesEnum scheduleOfAccrual) {
	 this.scheduleOfAccrual = scheduleOfAccrual;
  }
	  
  public LeaveType hoursAccruedAnnually(Double hoursAccruedAnnually) {
	 this.hoursAccruedAnnually = hoursAccruedAnnually;
	 return this;
  }
  /**
	* The number of hours accrued for the leave annually. This is 0 when the scheduleOfAccrual chosen is "OnHourWorked"
	* @return hoursAccruedAnnually
  **/
  @ApiModelProperty(required = false, value = "The number of hours accrued for the leave annually. This is 0 when the scheduleOfAccrual chosen is 'OnHourWorked'")
  public Double getHoursAccruedAnnually() {
	 return hoursAccruedAnnually;
  }
  public void setHoursAccruedAnnually(Double hoursAccruedAnnually) {
	 this.hoursAccruedAnnually = hoursAccruedAnnually;
  }
  
  public LeaveType maximumToAccrue(Double maximumToAccrue) {
    this.maximumToAccrue = maximumToAccrue;
    return this;
  }
  /**
   * The maximum number of hours that can be accrued for the leave
   * @return maximumToAccrue
  **/
  @ApiModelProperty(required = false, value = "The maximum number of hours that can be accrued for the leave")
  public Double getMaximumToAccrue() {
    return maximumToAccrue;
  }
  public void setMaximumToAccrue(Double maximumToAccrue) {
    this.maximumToAccrue = maximumToAccrue;
  }
  
  public LeaveType openingBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
    return this;
  }
  /**
   * The initial number of hours assigned when the leave was added to the employee
   * @return openingBalance
  **/
  @ApiModelProperty(required = false, value = "The initial number of hours assigned when the leave was added to the employee")
  public Double getOpeningBalance() {
    return openingBalance;
  }
  public void setOpeningBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
  }
  
  public LeaveType rateAccruedHourly(Double rateAccruedHourly) {
    this.rateAccruedHourly = rateAccruedHourly;
    return this;
  }
  /**
   * The number of hours added to the leave balance for every hour worked by the employee. This is normally 0, unless the scheduleOfAccrual chosen is "OnHourWorked"
   * @return rateAccruedHourly
  **/
  @ApiModelProperty(required = false, value = "The number of hours added to the leave balance for every hour worked by the employee. This is normally 0, unless the scheduleOfAccrual chosen is 'OnHourWorked'")
  public Double getRateAccruedHourly() {
    return rateAccruedHourly;
  }
  public void setRateAccruedHourly(Double rateAccruedHourly) {
    this.rateAccruedHourly = rateAccruedHourly;
  }
  
  public LeaveType isPaidLeave(Boolean isPaidLeave) {
    this.isPaidLeave = isPaidLeave;
    return this;
  }
  /**
   * Indicates that an employee will be paid when taking this type of leave	
   * @return isPaidLeave
  **/
  @ApiModelProperty(value = "Indicates that an employee will be paid when taking this type of leave")
  public Boolean getIsPaidLeave() {
    return isPaidLeave;
  }
  public void setIsPaidLeave(Boolean isPaidLeave) {
    this.isPaidLeave = isPaidLeave;
  }
  
  public LeaveType showOnPayslip(Boolean showOnPayslip) {
    this.showOnPayslip = showOnPayslip;
    return this;
  }
  /**
   * Indicate that a balance for this leave type to be shown on the employee’s payslips
   * @return showOnPayslip
  **/
  @ApiModelProperty(value = "Indicate that a balance for this leave type to be shown on the employee’s payslips")
  public Boolean getShowOnPayslip() {
    return showOnPayslip;
  }
  public void setShowOnPayslip(Boolean showOnPayslip) {
    this.showOnPayslip = showOnPayslip;
  }
  
  public LeaveType updatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }
  /**
   * UTC timestamp of last update to the leave type note
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of last update to the leave type note")
  public LocalDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  public void setUpdatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }
  
  public LeaveType isStatutoryLeave(Boolean isStatutoryLeave) {
    this.isStatutoryLeave = isStatutoryLeave;
    return this;
  }
  /**
   * Shows whether the leave type is a statutory leave type or not
   * @return isStatutoryLeave
  **/
  @ApiModelProperty(value = "Shows whether the leave type is a statutory leave type or not")
  public Boolean getIsStatutoryLeave() {
    return isStatutoryLeave;
  }
  public void setIsStatutoryLeave(Boolean isStatutoryLeave) {
    this.isStatutoryLeave = isStatutoryLeave;
  }
  
  public LeaveType isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }
  /**
   * Shows whether the leave type is active or not
   * @return isStatutoryLeave
  **/
  @ApiModelProperty(value = "Shows whether the leave type is active or not")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }
  
  public LeaveType validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public LeaveType addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    LeaveType leaveType = (LeaveType) o;
    return Objects.equals(this.leaveTypeID, leaveType.leaveTypeID) &&
    	Objects.equals(this.scheduleOfAccrual, leaveType.scheduleOfAccrual) &&
    	Objects.equals(this.name, leaveType.name) &&
    	Objects.equals(this.hoursAccruedAnnually, leaveType.hoursAccruedAnnually) &&
        Objects.equals(this.maximumToAccrue, leaveType.maximumToAccrue) &&
        Objects.equals(this.openingBalance, leaveType.openingBalance) &&
        Objects.equals(this.rateAccruedHourly, leaveType.rateAccruedHourly) &&
        Objects.equals(this.isPaidLeave, leaveType.isPaidLeave) &&
        Objects.equals(this.showOnPayslip, leaveType.showOnPayslip) &&
        Objects.equals(this.updatedDateUTC, leaveType.updatedDateUTC) &&
        Objects.equals(this.isStatutoryLeave, leaveType.isStatutoryLeave) &&
        Objects.equals(this.validationErrors, leaveType.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveTypeID, scheduleOfAccrual, name, hoursAccruedAnnually, maximumToAccrue, openingBalance, rateAccruedHourly, isPaidLeave, showOnPayslip, updatedDateUTC, isStatutoryLeave, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveType {\n");
    
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    scheduleOfAccrual: ").append(toIndentedString(scheduleOfAccrual)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hoursAccruedAnnually: ").append(toIndentedString(hoursAccruedAnnually)).append("\n");
    sb.append("    maximumToAccrue: ").append(toIndentedString(maximumToAccrue)).append("\n");
    sb.append("    openingBalance: ").append(toIndentedString(openingBalance)).append("\n");
    sb.append("    rateAccruedHourly: ").append(toIndentedString(rateAccruedHourly)).append("\n");
    sb.append("    isPaidLeave: ").append(toIndentedString(isPaidLeave)).append("\n");
    sb.append("    showOnPayslip: ").append(toIndentedString(showOnPayslip)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    isStatutoryLeave: ").append(toIndentedString(isStatutoryLeave)).append("\n");
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

