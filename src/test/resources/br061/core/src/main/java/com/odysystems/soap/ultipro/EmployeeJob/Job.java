
package com.odysystems.soap.ultipro.EmployeeJob;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

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
 * <p>Java class for Job complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agricultural" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AlternateTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateInJob" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DirectLabor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmployeeIdentifier" type="{http://www.ultipro.com/contracts}EmployeeIdentifier" minOccurs="0"/>
 *         &lt;element name="EmployeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullOrPartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HourlyOrSalaried" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalUnion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NationalUnion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgLevel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgLevel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgLevel3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgLevel4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayScaleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Promotion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledHours" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Seasonal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SelfServiceProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/>
 *         &lt;element name="ShiftCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShiftGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StepNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Supervisor" type="{http://www.ultipro.com/contracts}EmployeeIdentifier" minOccurs="0"/>
 *         &lt;element name="TimeClock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="YouthTraining" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job", propOrder = {
    "agricultural",
    "alternateTitle",
    "dateInJob",
    "directLabor",
    "effectiveDate",
    "effectiveDateString",
    "employeeIdentifier",
    "employeeType",
    "fullOrPartTime",
    "hourlyOrSalaried",
    "jobCode",
    "jobGroup",
    "localUnion",
    "nationalUnion",
    "orgLevel1",
    "orgLevel2",
    "orgLevel3",
    "orgLevel4",
    "payFrequency",
    "payGroup",
    "payScaleCode",
    "project",
    "promotion",
    "reasonCode",
    "scheduledHours",
    "seasonal",
    "selfServiceProperties",
    "shiftCode",
    "shiftGroup",
    "stepNo",
    "supervisor",
    "timeClock",
    "transfer",
    "youthTraining"
})
public class Job extends XMLGregDateConverter{
	
