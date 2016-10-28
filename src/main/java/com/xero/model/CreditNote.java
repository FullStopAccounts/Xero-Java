//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.25 at 11:30:02 AM PDT 
//


package com.xero.model;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreditNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditNote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ValidationErrors" type="{}ArrayOfValidationError" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}ArrayOfWarning" minOccurs="0"/>
 *         &lt;element name="Type" type="{}creditNoteType" minOccurs="0"/>
 *         &lt;element name="Contact" type="{}Contact" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Status" type="{}invoiceStatus" minOccurs="0"/>
 *         &lt;element name="LineAmountTypes" type="{}lineAmountType" minOccurs="0"/>
 *         &lt;element name="LineItems" type="{}ArrayOfLineItem" minOccurs="0"/>
 *         &lt;element name="SubTotal" type="{}itemPrice" minOccurs="0"/>
 *         &lt;element name="TotalTax" type="{}itemPrice" minOccurs="0"/>
 *         &lt;element name="Total" type="{}itemPrice"/>
 *         &lt;element name="UpdatedDateUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{}currencyCode" minOccurs="0"/>
 *         &lt;element name="FullyPaidOnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreditNoteID" type="{}uniqueIdentifier"/>
 *         &lt;element name="CreditNoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SentToContact" type="{}trueOrFalse" minOccurs="0"/>
 *         &lt;element name="CurrencyRate" type="{}currencyRate" minOccurs="0"/>
 *         &lt;element name="RemainingCredit" type="{}itemPrice" minOccurs="0"/>
 *         &lt;element name="Allocations" type="{}ArrayOfAllocation" minOccurs="0"/>
 *         &lt;element name="BrandingThemeID" type="{}uniqueIdentifier" minOccurs="0"/>
 *         &lt;element name="HasAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{}ArrayOfAttachment" minOccurs="0"/>
 *         &lt;element name="AppliedAmount" type="{}itemPrice"/>
 *       &lt;/all>
 *       &lt;attribute name="status" type="{}entityValidationStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditNote", propOrder = {

})
public class CreditNote {

