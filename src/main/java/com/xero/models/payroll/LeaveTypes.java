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
 * LeaveTypes
 */

public class LeaveTypes {
  
  @JsonProperty("leaveTypes")
  private List<LeaveType> leaveTypes = null;

  public LeaveTypes leaveTypes(List<LeaveType> leaveTypes) {
    this.leaveTypes = leaveTypes;
    return this;
  }

  public LeaveTypes addLeaveTypesItem(LeaveType leaveTypesItem) {
    if (this.leaveTypes == null) {
      this.leaveTypes = new ArrayList<LeaveType>();
    }
    this.leaveTypes.add(leaveTypesItem);
    return this;
  }

   /**
   * Get leaveTypes
   * @return leaveTypes
  **/
  @ApiModelProperty(value = "")
  public List<LeaveType> getLeaveTypes() {
    return leaveTypes;
  }

  public void setLeaveTypes(List<LeaveType> leaveTypes) {
    this.leaveTypes = leaveTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveTypes leaveTypes = (LeaveTypes) o;
    return Objects.equals(this.leaveTypes, leaveTypes.leaveTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveTypes {\n");
    
    sb.append("    leaveTypes: ").append(toIndentedString(leaveTypes)).append("\n");
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

