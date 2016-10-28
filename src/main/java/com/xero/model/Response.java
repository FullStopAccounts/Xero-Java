//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.25 at 11:30:02 AM PDT 
//


package com.xero.model;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{}uniqueIdentifier"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TaxRates" type="{}ArrayOfTaxRate" minOccurs="0"/>
 *         &lt;element name="Invoices" type="{}ArrayOfInvoice" minOccurs="0"/>
 *         &lt;element name="InvoiceReminders" type="{}ArrayOfInvoiceReminder" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{}ArrayOfContact" minOccurs="0"/>
 *         &lt;element name="ContactGroups" type="{}ArrayOfContactGroup" minOccurs="0"/>
 *         &lt;element name="Accounts" type="{}ArrayOfAccount" minOccurs="0"/>
 *         &lt;element name="TrackingCategories" type="{}ArrayOfTrackingCategory" minOccurs="0"/>
 *         &lt;element name="Organisations" type="{}ArrayOfOrganisation" minOccurs="0"/>
 *         &lt;element name="CreditNotes" type="{}ArrayOfCreditNote" minOccurs="0"/>
 *         &lt;element name="Currencies" type="{}ArrayOfCurrency" minOccurs="0"/>
 *         &lt;element name="Payments" type="{}ArrayOfPayment" minOccurs="0"/>
 *         &lt;element name="Journals" type="{}ArrayOfJournal" minOccurs="0"/>
 *         &lt;element name="BrandingThemes" type="{}ArrayOfBrandingTheme" minOccurs="0"/>
 *         &lt;element name="Items" type="{}ArrayOfItem" minOccurs="0"/>
 *         &lt;element name="ManualJournals" type="{}ArrayOfManualJournal" minOccurs="0"/>
 *         &lt;element name="Reports" type="{}ArrayOfReport" minOccurs="0"/>
 *         &lt;element name="Employees" type="{}ArrayOfEmployee" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{}ArrayOfAttachment" minOccurs="0"/>
 *         &lt;element name="BankTransactions" type="{}ArrayOfBankTransaction" minOccurs="0"/>
 *         &lt;element name="Users" type="{}ArrayOfUser" minOccurs="0"/>
 *         &lt;element name="Receipts" type="{}ArrayOfReceipt" minOccurs="0"/>
 *         &lt;element name="ExpenseClaims" type="{}ArrayOfExpenseClaim" minOccurs="0"/>
 *         &lt;element name="RepeatingInvoices" type="{}ArrayOfRepeatingInvoice" minOccurs="0"/>
 *         &lt;element name="BankTransfers" type="{}ArrayOfBankTransfer" minOccurs="0"/>
 *         &lt;element name="LinkedTransactions" type="{}ArrayOfLinkedTransaction" minOccurs="0"/>
 *         &lt;element name="Overpayments" type="{}ArrayOfOverpayment" minOccurs="0"/>
 *         &lt;element name="Prepayments" type="{}ArrayOfPrepayment" minOccurs="0"/>
 *         &lt;element name="PurchaseOrders" type="{}ArrayOfPurchaseOrder" minOccurs="0"/>
 *         &lt;element name="Allocations" type="{}ArrayOfAllocation" minOccurs="0"/>
 *         &lt;element name="Options" type="{}ArrayOfTrackingCategoryOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "id",
    "status",
    "providerName",
    "dateTimeUTC",
    "taxRates",
    "invoices",
    "invoiceReminders",
    "contacts",
    "contactGroups",
    "accounts",
    "trackingCategories",
    "organisations",
    "creditNotes",
    "currencies",
    "payments",
    "journals",
    "brandingThemes",
    "items",
    "manualJournals",
    "reports",
    "employees",
    "attachments",
    "bankTransactions",
    "users",
    "receipts",
    "expenseClaims",
    "repeatingInvoices",
    "bankTransfers",
    "linkedTransactions",
    "overpayments",
    "prepayments",
    "purchaseOrders",
    "allocations",
    "options"
})
public class Response {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ProviderName")
    protected String providerName;
    @XmlElement(name = "DateTimeUTC", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dateTimeUTC;
    @XmlElement(name = "TaxRates")
    protected ArrayOfTaxRate taxRates;
    @XmlElement(name = "Invoices")
    protected ArrayOfInvoice invoices;
    @XmlElement(name = "InvoiceReminders")
    protected ArrayOfInvoiceReminder invoiceReminders;
    @XmlElement(name = "Contacts")
    protected ArrayOfContact contacts;
    @XmlElement(name = "ContactGroups")
    protected ArrayOfContactGroup contactGroups;
    @XmlElement(name = "Accounts")
    protected ArrayOfAccount accounts;
    @XmlElement(name = "TrackingCategories")
    protected ArrayOfTrackingCategory trackingCategories;
    @XmlElement(name = "Organisations")
    protected ArrayOfOrganisation organisations;
    @XmlElement(name = "CreditNotes")
    protected ArrayOfCreditNote creditNotes;
    @XmlElement(name = "Currencies")
    protected ArrayOfCurrency currencies;
    @XmlElement(name = "Payments")
    protected ArrayOfPayment payments;
    @XmlElement(name = "Journals")
    protected ArrayOfJournal journals;
    @XmlElement(name = "BrandingThemes")
    protected ArrayOfBrandingTheme brandingThemes;
    @XmlElement(name = "Items")
    protected ArrayOfItem items;
    @XmlElement(name = "ManualJournals")
    protected ArrayOfManualJournal manualJournals;
    @XmlElement(name = "Reports")
    protected ArrayOfReport reports;
    @XmlElement(name = "Employees")
    protected ArrayOfEmployee employees;
    @XmlElement(name = "Attachments")
    protected ArrayOfAttachment attachments;
    @XmlElement(name = "BankTransactions")
    protected ArrayOfBankTransaction bankTransactions;
    @XmlElement(name = "Users")
    protected ArrayOfUser users;
    @XmlElement(name = "Receipts")
    protected ArrayOfReceipt receipts;
    @XmlElement(name = "ExpenseClaims")
    protected ArrayOfExpenseClaim expenseClaims;
    @XmlElement(name = "RepeatingInvoices")
    protected ArrayOfRepeatingInvoice repeatingInvoices;
    @XmlElement(name = "BankTransfers")
    protected ArrayOfBankTransfer bankTransfers;
    @XmlElement(name = "LinkedTransactions")
    protected ArrayOfLinkedTransaction linkedTransactions;
    @XmlElement(name = "Overpayments")
    protected ArrayOfOverpayment overpayments;
    @XmlElement(name = "Prepayments")
    protected ArrayOfPrepayment prepayments;
    @XmlElement(name = "PurchaseOrders")
    protected ArrayOfPurchaseOrder purchaseOrders;
    @XmlElement(name = "Allocations")
    protected ArrayOfAllocation allocations;
    @XmlElement(name = "Options")
    protected ArrayOfTrackingCategoryOption options;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the dateTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateTimeUTC() {
        return dateTimeUTC;
    }

    /**
     * Sets the value of the dateTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeUTC(Calendar value) {
        this.dateTimeUTC = value;
    }

    /**
     * Gets the value of the taxRates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaxRate }
     *     
     */
    public ArrayOfTaxRate getTaxRates() {
        return taxRates;
    }

    /**
     * Sets the value of the taxRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaxRate }
     *     
     */
    public void setTaxRates(ArrayOfTaxRate value) {
        this.taxRates = value;
    }

    /**
     * Gets the value of the invoices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoice }
     *     
     */
    public ArrayOfInvoice getInvoices() {
        return invoices;
    }

    /**
     * Sets the value of the invoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoice }
     *     
     */
    public void setInvoices(ArrayOfInvoice value) {
        this.invoices = value;
    }

    /**
     * Gets the value of the invoiceReminders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoiceReminder }
     *     
     */
    public ArrayOfInvoiceReminder getInvoiceReminders() {
        return invoiceReminders;
    }

    /**
     * Sets the value of the invoiceReminders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoiceReminder }
     *     
     */
    public void setInvoiceReminders(ArrayOfInvoiceReminder value) {
        this.invoiceReminders = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContact }
     *     
     */
    public ArrayOfContact getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContact }
     *     
     */
    public void setContacts(ArrayOfContact value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the contactGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactGroup }
     *     
     */
    public ArrayOfContactGroup getContactGroups() {
        return contactGroups;
    }

