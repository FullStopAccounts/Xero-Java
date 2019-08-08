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
 * PayRuns
 */

public class PayRuns {
  
  @JsonProperty("PayRuns")
  private List<PayRun> payRuns = null;

  public PayRuns payRuns(List<PayRun> payRuns) {
    this.payRuns = payRuns;
    return this;
  }

  public PayRuns addPayRunsItem(PayRun payRunsItem) {
    if (this.payRuns == null) {
      this.payRuns = new ArrayList<PayRun>();
    }
    this.payRuns.add(payRunsItem);
    return this;
  }

   /**
   * Get payRuns
   * @return payRuns
  **/
  @ApiModelProperty(value = "")
  public List<PayRun> getPayRuns() {
    return payRuns;
  }

  public void setPayRuns(List<PayRun> payRuns) {
    this.payRuns = payRuns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayRuns payRuns = (PayRuns) o;
    return Objects.equals(this.payRuns, payRuns.payRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payRuns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRuns {\n");
    
    sb.append("    payRuns: ").append(toIndentedString(payRuns)).append("\n");
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

