//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.25 at 11:30:02 AM PDT 
//


package com.xero.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for externalLinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="externalLinkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Facebook"/>
 *     &lt;enumeration value="GooglePlus"/>
 *     &lt;enumeration value="LinkedIn"/>
 *     &lt;enumeration value="Twitter"/>
 *     &lt;enumeration value="Website"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "externalLinkType")
@XmlEnum
public enum ExternalLinkType {

    @XmlEnumValue("Facebook")
    FACEBOOK("Facebook"),
    @XmlEnumValue("GooglePlus")
    GOOGLE_PLUS("GooglePlus"),
    @XmlEnumValue("LinkedIn")
    LINKED_IN("LinkedIn"),
    @XmlEnumValue("Twitter")
    TWITTER("Twitter"),
    @XmlEnumValue("Website")
    WEBSITE("Website");
    private final String value;

    ExternalLinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalLinkType fromValue(String v) {
        for (ExternalLinkType c: ExternalLinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
