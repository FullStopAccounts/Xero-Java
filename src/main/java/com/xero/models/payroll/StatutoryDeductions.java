/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * StatutoryDeductions
 */

public class StatutoryDeductions {
  
  @JsonProperty("statutoryDeductions")
  private List<StatutoryDeduction> statutoryDeductions = null;

  public StatutoryDeductions statutoryDeductions(List<StatutoryDeduction> statutoryDeductions) {
    this.statutoryDeductions = statutoryDeductions;
    return this;
  }

  public StatutoryDeductions addStatutoryDeductionsItem(StatutoryDeduction statutoryDeductionsItem) {
    if (this.statutoryDeductions == null) {
      this.statutoryDeductions = new ArrayList<StatutoryDeduction>();
    }
    this.statutoryDeductions.add(statutoryDeductionsItem);
    return this;
  }

   /**
   * Get deductions
   * @return deductions
  **/
  @ApiModelProperty(value = "")
  public List<StatutoryDeduction> getStatutoryDeductions() {
    return statutoryDeductions;
  }

  public void setStatutoryDeductions(List<StatutoryDeduction> statutoryDeductions) {
    this.statutoryDeductions = statutoryDeductions;
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
    return Objects.equals(this.statutoryDeductions, statutoryDeductions.statutoryDeductions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statutoryDeductions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutoryDeductions {\n");
    
    sb.append("    statutoryDeductions: ").append(toIndentedString(statutoryDeductions)).append("\n");
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

