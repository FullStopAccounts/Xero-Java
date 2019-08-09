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
 * EmployeeLeave
 */

public class EmployeeLeave {
  
  @JsonProperty("leave")
  private List<Leave> leave = null;

  public EmployeeLeave leave(List<Leave> leave) {
    this.leave = leave;
    return this;
  }

  public EmployeeLeave addLeaveItem(Leave leaveItem) {
    if (this.leave == null) {
      this.leave = new ArrayList<Leave>();
    }
    this.leave.add(leaveItem);
    return this;
  }

   /**
   * Get employees
   * @return employees
  **/
  @ApiModelProperty(value = "")
  public List<Leave> getEmployeeLeave() {
    return leave;
  }

  public void setEmployeeLeave(List<Leave> leave) {
    this.leave = leave;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeLeave employeeLeave = (EmployeeLeave) o;
    return Objects.equals(this.leave, employeeLeave.leave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leave);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeLeave {\n");
    
    sb.append("    leave: ").append(toIndentedString(leave)).append("\n");
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