    /**
     * Sets the value of the contactGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactGroup }
     *     
     */
    public void setContactGroups(ArrayOfContactGroup value) {
        this.contactGroups = value;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccount }
     *     
     */
    public ArrayOfAccount getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccount }
     *     
     */
    public void setAccounts(ArrayOfAccount value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the trackingCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackingCategory }
     *     
     */
    public ArrayOfTrackingCategory getTrackingCategories() {
        return trackingCategories;
    }

    /**
     * Sets the value of the trackingCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackingCategory }
     *     
     */
    public void setTrackingCategories(ArrayOfTrackingCategory value) {
        this.trackingCategories = value;
    }

    /**
     * Gets the value of the organisations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrganisation }
     *     
     */
    public ArrayOfOrganisation getOrganisations() {
        return organisations;
    }

    /**
     * Sets the value of the organisations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrganisation }
     *     
     */
    public void setOrganisations(ArrayOfOrganisation value) {
        this.organisations = value;
    }

    /**
     * Gets the value of the creditNotes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditNote }
     *     
     */
    public ArrayOfCreditNote getCreditNotes() {
        return creditNotes;
    }

    /**
     * Sets the value of the creditNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditNote }
     *     
     */
    public void setCreditNotes(ArrayOfCreditNote value) {
        this.creditNotes = value;
    }

    /**
     * Gets the value of the currencies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCurrency }
     *     
     */
    public ArrayOfCurrency getCurrencies() {
        return currencies;
    }

    /**
     * Sets the value of the currencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCurrency }
     *     
     */
    public void setCurrencies(ArrayOfCurrency value) {
        this.currencies = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPayment }
     *     
     */
    public ArrayOfPayment getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPayment }
     *     
     */
    public void setPayments(ArrayOfPayment value) {
        this.payments = value;
    }

    /**
     * Gets the value of the journals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJournal }
     *     
     */
    public ArrayOfJournal getJournals() {
        return journals;
    }

    /**
     * Sets the value of the journals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJournal }
     *     
     */
    public void setJournals(ArrayOfJournal value) {
        this.journals = value;
    }

    /**
     * Gets the value of the brandingThemes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrandingTheme }
     *     
     */
    public ArrayOfBrandingTheme getBrandingThemes() {
        return brandingThemes;
    }

    /**
     * Sets the value of the brandingThemes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrandingTheme }
     *     
     */
    public void setBrandingThemes(ArrayOfBrandingTheme value) {
        this.brandingThemes = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItem }
     *     
     */
    public ArrayOfItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItem }
     *     
     */
    public void setItems(ArrayOfItem value) {
        this.items = value;
    }

    /**
     * Gets the value of the manualJournals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfManualJournal }
     *     
     */
    public ArrayOfManualJournal getManualJournals() {
        return manualJournals;
    }

    /**
     * Sets the value of the manualJournals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfManualJournal }
     *     
     */
    public void setManualJournals(ArrayOfManualJournal value) {
        this.manualJournals = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReport }
     *     
     */
    public ArrayOfReport getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReport }
     *     
     */
    public void setReports(ArrayOfReport value) {
        this.reports = value;
    }

    /**
     * Gets the value of the employees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmployee }
     *     
     */
    public ArrayOfEmployee getEmployees() {
        return employees;
    }

    /**
     * Sets the value of the employees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmployee }
     *     
     */
    public void setEmployees(ArrayOfEmployee value) {
        this.employees = value;
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
     * Gets the value of the bankTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBankTransaction }
     *     
     */
    public ArrayOfBankTransaction getBankTransactions() {
        return bankTransactions;
    }

    /**
     * Sets the value of the bankTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBankTransaction }
     *     
     */
    public void setBankTransactions(ArrayOfBankTransaction value) {
        this.bankTransactions = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUser }
     *     
     */
    public ArrayOfUser getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUser }
     *     
     */
    public void setUsers(ArrayOfUser value) {
        this.users = value;
    }

    /**
     * Gets the value of the receipts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReceipt }
     *     
     */
    public ArrayOfReceipt getReceipts() {
        return receipts;
    }

    /**
     * Sets the value of the receipts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReceipt }
     *     
     */
    public void setReceipts(ArrayOfReceipt value) {
        this.receipts = value;
    }

    /**
     * Gets the value of the expenseClaims property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExpenseClaim }
     *     
     */
    public ArrayOfExpenseClaim getExpenseClaims() {
        return expenseClaims;
    }

    /**
     * Sets the value of the expenseClaims property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExpenseClaim }
     *     
     */
    public void setExpenseClaims(ArrayOfExpenseClaim value) {
        this.expenseClaims = value;
    }

    /**
     * Gets the value of the repeatingInvoices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRepeatingInvoice }
     *     
     */
    public ArrayOfRepeatingInvoice getRepeatingInvoices() {
        return repeatingInvoices;
    }

    /**
     * Sets the value of the repeatingInvoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRepeatingInvoice }
     *     
     */
    public void setRepeatingInvoices(ArrayOfRepeatingInvoice value) {
        this.repeatingInvoices = value;
    }

    /**
     * Gets the value of the bankTransfers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBankTransfer }
     *     
     */
    public ArrayOfBankTransfer getBankTransfers() {
        return bankTransfers;
    }

    /**
     * Sets the value of the bankTransfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBankTransfer }
     *     
     */
    public void setBankTransfers(ArrayOfBankTransfer value) {
        this.bankTransfers = value;
    }

    /**
     * Gets the value of the linkedTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLinkedTransaction }
     *     
     */
    public ArrayOfLinkedTransaction getLinkedTransactions() {
        return linkedTransactions;
    }

    /**
     * Sets the value of the linkedTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLinkedTransaction }
     *     
     */
    public void setLinkedTransactions(ArrayOfLinkedTransaction value) {
        this.linkedTransactions = value;
    }

    /**
     * Gets the value of the overpayments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOverpayment }
     *     
     */
    public ArrayOfOverpayment getOverpayments() {
        return overpayments;
    }

    /**
     * Sets the value of the overpayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOverpayment }
     *     
     */
    public void setOverpayments(ArrayOfOverpayment value) {
        this.overpayments = value;
    }

    /**
     * Gets the value of the prepayments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrepayment }
     *     
     */
    public ArrayOfPrepayment getPrepayments() {
        return prepayments;
    }

    /**
     * Sets the value of the prepayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrepayment }
     *     
     */
    public void setPrepayments(ArrayOfPrepayment value) {
        this.prepayments = value;
    }

    /**
     * Gets the value of the purchaseOrders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPurchaseOrder }
     *     
     */
    public ArrayOfPurchaseOrder getPurchaseOrders() {
        return purchaseOrders;
    }

    /**
     * Sets the value of the purchaseOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPurchaseOrder }
     *     
     */
    public void setPurchaseOrders(ArrayOfPurchaseOrder value) {
        this.purchaseOrders = value;
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
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackingCategoryOption }
     *     
     */
    public ArrayOfTrackingCategoryOption getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackingCategoryOption }
     *     
     */
    public void setOptions(ArrayOfTrackingCategoryOption value) {
        this.options = value;
    }

}
