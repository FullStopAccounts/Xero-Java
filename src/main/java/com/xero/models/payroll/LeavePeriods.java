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
 * LeavePeriods
 */

public class LeavePeriods {
  
  @JsonProperty("leavePeriods")
  private List<LeavePeriod> leavePeriods = null;

  public LeavePeriods leavePeriods(List<LeavePeriod> leavePeriods) {
    this.leavePeriods = leavePeriods;
    return this;
  }

  public LeavePeriods addLeavePeriodsItem(LeavePeriod leavePeriodsItem) {
    if (this.leavePeriods == null) {
      this.leavePeriods = new ArrayList<LeavePeriod>();
    }
    this.leavePeriods.add(leavePeriodsItem);
    return this;
  }

   /**
   * Get leavePeriods
   * @return leavePeriods
  **/
  @ApiModelProperty(value = "")
  public List<LeavePeriod> getLeavePeriods() {
    return leavePeriods;
  }

  public void setLeavePeriods(List<LeavePeriod> leavePeriods) {
    this.leavePeriods = leavePeriods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeavePeriods leavePeriods = (LeavePeriods) o;
    return Objects.equals(this.leavePeriods, leavePeriods.leavePeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leavePeriods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeavePeriods {\n");
    
    sb.append("    leavePeriods: ").append(toIndentedString(leavePeriods)).append("\n");
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

