/*
 * Payroll API
 */

package com.xero.models.payroll;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Address
 */

public class Address {
	
  @JsonProperty("addressLine1")
  private String addressLine1;
  
  @JsonProperty("addressLine2")
  private String addressLine2;
  
  @JsonProperty("city")
  private String city;

  @JsonProperty("County")
  private String County;
  
  @JsonProperty("countryName")
  private String countryName;
  
  @JsonProperty("postCode")
  private String postCode;
  
  public Address addressLine1(String addressLine1) {
	 this.addressLine1 = addressLine1;
	 return this;
  }
  /**
	* Address line 1 for employee home address
	* @return addressLine1
  **/
  @ApiModelProperty(value = "Address line 1 for employee home address")
  public String getAddressLine1() {
	 return addressLine1;
  }
  public void setAddressLine1(String addressLine1) {
	 this.addressLine1 = addressLine1;
  }
  
  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }
  /**
   * Address line 2 for employee home address
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Address line 2 for employee home address")
  public String getAddressLine2() {
    return addressLine2;
  }
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }
  
  public Address city(String city) {
    this.city = city;
    return this;
  }
  /**
   * City for employee home address
   * @return city
  **/
  @ApiModelProperty(value = "City for employee home address")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  
  public Address County(String County) {
    this.County = County;
    return this;
  }
  /**
   * County for employee home address
   * @return County
  **/
  @ApiModelProperty(value = "County for employee home address")
  public String getCounty() {
    return County;
  }
  public void setCounty(String County) {
    this.County = County;
  }
  
  public Address countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }
  /**
   * Country Name for employee home address
   * @return countryName
  **/
  @ApiModelProperty(value = "Country Name for employee home address")
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }
  
  public Address postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }
  /**
   * Post code for employee home address
   * @return postCode
  **/
  @ApiModelProperty(value = "Post code for employee home address")
  public String getPostCode() {
    return postCode;
  }
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.County, address.County) &&
        Objects.equals(this.countryName, address.countryName) &&
        Objects.equals(this.postCode, address.postCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, city, County, countryName, postCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    County: ").append(toIndentedString(County)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
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

