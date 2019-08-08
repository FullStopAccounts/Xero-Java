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

/**
 * StatutorySickLeave
 */

public class StatutorySickLeave {
	
  @JsonProperty("statutoryLeaveID")
  private UUID statutoryLeaveID;
  
  @JsonProperty("employeeID")
  private UUID employeeID;
  
  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;
  
  @JsonProperty("startDate")
  private LocalDate startDate;
  
  @JsonProperty("endDate")
  private LocalDate endDate;
  
  @JsonProperty("workPattern")
  private List<String> workPattern;
  
  @JsonProperty("isPregnancyRelated")
  private Boolean isPregnancyRelated;
  
  @JsonProperty("sufficientNotice")
  private Boolean sufficientNotice;
  
  @JsonProperty("isEntitled")
  private Boolean isEntitled;
  
  @JsonProperty("entitlementWeeksRequested")
  private Double entitlementWeeksRequested;
  
  @JsonProperty("entitlementWeeksQualified")
  private Double entitlementWeeksQualified;
  
  @JsonProperty("entitlementWeeksRemaining")
  private Double entitlementWeeksRemaining;
  
  @JsonProperty("overlapsWithOtherLeave")
  private Boolean overlapsWithOtherLeave;
  
  /**
   * See Entitlement Failure Reasons
   */
  public enum ReasonEnum {
	@SerializedName("UnableToCalculateAwe")
	UNABLETOCALCULATEAWE("UnableToCalculateAwe"),
	
	@SerializedName("AweLowerThanLel")
	AWELOWERTHANLEL("AweLowerThanLel"),
	
	@SerializedName("NotQualifiedInPreviousPiw")
	NOTQUALIFIEDINPREVIOUSPIW("NotQualifiedInPreviousPiw"),
    
	@SerializedName("ExceededMaximumEntitlementWeeksOfSsp")
	EXCEEDEDMAXIMUMENTITLEMENTWEEKSOFSSP("ExceededMaximumEntitlementWeeksOfSsp"),
    
    @SerializedName("ExceededMaximumDurationOfPiw")
	EXCEEDEDMAXIMUMDURATIONOFPIW("ExceededMaximumDurationOfPiw"),
    
    @SerializedName("SufficientNoticeNotGiven")
	SUFFICIENTNOTICENOTGIVEN("SufficientNoticeNotGiven");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }
  @SerializedName("entitlementFailureReasons")
  private List<ReasonEnum> entitlementFailureReasons;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public StatutorySickLeave statutoryLeaveID(UUID statutoryLeaveID) {
	 this.statutoryLeaveID = statutoryLeaveID;
	 return this;
  }
  /**
	* The unique identifier (guid) of a statutory leave
	* @return statutoryLeaveID
  **/
  @ApiModelProperty(required = true, value = "The unique identifier (guid) of a statutory leave")
  public UUID getStatutoryLeaveID() {
	 return statutoryLeaveID;
  }
  public void setStatutoryLeaveID(UUID statutoryLeaveID) {
	 this.statutoryLeaveID = statutoryLeaveID;
  }
  
  public StatutorySickLeave employeeID(UUID employeeID) {
		 this.employeeID = employeeID;
		 return this;
	  }
	  /**
	    * The unique identifier (guid) of the employee
		* @return employeeID
	  **/
	  @ApiModelProperty(value = "The unique identifier (guid) of the employee")
	  public UUID getEmployeeID() {
		 return employeeID;
	  }
	  public void setEmployeeID(UUID employeeID) {
		 this.employeeID = employeeID;
	  } 
  
  public StatutorySickLeave leaveTypeID(UUID leaveTypeID) {
	 this.leaveTypeID = leaveTypeID;
	 return this;
  }
  /**
    * The unique identifier (guid) of the "Statutory Sick Leave (non-pensionable)" pay item
	* @return leaveTypeID
  **/
  @ApiModelProperty(value = "The unique identifier (guid) of the 'Statutory Sick Leave (non-pensionable)' pay item")
  public UUID getLeaveTypeID() {
	 return leaveTypeID;
  }
  public void setLeaveTypeID(UUID leaveTypeID) {
	 this.leaveTypeID = leaveTypeID;
  } 
  
