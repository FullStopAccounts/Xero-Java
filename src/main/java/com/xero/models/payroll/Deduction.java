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
import java.util.UUID;

/**
 * Deduction
 */

public class Deduction {
	
  @JsonProperty("deductionId")
  private UUID deductionId;
  
  @JsonProperty("deductionName")
  private String deductionName;
  
  /**
   * See Deduction Categories
   */
  public enum CategoryEnum {
	  STAKEHOLDERPENSION("StakeholderPension"),
	  
	  STAKEHOLDERPENSIONPOSTTAX("StakeholderPensionPostTax"),
	  
	  STUDENTLOANDEDUCTIONS("StudentLoanDeductions"),
	  
	  POSTGRADUATELOANDEDUCTIONS("PostgraduateLoanDeductions"),
	  
	  CHILDCAREVOUCHER("ChildCareVoucher"),
	  
	  SALARYSACRIFICE("SalarySacrifice"),
	  
	  UKOTHER("UkOther"),
	  
	  OTHER("Other");

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

  @JsonProperty("deductionCategory")
  private CategoryEnum deductionCategory;
  
  @JsonProperty("liabilityAccountId")
  private UUID liabilityAccountId;
  
  @JsonProperty("currentRecord")
  private Boolean currentRecord;
  
  @JsonProperty("standardAmount")
  private Double standardAmount;
  
  @JsonProperty("reducesSuperLiability")
  private Boolean reducesSuperLiability;
  
  @JsonProperty("reducesTaxLiability")
  private Boolean reducesTaxLiability;
  
  @JsonProperty("calculationType")
  private String calculationType;
  
  @JsonProperty("percentage")
  private Double percentage;
  
  @JsonProperty("subjectToNIC")
  private Boolean subjectToNIC;
  
  @JsonProperty("subjectToTax")
  private Boolean subjectToTax;
  
  @JsonProperty("isReducedByBasicRate")
  private Boolean isReducedByBasicRate;
  
  @JsonProperty("applyToPensionCalculations")
  private Boolean applyToPensionCalculations;
  
  @JsonProperty("isCalculatingOnQualifyingEarnings")
  private Boolean isCalculatingOnQualifyingEarnings;
  
  @JsonProperty("isPension")
  private Boolean isPension;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public Deduction deductionId(UUID deductionId) {
	 this.deductionId = deductionId;
	 return this;
  }
  /**
	* The Xero identifier for Deduction
	* @return deductionId
  **/
  @ApiModelProperty(value = "The Xero identifier for Deduction")
  public UUID getDeductionId() {
	 return deductionId;
  }
  public void setDeductionId(UUID deductionId) {
	 this.deductionId = deductionId;
  }
  
  public Deduction deductionName(String deductionName) {
	 this.deductionName = deductionName;
	 return this;
  }
  /**
    * Name of the deduction
	* @return payrollCalendarID
  **/
  @ApiModelProperty(value = "Name of the deduction")
  public String getDeductionName() {
	 return deductionName;
  }
  public void setDeductionName(String deductionName) {
	 this.deductionName = deductionName;
  }  
  
  public Deduction deductionCategory(CategoryEnum deductionCategory) {
	this.deductionCategory = deductionCategory;
	return this;
  }
  /**
   * Deduction Category type, see CategoryEnum
   * @return deductionCategory
  **/
  @ApiModelProperty(value = "Deduction Category type, see CategoryEnum")
  public CategoryEnum getDeductionCategory() {
    return deductionCategory;
  }
  public void setDeductionCategory(CategoryEnum deductionCategory) {
	this.deductionCategory = deductionCategory;
  } 
  
  public Deduction liabilityAccountId(UUID liabilityAccountId) {
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
  
  public Deduction currentRecord(Boolean currentRecord) {
	this.currentRecord = currentRecord;
	return this;
  }
  /**
   * Identifier for whether a record is active or not
   * @return currentRecord
  **/
  @ApiModelProperty(value = "Identifier for whether a record is active or not")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }
  public void setCurrentRecord(Boolean currentRecord) {
	this.currentRecord = currentRecord;
  } 
  
  public Deduction standardAmount(Double standardAmount) {
	this.standardAmount = standardAmount;
	return this;
  }
  /**
   * Standard amount of the deduction
   * @return standardAmount
  **/
  @ApiModelProperty(required = false, value = "Standard amount of the deduction")
  public Double getStandardAmount() {
    return standardAmount;
  }
  public void setStandardAmount(Double standardAmount) {
	this.standardAmount = standardAmount;
  } 
  
