/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.ValidationError;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;

import com.google.gson.annotations.SerializedName;

/**
 * PayRunCalendar
 */

public class PayRunCalendar {
	
  @JsonProperty("payrollCalendarID")
  private UUID payrollCalendarID;
  
  @JsonProperty("name")
  private String name;
	
  /**
   * See Calendar Type
   */
  public enum TypeEnum {
	  @SerializedName("Weekly")
	  WEEKLY("Weekly"),
	  
	  @SerializedName("Fortnightly")
	  FORTNIGHTLY("Fortnightly"),
	  
	  @SerializedName("FourWeekly")
	  FOURWEEKLY("FourWeekly"),
	  
	  @SerializedName("Monthly")
	  MONTHLY("Monthly"),
	  
	  @SerializedName("Annual")
	  ANNUAL("Annual"),
	  
	  @SerializedName("Quarterly")
	  QUARTERLY("Quarterly");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @SerializedName("calendarType")
  private TypeEnum calendarType;
  
  @JsonProperty("periodStartDate")
  private LocalDate periodStartDate;
  
  @JsonProperty("periodEndDate")
  private LocalDate periodEndDate;
  
  @JsonProperty("paymentDate")
  private LocalDate paymentDate;
  
  @JsonProperty("updatedDateUTC")
  private LocalDateTime updatedDateUTC;

  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public PayRunCalendar payrollCalendarID(UUID payrollCalendarID) {
	 this.payrollCalendarID = payrollCalendarID;
	 return this;
  }
  /**
    * Xero generated unique identifier for the pay run calendar
	* @return payrollCalendarID
  **/
  @ApiModelProperty(value = "Xero generated unique identifier for the pay run calendar")
  public UUID getPayrollCalendarID() {
	 return payrollCalendarID;
  }
  public void setPayrollCalendarID(UUID payrollCalendarID) {
	 this.payrollCalendarID = payrollCalendarID;
  } 
  
  public PayRunCalendar name(String name) {
	 this.name = name;
	 return this;
  }
  /**
   * Name of the calendar
   * @return name
  **/
  @ApiModelProperty(value = "Name of the calendar")
  public String getName() {
    return name;
  }
  public void setName(String name) {
	 this.name = name;
  }
  
  public PayRunCalendar calendarType(TypeEnum calendarType) {
	this.calendarType = calendarType;
	return this;
  }
  /**
	* Type of the calendar. See Pay Run Calendar types
	* @return calendarType
  **/
  @ApiModelProperty(required = true, value = "Type of the calendar. See Pay Run Calendar types")
  public TypeEnum getCalendarType() {
	return calendarType;
  }
  public void setCalendarType(TypeEnum calendarType) {
	this.calendarType = calendarType;
  }
  
  public PayRunCalendar periodStartDate(LocalDate periodStartDate) {
	this.periodStartDate = periodStartDate;
	return this;
  }
  /**
   * Period start date of the calendar
   * @return periodStartDate
  **/
  @ApiModelProperty(value = "Period start date of the calendar")
  public LocalDate getPeriodStartDate() {
    return periodStartDate;
  }
  public void setPeriodStartDate(LocalDate periodStartDate) {
	this.periodStartDate = periodStartDate;
  }
  
  public PayRunCalendar periodEndDate(LocalDate periodEndDate) {
	this.periodEndDate = periodEndDate;
	return this;
  }
  /**
   * Period End Date of the calendar
   * @return periodEndDate
  **/
  @ApiModelProperty(value = "Period End Date of the calendar")
  public LocalDate getPeriodEndDate() {
    return periodEndDate;
  }
  public void setPeriodEndDate(LocalDate periodEndDate) {
	this.periodEndDate = periodEndDate;
  }
  
  public PayRunCalendar paymentDate(LocalDate paymentDate) {
	this.paymentDate = paymentDate;
	return this;
  }
  /**
   * Payment Date of the calendar
   * @return paymentDate
  **/
  @ApiModelProperty(required = false, value = "Payment Date of the calendar")
  public LocalDate getPaymentDate() {
    return paymentDate;
  }
  public void setPaymentDate(LocalDate paymentDate) {
	this.paymentDate = paymentDate;
  }
  
  public PayRunCalendar updatedDateUTC(LocalDateTime updatedDateUTC) {
	this.updatedDateUTC = updatedDateUTC;
	return this;
  }
  /**
   * UTC timestamp of the last update to the pay run calendar
   * @return updatedDateUTC
  **/
  @ApiModelProperty(required = false, value = "UTC timestamp of the last update to the pay run calendar")
  public LocalDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  public void setUpdatedDateUTC(LocalDateTime updatedDateUTC) {
	this.updatedDateUTC = updatedDateUTC;
  }
  
  public PayRunCalendar validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public PayRunCalendar addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    PayRunCalendar payRunCalendar = (PayRunCalendar) o;
    return Objects.equals(this.payrollCalendarID, payRunCalendar.payrollCalendarID) &&
        Objects.equals(this.name, payRunCalendar.name) &&
        Objects.equals(this.calendarType, payRunCalendar.calendarType) &&
        Objects.equals(this.periodStartDate, payRunCalendar.periodStartDate) &&
        Objects.equals(this.periodEndDate, payRunCalendar.periodEndDate) &&
        Objects.equals(this.paymentDate, payRunCalendar.paymentDate) &&
        Objects.equals(this.updatedDateUTC, payRunCalendar.updatedDateUTC) &&
        Objects.equals(this.validationErrors, payRunCalendar.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payrollCalendarID, name, calendarType, periodStartDate, periodEndDate, paymentDate, updatedDateUTC, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRunCalendar {\n");
    
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    calendarType: ").append(toIndentedString(calendarType)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
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

