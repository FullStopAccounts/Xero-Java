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

/**
 * PayTemplates
 */

public class PayTemplate {
	
  @JsonProperty("employeeID")
  private UUID employeeID;
  
  @JsonProperty("earningTemplates")
  private List<EarningsTemplate> earningTemplates;
  
  @JsonProperty("deductionTemplates")
  private List<EarningsTemplate> deductionTemplates;
  
  @JsonProperty("benefitTemplates")
  private List<EarningsTemplate> benefitTemplates;
  
  @JsonProperty("reimbursementTemplates")
  private List<EarningsTemplate> reimbursementTemplates;
  
  @JsonProperty("validationErrors")
  private List<ValidationError> validationErrors = null;
  
  
  public PayTemplate employeeID(UUID employeeID) {
	 this.employeeID = employeeID;
	 return this;
  }
  /**
	* The Xero identifier for payroll employee
	* @return employeeID
  **/
  @ApiModelProperty(value = "The Xero identifier for payroll employee")
  public UUID getEmployeeID() {
	 return employeeID;
  }
  public void setEmployeeID(UUID employeeID) {
	 this.employeeID = employeeID;
  }
  
  public PayTemplate earningTemplates(List<EarningsTemplate> earningTemplates) {
	 this.earningTemplates = earningTemplates;
	 return this;
  }
  /**
    * See EarningsTemplate
	* @return earningTemplates
  **/
  @ApiModelProperty(value = "See EarningsTemplate")
  public List<EarningsTemplate> getEarningTemplates() {
	 return earningTemplates;
  }
  public void setEarningTemplates(List<EarningsTemplate> earningTemplates) {
	 this.earningTemplates = earningTemplates;
  } 
  
  public PayTemplate deductionTemplates(List<EarningsTemplate> deductionTemplates) {
	 this.deductionTemplates = deductionTemplates;
	 return this;
  }
  /**
    * future
	* @return deductionTemplates
  **/
  @ApiModelProperty(value = "future")
  public List<EarningsTemplate> getDeductionTemplates() {
	 return deductionTemplates;
  }
  public void setDeductionTemplates(List<EarningsTemplate> deductionTemplates) {
	 this.deductionTemplates = deductionTemplates;
  } 
  
  
  public PayTemplate benefitTemplates(List<EarningsTemplate> benefitTemplates) {
	 this.benefitTemplates = benefitTemplates;
	 return this;
  }
  /**
    * future
	* @return deductionTemplates
  **/
  @ApiModelProperty(value = "future")
  public List<EarningsTemplate> getBenefitTemplates() {
	 return benefitTemplates;
  }
  public void setBenefitTemplates(List<EarningsTemplate> benefitTemplates) {
	 this.benefitTemplates = benefitTemplates;
  } 
  
  
  public PayTemplate reimbursementTemplates(List<EarningsTemplate> reimbursementTemplates) {
	 this.reimbursementTemplates = reimbursementTemplates;
	 return this;
  }
  /**
    * future
	* @return deductionTemplates
  **/
  @ApiModelProperty(value = "future")
  public List<EarningsTemplate> getReimbursementTemplates() {
	 return reimbursementTemplates;
  }
  public void setReimbursementTemplates(List<EarningsTemplate> reimbursementTemplates) {
	 this.reimbursementTemplates = reimbursementTemplates;
  } 
 
  public PayTemplate validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public PayTemplate addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    PayTemplate payTemplate = (PayTemplate) o;
    return Objects.equals(this.employeeID, payTemplate.employeeID) &&
        Objects.equals(this.earningTemplates, payTemplate.earningTemplates) &&
        Objects.equals(this.deductionTemplates, payTemplate.deductionTemplates) &&
        Objects.equals(this.benefitTemplates, payTemplate.benefitTemplates) &&
        Objects.equals(this.reimbursementTemplates, payTemplate.reimbursementTemplates) &&
        Objects.equals(this.validationErrors, payTemplate.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeID, earningTemplates, deductionTemplates, benefitTemplates, reimbursementTemplates, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayTemplate {\n");
    
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    earningTemplates: ").append(toIndentedString(earningTemplates)).append("\n");
    sb.append("    deductionTemplates: ").append(toIndentedString(deductionTemplates)).append("\n");
    sb.append("    benefitTemplates: ").append(toIndentedString(benefitTemplates)).append("\n");
    sb.append("    reimbursementTemplates: ").append(toIndentedString(reimbursementTemplates)).append("\n");
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

