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
 * SalaryAndWages
 */

public class SalaryAndWages {
  
  @JsonProperty("salaryAndWages")
  private List<SalaryAndWage> salaryAndWages = null;

  public SalaryAndWages salaryAndWages(List<SalaryAndWage> salaryAndWages) {
    this.salaryAndWages = salaryAndWages;
    return this;
  }

  public SalaryAndWages addSalaryAndWagesItem(SalaryAndWage salaryAndWagesItem) {
    if (this.salaryAndWages == null) {
      this.salaryAndWages = new ArrayList<SalaryAndWage>();
    }
    this.salaryAndWages.add(salaryAndWagesItem);
    return this;
  }

   /**
   * Get salaryAndWages
   * @return salaryAndWages
  **/
  @ApiModelProperty(value = "")
  public List<SalaryAndWage> getSalaryAndWages() {
    return salaryAndWages;
  }

  public void setSalaryAndWages(List<SalaryAndWage> salaryAndWages) {
    this.salaryAndWages = salaryAndWages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalaryAndWages salaryAndWages = (SalaryAndWages) o;
    return Objects.equals(this.salaryAndWages, salaryAndWages.salaryAndWages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salaryAndWages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryAndWages {\n");
    
    sb.append("    salaryAndWages: ").append(toIndentedString(salaryAndWages)).append("\n");
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

