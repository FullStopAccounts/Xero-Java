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
 * Leaves
 */

public class Leaves {
  
  @JsonProperty("leaves")
  private List<Leave> leaves = null;

  public Leaves leaves(List<Leave> leaves) {
    this.leaves = leaves;
    return this;
  }

  public Leaves addLeaveItem(Leave leaveItem) {
    if (this.leaves == null) {
      this.leaves = new ArrayList<Leave>();
    }
    this.leaves.add(leaveItem);
    return this;
  }

   /**
   * Get leaves
   * @return leaves
  **/
  @ApiModelProperty(value = "")
  public List<Leave> getLeaves() {
    return leaves;
  }

  public void setLeaves(List<Leave> leaves) {
    this.leaves = leaves;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Leaves leaves = (Leaves) o;
    return Objects.equals(this.leaves, leaves.leaves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaves);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leaves {\n");
    
    sb.append("    leaves: ").append(toIndentedString(leaves)).append("\n");
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

