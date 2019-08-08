/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.ValidationError;

import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import org.threeten.bp.LocalDate;
/**
 * LeavePeriod
 */

public class LeavePeriod {
	
  @JsonProperty("periodStartDate")
  private LocalDate periodStartDate;
  
  @JsonProperty("periodEndDate")
  private LocalDate periodEndDate;
  
  @JsonProperty("numberOfUnits")
  private Double numberOfUnits;
  
  /**
   * See periodStatustatus
   */
  public enum StatusEnum {
	APPROVED("Approved"),
    
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

  @JsonProperty("periodStatus")
  private StatusEnum periodStatus;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public LeavePeriod periodStartDate(LocalDate periodStartDate) {
    this.periodStartDate = periodStartDate;
    return this;
  }
  /**
   * The Pay Period Start Date (YYYY-MM-DD)
   * @return periodStatustartDate
  **/
  @ApiModelProperty(value = "The Pay Period Start Date (YYYY-MM-DD)")
  public LocalDate getPeriodStartDate() {
    return periodStartDate;
  }
  public void setPeriodStartDate(LocalDate periodStartDate) {
    this.periodStartDate = periodStartDate;
  }
  
  public LeavePeriod periodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
    return this;
  }
  /**
   * The Pay Period End Date (YYYY-MM-DD)
   * @return periodEndDate
  **/
  @ApiModelProperty(value = "The Pay Period End Date (YYYY-MM-DD)")
  public LocalDate getPeriodEndDate() {
    return periodEndDate;
  }
  public void setPeriodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
  }
  
  public LeavePeriod numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }
  /**
   * The Number of Units for the leave	
   * @return numberOfUnits
  **/
  @ApiModelProperty(value = "The Number of Units for the leave	")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }
  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }
  
  public LeavePeriod periodStatus(StatusEnum periodStatus) {
    this.periodStatus = periodStatus;
    return this;
  }
  /**
   * The leave period information
   * @return periodStatus
  **/
  @ApiModelProperty(value = "The leave period information")
  public StatusEnum getperiodStatus() {
    return periodStatus;
  }
  public void setperiodStatus(StatusEnum periodStatus) {
    this.periodStatus = periodStatus;
  }
  
  public LeavePeriod validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public LeavePeriod addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    LeavePeriod leavePeriod = (LeavePeriod) o;
    return Objects.equals(this.periodStartDate, leavePeriod.periodStartDate) &&
        Objects.equals(this.periodEndDate, leavePeriod.periodEndDate) &&
        Objects.equals(this.numberOfUnits, leavePeriod.numberOfUnits) &&
        Objects.equals(this.periodStatus, leavePeriod.periodStatus) &&
        Objects.equals(this.validationErrors, leavePeriod.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodStartDate, periodEndDate, numberOfUnits, periodStatus, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeavePeriod {\n");
    
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    periodStatus: ").append(toIndentedString(periodStatus)).append("\n");
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

