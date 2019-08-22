/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Problem
 */

public class Problem {
	
  @JsonProperty("type")
  private String type;
  
  @JsonProperty("title")
  private String title;
  
  @JsonProperty("status")
  private String status;

  @JsonProperty("detail")
  private String detail;
  
  @JsonProperty("message")
  private String message;
  
  @JsonProperty("instance")
  private String instance;
  
  @JsonProperty("invalidFields")
  private List<InvalidFields> invalidFields;
  
  public Problem type(String type) {
    this.type = type;
    return this;
  }
  /**
   * @return type
  **/
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  
  public Problem title(String title) {
	 this.title = title;
	 return this;
  }
  /**
	* @return title
  **/
  public String getTitle() {
	 return title;
  }
  public void setTitle(String title) {
	 this.title = title;
  }
  
  public Problem status(String status) {
    this.status = status;
    return this;
  }
  /**
   * @return status
  **/
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  
  public Problem detail(String detail) {
    this.detail = detail;
    return this;
  }
  /**
   * @return detail
  **/
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }
  
  public Problem message(String message) {
    this.message = message;
    return this;
  }
  /**
   * @return message
  **/
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  
  public Problem instance(String instance) {
    this.instance = instance;
    return this;
  }
  /**
   * @return instance
  **/
  public String getInstance() {
    return instance;
  }
  public void setInstance(String instance) {
    this.instance = instance;
  }
  
  public Problem invalidFields(List<InvalidFields> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }
  /**
   * @return invalidFields
  **/
  public List<InvalidFields> getInvalidFields() {
    return invalidFields;
  }
  public void setInvalidFields(List<InvalidFields> invalidFields) {
    this.invalidFields = invalidFields;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problem problem = (Problem) o;
    return Objects.equals(this.type, problem.type) &&
        Objects.equals(this.title, problem.title) &&
        Objects.equals(this.status, problem.status) &&
        Objects.equals(this.detail, problem.detail) &&
        Objects.equals(this.instance, problem.instance) &&
        Objects.equals(this.invalidFields, problem.invalidFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance, invalidFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
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

