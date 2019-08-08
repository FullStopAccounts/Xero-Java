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
 * Benefits
 */

public class Benefits {
  
  @JsonProperty("benefits")
  private List<Benefit> benefits = null;

  public Benefits benefits(List<Benefit> benefits) {
    this.benefits = benefits;
    return this;
  }

  public Benefits addBenefitsItem(Benefit benefitsItem) {
    if (this.benefits == null) {
      this.benefits = new ArrayList<Benefit>();
    }
    this.benefits.add(benefitsItem);
    return this;
  }

   /**
   * Get benefits
   * @return benefits
  **/
  @ApiModelProperty(value = "")
  public List<Benefit> getBenefits() {
    return benefits;
  }

  public void setBenefits(List<Benefit> benefits) {
    this.benefits = benefits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Benefits benefits = (Benefits) o;
    return Objects.equals(this.benefits, benefits.benefits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Benefits {\n");
    
    sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
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