    @XmlElement(name = "Agricultural")
    protected Boolean agricultural;
    @XmlElementRef(name = "AlternateTitle", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternateTitle;
    @XmlElement(name = "DateInJob")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateInJob;
    @XmlElement(name = "DirectLabor")
    protected Boolean directLabor;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElementRef(name = "EmployeeIdentifier", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EmployeeIdentifier> employeeIdentifier;
    @XmlElementRef(name = "EmployeeType", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeType;
    @XmlElementRef(name = "FullOrPartTime", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullOrPartTime;
    @XmlElementRef(name = "HourlyOrSalaried", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hourlyOrSalaried;
    @XmlElementRef(name = "JobCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobCode;
    @XmlElementRef(name = "JobGroup", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobGroup;
    @XmlElementRef(name = "LocalUnion", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localUnion;
    @XmlElementRef(name = "NationalUnion", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationalUnion;
    @XmlElementRef(name = "OrgLevel1", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgLevel1;
    @XmlElementRef(name = "OrgLevel2", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgLevel2;
    @XmlElementRef(name = "OrgLevel3", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgLevel3;
    @XmlElementRef(name = "OrgLevel4", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgLevel4;
    @XmlElementRef(name = "PayFrequency", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payFrequency;
    @XmlElementRef(name = "PayGroup", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payGroup;
    @XmlElementRef(name = "PayScaleCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payScaleCode;
    @XmlElementRef(name = "Project", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> project;
    @XmlElement(name = "Promotion")
    protected Boolean promotion;
    @XmlElementRef(name = "ReasonCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reasonCode;
    @XmlElement(name = "ScheduledHours")
    protected BigDecimal scheduledHours;
    @XmlElement(name = "Seasonal")
    protected Boolean seasonal;
    @XmlElementRef(name = "SelfServiceProperties", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> selfServiceProperties;
    @XmlElementRef(name = "ShiftCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shiftCode;
    @XmlElementRef(name = "ShiftGroup", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shiftGroup;
    @XmlElementRef(name = "StepNo", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stepNo;
    @XmlElementRef(name = "Supervisor", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EmployeeIdentifier> supervisor;
    @XmlElementRef(name = "TimeClock", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeClock;
    @XmlElement(name = "Transfer")
    protected Boolean transfer;
    @XmlElement(name = "YouthTraining")
    protected Boolean youthTraining;
    protected String effectiveDateString;
    
    


	/**
     * Gets the value of the agricultural property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgricultural() {
        return agricultural;
    }
    public Boolean getAgricultural() {
        return agricultural;
    }

    /**
     * Sets the value of the agricultural property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgricultural(Boolean value) {
        this.agricultural = value;
    }

    /**
     * Gets the value of the alternateTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternateTitle() {
        return alternateTitle;
    }

    /**
     * Sets the value of the alternateTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternateTitle(JAXBElement<String> value) {
        this.alternateTitle = value;
    }

    /**
     * Gets the value of the dateInJob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDateInJob() {
        return gregToDateString(dateInJob);
    }

    /**
     * Sets the value of the dateInJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateInJob(XMLGregorianCalendar value) {
        this.dateInJob = value;
    }

    /**
     * Gets the value of the directLabor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectLabor() {
        return directLabor;
    }
    public Boolean getDirectLabor() {
        return directLabor;
    }

    /**
     * Sets the value of the directLabor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectLabor(Boolean value) {
        this.directLabor = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getEffectiveDate() {

    	return gregToDateString(effectiveDate);
    }

    
 /*   public String getEffectiveDateString() {
		String date = gregToDateString(getEffectiveDate());
		this.effectiveDateString = date;
    	return effectiveDateString;
	}
	public void setEffectiveDateString(String effectiveDateString) {		
		this.effectiveDateString = effectiveDateString;
	}*/

	/**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
    	this.effectiveDate = value;
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
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeType(JAXBElement<String> value) {
        this.employeeType = value;
    }

    /**
     * Gets the value of the fullOrPartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullOrPartTime() {
        return fullOrPartTime;
    }

    /**
     * Sets the value of the fullOrPartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullOrPartTime(JAXBElement<String> value) {
        this.fullOrPartTime = value;
    }

    /**
     * Gets the value of the hourlyOrSalaried property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHourlyOrSalaried() {
        return hourlyOrSalaried;
    }

    /**
     * Sets the value of the hourlyOrSalaried property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHourlyOrSalaried(JAXBElement<String> value) {
        this.hourlyOrSalaried = value;
    }

    /**
     * Gets the value of the jobCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobCode() {
        return jobCode;
    }

    /**
     * Sets the value of the jobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobCode(JAXBElement<String> value) {
        this.jobCode = value;
    }

    /**
     * Gets the value of the jobGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobGroup() {
        return jobGroup;
    }

    /**
     * Sets the value of the jobGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobGroup(JAXBElement<String> value) {
        this.jobGroup = value;
    }

    /**
     * Gets the value of the localUnion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalUnion() {
        return localUnion;
    }

    /**
     * Sets the value of the localUnion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalUnion(JAXBElement<String> value) {
        this.localUnion = value;
    }

    /**
     * Gets the value of the nationalUnion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationalUnion() {
        return nationalUnion;
    }

    /**
     * Sets the value of the nationalUnion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationalUnion(JAXBElement<String> value) {
        this.nationalUnion = value;
    }

    /**
     * Gets the value of the orgLevel1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgLevel1() {
        return orgLevel1;
    }

    /**
     * Sets the value of the orgLevel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgLevel1(JAXBElement<String> value) {
        this.orgLevel1 = value;
    }

    /**
     * Gets the value of the orgLevel2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgLevel2() {
        return orgLevel2;
    }

    /**
     * Sets the value of the orgLevel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgLevel2(JAXBElement<String> value) {
        this.orgLevel2 = value;
    }

    /**
     * Gets the value of the orgLevel3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgLevel3() {
        return orgLevel3;
    }

    /**
     * Sets the value of the orgLevel3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgLevel3(JAXBElement<String> value) {
        this.orgLevel3 = value;
    }

    /**
     * Gets the value of the orgLevel4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgLevel4() {
        return orgLevel4;
    }

    /**
     * Sets the value of the orgLevel4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgLevel4(JAXBElement<String> value) {
        this.orgLevel4 = value;
    }

    /**
     * Gets the value of the payFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayFrequency() {
        return payFrequency;
    }

    /**
     * Sets the value of the payFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayFrequency(JAXBElement<String> value) {
        this.payFrequency = value;
    }

    /**
     * Gets the value of the payGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayGroup() {
        return payGroup;
    }

    /**
     * Sets the value of the payGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayGroup(JAXBElement<String> value) {
        this.payGroup = value;
    }

    /**
     * Gets the value of the payScaleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayScaleCode() {
        return payScaleCode;
    }

    /**
     * Sets the value of the payScaleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayScaleCode(JAXBElement<String> value) {
        this.payScaleCode = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProject(JAXBElement<String> value) {
        this.project = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromotion() {
        return promotion;
    }
    public Boolean getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromotion(Boolean value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonCode(JAXBElement<String> value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the scheduledHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScheduledHours() {
        return scheduledHours;
    }

    /**
     * Sets the value of the scheduledHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScheduledHours(BigDecimal value) {
        this.scheduledHours = value;
    }

    /**
     * Gets the value of the seasonal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeasonal() {
        return seasonal;
    }
    public Boolean getSeasonal() {
        return seasonal;
    }

    /**
     * Sets the value of the seasonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeasonal(Boolean value) {
        this.seasonal = value;
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
     * Gets the value of the shiftCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShiftCode() {
        return shiftCode;
    }

    /**
     * Sets the value of the shiftCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShiftCode(JAXBElement<String> value) {
        this.shiftCode = value;
    }

    /**
     * Gets the value of the shiftGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShiftGroup() {
        return shiftGroup;
    }

    /**
     * Sets the value of the shiftGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShiftGroup(JAXBElement<String> value) {
        this.shiftGroup = value;
    }

    /**
     * Gets the value of the stepNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStepNo() {
        return stepNo;
    }

    /**
     * Sets the value of the stepNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStepNo(JAXBElement<Integer> value) {
        this.stepNo = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}
     *     
     */
    public JAXBElement<EmployeeIdentifier> getSupervisor() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}
     *     
     */
    public void setSupervisor(JAXBElement<EmployeeIdentifier> value) {
        this.supervisor = value;
    }

    /**
     * Gets the value of the timeClock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeClock() {
        return timeClock;
    }

    /**
     * Sets the value of the timeClock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeClock(JAXBElement<String> value) {
        this.timeClock = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransfer(Boolean value) {
        this.transfer = value;
    }

    /**
     * Gets the value of the youthTraining property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYouthTraining() {
        return youthTraining;
    }
    public Boolean getYouthTraining() {
        return youthTraining;
    }

    /**
     * Sets the value of the youthTraining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYouthTraining(Boolean value) {
        this.youthTraining = value;
    }

}
