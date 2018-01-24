
package com.odysystems.soap.ultipro.employeeNewHire;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.odysystems.soap.ultipro.employeeNewHire package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ImportCodeIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "ImportCodeIdentifier");
    private final static QName _ArrayOfOperationMessage_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfOperationMessage");
    private final static QName _NameValueCollection_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Specialized", "NameValueCollection");
    private final static QName _CompanyIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "CompanyIdentifier");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _SinIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "SinIdentifier");
    private final static QName _WriteResponse_QNAME = new QName("http://www.ultipro.com/contracts", "WriteResponse");
    private final static QName _Severity_QNAME = new QName("http://www.ultipro.com/contracts", "Severity");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfResult_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfResult");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfEmployeeAccrual_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfEmployeeAccrual");
    private final static QName _EmployeeIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeIdentifier");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _SsnIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "SsnIdentifier");
    private final static QName _EntityIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "EntityIdentifier");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfDirectDeposit_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfDirectDeposit");
    private final static QName _ArrayOfKeyValueOfstringstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _OperationMessage_QNAME = new QName("http://www.ultipro.com/contracts", "OperationMessage");
    private final static QName _Employee_QNAME = new QName("http://www.ultipro.com/contracts", "Employee");
    private final static QName _EmployeeNumberIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeNumberIdentifier");
    private final static QName _EmployeeCreateResponse_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeCreateResponse");
    private final static QName _EmailAddressIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "EmailAddressIdentifier");
    private final static QName _UserDefinedIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "UserDefinedIdentifier");
    private final static QName _FederalIdIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "FederalIdIdentifier");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ArrayOfEmployee_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfEmployee");
    private final static QName _NationalIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "NationalIdentifier");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _EmployeeAccrual_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeAccrual");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _CompanyCodeIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "CompanyCodeIdentifier");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _PagingInfo_QNAME = new QName("http://www.ultipro.com/contracts", "PagingInfo");
    private final static QName _NameObjectCollectionBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Specialized", "NameObjectCollectionBase");
    private final static QName _PingResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "PingResponse");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _DirectDeposit_QNAME = new QName("http://www.ultipro.com/contracts", "DirectDeposit");
    private final static QName _Result_QNAME = new QName("http://www.ultipro.com/contracts", "Result");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _CreateResponse_QNAME = new QName("http://www.ultipro.com/contracts", "CreateResponse");
    private final static QName _NationalIdentifierNationalId_QNAME = new QName("http://www.ultipro.com/contracts", "NationalId");
    private final static QName _EmployeeNumberIdentifierEmployeeNumber_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeNumber");
    private final static QName _PingResponseTargetUri_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "TargetUri");
    private final static QName _PingResponseCallerIPAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "CallerIPAddress");
    private final static QName _PingResponseChild_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "Child");
    private final static QName _PingResponseInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "Information");
    private final static QName _PingResponseExceptionDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "ExceptionDetails");
    private final static QName _PingResponseAppDomainName_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "AppDomainName");
    private final static QName _PingResponseStackTrace_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "StackTrace");
    private final static QName _PingResponseMachineName_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "MachineName");
    private final static QName _PingResponseExceptionMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "ExceptionMessage");
    private final static QName _PingResponseProcessName_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "ProcessName");
    private final static QName _PingResponseListenerUri_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "ListenerUri");
    private final static QName _JokerPingResult_QNAME = new QName("http://tempuri.org/", "PingResult");
    private final static QName _WriteResponseOperationResult_QNAME = new QName("http://www.ultipro.com/contracts", "OperationResult");
    private final static QName _WriteResponseResults_QNAME = new QName("http://www.ultipro.com/contracts", "Results");
    private final static QName _NewHireUsaResponseNewHireUsaResult_QNAME = new QName("http://www.ultipro.com/services/employeenewhire", "NewHireUsaResult");
    private final static QName _OperationMessageCode_QNAME = new QName("http://www.ultipro.com/contracts", "Code");
    private final static QName _OperationMessagePropertyName_QNAME = new QName("http://www.ultipro.com/contracts", "PropertyName");
    private final static QName _OperationMessageMessage_QNAME = new QName("http://www.ultipro.com/contracts", "Message");
    private final static QName _OperationMessageLogEntryId_QNAME = new QName("http://www.ultipro.com/contracts", "LogEntryId");
    private final static QName _ResultRequestNumber_QNAME = new QName("http://www.ultipro.com/contracts", "RequestNumber");
    private final static QName _ResultMessages_QNAME = new QName("http://www.ultipro.com/contracts", "Messages");
    private final static QName _ImportCodeIdentifierImportCode_QNAME = new QName("http://www.ultipro.com/contracts", "ImportCode");
    private final static QName _EmailAddressIdentifierEmailAddress_QNAME = new QName("http://www.ultipro.com/contracts", "EmailAddress");
    private final static QName _FederalIdIdentifierFederalId_QNAME = new QName("http://www.ultipro.com/contracts", "FederalId");
    private final static QName _CompanyCodeIdentifierCompanyCode_QNAME = new QName("http://www.ultipro.com/contracts", "CompanyCode");
    private final static QName _DirectDepositFlatOrPercentAmount_QNAME = new QName("http://www.ultipro.com/contracts", "FlatOrPercentAmount");
    private final static QName _DirectDepositAccountType_QNAME = new QName("http://www.ultipro.com/contracts", "AccountType");
    private final static QName _DirectDepositAccountNumber_QNAME = new QName("http://www.ultipro.com/contracts", "AccountNumber");
    private final static QName _DirectDepositRoutingNumber_QNAME = new QName("http://www.ultipro.com/contracts", "RoutingNumber");
    private final static QName _DirectDepositBankName_QNAME = new QName("http://www.ultipro.com/contracts", "BankName");
    private final static QName _DirectDepositAccountIsActive_QNAME = new QName("http://www.ultipro.com/contracts", "AccountIsActive");
    private final static QName _DirectDepositAmountRule_QNAME = new QName("http://www.ultipro.com/contracts", "AmountRule");
    private final static QName _UserDefinedIdentifierValue_QNAME = new QName("http://www.ultipro.com/contracts", "Value");
    private final static QName _NewHireUsaEntities_QNAME = new QName("http://www.ultipro.com/services/employeenewhire", "entities");
    private final static QName _SinIdentifierSin_QNAME = new QName("http://www.ultipro.com/contracts", "Sin");
    private final static QName _SsnIdentifierSsn_QNAME = new QName("http://www.ultipro.com/contracts", "Ssn");
    private final static QName _EmployeeStepNo_QNAME = new QName("http://www.ultipro.com/contracts", "StepNo");
    private final static QName _EmployeeShiftGroup_QNAME = new QName("http://www.ultipro.com/contracts", "ShiftGroup");
    private final static QName _EmployeeOtherRate4_QNAME = new QName("http://www.ultipro.com/contracts", "OtherRate4");
    private final static QName _EmployeeSelfServiceProperties_QNAME = new QName("http://www.ultipro.com/contracts", "SelfServiceProperties");
    private final static QName _EmployeePayScaleCode_QNAME = new QName("http://www.ultipro.com/contracts", "PayScaleCode");
    private final static QName _EmployeeHomePhone_QNAME = new QName("http://www.ultipro.com/contracts", "HomePhone");
    private final static QName _EmployeeZipOrPostalCode_QNAME = new QName("http://www.ultipro.com/contracts", "ZipOrPostalCode");
    private final static QName _EmployeeOtherRate1_QNAME = new QName("http://www.ultipro.com/contracts", "OtherRate1");
    private final static QName _EmployeeI9Verification_QNAME = new QName("http://www.ultipro.com/contracts", "I9Verification");
    private final static QName _EmployeeOtherRate2_QNAME = new QName("http://www.ultipro.com/contracts", "OtherRate2");
    private final static QName _EmployeeOtherRate3_QNAME = new QName("http://www.ultipro.com/contracts", "OtherRate3");
    private final static QName _EmployeeOrgLevel4_QNAME = new QName("http://www.ultipro.com/contracts", "OrgLevel4");
    private final static QName _EmployeeOrgLevel1_QNAME = new QName("http://www.ultipro.com/contracts", "OrgLevel1");
    private final static QName _EmployeeUnionLocal_QNAME = new QName("http://www.ultipro.com/contracts", "UnionLocal");
    private final static QName _EmployeeMiddleName_QNAME = new QName("http://www.ultipro.com/contracts", "MiddleName");
    private final static QName _EmployeeEmployeeType_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeType");
    private final static QName _EmployeeHourlyOrSalaried_QNAME = new QName("http://www.ultipro.com/contracts", "HourlyOrSalaried");
    private final static QName _EmployeeOrgLevel3_QNAME = new QName("http://www.ultipro.com/contracts", "OrgLevel3");
    private final static QName _EmployeeSSN_QNAME = new QName("http://www.ultipro.com/contracts", "SSN");
    private final static QName _EmployeeOrgLevel2_QNAME = new QName("http://www.ultipro.com/contracts", "OrgLevel2");
    private final static QName _EmployeeEarningsGroup_QNAME = new QName("http://www.ultipro.com/contracts", "EarningsGroup");
    private final static QName _EmployeePayGroup_QNAME = new QName("http://www.ultipro.com/contracts", "PayGroup");
    private final static QName _EmployeeFirstName_QNAME = new QName("http://www.ultipro.com/contracts", "FirstName");
    private final static QName _EmployeeStateGeographicCode_QNAME = new QName("http://www.ultipro.com/contracts", "StateGeographicCode");
    private final static QName _EmployeeStateOccupationalCode_QNAME = new QName("http://www.ultipro.com/contracts", "StateOccupationalCode");
    private final static QName _EmployeeJobCode_QNAME = new QName("http://www.ultipro.com/contracts", "JobCode");
    private final static QName _EmployeeAlternateEmailAddress_QNAME = new QName("http://www.ultipro.com/contracts", "AlternateEmailAddress");
    private final static QName _EmployeePayRateType_QNAME = new QName("http://www.ultipro.com/contracts", "PayRateType");
    private final static QName _EmployeePrefix_QNAME = new QName("http://www.ultipro.com/contracts", "Prefix");
    private final static QName _EmployeeCounty_QNAME = new QName("http://www.ultipro.com/contracts", "County");
    private final static QName _EmployeeDeductionBenefitGroup_QNAME = new QName("http://www.ultipro.com/contracts", "DeductionBenefitGroup");
    private final static QName _EmployeeFormerLastName_QNAME = new QName("http://www.ultipro.com/contracts", "FormerLastName");
    private final static QName _EmployeeDirectDeposits_QNAME = new QName("http://www.ultipro.com/contracts", "DirectDeposits");
    private final static QName _EmployeeOtherPhone_QNAME = new QName("http://www.ultipro.com/contracts", "OtherPhone");
    private final static QName _EmployeeMailStop_QNAME = new QName("http://www.ultipro.com/contracts", "MailStop");
    private final static QName _EmployeeShiftCode_QNAME = new QName("http://www.ultipro.com/contracts", "ShiftCode");
    private final static QName _EmployeeCountry_QNAME = new QName("http://www.ultipro.com/contracts", "Country");
    private final static QName _EmployeeLastName_QNAME = new QName("http://www.ultipro.com/contracts", "LastName");
    private final static QName _EmployeeFederalFilingStatus_QNAME = new QName("http://www.ultipro.com/contracts", "FederalFilingStatus");
    private final static QName _EmployeeOtherPhoneType_QNAME = new QName("http://www.ultipro.com/contracts", "OtherPhoneType");
    private final static QName _EmployeeAddressLine2_QNAME = new QName("http://www.ultipro.com/contracts", "AddressLine2");
    private final static QName _EmployeeMaritalStatus_QNAME = new QName("http://www.ultipro.com/contracts", "MaritalStatus");
    private final static QName _EmployeeOtherPhoneExtension_QNAME = new QName("http://www.ultipro.com/contracts", "OtherPhoneExtension");
    private final static QName _EmployeeProject_QNAME = new QName("http://www.ultipro.com/contracts", "Project");
    private final static QName _EmployeeSuffix_QNAME = new QName("http://www.ultipro.com/contracts", "Suffix");
    private final static QName _EmployeeAddressLine1_QNAME = new QName("http://www.ultipro.com/contracts", "AddressLine1");
    private final static QName _EmployeeTimeClock_QNAME = new QName("http://www.ultipro.com/contracts", "TimeClock");
    private final static QName _EmployeeFullOrPartTime_QNAME = new QName("http://www.ultipro.com/contracts", "FullOrPartTime");
    private final static QName _EmployeeLocationCode_QNAME = new QName("http://www.ultipro.com/contracts", "LocationCode");
    private final static QName _EmployeeUnionNational_QNAME = new QName("http://www.ultipro.com/contracts", "UnionNational");
    private final static QName _EmployeeCity_QNAME = new QName("http://www.ultipro.com/contracts", "City");
    private final static QName _EmployeeJobGroup_QNAME = new QName("http://www.ultipro.com/contracts", "JobGroup");
    private final static QName _EmployeeSupervisor_QNAME = new QName("http://www.ultipro.com/contracts", "Supervisor");
    private final static QName _EmployeeAlternateTitle_QNAME = new QName("http://www.ultipro.com/contracts", "AlternateTitle");
    private final static QName _EmployeeWorkPhone_QNAME = new QName("http://www.ultipro.com/contracts", "WorkPhone");
    private final static QName _EmployeeStateOrProvince_QNAME = new QName("http://www.ultipro.com/contracts", "StateOrProvince");
    private final static QName _EmployeeDistributionCenterCode_QNAME = new QName("http://www.ultipro.com/contracts", "DistributionCenterCode");
    private final static QName _EmployeeResidentCounty_QNAME = new QName("http://www.ultipro.com/contracts", "ResidentCounty");
    private final static QName _EmployeeWorkStatePlan_QNAME = new QName("http://www.ultipro.com/contracts", "WorkStatePlan");
    private final static QName _EmployeeResidentJurisdiction_QNAME = new QName("http://www.ultipro.com/contracts", "ResidentJurisdiction");
    private final static QName _EmployeeEthnicOrigin_QNAME = new QName("http://www.ultipro.com/contracts", "EthnicOrigin");
    private final static QName _EmployeeLocalWorkInTaxResidentStatus_QNAME = new QName("http://www.ultipro.com/contracts", "LocalWorkInTaxResidentStatus");
    private final static QName _EmployeeWorkExtension_QNAME = new QName("http://www.ultipro.com/contracts", "WorkExtension");
    private final static QName _EmployeeResidentStateFilingStatus_QNAME = new QName("http://www.ultipro.com/contracts", "ResidentStateFilingStatus");
    private final static QName _EmployeeWorkStateFilingStatus_QNAME = new QName("http://www.ultipro.com/contracts", "WorkStateFilingStatus");
    private final static QName _EmployeeGender_QNAME = new QName("http://www.ultipro.com/contracts", "Gender");
    private final static QName _EmployeePreferredFirstName_QNAME = new QName("http://www.ultipro.com/contracts", "PreferredFirstName");
    private final static QName _EmployeeWorkStateDisabilityPlanType_QNAME = new QName("http://www.ultipro.com/contracts", "WorkStateDisabilityPlanType");
    private final static QName _EmployeePTOPlans_QNAME = new QName("http://www.ultipro.com/contracts", "PTOPlans");
    private final static QName _EmployeeHireSource_QNAME = new QName("http://www.ultipro.com/contracts", "HireSource");
    private final static QName _EmployeeAccrualAvailable_QNAME = new QName("http://www.ultipro.com/contracts", "Available");
    private final static QName _EmployeeAccrualPlan_QNAME = new QName("http://www.ultipro.com/contracts", "Plan");
    private final static QName _EmployeeAccrualEarnedThroughDate_QNAME = new QName("http://www.ultipro.com/contracts", "EarnedThroughDate");
    private final static QName _EmployeeAccrualResetDate_QNAME = new QName("http://www.ultipro.com/contracts", "ResetDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.odysystems.soap.ultipro.employeeNewHire
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring createArrayOfKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link Joker }
     * 
     */
    public Joker createJoker() {
        return new Joker();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link NameObjectCollectionBase }
     * 
     */
    public NameObjectCollectionBase createNameObjectCollectionBase() {
        return new NameObjectCollectionBase();
    }

    /**
     * Create an instance of {@link NameValueCollection }
     * 
     */
    public NameValueCollection createNameValueCollection() {
        return new NameValueCollection();
    }

    /**
     * Create an instance of {@link NewHireUsa }
     * 
     */
    public NewHireUsa createNewHireUsa() {
        return new NewHireUsa();
    }

    /**
     * Create an instance of {@link ArrayOfEmployee }
     * 
     */
    public ArrayOfEmployee createArrayOfEmployee() {
        return new ArrayOfEmployee();
    }

    /**
     * Create an instance of {@link NewHireUsaResponse }
     * 
     */
    public NewHireUsaResponse createNewHireUsaResponse() {
        return new NewHireUsaResponse();
    }

    /**
     * Create an instance of {@link EmployeeCreateResponse }
     * 
     */
    public EmployeeCreateResponse createEmployeeCreateResponse() {
        return new EmployeeCreateResponse();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link EntityIdentifier }
     * 
     */
    public EntityIdentifier createEntityIdentifier() {
        return new EntityIdentifier();
    }

    /**
     * Create an instance of {@link ArrayOfDirectDeposit }
     * 
     */
    public ArrayOfDirectDeposit createArrayOfDirectDeposit() {
        return new ArrayOfDirectDeposit();
    }

    /**
     * Create an instance of {@link DirectDeposit }
     * 
     */
    public DirectDeposit createDirectDeposit() {
        return new DirectDeposit();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link SsnIdentifier }
     * 
     */
    public SsnIdentifier createSsnIdentifier() {
        return new SsnIdentifier();
    }

    /**
     * Create an instance of {@link CompanyCodeIdentifier }
     * 
     */
    public CompanyCodeIdentifier createCompanyCodeIdentifier() {
        return new CompanyCodeIdentifier();
    }

    /**
     * Create an instance of {@link PagingInfo }
     * 
     */
    public PagingInfo createPagingInfo() {
        return new PagingInfo();
    }

    /**
     * Create an instance of {@link NationalIdentifier }
     * 
     */
    public NationalIdentifier createNationalIdentifier() {
        return new NationalIdentifier();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeAccrual }
     * 
     */
    public ArrayOfEmployeeAccrual createArrayOfEmployeeAccrual() {
        return new ArrayOfEmployeeAccrual();
    }

    /**
     * Create an instance of {@link EmployeeAccrual }
     * 
     */
    public EmployeeAccrual createEmployeeAccrual() {
        return new EmployeeAccrual();
    }

    /**
     * Create an instance of {@link EmployeeIdentifier }
     * 
     */
    public EmployeeIdentifier createEmployeeIdentifier() {
        return new EmployeeIdentifier();
    }

    /**
     * Create an instance of {@link ArrayOfResult }
     * 
     */
    public ArrayOfResult createArrayOfResult() {
        return new ArrayOfResult();
    }

    /**
     * Create an instance of {@link UserDefinedIdentifier }
     * 
     */
    public UserDefinedIdentifier createUserDefinedIdentifier() {
        return new UserDefinedIdentifier();
    }

    /**
     * Create an instance of {@link WriteResponse }
     * 
     */
    public WriteResponse createWriteResponse() {
        return new WriteResponse();
    }

    /**
     * Create an instance of {@link FederalIdIdentifier }
     * 
     */
    public FederalIdIdentifier createFederalIdIdentifier() {
        return new FederalIdIdentifier();
    }

    /**
     * Create an instance of {@link CompanyIdentifier }
     * 
     */
    public CompanyIdentifier createCompanyIdentifier() {
        return new CompanyIdentifier();
    }

    /**
     * Create an instance of {@link EmployeeNumberIdentifier }
     * 
     */
    public EmployeeNumberIdentifier createEmployeeNumberIdentifier() {
        return new EmployeeNumberIdentifier();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link SinIdentifier }
     * 
     */
    public SinIdentifier createSinIdentifier() {
        return new SinIdentifier();
    }

    /**
     * Create an instance of {@link EmailAddressIdentifier }
     * 
     */
    public EmailAddressIdentifier createEmailAddressIdentifier() {
        return new EmailAddressIdentifier();
    }

    /**
     * Create an instance of {@link ImportCodeIdentifier }
     * 
     */
    public ImportCodeIdentifier createImportCodeIdentifier() {
        return new ImportCodeIdentifier();
    }

    /**
     * Create an instance of {@link ArrayOfOperationMessage }
     * 
     */
    public ArrayOfOperationMessage createArrayOfOperationMessage() {
        return new ArrayOfOperationMessage();
    }

    /**
     * Create an instance of {@link OperationMessage }
     * 
     */
    public OperationMessage createOperationMessage() {
        return new OperationMessage();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring.KeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring.KeyValueOfstringstring createArrayOfKeyValueOfstringstringKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring.KeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportCodeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ImportCodeIdentifier")
    public JAXBElement<ImportCodeIdentifier> createImportCodeIdentifier(ImportCodeIdentifier value) {
        return new JAXBElement<ImportCodeIdentifier>(_ImportCodeIdentifier_QNAME, ImportCodeIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ArrayOfOperationMessage")
    public JAXBElement<ArrayOfOperationMessage> createArrayOfOperationMessage(ArrayOfOperationMessage value) {
        return new JAXBElement<ArrayOfOperationMessage>(_ArrayOfOperationMessage_QNAME, ArrayOfOperationMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameValueCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Specialized", name = "NameValueCollection")
    public JAXBElement<NameValueCollection> createNameValueCollection(NameValueCollection value) {
        return new JAXBElement<NameValueCollection>(_NameValueCollection_QNAME, NameValueCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "CompanyIdentifier")
    public JAXBElement<CompanyIdentifier> createCompanyIdentifier(CompanyIdentifier value) {
        return new JAXBElement<CompanyIdentifier>(_CompanyIdentifier_QNAME, CompanyIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SinIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SinIdentifier")
    public JAXBElement<SinIdentifier> createSinIdentifier(SinIdentifier value) {
        return new JAXBElement<SinIdentifier>(_SinIdentifier_QNAME, SinIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "WriteResponse")
    public JAXBElement<WriteResponse> createWriteResponse(WriteResponse value) {
        return new JAXBElement<WriteResponse>(_WriteResponse_QNAME, WriteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Severity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Severity")
    public JAXBElement<Severity> createSeverity(Severity value) {
        return new JAXBElement<Severity>(_Severity_QNAME, Severity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ArrayOfResult")
    public JAXBElement<ArrayOfResult> createArrayOfResult(ArrayOfResult value) {
        return new JAXBElement<ArrayOfResult>(_ArrayOfResult_QNAME, ArrayOfResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeAccrual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ArrayOfEmployeeAccrual")
    public JAXBElement<ArrayOfEmployeeAccrual> createArrayOfEmployeeAccrual(ArrayOfEmployeeAccrual value) {
        return new JAXBElement<ArrayOfEmployeeAccrual>(_ArrayOfEmployeeAccrual_QNAME, ArrayOfEmployeeAccrual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeIdentifier")
    public JAXBElement<EmployeeIdentifier> createEmployeeIdentifier(EmployeeIdentifier value) {
        return new JAXBElement<EmployeeIdentifier>(_EmployeeIdentifier_QNAME, EmployeeIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsnIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SsnIdentifier")
    public JAXBElement<SsnIdentifier> createSsnIdentifier(SsnIdentifier value) {
        return new JAXBElement<SsnIdentifier>(_SsnIdentifier_QNAME, SsnIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EntityIdentifier")
    public JAXBElement<EntityIdentifier> createEntityIdentifier(EntityIdentifier value) {
        return new JAXBElement<EntityIdentifier>(_EntityIdentifier_QNAME, EntityIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDirectDeposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ArrayOfDirectDeposit")
    public JAXBElement<ArrayOfDirectDeposit> createArrayOfDirectDeposit(ArrayOfDirectDeposit value) {
        return new JAXBElement<ArrayOfDirectDeposit>(_ArrayOfDirectDeposit_QNAME, ArrayOfDirectDeposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringstring")
    public JAXBElement<ArrayOfKeyValueOfstringstring> createArrayOfKeyValueOfstringstring(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_ArrayOfKeyValueOfstringstring_QNAME, ArrayOfKeyValueOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OperationMessage")
    public JAXBElement<OperationMessage> createOperationMessage(OperationMessage value) {
        return new JAXBElement<OperationMessage>(_OperationMessage_QNAME, OperationMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeNumberIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeNumberIdentifier")
    public JAXBElement<EmployeeNumberIdentifier> createEmployeeNumberIdentifier(EmployeeNumberIdentifier value) {
        return new JAXBElement<EmployeeNumberIdentifier>(_EmployeeNumberIdentifier_QNAME, EmployeeNumberIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeCreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeCreateResponse")
    public JAXBElement<EmployeeCreateResponse> createEmployeeCreateResponse(EmployeeCreateResponse value) {
        return new JAXBElement<EmployeeCreateResponse>(_EmployeeCreateResponse_QNAME, EmployeeCreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddressIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmailAddressIdentifier")
    public JAXBElement<EmailAddressIdentifier> createEmailAddressIdentifier(EmailAddressIdentifier value) {
        return new JAXBElement<EmailAddressIdentifier>(_EmailAddressIdentifier_QNAME, EmailAddressIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "UserDefinedIdentifier")
    public JAXBElement<UserDefinedIdentifier> createUserDefinedIdentifier(UserDefinedIdentifier value) {
        return new JAXBElement<UserDefinedIdentifier>(_UserDefinedIdentifier_QNAME, UserDefinedIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FederalIdIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FederalIdIdentifier")
    public JAXBElement<FederalIdIdentifier> createFederalIdIdentifier(FederalIdIdentifier value) {
        return new JAXBElement<FederalIdIdentifier>(_FederalIdIdentifier_QNAME, FederalIdIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ArrayOfEmployee")
    public JAXBElement<ArrayOfEmployee> createArrayOfEmployee(ArrayOfEmployee value) {
        return new JAXBElement<ArrayOfEmployee>(_ArrayOfEmployee_QNAME, ArrayOfEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NationalIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "NationalIdentifier")
    public JAXBElement<NationalIdentifier> createNationalIdentifier(NationalIdentifier value) {
        return new JAXBElement<NationalIdentifier>(_NationalIdentifier_QNAME, NationalIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeAccrual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeAccrual")
    public JAXBElement<EmployeeAccrual> createEmployeeAccrual(EmployeeAccrual value) {
        return new JAXBElement<EmployeeAccrual>(_EmployeeAccrual_QNAME, EmployeeAccrual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyCodeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "CompanyCodeIdentifier")
    public JAXBElement<CompanyCodeIdentifier> createCompanyCodeIdentifier(CompanyCodeIdentifier value) {
        return new JAXBElement<CompanyCodeIdentifier>(_CompanyCodeIdentifier_QNAME, CompanyCodeIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagingInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PagingInfo")
    public JAXBElement<PagingInfo> createPagingInfo(PagingInfo value) {
        return new JAXBElement<PagingInfo>(_PagingInfo_QNAME, PagingInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameObjectCollectionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Specialized", name = "NameObjectCollectionBase")
    public JAXBElement<NameObjectCollectionBase> createNameObjectCollectionBase(NameObjectCollectionBase value) {
        return new JAXBElement<NameObjectCollectionBase>(_NameObjectCollectionBase_QNAME, NameObjectCollectionBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "PingResponse")
    public JAXBElement<PingResponse> createPingResponse(PingResponse value) {
        return new JAXBElement<PingResponse>(_PingResponse_QNAME, PingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectDeposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "DirectDeposit")
    public JAXBElement<DirectDeposit> createDirectDeposit(DirectDeposit value) {
        return new JAXBElement<DirectDeposit>(_DirectDeposit_QNAME, DirectDeposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Result")
    public JAXBElement<Result> createResult(Result value) {
        return new JAXBElement<Result>(_Result_QNAME, Result.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "CreateResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "NationalId", scope = NationalIdentifier.class)
    public JAXBElement<String> createNationalIdentifierNationalId(String value) {
        return new JAXBElement<String>(_NationalIdentifierNationalId_QNAME, String.class, NationalIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeNumber", scope = EmployeeNumberIdentifier.class)
    public JAXBElement<String> createEmployeeNumberIdentifierEmployeeNumber(String value) {
        return new JAXBElement<String>(_EmployeeNumberIdentifierEmployeeNumber_QNAME, String.class, EmployeeNumberIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "TargetUri", scope = PingResponse.class)
    public JAXBElement<String> createPingResponseTargetUri(String value) {
        return new JAXBElement<String>(_PingResponseTargetUri_QNAME, String.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "CallerIPAddress", scope = PingResponse.class)
    public JAXBElement<String> createPingResponseCallerIPAddress(String value) {
        return new JAXBElement<String>(_PingResponseCallerIPAddress_QNAME, String.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "Child", scope = PingResponse.class)
    public JAXBElement<PingResponse> createPingResponseChild(PingResponse value) {
        return new JAXBElement<PingResponse>(_PingResponseChild_QNAME, PingResponse.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameValueCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "Information", scope = PingResponse.class)
    public JAXBElement<NameValueCollection> createPingResponseInformation(NameValueCollection value) {
        return new JAXBElement<NameValueCollection>(_PingResponseInformation_QNAME, NameValueCollection.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "ExceptionDetails", scope = PingResponse.class)
    public JAXBElement<String> createPingResponseExceptionDetails(String value) {
        return new JAXBElement<String>(_PingResponseExceptionDetails_QNAME, String.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "AppDomainName", scope = PingResponse.class)
    public JAXBElement<String> createPingResponseAppDomainName(String value) {
        return new JAXBElement<String>(_PingResponseAppDomainName_QNAME, String.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "StackTrace", scope = PingResponse.class)
    public JAXBElement<String> createPingResponseStackTrace(String value) {
        return new JAXBElement<String>(_PingResponseStackTrace_QNAME, String.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "MachineName", scope = PingResponse.class)
    public JAXBElement<String> createPingResponseMachineName(String value) {
        return new JAXBElement<String>(_PingResponseMachineName_QNAME, String.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "ExceptionMessage", scope = PingResponse.class)
    public JAXBElement<String> createPingResponseExceptionMessage(String value) {
        return new JAXBElement<String>(_PingResponseExceptionMessage_QNAME, String.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "ProcessName", scope = PingResponse.class)
    public JAXBElement<String> createPingResponseProcessName(String value) {
        return new JAXBElement<String>(_PingResponseProcessName_QNAME, String.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", name = "ListenerUri", scope = PingResponse.class)
    public JAXBElement<String> createPingResponseListenerUri(String value) {
        return new JAXBElement<String>(_PingResponseListenerUri_QNAME, String.class, PingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PingResult", scope = Joker.class)
    public JAXBElement<PingResponse> createJokerPingResult(PingResponse value) {
        return new JAXBElement<PingResponse>(_JokerPingResult_QNAME, PingResponse.class, Joker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OperationResult", scope = WriteResponse.class)
    public JAXBElement<Result> createWriteResponseOperationResult(Result value) {
        return new JAXBElement<Result>(_WriteResponseOperationResult_QNAME, Result.class, WriteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Results", scope = WriteResponse.class)
    public JAXBElement<ArrayOfResult> createWriteResponseResults(ArrayOfResult value) {
        return new JAXBElement<ArrayOfResult>(_WriteResponseResults_QNAME, ArrayOfResult.class, WriteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeCreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeenewhire", name = "NewHireUsaResult", scope = NewHireUsaResponse.class)
    public JAXBElement<EmployeeCreateResponse> createNewHireUsaResponseNewHireUsaResult(EmployeeCreateResponse value) {
        return new JAXBElement<EmployeeCreateResponse>(_NewHireUsaResponseNewHireUsaResult_QNAME, EmployeeCreateResponse.class, NewHireUsaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Code", scope = OperationMessage.class)
    public JAXBElement<String> createOperationMessageCode(String value) {
        return new JAXBElement<String>(_OperationMessageCode_QNAME, String.class, OperationMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PropertyName", scope = OperationMessage.class)
    public JAXBElement<String> createOperationMessagePropertyName(String value) {
        return new JAXBElement<String>(_OperationMessagePropertyName_QNAME, String.class, OperationMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Message", scope = OperationMessage.class)
    public JAXBElement<String> createOperationMessageMessage(String value) {
        return new JAXBElement<String>(_OperationMessageMessage_QNAME, String.class, OperationMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "LogEntryId", scope = OperationMessage.class)
    public JAXBElement<String> createOperationMessageLogEntryId(String value) {
        return new JAXBElement<String>(_OperationMessageLogEntryId_QNAME, String.class, OperationMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "RequestNumber", scope = Result.class)
    public JAXBElement<Integer> createResultRequestNumber(Integer value) {
        return new JAXBElement<Integer>(_ResultRequestNumber_QNAME, Integer.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Messages", scope = Result.class)
    public JAXBElement<ArrayOfOperationMessage> createResultMessages(ArrayOfOperationMessage value) {
        return new JAXBElement<ArrayOfOperationMessage>(_ResultMessages_QNAME, ArrayOfOperationMessage.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagingInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PagingInfo", scope = Result.class)
    public JAXBElement<PagingInfo> createResultPagingInfo(PagingInfo value) {
        return new JAXBElement<PagingInfo>(_PagingInfo_QNAME, PagingInfo.class, Result.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ImportCode", scope = ImportCodeIdentifier.class)
    public JAXBElement<String> createImportCodeIdentifierImportCode(String value) {
        return new JAXBElement<String>(_ImportCodeIdentifierImportCode_QNAME, String.class, ImportCodeIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmailAddress", scope = EmailAddressIdentifier.class)
    public JAXBElement<String> createEmailAddressIdentifierEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddressIdentifierEmailAddress_QNAME, String.class, EmailAddressIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FederalId", scope = FederalIdIdentifier.class)
    public JAXBElement<String> createFederalIdIdentifierFederalId(String value) {
        return new JAXBElement<String>(_FederalIdIdentifierFederalId_QNAME, String.class, FederalIdIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "CompanyCode", scope = CompanyCodeIdentifier.class)
    public JAXBElement<String> createCompanyCodeIdentifierCompanyCode(String value) {
        return new JAXBElement<String>(_CompanyCodeIdentifierCompanyCode_QNAME, String.class, CompanyCodeIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FlatOrPercentAmount", scope = DirectDeposit.class)
    public JAXBElement<BigDecimal> createDirectDepositFlatOrPercentAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DirectDepositFlatOrPercentAmount_QNAME, BigDecimal.class, DirectDeposit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "AccountType", scope = DirectDeposit.class)
    public JAXBElement<String> createDirectDepositAccountType(String value) {
        return new JAXBElement<String>(_DirectDepositAccountType_QNAME, String.class, DirectDeposit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "AccountNumber", scope = DirectDeposit.class)
    public JAXBElement<String> createDirectDepositAccountNumber(String value) {
        return new JAXBElement<String>(_DirectDepositAccountNumber_QNAME, String.class, DirectDeposit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "RoutingNumber", scope = DirectDeposit.class)
    public JAXBElement<String> createDirectDepositRoutingNumber(String value) {
        return new JAXBElement<String>(_DirectDepositRoutingNumber_QNAME, String.class, DirectDeposit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "BankName", scope = DirectDeposit.class)
    public JAXBElement<String> createDirectDepositBankName(String value) {
        return new JAXBElement<String>(_DirectDepositBankName_QNAME, String.class, DirectDeposit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "AccountIsActive", scope = DirectDeposit.class)
    public JAXBElement<Boolean> createDirectDepositAccountIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_DirectDepositAccountIsActive_QNAME, Boolean.class, DirectDeposit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "AmountRule", scope = DirectDeposit.class)
    public JAXBElement<String> createDirectDepositAmountRule(String value) {
        return new JAXBElement<String>(_DirectDepositAmountRule_QNAME, String.class, DirectDeposit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Value", scope = UserDefinedIdentifier.class)
    public JAXBElement<String> createUserDefinedIdentifierValue(String value) {
        return new JAXBElement<String>(_UserDefinedIdentifierValue_QNAME, String.class, UserDefinedIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "CompanyCode", scope = EmployeeIdentifier.class)
    public JAXBElement<String> createEmployeeIdentifierCompanyCode(String value) {
        return new JAXBElement<String>(_CompanyCodeIdentifierCompanyCode_QNAME, String.class, EmployeeIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeenewhire", name = "entities", scope = NewHireUsa.class)
    public JAXBElement<ArrayOfEmployee> createNewHireUsaEntities(ArrayOfEmployee value) {
        return new JAXBElement<ArrayOfEmployee>(_NewHireUsaEntities_QNAME, ArrayOfEmployee.class, NewHireUsa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Sin", scope = SinIdentifier.class)
    public JAXBElement<String> createSinIdentifierSin(String value) {
        return new JAXBElement<String>(_SinIdentifierSin_QNAME, String.class, SinIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Ssn", scope = SsnIdentifier.class)
    public JAXBElement<String> createSsnIdentifierSsn(String value) {
        return new JAXBElement<String>(_SsnIdentifierSsn_QNAME, String.class, SsnIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "StepNo", scope = Employee.class)
    public JAXBElement<Integer> createEmployeeStepNo(Integer value) {
        return new JAXBElement<Integer>(_EmployeeStepNo_QNAME, Integer.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ShiftGroup", scope = Employee.class)
    public JAXBElement<String> createEmployeeShiftGroup(String value) {
        return new JAXBElement<String>(_EmployeeShiftGroup_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OtherRate4", scope = Employee.class)
    public JAXBElement<BigDecimal> createEmployeeOtherRate4(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeOtherRate4_QNAME, BigDecimal.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "CompanyIdentifier", scope = Employee.class)
    public JAXBElement<CompanyIdentifier> createEmployeeCompanyIdentifier(CompanyIdentifier value) {
        return new JAXBElement<CompanyIdentifier>(_CompanyIdentifier_QNAME, CompanyIdentifier.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SelfServiceProperties", scope = Employee.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createEmployeeSelfServiceProperties(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_EmployeeSelfServiceProperties_QNAME, ArrayOfKeyValueOfstringstring.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PayScaleCode", scope = Employee.class)
    public JAXBElement<String> createEmployeePayScaleCode(String value) {
        return new JAXBElement<String>(_EmployeePayScaleCode_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "HomePhone", scope = Employee.class)
    public JAXBElement<String> createEmployeeHomePhone(String value) {
        return new JAXBElement<String>(_EmployeeHomePhone_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ZipOrPostalCode", scope = Employee.class)
    public JAXBElement<String> createEmployeeZipOrPostalCode(String value) {
        return new JAXBElement<String>(_EmployeeZipOrPostalCode_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OtherRate1", scope = Employee.class)
    public JAXBElement<BigDecimal> createEmployeeOtherRate1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeOtherRate1_QNAME, BigDecimal.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "I9Verification", scope = Employee.class)
    public JAXBElement<String> createEmployeeI9Verification(String value) {
        return new JAXBElement<String>(_EmployeeI9Verification_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OtherRate2", scope = Employee.class)
    public JAXBElement<BigDecimal> createEmployeeOtherRate2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeOtherRate2_QNAME, BigDecimal.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OtherRate3", scope = Employee.class)
    public JAXBElement<BigDecimal> createEmployeeOtherRate3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeOtherRate3_QNAME, BigDecimal.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeNumber", scope = Employee.class)
    public JAXBElement<String> createEmployeeEmployeeNumber(String value) {
        return new JAXBElement<String>(_EmployeeNumberIdentifierEmployeeNumber_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OrgLevel4", scope = Employee.class)
    public JAXBElement<String> createEmployeeOrgLevel4(String value) {
        return new JAXBElement<String>(_EmployeeOrgLevel4_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OrgLevel1", scope = Employee.class)
    public JAXBElement<String> createEmployeeOrgLevel1(String value) {
        return new JAXBElement<String>(_EmployeeOrgLevel1_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "UnionLocal", scope = Employee.class)
    public JAXBElement<String> createEmployeeUnionLocal(String value) {
        return new JAXBElement<String>(_EmployeeUnionLocal_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "MiddleName", scope = Employee.class)
    public JAXBElement<String> createEmployeeMiddleName(String value) {
        return new JAXBElement<String>(_EmployeeMiddleName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeType", scope = Employee.class)
    public JAXBElement<String> createEmployeeEmployeeType(String value) {
        return new JAXBElement<String>(_EmployeeEmployeeType_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "HourlyOrSalaried", scope = Employee.class)
    public JAXBElement<String> createEmployeeHourlyOrSalaried(String value) {
        return new JAXBElement<String>(_EmployeeHourlyOrSalaried_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OrgLevel3", scope = Employee.class)
    public JAXBElement<String> createEmployeeOrgLevel3(String value) {
        return new JAXBElement<String>(_EmployeeOrgLevel3_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SSN", scope = Employee.class)
    public JAXBElement<String> createEmployeeSSN(String value) {
        return new JAXBElement<String>(_EmployeeSSN_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OrgLevel2", scope = Employee.class)
    public JAXBElement<String> createEmployeeOrgLevel2(String value) {
        return new JAXBElement<String>(_EmployeeOrgLevel2_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EarningsGroup", scope = Employee.class)
    public JAXBElement<String> createEmployeeEarningsGroup(String value) {
        return new JAXBElement<String>(_EmployeeEarningsGroup_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PayGroup", scope = Employee.class)
    public JAXBElement<String> createEmployeePayGroup(String value) {
        return new JAXBElement<String>(_EmployeePayGroup_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FirstName", scope = Employee.class)
    public JAXBElement<String> createEmployeeFirstName(String value) {
        return new JAXBElement<String>(_EmployeeFirstName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "StateGeographicCode", scope = Employee.class)
    public JAXBElement<String> createEmployeeStateGeographicCode(String value) {
        return new JAXBElement<String>(_EmployeeStateGeographicCode_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "StateOccupationalCode", scope = Employee.class)
    public JAXBElement<String> createEmployeeStateOccupationalCode(String value) {
        return new JAXBElement<String>(_EmployeeStateOccupationalCode_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "JobCode", scope = Employee.class)
    public JAXBElement<String> createEmployeeJobCode(String value) {
        return new JAXBElement<String>(_EmployeeJobCode_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "AlternateEmailAddress", scope = Employee.class)
    public JAXBElement<String> createEmployeeAlternateEmailAddress(String value) {
        return new JAXBElement<String>(_EmployeeAlternateEmailAddress_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PayRateType", scope = Employee.class)
    public JAXBElement<String> createEmployeePayRateType(String value) {
        return new JAXBElement<String>(_EmployeePayRateType_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Prefix", scope = Employee.class)
    public JAXBElement<String> createEmployeePrefix(String value) {
        return new JAXBElement<String>(_EmployeePrefix_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "County", scope = Employee.class)
    public JAXBElement<String> createEmployeeCounty(String value) {
        return new JAXBElement<String>(_EmployeeCounty_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "DeductionBenefitGroup", scope = Employee.class)
    public JAXBElement<String> createEmployeeDeductionBenefitGroup(String value) {
        return new JAXBElement<String>(_EmployeeDeductionBenefitGroup_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FormerLastName", scope = Employee.class)
    public JAXBElement<String> createEmployeeFormerLastName(String value) {
        return new JAXBElement<String>(_EmployeeFormerLastName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDirectDeposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "DirectDeposits", scope = Employee.class)
    public JAXBElement<ArrayOfDirectDeposit> createEmployeeDirectDeposits(ArrayOfDirectDeposit value) {
        return new JAXBElement<ArrayOfDirectDeposit>(_EmployeeDirectDeposits_QNAME, ArrayOfDirectDeposit.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OtherPhone", scope = Employee.class)
    public JAXBElement<String> createEmployeeOtherPhone(String value) {
        return new JAXBElement<String>(_EmployeeOtherPhone_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "MailStop", scope = Employee.class)
    public JAXBElement<String> createEmployeeMailStop(String value) {
        return new JAXBElement<String>(_EmployeeMailStop_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ShiftCode", scope = Employee.class)
    public JAXBElement<String> createEmployeeShiftCode(String value) {
        return new JAXBElement<String>(_EmployeeShiftCode_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Country", scope = Employee.class)
    public JAXBElement<String> createEmployeeCountry(String value) {
        return new JAXBElement<String>(_EmployeeCountry_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "LastName", scope = Employee.class)
    public JAXBElement<String> createEmployeeLastName(String value) {
        return new JAXBElement<String>(_EmployeeLastName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FederalFilingStatus", scope = Employee.class)
    public JAXBElement<String> createEmployeeFederalFilingStatus(String value) {
        return new JAXBElement<String>(_EmployeeFederalFilingStatus_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OtherPhoneType", scope = Employee.class)
    public JAXBElement<String> createEmployeeOtherPhoneType(String value) {
        return new JAXBElement<String>(_EmployeeOtherPhoneType_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "AddressLine2", scope = Employee.class)
    public JAXBElement<String> createEmployeeAddressLine2(String value) {
        return new JAXBElement<String>(_EmployeeAddressLine2_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "MaritalStatus", scope = Employee.class)
    public JAXBElement<String> createEmployeeMaritalStatus(String value) {
        return new JAXBElement<String>(_EmployeeMaritalStatus_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OtherPhoneExtension", scope = Employee.class)
    public JAXBElement<String> createEmployeeOtherPhoneExtension(String value) {
        return new JAXBElement<String>(_EmployeeOtherPhoneExtension_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Project", scope = Employee.class)
    public JAXBElement<String> createEmployeeProject(String value) {
        return new JAXBElement<String>(_EmployeeProject_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Suffix", scope = Employee.class)
    public JAXBElement<String> createEmployeeSuffix(String value) {
        return new JAXBElement<String>(_EmployeeSuffix_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "AddressLine1", scope = Employee.class)
    public JAXBElement<String> createEmployeeAddressLine1(String value) {
        return new JAXBElement<String>(_EmployeeAddressLine1_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "TimeClock", scope = Employee.class)
    public JAXBElement<String> createEmployeeTimeClock(String value) {
        return new JAXBElement<String>(_EmployeeTimeClock_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FullOrPartTime", scope = Employee.class)
    public JAXBElement<String> createEmployeeFullOrPartTime(String value) {
        return new JAXBElement<String>(_EmployeeFullOrPartTime_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "LocationCode", scope = Employee.class)
    public JAXBElement<String> createEmployeeLocationCode(String value) {
        return new JAXBElement<String>(_EmployeeLocationCode_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "UnionNational", scope = Employee.class)
    public JAXBElement<String> createEmployeeUnionNational(String value) {
        return new JAXBElement<String>(_EmployeeUnionNational_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "City", scope = Employee.class)
    public JAXBElement<String> createEmployeeCity(String value) {
        return new JAXBElement<String>(_EmployeeCity_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmailAddress", scope = Employee.class)
    public JAXBElement<String> createEmployeeEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddressIdentifierEmailAddress_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "JobGroup", scope = Employee.class)
    public JAXBElement<String> createEmployeeJobGroup(String value) {
        return new JAXBElement<String>(_EmployeeJobGroup_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Supervisor", scope = Employee.class)
    public JAXBElement<EmployeeIdentifier> createEmployeeSupervisor(EmployeeIdentifier value) {
        return new JAXBElement<EmployeeIdentifier>(_EmployeeSupervisor_QNAME, EmployeeIdentifier.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "AlternateTitle", scope = Employee.class)
    public JAXBElement<String> createEmployeeAlternateTitle(String value) {
        return new JAXBElement<String>(_EmployeeAlternateTitle_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "WorkPhone", scope = Employee.class)
    public JAXBElement<String> createEmployeeWorkPhone(String value) {
        return new JAXBElement<String>(_EmployeeWorkPhone_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "StateOrProvince", scope = Employee.class)
    public JAXBElement<String> createEmployeeStateOrProvince(String value) {
        return new JAXBElement<String>(_EmployeeStateOrProvince_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "DistributionCenterCode", scope = Employee.class)
    public JAXBElement<String> createEmployeeDistributionCenterCode(String value) {
        return new JAXBElement<String>(_EmployeeDistributionCenterCode_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ResidentCounty", scope = Employee.class)
    public JAXBElement<String> createEmployeeResidentCounty(String value) {
        return new JAXBElement<String>(_EmployeeResidentCounty_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "WorkStatePlan", scope = Employee.class)
    public JAXBElement<String> createEmployeeWorkStatePlan(String value) {
        return new JAXBElement<String>(_EmployeeWorkStatePlan_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ResidentJurisdiction", scope = Employee.class)
    public JAXBElement<String> createEmployeeResidentJurisdiction(String value) {
        return new JAXBElement<String>(_EmployeeResidentJurisdiction_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EthnicOrigin", scope = Employee.class)
    public JAXBElement<String> createEmployeeEthnicOrigin(String value) {
        return new JAXBElement<String>(_EmployeeEthnicOrigin_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "LocalWorkInTaxResidentStatus", scope = Employee.class)
    public JAXBElement<String> createEmployeeLocalWorkInTaxResidentStatus(String value) {
        return new JAXBElement<String>(_EmployeeLocalWorkInTaxResidentStatus_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "WorkExtension", scope = Employee.class)
    public JAXBElement<String> createEmployeeWorkExtension(String value) {
        return new JAXBElement<String>(_EmployeeWorkExtension_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ResidentStateFilingStatus", scope = Employee.class)
    public JAXBElement<String> createEmployeeResidentStateFilingStatus(String value) {
        return new JAXBElement<String>(_EmployeeResidentStateFilingStatus_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "WorkStateFilingStatus", scope = Employee.class)
    public JAXBElement<String> createEmployeeWorkStateFilingStatus(String value) {
        return new JAXBElement<String>(_EmployeeWorkStateFilingStatus_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Gender", scope = Employee.class)
    public JAXBElement<String> createEmployeeGender(String value) {
        return new JAXBElement<String>(_EmployeeGender_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PreferredFirstName", scope = Employee.class)
    public JAXBElement<String> createEmployeePreferredFirstName(String value) {
        return new JAXBElement<String>(_EmployeePreferredFirstName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "WorkStateDisabilityPlanType", scope = Employee.class)
    public JAXBElement<String> createEmployeeWorkStateDisabilityPlanType(String value) {
        return new JAXBElement<String>(_EmployeeWorkStateDisabilityPlanType_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeAccrual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PTOPlans", scope = Employee.class)
    public JAXBElement<ArrayOfEmployeeAccrual> createEmployeePTOPlans(ArrayOfEmployeeAccrual value) {
        return new JAXBElement<ArrayOfEmployeeAccrual>(_EmployeePTOPlans_QNAME, ArrayOfEmployeeAccrual.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "HireSource", scope = Employee.class)
    public JAXBElement<String> createEmployeeHireSource(String value) {
        return new JAXBElement<String>(_EmployeeHireSource_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Available", scope = EmployeeAccrual.class)
    public JAXBElement<BigDecimal> createEmployeeAccrualAvailable(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeAccrualAvailable_QNAME, BigDecimal.class, EmployeeAccrual.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Plan", scope = EmployeeAccrual.class)
    public JAXBElement<String> createEmployeeAccrualPlan(String value) {
        return new JAXBElement<String>(_EmployeeAccrualPlan_QNAME, String.class, EmployeeAccrual.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EarnedThroughDate", scope = EmployeeAccrual.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeeAccrualEarnedThroughDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmployeeAccrualEarnedThroughDate_QNAME, XMLGregorianCalendar.class, EmployeeAccrual.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ResetDate", scope = EmployeeAccrual.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeeAccrualResetDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmployeeAccrualResetDate_QNAME, XMLGregorianCalendar.class, EmployeeAccrual.class, value);
    }

}
