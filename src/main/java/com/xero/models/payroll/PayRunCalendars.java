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
 * PayRunCalendars
 */

public class PayRunCalendars {
  
  @JsonProperty("payRunCalendars")
  private List<PayRunCalendar> payRunCalendars = null;

  public PayRunCalendars payRunCalendars(List<PayRunCalendar> payRunCalendars) {
    this.payRunCalendars = payRunCalendars;
    return this;
  }

  public PayRunCalendars addPayRunCalendarsItem(PayRunCalendar payRunCalendarsItem) {
    if (this.payRunCalendars == null) {
      this.payRunCalendars = new ArrayList<PayRunCalendar>();
    }
    this.payRunCalendars.add(payRunCalendarsItem);
    return this;
  }

   /**
   * Get payRunCalendars
   * @return payRunCalendars
  **/
  @ApiModelProperty(value = "")
  public List<PayRunCalendar> getPayRunCalendars() {
    return payRunCalendars;
  }

  public void setPayRunCalendars(List<PayRunCalendar> payRunCalendars) {
    this.payRunCalendars = payRunCalendars;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayRunCalendars payRunCalendars = (PayRunCalendars) o;
    return Objects.equals(this.payRunCalendars, payRunCalendars.payRunCalendars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payRunCalendars);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRunCalendars {\n");
    
    sb.append("    payRunCalendars: ").append(toIndentedString(payRunCalendars)).append("\n");
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

