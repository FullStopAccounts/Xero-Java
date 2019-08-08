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
 * LeaveBalances
 */

public class LeaveBalances {
  
  @JsonProperty("leaveBalances")
  private List<LeaveBalance> leaveBalances = null;

  public LeaveBalances leaveBalances(List<LeaveBalance> leaveBalances) {
    this.leaveBalances = leaveBalances;
    return this;
  }

  public LeaveBalances addLeaveBalancesItem(LeaveBalance leaveBalancesItem) {
    if (this.leaveBalances == null) {
      this.leaveBalances = new ArrayList<LeaveBalance>();
    }
    this.leaveBalances.add(leaveBalancesItem);
    return this;
  }

   /**
   * Get leaveBalances
   * @return leaveBalances
  **/
  @ApiModelProperty(value = "")
  public List<LeaveBalance> getLeaveBalances() {
    return leaveBalances;
  }

  public void setLeaveBalances(List<LeaveBalance> leaveBalances) {
    this.leaveBalances = leaveBalances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveBalances leaveBalances = (LeaveBalances) o;
    return Objects.equals(this.leaveBalances, leaveBalances.leaveBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveBalances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveBalances {\n");
    
    sb.append("    leaveBalances: ").append(toIndentedString(leaveBalances)).append("\n");
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

