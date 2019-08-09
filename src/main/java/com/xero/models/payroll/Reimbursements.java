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
 * Reimbursements
 */

public class Reimbursements {
  
  @JsonProperty("reimbursements")
  private List<Reimbursement> reimbursements = null;

  public Reimbursements reimbursements(List<Reimbursement> reimbursements) {
    this.reimbursements = reimbursements;
    return this;
  }

  public Reimbursements addReimbursementsItem(Reimbursement reimbursementsItem) {
    if (this.reimbursements == null) {
      this.reimbursements = new ArrayList<Reimbursement>();
    }
    this.reimbursements.add(reimbursementsItem);
    return this;
  }

   /**
   * Get reimbursements
   * @return reimbursements
  **/
  @ApiModelProperty(value = "")
  public List<Reimbursement> getReimbursements() {
    return reimbursements;
  }

  public void setReimbursements(List<Reimbursement> reimbursements) {
    this.reimbursements = reimbursements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reimbursements reimbursements = (Reimbursements) o;
    return Objects.equals(this.reimbursements, reimbursements.reimbursements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reimbursements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reimbursements {\n");
    
    sb.append("    reimbursements: ").append(toIndentedString(reimbursements)).append("\n");
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