  public StatutorySickLeave startDate(LocalDate startDate) {
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
  
  public StatutorySickLeave endDate(LocalDate endDate) {
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
  
  public StatutorySickLeave workPattern(List<String> workPattern) {
    this.workPattern = workPattern;
    return this;
  }
  /**
   * The days of the work week the employee is scheduled to work at the time the leave is taken
   * @return workPattern
  **/
  @ApiModelProperty(value = "The days of the work week the employee is scheduled to work at the time the leave is taken")
  public List<String> getWorkPattern() {
    return workPattern;
  }
  public void setWorkPattern(List<String> workPattern) {
    this.workPattern = workPattern;
  }
  
  public StatutorySickLeave isPregnancyRelated(Boolean isPregnancyRelated) {
    this.isPregnancyRelated = isPregnancyRelated;
    return this;
  }
  /**
   * Whether the sick leave was pregnancy related
   * @return isPregnancyRelated
  **/
  @ApiModelProperty(value = "Whether the sick leave was pregnancy related")
  public Boolean getIsPregnancyRelated() {
    return isPregnancyRelated;
  }
  public void setIsPregnancyRelated(Boolean isPregnancyRelated) {
    this.isPregnancyRelated = isPregnancyRelated;
  }
  
  public StatutorySickLeave sufficientNotice(Boolean sufficientNotice) {
    this.sufficientNotice = sufficientNotice;
    return this;
  }
  /**
   * Whether the employee provided sufficent notice and documentation as required by the employer supporting the sick leave request
   * @return sufficientNotice
  **/
  @ApiModelProperty(value = "Whether the employee provided sufficent notice and documentation as required by the employer supporting the sick leave request")
  public Boolean getSufficientNotice() {
    return sufficientNotice;
  }
  public void setSufficientNotice(Boolean sufficientNotice) {
    this.sufficientNotice = sufficientNotice;
  }
  
  public StatutorySickLeave isEntitled(Boolean isEntitled) {
    this.isEntitled = isEntitled;
    return this;
  }
  /**
   * Whether the leave was entitled to receive payment
   * @return isEntitled
  **/
  @ApiModelProperty(value = "Whether the leave was entitled to receive payment")
  public Boolean getIsEntitled() {
    return isEntitled;
  }
  public void setIsEntitled(Boolean isEntitled) {
    this.isEntitled = isEntitled;
  }
  
  public StatutorySickLeave entitlementWeeksRequested(Double entitlementWeeksRequested) {
    this.entitlementWeeksRequested = entitlementWeeksRequested;
    return this;
  }
  /**
   * The amount of requested time (in weeks)
   * @return entitlementWeeksRequested
  **/
  @ApiModelProperty(value = "The amount of requested time (in weeks)")
  public Double getEntitlementWeeksRequested() {
    return entitlementWeeksRequested;
  }
  public void setEntitlementWeeksRequested(Double entitlementWeeksRequested) {
    this.entitlementWeeksRequested = entitlementWeeksRequested;
  }
  
  public StatutorySickLeave entitlementWeeksQualified(Double entitlementWeeksQualified) {
    this.entitlementWeeksQualified = entitlementWeeksQualified;
    return this;
  }
  /**
   * The amount of statutory sick leave time off (in weeks) that is available to take at the time the leave was requested
   * @return entitlementWeeksQualified
  **/
  @ApiModelProperty(value = "The amount of statutory sick leave time off (in weeks) that is available to take at the time the leave was requested")
  public Double getEntitlementWeeksQualified() {
    return entitlementWeeksQualified;
  }
  public void setEntitlementWeeksQualified(Double entitlementWeeksQualified) {
    this.entitlementWeeksQualified = entitlementWeeksQualified;
  }
  
  public StatutorySickLeave entitlementWeeksRemaining(Double entitlementWeeksRemaining) {
    this.entitlementWeeksRemaining = entitlementWeeksRemaining;
    return this;
  }
  /**
   * A calculated amount of time (in weeks) that remains for the statutory sick leave period
   * @return entitlementWeeksRemaining
  **/
  @ApiModelProperty(value = "A calculated amount of time (in weeks) that remains for the statutory sick leave period")
  public Double getEntitlementWeeksRemaining() {
    return entitlementWeeksRemaining;
  }
  public void setEntitlementWeeksRemaining(Double entitlementWeeksRemaining) {
    this.entitlementWeeksRemaining = entitlementWeeksRemaining;
  }
  
  public StatutorySickLeave overlapsWithOtherLeave(Boolean overlapsWithOtherLeave) {
    this.overlapsWithOtherLeave = overlapsWithOtherLeave;
    return this;
  }
  /**
   * Whether another leave (Paternity, Shared Parental specifically) occurs during the requested leave's period. While this is allowed it could affect payment amounts
   * @return overlapsWithOtherLeave
  **/
  @ApiModelProperty(value = "Whether another leave (Paternity, Shared Parental specifically) occurs during the requested leave's period. While this is allowed it could affect payment amounts")
  public Boolean getOverlapsWithOtherLeave() {
    return overlapsWithOtherLeave;
  }
  public void setOverlapsWithOtherLeave(Boolean overlapsWithOtherLeave) {
    this.overlapsWithOtherLeave = overlapsWithOtherLeave;
  }
  
  public StatutorySickLeave entitlementFailureReasons(List<ReasonEnum> entitlementFailureReasons) {
    this.entitlementFailureReasons = entitlementFailureReasons;
    return this;
  }
  /**
   * If the leave requested was considered 'not entitled', the reasons why are listed here.
   * @return entitlementFailureReasons
  **/
  @ApiModelProperty(value = "If the leave requested was considered 'not entitled', the reasons why are listed here.")
  public List<ReasonEnum> getEntitlementFailureReasons() {
    return entitlementFailureReasons;
  }
  public void setEntitlementFailureReasons(List<ReasonEnum> entitlementFailureReasons) {
    this.entitlementFailureReasons = entitlementFailureReasons;
  }
  
  public StatutorySickLeave validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }
  public StatutorySickLeave addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    StatutorySickLeave statutorySickLeave = (StatutorySickLeave) o;
    return Objects.equals(this.statutoryLeaveID, statutorySickLeave.statutoryLeaveID) &&
    	Objects.equals(this.employeeID, statutorySickLeave.employeeID) &&
        Objects.equals(this.leaveTypeID, statutorySickLeave.leaveTypeID) &&
        Objects.equals(this.startDate, statutorySickLeave.startDate) &&
        Objects.equals(this.endDate, statutorySickLeave.endDate) &&
        Objects.equals(this.workPattern, statutorySickLeave.workPattern) &&
        Objects.equals(this.isPregnancyRelated, statutorySickLeave.isPregnancyRelated) &&
        Objects.equals(this.sufficientNotice, statutorySickLeave.sufficientNotice) &&
        Objects.equals(this.isEntitled, statutorySickLeave.isEntitled) &&
        Objects.equals(this.entitlementWeeksRequested, statutorySickLeave.entitlementWeeksRequested) &&
        Objects.equals(this.entitlementWeeksQualified, statutorySickLeave.entitlementWeeksQualified) &&
        Objects.equals(this.entitlementWeeksRemaining, statutorySickLeave.entitlementWeeksRemaining) &&
        Objects.equals(this.overlapsWithOtherLeave, statutorySickLeave.overlapsWithOtherLeave) &&
        Objects.equals(this.entitlementFailureReasons, statutorySickLeave.entitlementFailureReasons) &&
        Objects.equals(this.validationErrors, statutorySickLeave.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statutoryLeaveID, employeeID, leaveTypeID, startDate, endDate, workPattern, isPregnancyRelated, sufficientNotice, isEntitled, entitlementWeeksRequested, entitlementWeeksQualified, entitlementWeeksRemaining, overlapsWithOtherLeave, entitlementFailureReasons, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutorySickLeave {\n");
    
    sb.append("    statutoryLeaveID: ").append(toIndentedString(statutoryLeaveID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    workPattern: ").append(toIndentedString(workPattern)).append("\n");
    sb.append("    isPregnancyRelated: ").append(toIndentedString(isPregnancyRelated)).append("\n");
    sb.append("    sufficientNotice: ").append(toIndentedString(sufficientNotice)).append("\n");
    sb.append("    isEntitled: ").append(toIndentedString(isEntitled)).append("\n");
    sb.append("    entitlementWeeksRequested: ").append(toIndentedString(entitlementWeeksRequested)).append("\n");
    sb.append("    entitlementWeeksQualified: ").append(toIndentedString(entitlementWeeksQualified)).append("\n");
    sb.append("    entitlementWeeksRemaining: ").append(toIndentedString(entitlementWeeksRemaining)).append("\n");
    sb.append("    overlapsWithOtherLeave: ").append(toIndentedString(overlapsWithOtherLeave)).append("\n");
    sb.append("    entitlementFailureReasons: ").append(toIndentedString(entitlementFailureReasons)).append("\n");
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