  public Deduction reducesSuperLiability(Boolean reducesSuperLiability) {
	this.reducesSuperLiability = reducesSuperLiability;
	return this;
  }
  /**
   * Standard amount of the deduction
   * @return reducesSuperLiability
  **/
  @ApiModelProperty(required = false, value = "Standard amount of the deduction")
  public Boolean getReducesSuperLiability() {
    return reducesSuperLiability;
  }
  public void setReducesSuperLiability(Boolean reducesSuperLiability) {
	this.reducesSuperLiability = reducesSuperLiability;
  } 
  
  public Deduction reducesTaxLiability(Boolean reducesTaxLiability) {
	this.reducesTaxLiability = reducesTaxLiability;
	return this;
  }
  /**
   * Standard amount of the deduction
   * @return reducesTaxLiability
  **/
  @ApiModelProperty(required = false, value = "Standard amount of the deduction")
  public Boolean getReducesTaxLiability() {
    return reducesTaxLiability;
  }
  public void setReducesTaxLiability(Boolean reducesTaxLiability) {
	this.reducesTaxLiability = reducesTaxLiability;
  } 
  
  public Deduction calculationType(String calculationType) {
	this.calculationType = calculationType;
	return this;
  }
  /**
   * Determines the calculation type, whether fixed amount or percentage of gross
   * @return calculationType
  **/
  @ApiModelProperty(required = false, value = "Determines the calculation type, whether fixed amount or percentage of gross")
  public String getCalculationType() {
    return calculationType;
  }
  public void setCalculationType(String calculationType) {
	this.calculationType = calculationType;
  } 
  
  public Deduction percentage(Double percentage) {
	this.percentage = percentage;
	return this;
  }
  /**
   * Percentage of gross
   * @return percentage
  **/
  @ApiModelProperty(required = false, value = "Percentage of gross")
  public Double getPercentage() {
    return percentage;
  }
  public void setPercentage(Double percentage) {
	this.percentage = percentage;
  } 
  
  public Deduction subjectToNIC(Boolean subjectToNIC) {
	this.subjectToNIC = subjectToNIC;
	return this;
  }
  /**
   * Identifier of subject To NIC
   * @return subjectToNIC
  **/
  @ApiModelProperty(required = false, value = "Identifier of subject To NIC")
  public Boolean getSubjectToNIC() {
     return subjectToNIC;
  }
  public void setSubjectToNIC(Boolean subjectToNIC) {
	this.subjectToNIC = subjectToNIC;
  } 
  
  public Deduction subjectToTax(Boolean subjectToTax) {
	this.subjectToTax = subjectToTax;
	return this;
  }
  /**
   * Identifier of subject To Tax
   * @return subjectToTax
  **/
  @ApiModelProperty(required = false, value = "Identifier of subject To Tax")
  public Boolean getSubjectToTax() {
    return subjectToTax;
  }
  public void setSubjectToTax(Boolean subjectToTax) {
	this.subjectToTax = subjectToTax;
  } 
  
  public Deduction isReducedByBasicRate(Boolean isReducedByBasicRate) {
	this.isReducedByBasicRate = isReducedByBasicRate;
	return this;
  }
  /**
   * Identifier of reduced by basic rate applicable or not
   * @return isReducedByBasicRate
  **/
  @ApiModelProperty(required = false, value = "Identifier of reduced by basic rate applicable or not")
  public Boolean getIsReducedByBasicRate() {
    return isReducedByBasicRate;
  }
  public void setIsReducedByBasicRate(Boolean isReducedByBasicRate) {
	this.isReducedByBasicRate = isReducedByBasicRate;
  }
  
  public Deduction applyToPensionCalculations(Boolean applyToPensionCalculations) {
	this.applyToPensionCalculations = applyToPensionCalculations;
	return this;
  }
  /**
   * Identifier for apply to pension calculations
   * @return applyToPensionCalculations
  **/
  @ApiModelProperty(required = false, value = "Identifier for apply to pension calculations")
  public Boolean getApplyToPensionCalculations() {
    return applyToPensionCalculations;
  }
  public void setApplyToPensionCalculations(Boolean applyToPensionCalculations) {
	this.applyToPensionCalculations = applyToPensionCalculations;
  }
  
