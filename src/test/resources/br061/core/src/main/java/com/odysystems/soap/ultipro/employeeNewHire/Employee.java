
package com.odysystems.soap.ultipro.employeeNewHire;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BenefitSeniorityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyIdentifier" type="{http://www.ultipro.com/contracts}CompanyIdentifier" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeductionBenefitGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectDeposits" type="{http://www.ultipro.com/contracts}ArrayOfDirectDeposit" minOccurs="0"/>
 *         &lt;element name="DistributionCenterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EarningsGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EthnicOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FederalAdditionalAmountWithheld" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FederalEmployeeClaimsExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FederalFilingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FederalSubjectToBackupWithholding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FederalTotalAllowancesClaimed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FederalW2Pension" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullOrPartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HireSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HourlyOrSalaried" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="I9Verification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalWorkInTaxResidentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextPerformanceReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NextSalaryReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrgLevel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgLevel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgLevel3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgLevel4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPhoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherRate1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OtherRate2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OtherRate3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OtherRate4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PTOPlans" type="{http://www.ultipro.com/contracts}ArrayOfEmployeeAccrual" minOccurs="0"/>
 *         &lt;element name="PayAutomatically" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PayGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PayRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayScaleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResidentCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResidentJurisdiction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResidentStateAdditionalAllowances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResidentStateAdditionalAmountWithheld" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ResidentStateEmployeeClaimsExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ResidentStateFilingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResidentStateTotalAllowancesClaimed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledHours" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SelfServiceProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/>
 *         &lt;element name="SeniorityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShiftCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShiftGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateGeographicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOccupationalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StepNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Supervisor" type="{http://www.ultipro.com/contracts}EmployeeIdentifier" minOccurs="0"/>
 *         &lt;element name="TimeClock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnionLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnionNational" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkStateAdditionalAllowances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WorkStateAdditionalAmountWithheld" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkStateDisabilityPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkStateEmployeeClaimsExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WorkStateFilingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkStatePlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkStateTotalAllowancesClaimed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZipOrPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", propOrder = {
    "addressLine1",
    "addressLine2",
    "alternateEmailAddress",
    "alternateTitle",
    "benefitSeniorityDate",
    "birthDate",
    "city",
    "companyIdentifier",
    "country",
    "county",
    "deductionBenefitGroup",
    "directDeposits",
    "distributionCenterCode",
    "earningsGroup",
    "emailAddress",
    "employeeNumber",
    "employeeType",
    "ethnicOrigin",
    "federalAdditionalAmountWithheld",
    "federalEmployeeClaimsExempt",
    "federalFilingStatus",
    "federalSubjectToBackupWithholding",
    "federalTotalAllowancesClaimed",
    "federalW2Pension",
    "firstName",
    "formerLastName",
    "fullOrPartTime",
    "gender",
    "hireDate",
    "hireSource",
    "homePhone",
    "hourlyOrSalaried",
    "i9Verification",
    "jobCode",
    "jobGroup",
    "lastName",
    "localWorkInTaxResidentStatus",
    "locationCode",
    "mailStop",
    "maritalStatus",
    "middleName",
    "nextPerformanceReviewDate",
    "nextSalaryReviewDate",
    "orgLevel1",
    "orgLevel2",
    "orgLevel3",
    "orgLevel4",
    "otherPhone",
    "otherPhoneExtension",
    "otherPhoneType",
    "otherRate1",
    "otherRate2",
    "otherRate3",
    "otherRate4",
    "ptoPlans",
    "payAutomatically",
    "payGroup",
    "payRate",
    "payRateType",
    "payScaleCode",
    "preferredFirstName",
    "prefix",
    "project",
    "residentCounty",
    "residentJurisdiction",
    "residentStateAdditionalAllowances",
    "residentStateAdditionalAmountWithheld",
    "residentStateEmployeeClaimsExempt",
    "residentStateFilingStatus",
    "residentStateTotalAllowancesClaimed",
    "ssn",
    "scheduledHours",
    "selfServiceProperties",
    "seniorityDate",
    "shiftCode",
    "shiftGroup",
    "stateGeographicCode",
    "stateOccupationalCode",
    "stateOrProvince",
    "stepNo",
    "suffix",
    "supervisor",
    "timeClock",
    "unionLocal",
    "unionNational",
    "workExtension",
    "workPhone",
    "workStateAdditionalAllowances",
    "workStateAdditionalAmountWithheld",
    "workStateDisabilityPlanType",
    "workStateEmployeeClaimsExempt",
    "workStateFilingStatus",
    "workStatePlan",
    "workStateTotalAllowancesClaimed",
    "zipOrPostalCode"
})
public class Employee {

