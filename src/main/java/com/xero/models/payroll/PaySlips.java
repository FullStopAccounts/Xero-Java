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
 * PaySlips
 */

public class PaySlips {
  
  @JsonProperty("PaySlips")
  private List<PaySlip> paySlips = null;

  public PaySlips paySlips(List<PaySlip> paySlips) {
    this.paySlips = paySlips;
    return this;
  }

  public PaySlips addPaySlipsItem(PaySlip paySlipsItem) {
    if (this.paySlips == null) {
      this.paySlips = new ArrayList<PaySlip>();
    }
    this.paySlips.add(paySlipsItem);
    return this;
  }

   /**
   * Get paySlips
   * @return paySlips
  **/
  @ApiModelProperty(value = "")
  public List<PaySlip> getPaySlips() {
    return paySlips;
  }

  public void setPaySlips(List<PaySlip> paySlips) {
    this.paySlips = paySlips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaySlips paySlips = (PaySlips) o;
    return Objects.equals(this.paySlips, paySlips.paySlips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paySlips);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaySlips {\n");
    
    sb.append("    paySlips: ").append(toIndentedString(paySlips)).append("\n");
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

