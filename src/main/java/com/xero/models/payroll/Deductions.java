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
 * Deductions
 */

public class Deductions {
  
  @JsonProperty("deductions")
  private List<Deduction> deductions = null;

  public Deductions deductions(List<Deduction> deductions) {
    this.deductions = deductions;
    return this;
  }

  public Deductions addDeductionsItem(Deduction deductionsItem) {
    if (this.deductions == null) {
      this.deductions = new ArrayList<Deduction>();
    }
    this.deductions.add(deductionsItem);
    return this;
  }

   /**
   * Get deductions
   * @return deductions
  **/
  @ApiModelProperty(value = "")
  public List<Deduction> getDeductions() {
    return deductions;
  }

  public void setDeductions(List<Deduction> deductions) {
    this.deductions = deductions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deductions deductions = (Deductions) o;
    return Objects.equals(this.deductions, deductions.deductions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deductions {\n");
    
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
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

