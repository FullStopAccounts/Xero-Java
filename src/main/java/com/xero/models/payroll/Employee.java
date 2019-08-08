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
 * Employee
 */

public class Employee {
	
  @JsonProperty("employeeID")
  private UUID employeeID;
  
  @JsonProperty("firstName")
  private String firstName;
  
  @JsonProperty("lastName")
  private String lastName;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("dateOfBirth")
  private LocalDate dateOfBirth;
  
  @JsonProperty("gender")
  private String gender;
  
  @JsonProperty("email")
  private String email;
  
  @JsonProperty("phoneNumber")
  private String phoneNumber;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("startDate")
  private LocalDate startDate;
  
  @JsonProperty("nationalInsuranceNumber")
  private String nationalInsuranceNumber;
  
  @JsonProperty("address")
  private Address address;
  
  @JsonProperty("payrollCalendarID")
  private UUID payrollCalendarID;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("updatedDateUTC")
  private LocalDateTime updatedDateUTC;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("createdDateUTC")
  private LocalDateTime createdDateUTC;
  
  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("endDate")
  private LocalDate endDate;
	
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public Employee employeeID(UUID employeeID) {
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
  
  public Employee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  /**
   * First name of the employee
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "First name of the employee")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  /**
   * Last name of the employee
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Last name of the employee")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public Employee dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }
  /**
   * Date of birth of the employee
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Date of birth of the employee")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public Employee gender(String gender) {
    this.gender = gender;
    return this;
  }
  /**
   * The employee’s gender (F or M)
   * @return gender
  **/
  @ApiModelProperty(required = false, value = "The employee’s gender (F or M)")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  
  public Employee email(String email) {
    this.email = email;
    return this;
  }
  /**
   * Email of the employee
   * @return email
  **/
  @ApiModelProperty(required = false, value = "Email of the employee")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  
  public Employee phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  /**
   * Phone number of the employee
   * @return phoneNumber
  **/
  @ApiModelProperty(required = false, value = "Phone number of the employee")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  public Employee startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
  /**
   * Employment start date of the employee at the time it was requested
   * @return startDate
  **/
  @ApiModelProperty(value = "Employment start date of the employee at the time it was requested")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }
  
  public Employee nationalInsuranceNumber(String nationalInsuranceNumber) {
    this.nationalInsuranceNumber = nationalInsuranceNumber;
    return this;
  }
  /**
   * National insurance number of the employee
   * @return nationalInsuranceNumber
  **/
  @ApiModelProperty(required = false, value = "National insurance number of the employee")
  public String getNationalInsuranceNumber() {
	 return nationalInsuranceNumber;
  }
  public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
	 this.nationalInsuranceNumber = nationalInsuranceNumber;
  }
  
  public Employee address(Address address) {
    this.address = address;
    return this;
  }
  /**
   * Employee home address. See Address.
   * @return address
  **/
  @ApiModelProperty(value = "Employee home address. See Address.")
  public Address getAddress() {
	 return address;
  }
  public void setAddress(Address address) {
	 this.address = address;
  }
  
  public Employee payrollCalendarID(UUID payrollCalendarID) {
	 this.payrollCalendarID = payrollCalendarID;
	 return this;
  }
  /**
    * Xero unique identifier for the payroll calendar of the employee
	* @return payrollCalendarID
  **/
  @ApiModelProperty(value = "Xero unique identifier for the payroll calendar of the employee")
  public UUID getPayrollCalendarID() {
	 return payrollCalendarID;
  }
  public void setPayrollCalendarID(UUID payrollCalendarID) {
	 this.payrollCalendarID = payrollCalendarID;
  } 
  
  public Employee updatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }
  /**
   * UTC timestamp of last update to the employee
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of last update to the employee")
  public LocalDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  public void setUpdatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }
  
  public Employee createdDateUTC(LocalDateTime createdDateUTC) {
    this.createdDateUTC = createdDateUTC;
    return this;
  }
  /**
   * UTC timestamp when the employee was created in Xero
   * @return createdDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp when the employee was created in Xero")
  public LocalDateTime getCreatedDateUTC() {
    return createdDateUTC;
  }
  public void setCreatedDateUTC(LocalDateTime createdDateUTC) {
    this.createdDateUTC = createdDateUTC;
  }
  
  public Employee endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }
  /**
   * Employment end date of the employee at the time it was requested
   * @return endDate
  **/
  @ApiModelProperty(required = false, value = "Employment end date of the employee at the time it was requested")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }
  
  public Employee validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Employee addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    Employee employee = (Employee) o;
    return Objects.equals(this.employeeID, employee.employeeID) &&
        Objects.equals(this.firstName, employee.firstName) &&
        Objects.equals(this.lastName, employee.lastName) &&
        Objects.equals(this.dateOfBirth, employee.dateOfBirth) &&
        Objects.equals(this.email, employee.email) &&
        Objects.equals(this.phoneNumber, employee.phoneNumber) &&
        Objects.equals(this.startDate, employee.startDate) &&
        Objects.equals(this.payrollCalendarID, employee.payrollCalendarID) &&
        Objects.equals(this.updatedDateUTC, employee.updatedDateUTC) &&
        Objects.equals(this.createdDateUTC, employee.createdDateUTC) &&
        Objects.equals(this.endDate, employee.endDate) &&
        Objects.equals(this.validationErrors, employee.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeID, firstName, lastName, dateOfBirth, email, phoneNumber, startDate, payrollCalendarID, updatedDateUTC, createdDateUTC, endDate, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    createdDateUTC: ").append(toIndentedString(createdDateUTC)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