  public Deduction isCalculatingOnQualifyingEarnings(Boolean isCalculatingOnQualifyingEarnings) {
	this.isCalculatingOnQualifyingEarnings = isCalculatingOnQualifyingEarnings;
	return this;
  }
  /**
   * Identifier of calculating on qualifying earnings
   * @return isCalculatingOnQualifyingEarnings
  **/
  @ApiModelProperty(required = false, value = "Identifier of calculating on qualifying earnings")
  public Boolean getIsCalculatingOnQualifyingEarnings() {
    return isCalculatingOnQualifyingEarnings;
  }
  public void setIsCalculatingOnQualifyingEarnings(Boolean isCalculatingOnQualifyingEarnings) {
	this.isCalculatingOnQualifyingEarnings = isCalculatingOnQualifyingEarnings;
  }
  
  public Deduction isPension(Boolean isPension) {
	this.isPension = isPension;
	return this;
  }
  /**
   * Identifier of applicable for pension or not
   * @return isPension
  **/
  @ApiModelProperty(required = false, value = "Identifier of applicable for pension or not")
  public Boolean getIsPension() {
    return isPension;
  }
  public void setIsPension(Boolean isPension) {
	this.isPension = isPension;
  } 
  
  public Deduction validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Deduction addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    Deduction deduction = (Deduction) o;
    return Objects.equals(this.deductionId, deduction.deductionId) &&
        Objects.equals(this.deductionName, deduction.deductionName) &&
        Objects.equals(this.deductionCategory, deduction.deductionCategory) &&
        Objects.equals(this.liabilityAccountId, deduction.liabilityAccountId) &&
        Objects.equals(this.currentRecord, deduction.currentRecord) &&
        Objects.equals(this.standardAmount, deduction.standardAmount) &&
        Objects.equals(this.reducesSuperLiability, deduction.reducesSuperLiability) &&
        Objects.equals(this.reducesTaxLiability, deduction.reducesTaxLiability) &&
        Objects.equals(this.calculationType, deduction.calculationType) &&
        Objects.equals(this.percentage, deduction.percentage) &&
        Objects.equals(this.subjectToNIC, deduction.subjectToNIC) &&
        Objects.equals(this.subjectToTax, deduction.subjectToTax) &&
        Objects.equals(this.isReducedByBasicRate, deduction.isReducedByBasicRate) &&
        Objects.equals(this.applyToPensionCalculations, deduction.applyToPensionCalculations) &&
        Objects.equals(this.isCalculatingOnQualifyingEarnings, deduction.isCalculatingOnQualifyingEarnings) &&
        Objects.equals(this.isPension, deduction.isPension) &&
        Objects.equals(this.validationErrors, deduction.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductionId, deductionName, deductionCategory, liabilityAccountId, currentRecord, standardAmount, reducesSuperLiability, reducesTaxLiability, calculationType, percentage, subjectToNIC, subjectToTax, isReducedByBasicRate, applyToPensionCalculations, isCalculatingOnQualifyingEarnings, isPension, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deduction {\n");
    
    sb.append("    deductionId: ").append(toIndentedString(deductionId)).append("\n");
    sb.append("    deductionName: ").append(toIndentedString(deductionName)).append("\n");
    sb.append("    deductionCategory: ").append(toIndentedString(deductionCategory)).append("\n");
    sb.append("    liabilityAccountId: ").append(toIndentedString(liabilityAccountId)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
    sb.append("    standardAmount: ").append(toIndentedString(standardAmount)).append("\n");
    sb.append("    reducesSuperLiability: ").append(toIndentedString(reducesSuperLiability)).append("\n");
    sb.append("    reducesTaxLiability: ").append(toIndentedString(reducesTaxLiability)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    subjectToNIC: ").append(toIndentedString(subjectToNIC)).append("\n");
    sb.append("    subjectToTax: ").append(toIndentedString(subjectToTax)).append("\n");
    sb.append("    isReducedByBasicRate: ").append(toIndentedString(isReducedByBasicRate)).append("\n");
    sb.append("    applyToPensionCalculations: ").append(toIndentedString(applyToPensionCalculations)).append("\n");
    sb.append("    isCalculatingOnQualifyingEarnings: ").append(toIndentedString(isCalculatingOnQualifyingEarnings)).append("\n");
    sb.append("    isPension: ").append(toIndentedString(isPension)).append("\n");
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