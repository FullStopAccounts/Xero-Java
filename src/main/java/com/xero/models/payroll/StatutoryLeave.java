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
 * LeaveType
 */

public class StatutoryLeave {
	
  @JsonProperty("statutoryLeaveID")
  private UUID statutoryLeaveID;
  
  @JsonProperty("employeeID")
  private UUID employeeID;
  
  /**
   * See Statutory Leave Types
   */
  public enum TypeEnum {
	@SerializedName("Adoption")
	ADOPTION("Adoption"),
	
	@SerializedName("Maternity")
	MATERNITY("Maternity"),
	
	@SerializedName("Paternity")
	PATERNITY("Paternity"),
    
	@SerializedName("SharedParental")
    SHAREDPARENTAL("SharedParental"),
    
    @SerializedName("Sick")
    SICK("Sick");

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

  @SerializedName("type")
  private TypeEnum type;
  
  @JsonProperty("startDate")
  private LocalDate startDate;
  
  @JsonProperty("endDate")
  private LocalDate endDate;
  
  @JsonProperty("isEntitled")
  private Boolean isEntitled;
  
  /**
   * See Statutory Leave Status
   */
  public enum StatusEnum {
	@SerializedName("Pending")
	PENDING("Pending"),
	
	@SerializedName("In-Progress")
	INPROGRESS("In-Progress"),
	
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
 
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public StatutoryLeave statutoryLeaveID(UUID statutoryLeaveID) {
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
  
  public StatutoryLeave employeeID(UUID employeeID) {
	 this.employeeID = employeeID;
	 return this;
  }
  /**
	* Xero unique identifier for the employee
	* @return employeeID
  **/
  @ApiModelProperty(required = true, value = "Xero unique identifier for the employee")
  public UUID getEmployeeID() {
	 return employeeID;
  }
  public void setEmployeeID(UUID employeeID) {
	 this.employeeID = employeeID;
  }
  
  public StatutoryLeave type(TypeEnum type) {
	 this.type = type;
	 return this;
  }
  /**
    * The category of statutory leave
	* @return type
  **/
  @ApiModelProperty(value = "The category of statutory leave")
  public TypeEnum getType() {
	 return type;
  }
  public void setType(TypeEnum type) {
	 this.type = type;
  } 
	  
  public StatutoryLeave startDate(LocalDate startDate) {
	 this.startDate = startDate;
	 return this;
  }
  /**
	* The date when the leave starts
	* @return startDate
  **/
  @ApiModelProperty(value = "The date when the leave starts")
  public LocalDate getStartDate() {
	 return startDate;
  }
  public void setStartDate(LocalDate startDate) {
	 this.startDate = startDate;
  }
	  
  public StatutoryLeave endDate(LocalDate endDate) {
	 this.endDate = endDate;
	 return this;
  }
  /**
	* The date when the leave ends
	* @return endDate
  **/
  @ApiModelProperty(value = "The date when the leave ends")
  public LocalDate getHoursAccruedAnnually() {
	 return endDate;
  }
  public void setHoursAccruedAnnually(LocalDate endDate) {
	 this.endDate = endDate;
  }
  
  public StatutoryLeave isEntitled(Boolean isEntitled) {
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
  
  public StatutoryLeave status(StatusEnum status) {
    this.status = status;
    return this;
  }
  /**
   * The status of the leave
   * @return status
  **/
  @ApiModelProperty(value = "The status of the leave")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  
  public StatutoryLeave validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }
  public StatutoryLeave addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    StatutoryLeave statutoryLeave = (StatutoryLeave) o;
    return Objects.equals(this.statutoryLeaveID, statutoryLeave.statutoryLeaveID) &&
    	Objects.equals(this.employeeID, statutoryLeave.employeeID) &&
    	Objects.equals(this.type, statutoryLeave.type) &&
    	Objects.equals(this.endDate, statutoryLeave.endDate) &&
        Objects.equals(this.startDate, statutoryLeave.startDate) &&
        Objects.equals(this.isEntitled, statutoryLeave.isEntitled) &&
        Objects.equals(this.status, statutoryLeave.status) &&
        Objects.equals(this.validationErrors, statutoryLeave.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statutoryLeaveID, employeeID, type, endDate, startDate, isEntitled, status, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutoryLeave {\n");
    
    sb.append("    statutoryLeaveID: ").append(toIndentedString(statutoryLeaveID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    isEntitled: ").append(toIndentedString(isEntitled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