    @XmlElementRef(name = "AddressLine1", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "AddressLine2", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine2;
    @XmlElementRef(name = "AlternateEmailAddress", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternateEmailAddress;
    @XmlElementRef(name = "AlternateTitle", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternateTitle;
    @XmlElement(name = "BenefitSeniorityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar benefitSeniorityDate;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElementRef(name = "City", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "CompanyIdentifier", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<CompanyIdentifier> companyIdentifier;
    @XmlElementRef(name = "Country", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "County", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> county;
    @XmlElementRef(name = "DeductionBenefitGroup", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deductionBenefitGroup;
    @XmlElementRef(name = "DirectDeposits", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDirectDeposit> directDeposits;
    @XmlElementRef(name = "DistributionCenterCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distributionCenterCode;
    @XmlElementRef(name = "EarningsGroup", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> earningsGroup;
    @XmlElementRef(name = "EmailAddress", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "EmployeeNumber", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeNumber;
    @XmlElementRef(name = "EmployeeType", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeType;
    @XmlElementRef(name = "EthnicOrigin", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ethnicOrigin;
    @XmlElement(name = "FederalAdditionalAmountWithheld")
    protected BigDecimal federalAdditionalAmountWithheld;
    @XmlElement(name = "FederalEmployeeClaimsExempt")
    protected Boolean federalEmployeeClaimsExempt;
    @XmlElementRef(name = "FederalFilingStatus", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> federalFilingStatus;
    @XmlElement(name = "FederalSubjectToBackupWithholding")
    protected Boolean federalSubjectToBackupWithholding;
    @XmlElement(name = "FederalTotalAllowancesClaimed")
    protected Integer federalTotalAllowancesClaimed;
    @XmlElement(name = "FederalW2Pension")
    protected Boolean federalW2Pension;
    @XmlElementRef(name = "FirstName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "FormerLastName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formerLastName;
    @XmlElementRef(name = "FullOrPartTime", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullOrPartTime;
    @XmlElementRef(name = "Gender", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gender;
    @XmlElement(name = "HireDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hireDate;
    @XmlElementRef(name = "HireSource", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hireSource;
    @XmlElementRef(name = "HomePhone", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homePhone;
    @XmlElementRef(name = "HourlyOrSalaried", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hourlyOrSalaried;
    @XmlElementRef(name = "I9Verification", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> i9Verification;
    @XmlElementRef(name = "JobCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobCode;
    @XmlElementRef(name = "JobGroup", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobGroup;
    @XmlElementRef(name = "LastName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "LocalWorkInTaxResidentStatus", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localWorkInTaxResidentStatus;
    @XmlElementRef(name = "LocationCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationCode;
    @XmlElementRef(name = "MailStop", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailStop;
    @XmlElementRef(name = "MaritalStatus", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maritalStatus;
    @XmlElementRef(name = "MiddleName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleName;
    @XmlElement(name = "NextPerformanceReviewDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextPerformanceReviewDate;
    @XmlElement(name = "NextSalaryReviewDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextSalaryReviewDate;
    @XmlElementRef(name = "OrgLevel1", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgLevel1;
    @XmlElementRef(name = "OrgLevel2", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgLevel2;
    @XmlElementRef(name = "OrgLevel3", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgLevel3;
    @XmlElementRef(name = "OrgLevel4", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgLevel4;
    @XmlElementRef(name = "OtherPhone", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherPhone;
    @XmlElementRef(name = "OtherPhoneExtension", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherPhoneExtension;
    @XmlElementRef(name = "OtherPhoneType", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherPhoneType;
    @XmlElementRef(name = "OtherRate1", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> otherRate1;
    @XmlElementRef(name = "OtherRate2", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> otherRate2;
    @XmlElementRef(name = "OtherRate3", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> otherRate3;
    @XmlElementRef(name = "OtherRate4", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> otherRate4;
    @XmlElementRef(name = "PTOPlans", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmployeeAccrual> ptoPlans;
    @XmlElement(name = "PayAutomatically")
    protected Boolean payAutomatically;
    @XmlElementRef(name = "PayGroup", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payGroup;
    @XmlElement(name = "PayRate")
    protected BigDecimal payRate;
    @XmlElementRef(name = "PayRateType", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payRateType;
    @XmlElementRef(name = "PayScaleCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payScaleCode;
    @XmlElementRef(name = "PreferredFirstName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredFirstName;
    @XmlElementRef(name = "Prefix", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prefix;
    @XmlElementRef(name = "Project", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> project;
    @XmlElementRef(name = "ResidentCounty", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residentCounty;
    @XmlElementRef(name = "ResidentJurisdiction", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residentJurisdiction;
    @XmlElement(name = "ResidentStateAdditionalAllowances")
    protected Integer residentStateAdditionalAllowances;
    @XmlElement(name = "ResidentStateAdditionalAmountWithheld")
    protected BigDecimal residentStateAdditionalAmountWithheld;
    @XmlElement(name = "ResidentStateEmployeeClaimsExempt")
    protected Boolean residentStateEmployeeClaimsExempt;
    @XmlElementRef(name = "ResidentStateFilingStatus", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> residentStateFilingStatus;
    @XmlElement(name = "ResidentStateTotalAllowancesClaimed")
    protected Integer residentStateTotalAllowancesClaimed;
    @XmlElementRef(name = "SSN", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ssn;
    @XmlElement(name = "ScheduledHours")
    protected BigDecimal scheduledHours;
    @XmlElementRef(name = "SelfServiceProperties", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> selfServiceProperties;
    @XmlElement(name = "SeniorityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seniorityDate;
    @XmlElementRef(name = "ShiftCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shiftCode;
    @XmlElementRef(name = "ShiftGroup", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shiftGroup;
    @XmlElementRef(name = "StateGeographicCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateGeographicCode;
    @XmlElementRef(name = "StateOccupationalCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateOccupationalCode;
    @XmlElementRef(name = "StateOrProvince", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateOrProvince;
    @XmlElementRef(name = "StepNo", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stepNo;
    @XmlElementRef(name = "Suffix", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suffix;
    @XmlElementRef(name = "Supervisor", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EmployeeIdentifier> supervisor;
    @XmlElementRef(name = "TimeClock", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeClock;
    @XmlElementRef(name = "UnionLocal", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unionLocal;
    @XmlElementRef(name = "UnionNational", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unionNational;
    @XmlElementRef(name = "WorkExtension", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workExtension;
    @XmlElementRef(name = "WorkPhone", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPhone;
    @XmlElement(name = "WorkStateAdditionalAllowances")
    protected Integer workStateAdditionalAllowances;
    @XmlElement(name = "WorkStateAdditionalAmountWithheld")
    protected BigDecimal workStateAdditionalAmountWithheld;
    @XmlElementRef(name = "WorkStateDisabilityPlanType", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workStateDisabilityPlanType;
    @XmlElement(name = "WorkStateEmployeeClaimsExempt")
    protected Boolean workStateEmployeeClaimsExempt;
    @XmlElementRef(name = "WorkStateFilingStatus", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workStateFilingStatus;
    @XmlElementRef(name = "WorkStatePlan", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workStatePlan;
    @XmlElement(name = "WorkStateTotalAllowancesClaimed")
    protected Integer workStateTotalAllowancesClaimed;
    @XmlElementRef(name = "ZipOrPostalCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zipOrPostalCode;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine2(JAXBElement<String> value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the alternateEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternateEmailAddress() {
        return alternateEmailAddress;
    }

    /**
     * Sets the value of the alternateEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternateEmailAddress(JAXBElement<String> value) {
        this.alternateEmailAddress = value;
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
     * Gets the value of the benefitSeniorityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBenefitSeniorityDate() {
        return benefitSeniorityDate;
    }

    /**
     * Sets the value of the benefitSeniorityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBenefitSeniorityDate(XMLGregorianCalendar value) {
        this.benefitSeniorityDate = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the companyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompanyIdentifier }{@code >}
     *     
     */
    public JAXBElement<CompanyIdentifier> getCompanyIdentifier() {
        return companyIdentifier;
    }

    /**
     * Sets the value of the companyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompanyIdentifier }{@code >}
     *     
     */
    public void setCompanyIdentifier(JAXBElement<CompanyIdentifier> value) {
        this.companyIdentifier = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounty(JAXBElement<String> value) {
        this.county = value;
    }

    /**
     * Gets the value of the deductionBenefitGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeductionBenefitGroup() {
        return deductionBenefitGroup;
    }

    /**
     * Sets the value of the deductionBenefitGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeductionBenefitGroup(JAXBElement<String> value) {
        this.deductionBenefitGroup = value;
    }

    /**
     * Gets the value of the directDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDirectDeposit }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDirectDeposit> getDirectDeposits() {
        return directDeposits;
    }

    /**
     * Sets the value of the directDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDirectDeposit }{@code >}
     *     
     */
    public void setDirectDeposits(JAXBElement<ArrayOfDirectDeposit> value) {
        this.directDeposits = value;
    }

    /**
     * Gets the value of the distributionCenterCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistributionCenterCode() {
        return distributionCenterCode;
    }

    /**
     * Sets the value of the distributionCenterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistributionCenterCode(JAXBElement<String> value) {
        this.distributionCenterCode = value;
    }

    /**
     * Gets the value of the earningsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEarningsGroup() {
        return earningsGroup;
    }

    /**
     * Sets the value of the earningsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEarningsGroup(JAXBElement<String> value) {
        this.earningsGroup = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeNumber(JAXBElement<String> value) {
        this.employeeNumber = value;
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
     * Gets the value of the ethnicOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEthnicOrigin() {
        return ethnicOrigin;
    }

    /**
     * Sets the value of the ethnicOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEthnicOrigin(JAXBElement<String> value) {
        this.ethnicOrigin = value;
    }

    /**
     * Gets the value of the federalAdditionalAmountWithheld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFederalAdditionalAmountWithheld() {
        return federalAdditionalAmountWithheld;
    }

    /**
     * Sets the value of the federalAdditionalAmountWithheld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFederalAdditionalAmountWithheld(BigDecimal value) {
        this.federalAdditionalAmountWithheld = value;
    }

    /**
     * Gets the value of the federalEmployeeClaimsExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederalEmployeeClaimsExempt() {
        return federalEmployeeClaimsExempt;
    }

    /**
     * Sets the value of the federalEmployeeClaimsExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederalEmployeeClaimsExempt(Boolean value) {
        this.federalEmployeeClaimsExempt = value;
    }

    /**
     * Gets the value of the federalFilingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFederalFilingStatus() {
        return federalFilingStatus;
    }

    /**
     * Sets the value of the federalFilingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFederalFilingStatus(JAXBElement<String> value) {
        this.federalFilingStatus = value;
    }

    /**
     * Gets the value of the federalSubjectToBackupWithholding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederalSubjectToBackupWithholding() {
        return federalSubjectToBackupWithholding;
    }

    /**
     * Sets the value of the federalSubjectToBackupWithholding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederalSubjectToBackupWithholding(Boolean value) {
        this.federalSubjectToBackupWithholding = value;
    }

    /**
     * Gets the value of the federalTotalAllowancesClaimed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFederalTotalAllowancesClaimed() {
        return federalTotalAllowancesClaimed;
    }

    /**
     * Sets the value of the federalTotalAllowancesClaimed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFederalTotalAllowancesClaimed(Integer value) {
        this.federalTotalAllowancesClaimed = value;
    }

    /**
     * Gets the value of the federalW2Pension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederalW2Pension() {
        return federalW2Pension;
    }

    /**
     * Sets the value of the federalW2Pension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederalW2Pension(Boolean value) {
        this.federalW2Pension = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the formerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormerLastName() {
        return formerLastName;
    }

    /**
     * Sets the value of the formerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormerLastName(JAXBElement<String> value) {
        this.formerLastName = value;
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGender(JAXBElement<String> value) {
        this.gender = value;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHireDate(XMLGregorianCalendar value) {
        this.hireDate = value;
    }

    /**
     * Gets the value of the hireSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHireSource() {
        return hireSource;
    }

    /**
     * Sets the value of the hireSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHireSource(JAXBElement<String> value) {
        this.hireSource = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomePhone(JAXBElement<String> value) {
        this.homePhone = value;
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
     * Gets the value of the i9Verification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getI9Verification() {
        return i9Verification;
    }

    /**
     * Sets the value of the i9Verification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setI9Verification(JAXBElement<String> value) {
        this.i9Verification = value;
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the localWorkInTaxResidentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalWorkInTaxResidentStatus() {
        return localWorkInTaxResidentStatus;
    }

    /**
     * Sets the value of the localWorkInTaxResidentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalWorkInTaxResidentStatus(JAXBElement<String> value) {
        this.localWorkInTaxResidentStatus = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationCode(JAXBElement<String> value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the mailStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailStop() {
        return mailStop;
    }

    /**
     * Sets the value of the mailStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailStop(JAXBElement<String> value) {
        this.mailStop = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<String> value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleName(JAXBElement<String> value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the nextPerformanceReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPerformanceReviewDate() {
        return nextPerformanceReviewDate;
    }

    /**
     * Sets the value of the nextPerformanceReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPerformanceReviewDate(XMLGregorianCalendar value) {
        this.nextPerformanceReviewDate = value;
    }

    /**
     * Gets the value of the nextSalaryReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextSalaryReviewDate() {
        return nextSalaryReviewDate;
    }

    /**
     * Sets the value of the nextSalaryReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextSalaryReviewDate(XMLGregorianCalendar value) {
        this.nextSalaryReviewDate = value;
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
     * Gets the value of the otherPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherPhone() {
        return otherPhone;
    }

    /**
     * Sets the value of the otherPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherPhone(JAXBElement<String> value) {
        this.otherPhone = value;
    }

    /**
     * Gets the value of the otherPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherPhoneExtension() {
        return otherPhoneExtension;
    }

    /**
     * Sets the value of the otherPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherPhoneExtension(JAXBElement<String> value) {
        this.otherPhoneExtension = value;
    }

    /**
     * Gets the value of the otherPhoneType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherPhoneType() {
        return otherPhoneType;
    }

    /**
     * Sets the value of the otherPhoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherPhoneType(JAXBElement<String> value) {
        this.otherPhoneType = value;
    }

    /**
     * Gets the value of the otherRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOtherRate1() {
        return otherRate1;
    }

    /**
     * Sets the value of the otherRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOtherRate1(JAXBElement<BigDecimal> value) {
        this.otherRate1 = value;
    }

    /**
     * Gets the value of the otherRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOtherRate2() {
        return otherRate2;
    }

    /**
     * Sets the value of the otherRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOtherRate2(JAXBElement<BigDecimal> value) {
        this.otherRate2 = value;
    }

    /**
     * Gets the value of the otherRate3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOtherRate3() {
        return otherRate3;
    }

    /**
     * Sets the value of the otherRate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOtherRate3(JAXBElement<BigDecimal> value) {
        this.otherRate3 = value;
    }

    /**
     * Gets the value of the otherRate4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOtherRate4() {
        return otherRate4;
    }

    /**
     * Sets the value of the otherRate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOtherRate4(JAXBElement<BigDecimal> value) {
        this.otherRate4 = value;
    }

    /**
     * Gets the value of the ptoPlans property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmployeeAccrual }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmployeeAccrual> getPTOPlans() {
        return ptoPlans;
    }

    /**
     * Sets the value of the ptoPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmployeeAccrual }{@code >}
     *     
     */
    public void setPTOPlans(JAXBElement<ArrayOfEmployeeAccrual> value) {
        this.ptoPlans = value;
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
     * Gets the value of the payRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayRate() {
        return payRate;
    }

    /**
     * Sets the value of the payRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayRate(BigDecimal value) {
        this.payRate = value;
    }

    /**
     * Gets the value of the payRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayRateType() {
        return payRateType;
    }

    /**
     * Sets the value of the payRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayRateType(JAXBElement<String> value) {
        this.payRateType = value;
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
     * Gets the value of the preferredFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredFirstName() {
        return preferredFirstName;
    }

    /**
     * Sets the value of the preferredFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredFirstName(JAXBElement<String> value) {
        this.preferredFirstName = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefix(JAXBElement<String> value) {
        this.prefix = value;
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
     * Gets the value of the residentCounty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResidentCounty() {
        return residentCounty;
    }

    /**
     * Sets the value of the residentCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResidentCounty(JAXBElement<String> value) {
        this.residentCounty = value;
    }

    /**
     * Gets the value of the residentJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResidentJurisdiction() {
        return residentJurisdiction;
    }

    /**
     * Sets the value of the residentJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResidentJurisdiction(JAXBElement<String> value) {
        this.residentJurisdiction = value;
    }

    /**
     * Gets the value of the residentStateAdditionalAllowances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResidentStateAdditionalAllowances() {
        return residentStateAdditionalAllowances;
    }

    /**
     * Sets the value of the residentStateAdditionalAllowances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResidentStateAdditionalAllowances(Integer value) {
        this.residentStateAdditionalAllowances = value;
    }

    /**
     * Gets the value of the residentStateAdditionalAmountWithheld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResidentStateAdditionalAmountWithheld() {
        return residentStateAdditionalAmountWithheld;
    }

    /**
     * Sets the value of the residentStateAdditionalAmountWithheld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResidentStateAdditionalAmountWithheld(BigDecimal value) {
        this.residentStateAdditionalAmountWithheld = value;
    }

    /**
     * Gets the value of the residentStateEmployeeClaimsExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResidentStateEmployeeClaimsExempt() {
        return residentStateEmployeeClaimsExempt;
    }

    /**
     * Sets the value of the residentStateEmployeeClaimsExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResidentStateEmployeeClaimsExempt(Boolean value) {
        this.residentStateEmployeeClaimsExempt = value;
    }

    /**
     * Gets the value of the residentStateFilingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResidentStateFilingStatus() {
        return residentStateFilingStatus;
    }

    /**
     * Sets the value of the residentStateFilingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResidentStateFilingStatus(JAXBElement<String> value) {
        this.residentStateFilingStatus = value;
    }

    /**
     * Gets the value of the residentStateTotalAllowancesClaimed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResidentStateTotalAllowancesClaimed() {
        return residentStateTotalAllowancesClaimed;
    }

    /**
     * Sets the value of the residentStateTotalAllowancesClaimed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResidentStateTotalAllowancesClaimed(Integer value) {
        this.residentStateTotalAllowancesClaimed = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSN(JAXBElement<String> value) {
        this.ssn = value;
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
     * Gets the value of the seniorityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeniorityDate() {
        return seniorityDate;
    }

    /**
     * Sets the value of the seniorityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeniorityDate(XMLGregorianCalendar value) {
        this.seniorityDate = value;
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
     * Gets the value of the stateGeographicCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateGeographicCode() {
        return stateGeographicCode;
    }

    /**
     * Sets the value of the stateGeographicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateGeographicCode(JAXBElement<String> value) {
        this.stateGeographicCode = value;
    }

    /**
     * Gets the value of the stateOccupationalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateOccupationalCode() {
        return stateOccupationalCode;
    }

    /**
     * Sets the value of the stateOccupationalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateOccupationalCode(JAXBElement<String> value) {
        this.stateOccupationalCode = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateOrProvince(JAXBElement<String> value) {
        this.stateOrProvince = value;
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
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuffix(JAXBElement<String> value) {
        this.suffix = value;
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
     * Gets the value of the unionLocal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnionLocal() {
        return unionLocal;
    }

    /**
     * Sets the value of the unionLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnionLocal(JAXBElement<String> value) {
        this.unionLocal = value;
    }

    /**
     * Gets the value of the unionNational property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnionNational() {
        return unionNational;
    }

    /**
     * Sets the value of the unionNational property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnionNational(JAXBElement<String> value) {
        this.unionNational = value;
    }

    /**
     * Gets the value of the workExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkExtension() {
        return workExtension;
    }

    /**
     * Sets the value of the workExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkExtension(JAXBElement<String> value) {
        this.workExtension = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPhone(JAXBElement<String> value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the workStateAdditionalAllowances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkStateAdditionalAllowances() {
        return workStateAdditionalAllowances;
    }

    /**
     * Sets the value of the workStateAdditionalAllowances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkStateAdditionalAllowances(Integer value) {
        this.workStateAdditionalAllowances = value;
    }

    /**
     * Gets the value of the workStateAdditionalAmountWithheld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkStateAdditionalAmountWithheld() {
        return workStateAdditionalAmountWithheld;
    }

    /**
     * Sets the value of the workStateAdditionalAmountWithheld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkStateAdditionalAmountWithheld(BigDecimal value) {
        this.workStateAdditionalAmountWithheld = value;
    }

    /**
     * Gets the value of the workStateDisabilityPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkStateDisabilityPlanType() {
        return workStateDisabilityPlanType;
    }

    /**
     * Sets the value of the workStateDisabilityPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkStateDisabilityPlanType(JAXBElement<String> value) {
        this.workStateDisabilityPlanType = value;
    }

    /**
     * Gets the value of the workStateEmployeeClaimsExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkStateEmployeeClaimsExempt() {
        return workStateEmployeeClaimsExempt;
    }

    /**
     * Sets the value of the workStateEmployeeClaimsExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkStateEmployeeClaimsExempt(Boolean value) {
        this.workStateEmployeeClaimsExempt = value;
    }

    /**
     * Gets the value of the workStateFilingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkStateFilingStatus() {
        return workStateFilingStatus;
    }

    /**
     * Sets the value of the workStateFilingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkStateFilingStatus(JAXBElement<String> value) {
        this.workStateFilingStatus = value;
    }

    /**
     * Gets the value of the workStatePlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkStatePlan() {
        return workStatePlan;
    }

    /**
     * Sets the value of the workStatePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkStatePlan(JAXBElement<String> value) {
        this.workStatePlan = value;
    }

    /**
     * Gets the value of the workStateTotalAllowancesClaimed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkStateTotalAllowancesClaimed() {
        return workStateTotalAllowancesClaimed;
    }

    /**
     * Sets the value of the workStateTotalAllowancesClaimed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkStateTotalAllowancesClaimed(Integer value) {
        this.workStateTotalAllowancesClaimed = value;
    }

    /**
     * Gets the value of the zipOrPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZipOrPostalCode() {
        return zipOrPostalCode;
    }

    /**
     * Sets the value of the zipOrPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZipOrPostalCode(JAXBElement<String> value) {
        this.zipOrPostalCode = value;
    }

}
