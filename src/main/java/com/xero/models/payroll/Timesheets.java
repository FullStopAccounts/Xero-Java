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
 * Timesheets
 */

public class Timesheets {
  
  @JsonProperty("timesheets")
  private List<Timesheet> timesheets = null;

  public Timesheets timesheets(List<Timesheet> timesheets) {
    this.timesheets = timesheets;
    return this;
  }

  public Timesheets addTimesheetsItem(Timesheet timesheetsItem) {
    if (this.timesheets == null) {
      this.timesheets = new ArrayList<Timesheet>();
    }
    this.timesheets.add(timesheetsItem);
    return this;
  }

   /**
   * Get timesheets
   * @return timesheets
  **/
  @ApiModelProperty(value = "")
  public List<Timesheet> getTimesheets() {
    return timesheets;
  }

  public void setTimesheets(List<Timesheet> timesheets) {
    this.timesheets = timesheets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timesheets timesheets = (Timesheets) o;
    return Objects.equals(this.timesheets, timesheets.timesheets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timesheets {\n");
    
    sb.append("    timesheets: ").append(toIndentedString(timesheets)).append("\n");
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

