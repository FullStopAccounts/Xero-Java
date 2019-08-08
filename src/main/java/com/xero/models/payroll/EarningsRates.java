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
 * EarningsRates
 */

public class EarningsRates {
  
  @JsonProperty("earningsRates")
  private List<EarningsRate> earningsRates = null;

  public EarningsRates earningsRates(List<EarningsRate> earningsRates) {
    this.earningsRates = earningsRates;
    return this;
  }

  public EarningsRates addEarningsRatesItem(EarningsRate earningsRatesItem) {
    if (this.earningsRates == null) {
      this.earningsRates = new ArrayList<EarningsRate>();
    }
    this.earningsRates.add(earningsRatesItem);
    return this;
  }

   /**
   * Get EarningsRates
   * @return earningsRates
  **/
  @ApiModelProperty(value = "")
  public List<EarningsRate> getEarningsRates() {
    return earningsRates;
  }

  public void setEarningsRates(List<EarningsRate> earningsRates) {
    this.earningsRates = earningsRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsRates earningsRates = (EarningsRates) o;
    return Objects.equals(this.earningsRates, earningsRates.earningsRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsRates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsRates {\n");
    
    sb.append("    earningsRates: ").append(toIndentedString(earningsRates)).append("\n");
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

