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
 * StatutoryLeaves
 */

public class StatutoryLeaves {
  
  @JsonProperty("statutoryLeaves")
  private List<StatutoryLeave> statutoryLeaves = null;

  public StatutoryLeaves statutoryLeaves(List<StatutoryLeave> statutoryLeaves) {
    this.statutoryLeaves = statutoryLeaves;
    return this;
  }

  public StatutoryLeaves addStatutoryLeavesItem(StatutoryLeave statutoryLeavesItem) {
    if (this.statutoryLeaves == null) {
      this.statutoryLeaves = new ArrayList<StatutoryLeave>();
    }
    this.statutoryLeaves.add(statutoryLeavesItem);
    return this;
  }

   /**
   * Get statutoryLeaves
   * @return statutoryLeaves
  **/
  @ApiModelProperty(value = "")
  public List<StatutoryLeave> getStatutoryLeaves() {
    return statutoryLeaves;
  }

  public void setStatutoryLeaves(List<StatutoryLeave> statutoryLeaves) {
    this.statutoryLeaves = statutoryLeaves;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatutoryLeaves statutoryLeaves = (StatutoryLeaves) o;
    return Objects.equals(this.statutoryLeaves, statutoryLeaves.statutoryLeaves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statutoryLeaves);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutoryLeaves {\n");
    
    sb.append("    statutoryLeaves: ").append(toIndentedString(statutoryLeaves)).append("\n");
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

