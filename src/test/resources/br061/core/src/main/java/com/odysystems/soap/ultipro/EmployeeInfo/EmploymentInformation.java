
package com.odysystems.soap.ultipro.EmployeeInfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.odysystems.util.XMLGregDateConverter;


/**
 * <p>Java class for EmploymentInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmploymentInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrearsSuspendedFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ArrearsSuspendedTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BeneSeniority" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Deceased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeceasedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EarlyRetirement" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmployeeIdentifier" type="{http://www.ultipro.com/contracts}EmployeeIdentifier" minOccurs="0"/>
 *         &lt;element name="EmploymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FMLA_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HCSOEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HCSONotCovered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HCSOStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Job" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastHire" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastPerfReview" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastSalaryReview" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LeaveReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextPerfReview" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NextSalaryReview" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OriginalHire" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PTOSuspendedFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PTOSuspendedTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PayAutomatically" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaySuspendedFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaySuspendedTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ROEIssueReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegularRetirement" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SelfServiceProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/>
 *         &lt;element name="Seniority" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StatusAnticipatedEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StatusStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Weeks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentInformation", propOrder = {
    "arrearsSuspendedFrom",
    "arrearsSuspendedTo",
    "beneSeniority",
    "deceased",
    "deceasedDate",
    "earlyRetirement",
    "employeeIdentifier",
    "employmentStatus",
    "fmlaCode",
    "hcsoEndDate",
    "hcsoNotCovered",
    "hcsoStartDate",
    "job",
    "jobStart",
    "lastHire",
    "lastPerfReview",
    "lastSalaryReview",
    "leaveReason",
    "nextPerfReview",
    "nextSalaryReview",
    "originalHire",
    "ptoSuspendedFrom",
    "ptoSuspendedTo",
    "payAutomatically",
    "paySuspendedFrom",
    "paySuspendedTo",
    "roeIssueReason",
    "regularRetirement",
    "selfServiceProperties",
    "seniority",
    "statusAnticipatedEnd",
    "statusStartDate",
    "weeks"
})
public class EmploymentInformation extends XMLGregDateConverter{

    @XmlElement(name = "ArrearsSuspendedFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrearsSuspendedFrom;
    @XmlElement(name = "ArrearsSuspendedTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrearsSuspendedTo;
    @XmlElement(name = "BeneSeniority")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beneSeniority;
    @XmlElement(name = "Deceased")
    protected Boolean deceased;
    @XmlElement(name = "DeceasedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deceasedDate;
    @XmlElement(name = "EarlyRetirement")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earlyRetirement;
    @XmlElementRef(name = "EmployeeIdentifier", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EmployeeIdentifier> employeeIdentifier;
    @XmlElementRef(name = "EmploymentStatus", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employmentStatus;
    @XmlElementRef(name = "FMLA_Code", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fmlaCode;
    @XmlElement(name = "HCSOEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hcsoEndDate;
    @XmlElement(name = "HCSONotCovered")
    protected Boolean hcsoNotCovered;
    @XmlElement(name = "HCSOStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hcsoStartDate;
    @XmlElementRef(name = "Job", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> job;
    @XmlElement(name = "JobStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar jobStart;
    @XmlElement(name = "LastHire")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastHire;
    @XmlElement(name = "LastPerfReview")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPerfReview;
    @XmlElement(name = "LastSalaryReview")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSalaryReview;
    @XmlElementRef(name = "LeaveReason", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leaveReason;
    @XmlElement(name = "NextPerfReview")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextPerfReview;
    @XmlElement(name = "NextSalaryReview")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextSalaryReview;
    @XmlElement(name = "OriginalHire")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalHire;
    @XmlElement(name = "PTOSuspendedFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ptoSuspendedFrom;
    @XmlElement(name = "PTOSuspendedTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ptoSuspendedTo;
    @XmlElement(name = "PayAutomatically")
    protected Boolean payAutomatically;
    @XmlElement(name = "PaySuspendedFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paySuspendedFrom;
    @XmlElement(name = "PaySuspendedTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paySuspendedTo;
    @XmlElementRef(name = "ROEIssueReason", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roeIssueReason;
    @XmlElement(name = "RegularRetirement")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regularRetirement;
    @XmlElementRef(name = "SelfServiceProperties", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> selfServiceProperties;
    @XmlElement(name = "Seniority")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seniority;
    @XmlElement(name = "StatusAnticipatedEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusAnticipatedEnd;
    @XmlElement(name = "StatusStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusStartDate;
    @XmlElement(name = "Weeks")
    protected Double weeks;

    /**
     * Gets the value of the arrearsSuspendedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getArrearsSuspendedFrom() {
        return gregToDateString(arrearsSuspendedFrom);
    }

    /**
     * Sets the value of the arrearsSuspendedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrearsSuspendedFrom(XMLGregorianCalendar value) {
        this.arrearsSuspendedFrom = value;
    }

    /**
     * Gets the value of the arrearsSuspendedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getArrearsSuspendedTo() {
        return gregToDateString(arrearsSuspendedTo);
    }

    /**
     * Sets the value of the arrearsSuspendedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrearsSuspendedTo(XMLGregorianCalendar value) {
        this.arrearsSuspendedTo = value;
    }

    /**
     * Gets the value of the beneSeniority property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getBeneSeniority() {
        return gregToDateString(beneSeniority);
    }

    /**
     * Sets the value of the beneSeniority property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeneSeniority(XMLGregorianCalendar value) {
        this.beneSeniority = value;
    }

    /**
     * Gets the value of the deceased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeceased() {
        return deceased;
    }
    public Boolean getDeceased(){
    	return deceased;
    }

    /**
     * Sets the value of the deceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeceased(Boolean value) {
        this.deceased = value;
    }

    /**
     * Gets the value of the deceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDeceasedDate() {
        return gregToDateString(deceasedDate);
    }

    /**
     * Sets the value of the deceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeceasedDate(XMLGregorianCalendar value) {
        this.deceasedDate = value;
    }

    /**
     * Gets the value of the earlyRetirement property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getEarlyRetirement() {
        return gregToDateString(earlyRetirement);
    }

    /**
     * Sets the value of the earlyRetirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarlyRetirement(XMLGregorianCalendar value) {
        this.earlyRetirement = value;
    }

    /**
     * Gets the value of the employeeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}
     *     
     */
    public JAXBElement<EmployeeIdentifier> getEmployeeIdentifier() {
        return employeeIdentifier;
    }

    /**
     * Sets the value of the employeeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}
     *     
     */
    public void setEmployeeIdentifier(JAXBElement<EmployeeIdentifier> value) {
        this.employeeIdentifier = value;
    }

    /**
     * Gets the value of the employmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmploymentStatus(JAXBElement<String> value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the fmlaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFMLACode() {
        return fmlaCode;
    }

    /**
     * Sets the value of the fmlaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFMLACode(JAXBElement<String> value) {
        this.fmlaCode = value;
    }

    /**
     * Gets the value of the hcsoEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getHcsoEndDate() {
        return gregToDateString(hcsoEndDate);
    }

    /**
     * Sets the value of the hcsoEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHcsoEndDate(XMLGregorianCalendar value) {
        this.hcsoEndDate = value;
    }

    /**
     * Gets the value of the hcsoNotCovered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHCSONotCovered() {
        return hcsoNotCovered;
    }
    public Boolean getHcsoNotCovered() {
        return hcsoNotCovered;
    }

    /**
     * Sets the value of the hcsoNotCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHcsoNotCovered(Boolean value) {
        this.hcsoNotCovered = value;
    }

    /**
     * Gets the value of the hcsoStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getHcsoStartDate() {
        return gregToDateString(hcsoStartDate);
    }

    /**
     * Sets the value of the hcsoStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHcsoStartDate(XMLGregorianCalendar value) {
        this.hcsoStartDate = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJob(JAXBElement<String> value) {
        this.job = value;
    }

    /**
     * Gets the value of the jobStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getJobStart() {
        return gregToDateString(jobStart);
    }

    /**
     * Sets the value of the jobStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJobStart(XMLGregorianCalendar value) {
        this.jobStart = value;
    }

    /**
     * Gets the value of the lastHire property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getLastHire() {
        return gregToDateString(lastHire);
    }

    /**
     * Sets the value of the lastHire property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastHire(XMLGregorianCalendar value) {
        this.lastHire = value;
    }

    /**
     * Gets the value of the lastPerfReview property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getLastPerfReview() {
        return gregToDateString(lastPerfReview);
    }

    /**
     * Sets the value of the lastPerfReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPerfReview(XMLGregorianCalendar value) {
        this.lastPerfReview = value;
    }

    /**
     * Gets the value of the lastSalaryReview property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getLastSalaryReview() {
        return gregToDateString(lastSalaryReview);
    }

    /**
     * Sets the value of the lastSalaryReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSalaryReview(XMLGregorianCalendar value) {
        this.lastSalaryReview = value;
    }

    /**
     * Gets the value of the leaveReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeaveReason() {
        return leaveReason;
    }

    /**
     * Sets the value of the leaveReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeaveReason(JAXBElement<String> value) {
        this.leaveReason = value;
    }

    /**
     * Gets the value of the nextPerfReview property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getNextPerfReview() {
        return gregToDateString(nextPerfReview);
    }

    /**
     * Sets the value of the nextPerfReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPerfReview(XMLGregorianCalendar value) {
        this.nextPerfReview = value;
    }

    /**
     * Gets the value of the nextSalaryReview property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getNextSalaryReview() {
        return gregToDateString(nextSalaryReview);
    }

    /**
     * Sets the value of the nextSalaryReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextSalaryReview(XMLGregorianCalendar value) {
        this.nextSalaryReview = value;
    }

    /**
     * Gets the value of the originalHire property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getOriginalHire() {
        return gregToDateString(originalHire);
    }

    /**
     * Sets the value of the originalHire property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalHire(XMLGregorianCalendar value) {
        this.originalHire = value;
    }

    /**
     * Gets the value of the ptoSuspendedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getPtoSuspendedFrom() {
        return gregToDateString(ptoSuspendedFrom);
    }

    /**
     * Sets the value of the ptoSuspendedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPtoSuspendedFrom(XMLGregorianCalendar value) {
        this.ptoSuspendedFrom = value;
    }

    /**
     * Gets the value of the ptoSuspendedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getPtoSuspendedTo() {
        return gregToDateString(ptoSuspendedTo);
    }

    /**
     * Sets the value of the ptoSuspendedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPtoSuspendedTo(XMLGregorianCalendar value) {
        this.ptoSuspendedTo = value;
    }

    /**
     * Gets the value of the payAutomatically property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayAutomatically() {
        return payAutomatically;
    }
    public Boolean getPayAutomatically() {
        return payAutomatically;
    }

    /**
     * Sets the value of the payAutomatically property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayAutomatically(Boolean value) {
        this.payAutomatically = value;
    }

    /**
     * Gets the value of the paySuspendedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getPaySuspendedFrom() {
        return gregToDateString(paySuspendedFrom);
    }

    /**
     * Sets the value of the paySuspendedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaySuspendedFrom(XMLGregorianCalendar value) {
        this.paySuspendedFrom = value;
    }

    /**
     * Gets the value of the paySuspendedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getPaySuspendedTo() {
        return gregToDateString(paySuspendedTo);
    }

    /**
     * Sets the value of the paySuspendedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaySuspendedTo(XMLGregorianCalendar value) {
        this.paySuspendedTo = value;
    }

    /**
     * Gets the value of the roeIssueReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoeIssueReason() {
        return roeIssueReason;
    }

    /**
     * Sets the value of the roeIssueReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoeIssueReason(JAXBElement<String> value) {
        this.roeIssueReason = value;
    }

    /**
     * Gets the value of the regularRetirement property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getRegularRetirement() {
        return gregToDateString(regularRetirement);
    }

    /**
     * Sets the value of the regularRetirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegularRetirement(XMLGregorianCalendar value) {
        this.regularRetirement = value;
    }

    /**
     * Gets the value of the selfServiceProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringstring> getSelfServiceProperties() {
        return selfServiceProperties;
    }

    /**
     * Sets the value of the selfServiceProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public void setSelfServiceProperties(JAXBElement<ArrayOfKeyValueOfstringstring> value) {
        this.selfServiceProperties = value;
    }

    /**
     * Gets the value of the seniority property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getSeniority() {
        return gregToDateString(seniority);
    }

    /**
     * Sets the value of the seniority property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeniority(XMLGregorianCalendar value) {
        this.seniority = value;
    }

    /**
     * Gets the value of the statusAnticipatedEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getStatusAnticipatedEnd() {
        return gregToDateString(statusAnticipatedEnd);
    }

    /**
     * Sets the value of the statusAnticipatedEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusAnticipatedEnd(XMLGregorianCalendar value) {
        this.statusAnticipatedEnd = value;
    }

    /**
     * Gets the value of the statusStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getStatusStartDate() {
        return gregToDateString(statusStartDate);
    }

    /**
     * Sets the value of the statusStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusStartDate(XMLGregorianCalendar value) {
        this.statusStartDate = value;
    }

    /**
     * Gets the value of the weeks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeeks() {
        return weeks;
    }

    /**
     * Sets the value of the weeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeeks(Double value) {
        this.weeks = value;
    }

}