    @XmlElement(name = "ValidationErrors")
    protected ArrayOfValidationError validationErrors;
    @XmlElement(name = "Warnings")
    protected ArrayOfWarning warnings;
    @XmlElement(name = "Type")
    protected CreditNoteType type;
    @XmlElement(name = "Contact")
    protected Contact contact;
    @XmlElement(name = "Date", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar date;
    @XmlElement(name = "Status")
    protected InvoiceStatus status;
    @XmlElement(name = "LineAmountTypes")
    protected LineAmountType lineAmountTypes;
    @XmlElement(name = "LineItems")
    protected ArrayOfLineItem lineItems;
    @XmlElement(name = "SubTotal")
    protected BigDecimal subTotal;
    @XmlElement(name = "TotalTax")
    protected BigDecimal totalTax;
    @XmlElement(name = "Total", required = true)
    protected BigDecimal total;
    @XmlElement(name = "UpdatedDateUTC", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar updatedDateUTC;
    @XmlElement(name = "CurrencyCode")
    protected CurrencyCode currencyCode;
    @XmlElement(name = "FullyPaidOnDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar fullyPaidOnDate;
    @XmlElement(name = "CreditNoteID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditNoteID;
    @XmlElement(name = "CreditNoteNumber")
    protected String creditNoteNumber;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "SentToContact")
    protected TrueOrFalse sentToContact;
    @XmlElement(name = "CurrencyRate")
    protected BigDecimal currencyRate;
    @XmlElement(name = "RemainingCredit")
    protected BigDecimal remainingCredit;
    @XmlElement(name = "Allocations")
    protected ArrayOfAllocation allocations;
    @XmlElement(name = "BrandingThemeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String brandingThemeID;
    @XmlElement(name = "HasAttachments")
    protected Boolean hasAttachments;
    @XmlElement(name = "Attachments")
    protected ArrayOfAttachment attachments;
    @XmlElement(name = "AppliedAmount", required = true)
    protected BigDecimal appliedAmount;
    @XmlAttribute(name = "status")
    protected EntityValidationStatus validationStatus;

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public ArrayOfValidationError getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public void setValidationErrors(ArrayOfValidationError value) {
        this.validationErrors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setWarnings(ArrayOfWarning value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CreditNoteType }
     *     
     */
    public CreditNoteType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditNoteType }
     *     
     */
    public void setType(CreditNoteType value) {
        this.type = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(Calendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceStatus }
     *     
     */
    public InvoiceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceStatus }
     *     
     */
    public void setStatus(InvoiceStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the lineAmountTypes property.
     * 
     * @return
     *     possible object is
     *     {@link LineAmountType }
     *     
     */
    public LineAmountType getLineAmountTypes() {
        return lineAmountTypes;
    }

    /**
     * Sets the value of the lineAmountTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineAmountType }
     *     
     */
    public void setLineAmountTypes(LineAmountType value) {
        this.lineAmountTypes = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLineItem }
     *     
     */
    public ArrayOfLineItem getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineItem }
     *     
     */
    public void setLineItems(ArrayOfLineItem value) {
        this.lineItems = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubTotal(BigDecimal value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the updatedDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUpdatedDateUTC() {
        return updatedDateUTC;
    }

    /**
     * Sets the value of the updatedDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedDateUTC(Calendar value) {
        this.updatedDateUTC = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCode(CurrencyCode value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the fullyPaidOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFullyPaidOnDate() {
        return fullyPaidOnDate;
    }

    /**
     * Sets the value of the fullyPaidOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullyPaidOnDate(Calendar value) {
        this.fullyPaidOnDate = value;
    }

    /**
     * Gets the value of the creditNoteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditNoteID() {
        return creditNoteID;
    }

    /**
     * Sets the value of the creditNoteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditNoteID(String value) {
        this.creditNoteID = value;
    }

    /**
     * Gets the value of the creditNoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditNoteNumber() {
        return creditNoteNumber;
    }

    /**
     * Sets the value of the creditNoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditNoteNumber(String value) {
        this.creditNoteNumber = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the sentToContact property.
     * 
     * @return
     *     possible object is
     *     {@link TrueOrFalse }
     *     
     */
    public TrueOrFalse getSentToContact() {
        return sentToContact;
    }

    /**
     * Sets the value of the sentToContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueOrFalse }
     *     
     */
    public void setSentToContact(TrueOrFalse value) {
        this.sentToContact = value;
    }

    /**
     * Gets the value of the currencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Sets the value of the currencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRate(BigDecimal value) {
        this.currencyRate = value;
    }

    /**
     * Gets the value of the remainingCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingCredit() {
        return remainingCredit;
    }

    /**
     * Sets the value of the remainingCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingCredit(BigDecimal value) {
        this.remainingCredit = value;
    }

    /**
     * Gets the value of the allocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllocation }
     *     
     */
    public ArrayOfAllocation getAllocations() {
        return allocations;
    }

    /**
     * Sets the value of the allocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllocation }
     *     
     */
    public void setAllocations(ArrayOfAllocation value) {
        this.allocations = value;
    }

    /**
     * Gets the value of the brandingThemeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingThemeID() {
        return brandingThemeID;
    }

    /**
     * Sets the value of the brandingThemeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingThemeID(String value) {
        this.brandingThemeID = value;
    }

    /**
     * Gets the value of the hasAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachments() {
        return hasAttachments;
    }

    /**
     * Sets the value of the hasAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachments(Boolean value) {
        this.hasAttachments = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setAttachments(ArrayOfAttachment value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the appliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Sets the value of the appliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAppliedAmount(BigDecimal value) {
        this.appliedAmount = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityValidationStatus }
     *     
     */
    public EntityValidationStatus getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityValidationStatus }
     *     
     */
    public void setValidationStatus(EntityValidationStatus value) {
        this.validationStatus = value;
    }

}
