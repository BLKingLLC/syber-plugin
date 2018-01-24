
package com.odysystems.soap.ultipro.employeePerson;

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
 * generated in the com.odysystems.soap.ultipro.employeePerson package. 
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

    private final static QName _ArrayOfOperationMessage_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfOperationMessage");
    private final static QName _PersonFindResponse_QNAME = new QName("http://www.ultipro.com/contracts", "PersonFindResponse");
    private final static QName _NameValueCollection_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Specialized", "NameValueCollection");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _SinIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "SinIdentifier");
    private final static QName _EmployeeQuery_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeQuery");
    private final static QName _WriteResponse_QNAME = new QName("http://www.ultipro.com/contracts", "WriteResponse");
    private final static QName _Severity_QNAME = new QName("http://www.ultipro.com/contracts", "Severity");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _GetResponse_QNAME = new QName("http://www.ultipro.com/contracts", "GetResponse");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfResult_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfResult");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _EmployeeIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeIdentifier");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _SsnIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "SsnIdentifier");
    private final static QName _ReadResponse_QNAME = new QName("http://www.ultipro.com/contracts", "ReadResponse");
    private final static QName _EntityIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "EntityIdentifier");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfKeyValueOfstringstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Person_QNAME = new QName("http://www.ultipro.com/contracts", "Person");
    private final static QName _OperationMessage_QNAME = new QName("http://www.ultipro.com/contracts", "OperationMessage");
    private final static QName _Employee_QNAME = new QName("http://www.ultipro.com/contracts", "Employee");
    private final static QName _EmployeeNumberIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeNumberIdentifier");
    private final static QName _EmailAddressIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "EmailAddressIdentifier");
    private final static QName _UserDefinedIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "UserDefinedIdentifier");
    private final static QName _EmployeePerson_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeePerson");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _NationalIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "NationalIdentifier");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _PersonGetResponse_QNAME = new QName("http://www.ultipro.com/contracts", "PersonGetResponse");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _UpdateResponse_QNAME = new QName("http://www.ultipro.com/contracts", "UpdateResponse");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _PagingInfo_QNAME = new QName("http://www.ultipro.com/contracts", "PagingInfo");
    private final static QName _NameObjectCollectionBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Specialized", "NameObjectCollectionBase");
    private final static QName _PingResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "PingResponse");
    private final static QName _PersonUpdateResponse_QNAME = new QName("http://www.ultipro.com/contracts", "PersonUpdateResponse");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Result_QNAME = new QName("http://www.ultipro.com/contracts", "Result");
    private final static QName _FindResponse_QNAME = new QName("http://www.ultipro.com/contracts", "FindResponse");
    private final static QName _ArrayOfPerson_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfPerson");
    private final static QName _ArrayOfEmployeePerson_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfEmployeePerson");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _PersonAlternateEmailAddress_QNAME = new QName("http://www.ultipro.com/contracts", "AlternateEmailAddress");
    private final static QName _PersonLastName_QNAME = new QName("http://www.ultipro.com/contracts", "LastName");
    private final static QName _PersonPreferredFirstName_QNAME = new QName("http://www.ultipro.com/contracts", "PreferredFirstName");
    private final static QName _PersonPrefix_QNAME = new QName("http://www.ultipro.com/contracts", "Prefix");
    private final static QName _PersonFormerLastName_QNAME = new QName("http://www.ultipro.com/contracts", "FormerLastName");
    private final static QName _PersonMiddleName_QNAME = new QName("http://www.ultipro.com/contracts", "MiddleName");
    private final static QName _PersonSSN_QNAME = new QName("http://www.ultipro.com/contracts", "SSN");
    private final static QName _PersonEmailAddress_QNAME = new QName("http://www.ultipro.com/contracts", "EmailAddress");
    private final static QName _PersonSelfServiceProperties_QNAME = new QName("http://www.ultipro.com/contracts", "SelfServiceProperties");
    private final static QName _PersonSuffix_QNAME = new QName("http://www.ultipro.com/contracts", "Suffix");
    private final static QName _PersonFirstName_QNAME = new QName("http://www.ultipro.com/contracts", "FirstName");
    private final static QName _ReadResponseOperationResult_QNAME = new QName("http://www.ultipro.com/contracts", "OperationResult");
    private final static QName _SsnIdentifierSsn_QNAME = new QName("http://www.ultipro.com/contracts", "Ssn");
    private final static QName _FindPeopleQuery_QNAME = new QName("http://www.ultipro.com/services/employeeperson", "query");
    private final static QName _PersonGetResponseResults_QNAME = new QName("http://www.ultipro.com/contracts", "Results");
    private final static QName _UpdatePersonEntities_QNAME = new QName("http://www.ultipro.com/services/employeeperson", "entities");
    private final static QName _GetPersonByEmployeeIdentifierEmployeeIdentifier_QNAME = new QName("http://www.ultipro.com/services/employeeperson", "employeeIdentifier");
    private final static QName _NationalIdentifierNationalId_QNAME = new QName("http://www.ultipro.com/contracts", "NationalId");
    private final static QName _ResultRequestNumber_QNAME = new QName("http://www.ultipro.com/contracts", "RequestNumber");
    private final static QName _ResultMessages_QNAME = new QName("http://www.ultipro.com/contracts", "Messages");
    private final static QName _EmployeePersonPeople_QNAME = new QName("http://www.ultipro.com/contracts", "People");
    private final static QName _EmployeeEmployeeNumber_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeNumber");
    private final static QName _EmployeeCompanyCode_QNAME = new QName("http://www.ultipro.com/contracts", "CompanyCode");
    private final static QName _JokerPingResult_QNAME = new QName("http://tempuri.org/", "PingResult");
    private final static QName _OperationMessageCode_QNAME = new QName("http://www.ultipro.com/contracts", "Code");
    private final static QName _OperationMessagePropertyName_QNAME = new QName("http://www.ultipro.com/contracts", "PropertyName");
    private final static QName _OperationMessageMessage_QNAME = new QName("http://www.ultipro.com/contracts", "Message");
    private final static QName _OperationMessageLogEntryId_QNAME = new QName("http://www.ultipro.com/contracts", "LogEntryId");
    private final static QName _EmployeeQueryCountry_QNAME = new QName("http://www.ultipro.com/contracts", "Country");
    private final static QName _EmployeeQueryJob_QNAME = new QName("http://www.ultipro.com/contracts", "Job");
    private final static QName _EmployeeQueryLocation_QNAME = new QName("http://www.ultipro.com/contracts", "Location");
    private final static QName _EmployeeQueryCompanyName_QNAME = new QName("http://www.ultipro.com/contracts", "CompanyName");
    private final static QName _EmployeeQueryOriginalHire_QNAME = new QName("http://www.ultipro.com/contracts", "OriginalHire");
    private final static QName _EmployeeQueryLastHire_QNAME = new QName("http://www.ultipro.com/contracts", "LastHire");
    private final static QName _EmployeeQueryOrganizationLevel3_QNAME = new QName("http://www.ultipro.com/contracts", "OrganizationLevel3");
    private final static QName _EmployeeQueryPageNumber_QNAME = new QName("http://www.ultipro.com/contracts", "PageNumber");
    private final static QName _EmployeeQueryOrganizationLevel4_QNAME = new QName("http://www.ultipro.com/contracts", "OrganizationLevel4");
    private final static QName _EmployeeQueryOrganizationLevel1_QNAME = new QName("http://www.ultipro.com/contracts", "OrganizationLevel1");
    private final static QName _EmployeeQuerySupervisorLastName_QNAME = new QName("http://www.ultipro.com/contracts", "SupervisorLastName");
    private final static QName _EmployeeQueryFullOrPartTime_QNAME = new QName("http://www.ultipro.com/contracts", "FullOrPartTime");
    private final static QName _EmployeeQueryOrganizationLevel2_QNAME = new QName("http://www.ultipro.com/contracts", "OrganizationLevel2");
    private final static QName _EmployeeQueryFormerName_QNAME = new QName("http://www.ultipro.com/contracts", "FormerName");
    private final static QName _EmployeeQueryStatus_QNAME = new QName("http://www.ultipro.com/contracts", "Status");
    private final static QName _EmployeeQueryPayGroup_QNAME = new QName("http://www.ultipro.com/contracts", "PayGroup");
    private final static QName _EmployeeQueryPageSize_QNAME = new QName("http://www.ultipro.com/contracts", "PageSize");
    private final static QName _EmployeeQueryTimeClockId_QNAME = new QName("http://www.ultipro.com/contracts", "TimeClockId");
    private final static QName _EmployeeQueryTerminationDate_QNAME = new QName("http://www.ultipro.com/contracts", "TerminationDate");
    private final static QName _GetPersonByEmployeeIdentifierResponseGetPersonByEmployeeIdentifierResult_QNAME = new QName("http://www.ultipro.com/services/employeeperson", "GetPersonByEmployeeIdentifierResult");
    private final static QName _UpdatePersonResponseUpdatePersonResult_QNAME = new QName("http://www.ultipro.com/services/employeeperson", "UpdatePersonResult");
    private final static QName _SinIdentifierSin_QNAME = new QName("http://www.ultipro.com/contracts", "Sin");
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
    private final static QName _FindPeopleResponseFindPeopleResult_QNAME = new QName("http://www.ultipro.com/services/employeeperson", "FindPeopleResult");
    private final static QName _UserDefinedIdentifierValue_QNAME = new QName("http://www.ultipro.com/contracts", "Value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.odysystems.soap.ultipro.employeePerson
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
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link ArrayOfPerson }
     * 
     */
    public ArrayOfPerson createArrayOfPerson() {
        return new ArrayOfPerson();
    }

    /**
     * Create an instance of {@link GetPersonByEmployeeIdentifier }
     * 
     */
    public GetPersonByEmployeeIdentifier createGetPersonByEmployeeIdentifier() {
        return new GetPersonByEmployeeIdentifier();
    }

    /**
     * Create an instance of {@link EmployeeIdentifier }
     * 
     */
    public EmployeeIdentifier createEmployeeIdentifier() {
        return new EmployeeIdentifier();
    }

    /**
     * Create an instance of {@link GetPersonByEmployeeIdentifierResponse }
     * 
     */
    public GetPersonByEmployeeIdentifierResponse createGetPersonByEmployeeIdentifierResponse() {
        return new GetPersonByEmployeeIdentifierResponse();
    }

    /**
     * Create an instance of {@link PersonGetResponse }
     * 
     */
    public PersonGetResponse createPersonGetResponse() {
        return new PersonGetResponse();
    }

    /**
     * Create an instance of {@link FindPeople }
     * 
     */
    public FindPeople createFindPeople() {
        return new FindPeople();
    }

    /**
     * Create an instance of {@link EmployeeQuery }
     * 
     */
    public EmployeeQuery createEmployeeQuery() {
        return new EmployeeQuery();
    }

    /**
     * Create an instance of {@link FindPeopleResponse }
     * 
     */
    public FindPeopleResponse createFindPeopleResponse() {
        return new FindPeopleResponse();
    }

    /**
     * Create an instance of {@link PersonFindResponse }
     * 
     */
    public PersonFindResponse createPersonFindResponse() {
        return new PersonFindResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link PersonUpdateResponse }
     * 
     */
    public PersonUpdateResponse createPersonUpdateResponse() {
        return new PersonUpdateResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeePerson }
     * 
     */
    public ArrayOfEmployeePerson createArrayOfEmployeePerson() {
        return new ArrayOfEmployeePerson();
    }

    /**
     * Create an instance of {@link EntityIdentifier }
     * 
     */
    public EntityIdentifier createEntityIdentifier() {
        return new EntityIdentifier();
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
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link ReadResponse }
     * 
     */
    public ReadResponse createReadResponse() {
        return new ReadResponse();
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
     * Create an instance of {@link EmployeePerson }
     * 
     */
    public EmployeePerson createEmployeePerson() {
        return new EmployeePerson();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
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
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring.KeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring.KeyValueOfstringstring createArrayOfKeyValueOfstringstringKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring.KeyValueOfstringstring();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonFindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PersonFindResponse")
    public JAXBElement<PersonFindResponse> createPersonFindResponse(PersonFindResponse value) {
        return new JAXBElement<PersonFindResponse>(_PersonFindResponse_QNAME, PersonFindResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeQuery")
    public JAXBElement<EmployeeQuery> createEmployeeQuery(EmployeeQuery value) {
        return new JAXBElement<EmployeeQuery>(_EmployeeQuery_QNAME, EmployeeQuery.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "GetResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<GetResponse>(_GetResponse_QNAME, GetResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ReadResponse")
    public JAXBElement<ReadResponse> createReadResponse(ReadResponse value) {
        return new JAXBElement<ReadResponse>(_ReadResponse_QNAME, ReadResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeePerson")
    public JAXBElement<EmployeePerson> createEmployeePerson(EmployeePerson value) {
        return new JAXBElement<EmployeePerson>(_EmployeePerson_QNAME, EmployeePerson.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonGetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PersonGetResponse")
    public JAXBElement<PersonGetResponse> createPersonGetResponse(PersonGetResponse value) {
        return new JAXBElement<PersonGetResponse>(_PersonGetResponse_QNAME, PersonGetResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "UpdateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PersonUpdateResponse")
    public JAXBElement<PersonUpdateResponse> createPersonUpdateResponse(PersonUpdateResponse value) {
        return new JAXBElement<PersonUpdateResponse>(_PersonUpdateResponse_QNAME, PersonUpdateResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Result")
    public JAXBElement<Result> createResult(Result value) {
        return new JAXBElement<Result>(_Result_QNAME, Result.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FindResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ArrayOfPerson")
    public JAXBElement<ArrayOfPerson> createArrayOfPerson(ArrayOfPerson value) {
        return new JAXBElement<ArrayOfPerson>(_ArrayOfPerson_QNAME, ArrayOfPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ArrayOfEmployeePerson")
    public JAXBElement<ArrayOfEmployeePerson> createArrayOfEmployeePerson(ArrayOfEmployeePerson value) {
        return new JAXBElement<ArrayOfEmployeePerson>(_ArrayOfEmployeePerson_QNAME, ArrayOfEmployeePerson.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "AlternateEmailAddress", scope = Person.class)
    public JAXBElement<String> createPersonAlternateEmailAddress(String value) {
        return new JAXBElement<String>(_PersonAlternateEmailAddress_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "LastName", scope = Person.class)
    public JAXBElement<String> createPersonLastName(String value) {
        return new JAXBElement<String>(_PersonLastName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PreferredFirstName", scope = Person.class)
    public JAXBElement<String> createPersonPreferredFirstName(String value) {
        return new JAXBElement<String>(_PersonPreferredFirstName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Prefix", scope = Person.class)
    public JAXBElement<String> createPersonPrefix(String value) {
        return new JAXBElement<String>(_PersonPrefix_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeIdentifier", scope = Person.class)
    public JAXBElement<EmployeeIdentifier> createPersonEmployeeIdentifier(EmployeeIdentifier value) {
        return new JAXBElement<EmployeeIdentifier>(_EmployeeIdentifier_QNAME, EmployeeIdentifier.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FormerLastName", scope = Person.class)
    public JAXBElement<String> createPersonFormerLastName(String value) {
        return new JAXBElement<String>(_PersonFormerLastName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "MiddleName", scope = Person.class)
    public JAXBElement<String> createPersonMiddleName(String value) {
        return new JAXBElement<String>(_PersonMiddleName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SSN", scope = Person.class)
    public JAXBElement<String> createPersonSSN(String value) {
        return new JAXBElement<String>(_PersonSSN_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmailAddress", scope = Person.class)
    public JAXBElement<String> createPersonEmailAddress(String value) {
        return new JAXBElement<String>(_PersonEmailAddress_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SelfServiceProperties", scope = Person.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createPersonSelfServiceProperties(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_PersonSelfServiceProperties_QNAME, ArrayOfKeyValueOfstringstring.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Suffix", scope = Person.class)
    public JAXBElement<String> createPersonSuffix(String value) {
        return new JAXBElement<String>(_PersonSuffix_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FirstName", scope = Person.class)
    public JAXBElement<String> createPersonFirstName(String value) {
        return new JAXBElement<String>(_PersonFirstName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OperationResult", scope = ReadResponse.class)
    public JAXBElement<Result> createReadResponseOperationResult(Result value) {
        return new JAXBElement<Result>(_ReadResponseOperationResult_QNAME, Result.class, ReadResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeeperson", name = "query", scope = FindPeople.class)
    public JAXBElement<EmployeeQuery> createFindPeopleQuery(EmployeeQuery value) {
        return new JAXBElement<EmployeeQuery>(_FindPeopleQuery_QNAME, EmployeeQuery.class, FindPeople.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Results", scope = PersonGetResponse.class)
    public JAXBElement<ArrayOfPerson> createPersonGetResponseResults(ArrayOfPerson value) {
        return new JAXBElement<ArrayOfPerson>(_PersonGetResponseResults_QNAME, ArrayOfPerson.class, PersonGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeeperson", name = "entities", scope = UpdatePerson.class)
    public JAXBElement<ArrayOfPerson> createUpdatePersonEntities(ArrayOfPerson value) {
        return new JAXBElement<ArrayOfPerson>(_UpdatePersonEntities_QNAME, ArrayOfPerson.class, UpdatePerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeeperson", name = "employeeIdentifier", scope = GetPersonByEmployeeIdentifier.class)
    public JAXBElement<EmployeeIdentifier> createGetPersonByEmployeeIdentifierEmployeeIdentifier(EmployeeIdentifier value) {
        return new JAXBElement<EmployeeIdentifier>(_GetPersonByEmployeeIdentifierEmployeeIdentifier_QNAME, EmployeeIdentifier.class, GetPersonByEmployeeIdentifier.class, value);
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
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmailAddress", scope = EmailAddressIdentifier.class)
    public JAXBElement<String> createEmailAddressIdentifierEmailAddress(String value) {
        return new JAXBElement<String>(_PersonEmailAddress_QNAME, String.class, EmailAddressIdentifier.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "People", scope = EmployeePerson.class)
    public JAXBElement<ArrayOfPerson> createEmployeePersonPeople(ArrayOfPerson value) {
        return new JAXBElement<ArrayOfPerson>(_EmployeePersonPeople_QNAME, ArrayOfPerson.class, EmployeePerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeNumber", scope = Employee.class)
    public JAXBElement<String> createEmployeeEmployeeNumber(String value) {
        return new JAXBElement<String>(_EmployeeEmployeeNumber_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "LastName", scope = Employee.class)
    public JAXBElement<String> createEmployeeLastName(String value) {
        return new JAXBElement<String>(_PersonLastName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "CompanyCode", scope = Employee.class)
    public JAXBElement<String> createEmployeeCompanyCode(String value) {
        return new JAXBElement<String>(_EmployeeCompanyCode_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FirstName", scope = Employee.class)
    public JAXBElement<String> createEmployeeFirstName(String value) {
        return new JAXBElement<String>(_PersonFirstName_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Results", scope = PersonFindResponse.class)
    public JAXBElement<ArrayOfEmployeePerson> createPersonFindResponseResults(ArrayOfEmployeePerson value) {
        return new JAXBElement<ArrayOfEmployeePerson>(_PersonGetResponseResults_QNAME, ArrayOfEmployeePerson.class, PersonFindResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Country", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryCountry(String value) {
        return new JAXBElement<String>(_EmployeeQueryCountry_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "LastName", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryLastName(String value) {
        return new JAXBElement<String>(_PersonLastName_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Job", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryJob(String value) {
        return new JAXBElement<String>(_EmployeeQueryJob_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Location", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryLocation(String value) {
        return new JAXBElement<String>(_EmployeeQueryLocation_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "CompanyCode", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryCompanyCode(String value) {
        return new JAXBElement<String>(_EmployeeCompanyCode_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "CompanyName", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryCompanyName(String value) {
        return new JAXBElement<String>(_EmployeeQueryCompanyName_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OriginalHire", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryOriginalHire(String value) {
        return new JAXBElement<String>(_EmployeeQueryOriginalHire_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "LastHire", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryLastHire(String value) {
        return new JAXBElement<String>(_EmployeeQueryLastHire_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OrganizationLevel3", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryOrganizationLevel3(String value) {
        return new JAXBElement<String>(_EmployeeQueryOrganizationLevel3_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PageNumber", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryPageNumber(String value) {
        return new JAXBElement<String>(_EmployeeQueryPageNumber_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OrganizationLevel4", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryOrganizationLevel4(String value) {
        return new JAXBElement<String>(_EmployeeQueryOrganizationLevel4_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OrganizationLevel1", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryOrganizationLevel1(String value) {
        return new JAXBElement<String>(_EmployeeQueryOrganizationLevel1_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SupervisorLastName", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQuerySupervisorLastName(String value) {
        return new JAXBElement<String>(_EmployeeQuerySupervisorLastName_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FullOrPartTime", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryFullOrPartTime(String value) {
        return new JAXBElement<String>(_EmployeeQueryFullOrPartTime_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OrganizationLevel2", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryOrganizationLevel2(String value) {
        return new JAXBElement<String>(_EmployeeQueryOrganizationLevel2_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeNumber", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryEmployeeNumber(String value) {
        return new JAXBElement<String>(_EmployeeEmployeeNumber_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FormerName", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryFormerName(String value) {
        return new JAXBElement<String>(_EmployeeQueryFormerName_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Status", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryStatus(String value) {
        return new JAXBElement<String>(_EmployeeQueryStatus_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PayGroup", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryPayGroup(String value) {
        return new JAXBElement<String>(_EmployeeQueryPayGroup_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "PageSize", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryPageSize(String value) {
        return new JAXBElement<String>(_EmployeeQueryPageSize_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "TimeClockId", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryTimeClockId(String value) {
        return new JAXBElement<String>(_EmployeeQueryTimeClockId_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "FirstName", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryFirstName(String value) {
        return new JAXBElement<String>(_PersonFirstName_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "TerminationDate", scope = EmployeeQuery.class)
    public JAXBElement<String> createEmployeeQueryTerminationDate(String value) {
        return new JAXBElement<String>(_EmployeeQueryTerminationDate_QNAME, String.class, EmployeeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonGetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeeperson", name = "GetPersonByEmployeeIdentifierResult", scope = GetPersonByEmployeeIdentifierResponse.class)
    public JAXBElement<PersonGetResponse> createGetPersonByEmployeeIdentifierResponseGetPersonByEmployeeIdentifierResult(PersonGetResponse value) {
        return new JAXBElement<PersonGetResponse>(_GetPersonByEmployeeIdentifierResponseGetPersonByEmployeeIdentifierResult_QNAME, PersonGetResponse.class, GetPersonByEmployeeIdentifierResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeNumber", scope = EmployeeNumberIdentifier.class)
    public JAXBElement<String> createEmployeeNumberIdentifierEmployeeNumber(String value) {
        return new JAXBElement<String>(_EmployeeEmployeeNumber_QNAME, String.class, EmployeeNumberIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OperationResult", scope = WriteResponse.class)
    public JAXBElement<Result> createWriteResponseOperationResult(Result value) {
        return new JAXBElement<Result>(_ReadResponseOperationResult_QNAME, Result.class, WriteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Results", scope = WriteResponse.class)
    public JAXBElement<ArrayOfResult> createWriteResponseResults(ArrayOfResult value) {
        return new JAXBElement<ArrayOfResult>(_PersonGetResponseResults_QNAME, ArrayOfResult.class, WriteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeeperson", name = "UpdatePersonResult", scope = UpdatePersonResponse.class)
    public JAXBElement<PersonUpdateResponse> createUpdatePersonResponseUpdatePersonResult(PersonUpdateResponse value) {
        return new JAXBElement<PersonUpdateResponse>(_UpdatePersonResponseUpdatePersonResult_QNAME, PersonUpdateResponse.class, UpdatePersonResponse.class, value);
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
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "CompanyCode", scope = EmployeeIdentifier.class)
    public JAXBElement<String> createEmployeeIdentifierCompanyCode(String value) {
        return new JAXBElement<String>(_EmployeeCompanyCode_QNAME, String.class, EmployeeIdentifier.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonFindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeeperson", name = "FindPeopleResult", scope = FindPeopleResponse.class)
    public JAXBElement<PersonFindResponse> createFindPeopleResponseFindPeopleResult(PersonFindResponse value) {
        return new JAXBElement<PersonFindResponse>(_FindPeopleResponseFindPeopleResult_QNAME, PersonFindResponse.class, FindPeopleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Value", scope = UserDefinedIdentifier.class)
    public JAXBElement<String> createUserDefinedIdentifierValue(String value) {
        return new JAXBElement<String>(_UserDefinedIdentifierValue_QNAME, String.class, UserDefinedIdentifier.class, value);
    }

}
