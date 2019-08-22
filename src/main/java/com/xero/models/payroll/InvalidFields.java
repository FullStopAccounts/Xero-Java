/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvalidFields
 */

public class InvalidFields {
	
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("reason")
  private String reason;
  
  public InvalidFields name(String name) {
	 this.name = name;
	 return this;
  }
  /**
	* @return name
  **/
  public String getName() {
	 return name;
  }
  public void setName(String name) {
	 this.name = name;
  }
  
  public InvalidFields reason(String reason) {
    this.reason = reason;
    return this;
  }
  /**
   * @return reason
  **/
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidFields invalidFields = (InvalidFields) o;
    return Objects.equals(this.name, invalidFields.name) &&
        Objects.equals(this.reason, invalidFields.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidFields {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

