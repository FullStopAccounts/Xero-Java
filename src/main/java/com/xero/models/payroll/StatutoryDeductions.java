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

/**
 * StatutoryDeductions
 */

public class StatutoryDeductions {
	
  @JsonProperty("id")
  private UUID id = null;
  
  @JsonProperty("name")
  private String name = null;
  
  /**
   * See Statutory Deduction Category
   */
  public enum CategoryEnum {
	@SerializedName("PriorityOrder")
	PRIORITYORDER("PriorityOrder"),
	
	@SerializedName("NonPriorityOrder")
	NONPRIORITYORDER("NonPriorityOrder"),
	
	@SerializedName("TableBased")
	TABLEBASED("TableBased"),
	
	@SerializedName("ChildSupport")
	CHILDSUPPORT("ChildSupport"),
	
	@SerializedName("CourtFines")
	COURTFINES("CourtFines"),
	
	@SerializedName("InlandRevenueArrears")
	INLANDREVENUEARREARS("InlandRevenueArrears"),
	
	@SerializedName("MsdRepayments")
	MSDREPAYMENTS("MsdRepayments"),
	
	@SerializedName("StudentLoan")
	STUDENTLOAN("StudentLoan"),
	
	@SerializedName("AdditionalStudentLoan")
	ADDITIONALSTUDENTLOAN("AdditionalStudentLoan"),
	
	@SerializedName("VoluntaryStudentLoan")
	VOLUNTARYSTUDENTLOAN("VoluntaryStudentLoan"),
	
	@SerializedName("KiwiSaver")
	KIWISAVER("KiwiSaver"),
	
	@SerializedName("FederalLevy")
	FEDERALLEVY("FederalLevy"),
	
	@SerializedName("USChildSupport")
	USCHILDSUPPORT("USChildSupport"),
    
    @SerializedName("Creditor")
	CREDITOR("Creditor");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @SerializedName("statutoryDeductionCategory")
  private CategoryEnum statutoryDeductionCategory = null;

  @JsonProperty("liabilityAccountId")
  private UUID liabilityAccountId = null;
  
  @JsonProperty("currentRecord")
  private Boolean currentRecord = null;
	
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public StatutoryDeductions id(UUID id) {
	 this.id = id;
	 return this;
  }
  /**
	* The Xero identifier for earnings order
	* @return id
  **/
  @ApiModelProperty(required = true, value = "The Xero identifier for earnings order")
  public UUID getId() {
	 return id;
  }
  public void setId(UUID id) {
	 this.id = id;
  }
  
  public StatutoryDeductions name(String name) {
    this.name = name;
    return this;
  }
  /**
   * Name of the earnings order
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the earnings order")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public StatutoryDeductions statutoryDeductionCategory(CategoryEnum statutoryDeductionCategory) {
    this.statutoryDeductionCategory = statutoryDeductionCategory;
    return this;
  }
  /**
   * Statutory Deduction Category
   * @return statutoryDeductionCategory
  **/
  @ApiModelProperty(value = "Statutory Deduction Category")
  public CategoryEnum getStatutoryDeductionCategory() {
    return statutoryDeductionCategory;
  }
  public void setStatutoryDeductionCategory(CategoryEnum statutoryDeductionCategory) {
    this.statutoryDeductionCategory = statutoryDeductionCategory;
  }
  
  public StatutoryDeductions liabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
    return this;
  }
  /**
   * Xero identifier for Liability Account
   * @return liabilityAccountId
  **/
  @ApiModelProperty(value = "Xero identifier for Liability Account")
  public UUID getLiabilityAccountId() {
    return liabilityAccountId;
  }
  public void setLiabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
  }
  
  public StatutoryDeductions currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }
  /**
   * Identifier of a record is active or not
   * @return currentRecord
  **/
  @ApiModelProperty(value = "Identifier of a record is active or not")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }
  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }
  
  public StatutoryDeductions validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public StatutoryDeductions addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    StatutoryDeductions statutoryDeductions = (StatutoryDeductions) o;
    return Objects.equals(this.id, statutoryDeductions.id) &&
        Objects.equals(this.name, statutoryDeductions.name) &&
        Objects.equals(this.statutoryDeductionCategory, statutoryDeductions.statutoryDeductionCategory) &&
        Objects.equals(this.liabilityAccountId, statutoryDeductions.liabilityAccountId) &&
        Objects.equals(this.currentRecord, statutoryDeductions.currentRecord) &&
        Objects.equals(this.validationErrors, statutoryDeductions.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, statutoryDeductionCategory, liabilityAccountId, currentRecord, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutoryDeductions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statutoryDeductionCategory: ").append(toIndentedString(statutoryDeductionCategory)).append("\n");
    sb.append("    liabilityAccountId: ").append(toIndentedString(liabilityAccountId)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
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

