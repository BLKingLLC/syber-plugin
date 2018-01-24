
package com.odysystems.soap.ultipro.SSOuser;

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
 * generated in the com.odysystems.soap.ultipro.SSOuser package. 
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

    private final static QName _EmployeeSsoUser_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeSsoUser");
    private final static QName _SsoUser_QNAME = new QName("http://www.ultipro.com/contracts", "SsoUser");
    private final static QName _ArrayOfOperationMessage_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfOperationMessage");
    private final static QName _NameValueCollection_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Specialized", "NameValueCollection");
    private final static QName _SsoUserCreateResponse_QNAME = new QName("http://www.ultipro.com/contracts", "SsoUserCreateResponse");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _SinIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "SinIdentifier");
    private final static QName _EmployeeQuery_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeQuery");
    private final static QName _WriteResponse_QNAME = new QName("http://www.ultipro.com/contracts", "WriteResponse");
    private final static QName _Severity_QNAME = new QName("http://www.ultipro.com/contracts", "Severity");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _GetResponse_QNAME = new QName("http://www.ultipro.com/contracts", "GetResponse");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _SsoUserGetResponse_QNAME = new QName("http://www.ultipro.com/contracts", "SsoUserGetResponse");
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
    private final static QName _ArrayOfSsoUser_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfSsoUser");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _SsoUserDeleteResponse_QNAME = new QName("http://www.ultipro.com/contracts", "SsoUserDeleteResponse");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfEmployeeSsoUser_QNAME = new QName("http://www.ultipro.com/contracts", "ArrayOfEmployeeSsoUser");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _OperationMessage_QNAME = new QName("http://www.ultipro.com/contracts", "OperationMessage");
    private final static QName _Employee_QNAME = new QName("http://www.ultipro.com/contracts", "Employee");
    private final static QName _DeleteResponse_QNAME = new QName("http://www.ultipro.com/contracts", "DeleteResponse");
    private final static QName _EmployeeNumberIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeNumberIdentifier");
    private final static QName _EmailAddressIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "EmailAddressIdentifier");
    private final static QName _UserDefinedIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "UserDefinedIdentifier");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _SsoUserUpdateResponse_QNAME = new QName("http://www.ultipro.com/contracts", "SsoUserUpdateResponse");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _NationalIdentifier_QNAME = new QName("http://www.ultipro.com/contracts", "NationalIdentifier");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _UpdateResponse_QNAME = new QName("http://www.ultipro.com/contracts", "UpdateResponse");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _PagingInfo_QNAME = new QName("http://www.ultipro.com/contracts", "PagingInfo");
    private final static QName _SsoUserFindResponse_QNAME = new QName("http://www.ultipro.com/contracts", "SsoUserFindResponse");
    private final static QName _NameObjectCollectionBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Specialized", "NameObjectCollectionBase");
    private final static QName _PingResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", "PingResponse");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Result_QNAME = new QName("http://www.ultipro.com/contracts", "Result");
    private final static QName _FindResponse_QNAME = new QName("http://www.ultipro.com/contracts", "FindResponse");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _CreateResponse_QNAME = new QName("http://www.ultipro.com/contracts", "CreateResponse");
    private final static QName _CreateSsoUserResponseCreateSsoUserResult_QNAME = new QName("http://www.ultipro.com/services/employeessouser", "CreateSsoUserResult");
    private final static QName _EmployeeEmployeeNumber_QNAME = new QName("http://www.ultipro.com/contracts", "EmployeeNumber");
    private final static QName _EmployeeLastName_QNAME = new QName("http://www.ultipro.com/contracts", "LastName");
    private final static QName _EmployeeCompanyCode_QNAME = new QName("http://www.ultipro.com/contracts", "CompanyCode");
    private final static QName _EmployeeFirstName_QNAME = new QName("http://www.ultipro.com/contracts", "FirstName");
    private final static QName _WriteResponseOperationResult_QNAME = new QName("http://www.ultipro.com/contracts", "OperationResult");
    private final static QName _WriteResponseResults_QNAME = new QName("http://www.ultipro.com/contracts", "Results");
    private final static QName _NationalIdentifierNationalId_QNAME = new QName("http://www.ultipro.com/contracts", "NationalId");
    private final static QName _SinIdentifierSin_QNAME = new QName("http://www.ultipro.com/contracts", "Sin");
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
    private final static QName _GetSsoUserByClientUserNameResponseGetSsoUserByClientUserNameResult_QNAME = new QName("http://www.ultipro.com/services/employeessouser", "GetSsoUserByClientUserNameResult");
    private final static QName _UpdateSsoUserResponseUpdateSsoUserResult_QNAME = new QName("http://www.ultipro.com/services/employeessouser", "UpdateSsoUserResult");
    private final static QName _DeleteSsoUserEntities_QNAME = new QName("http://www.ultipro.com/services/employeessouser", "entities");
    private final static QName _DeleteSsoUserResponseDeleteSsoUserResult_QNAME = new QName("http://www.ultipro.com/services/employeessouser", "DeleteSsoUserResult");
    private final static QName _UserDefinedIdentifierValue_QNAME = new QName("http://www.ultipro.com/contracts", "Value");
    private final static QName _ResultRequestNumber_QNAME = new QName("http://www.ultipro.com/contracts", "RequestNumber");
    private final static QName _ResultMessages_QNAME = new QName("http://www.ultipro.com/contracts", "Messages");
    private final static QName _GetSsoUserByEmployeeIdentifierEmployeeIdentifier_QNAME = new QName("http://www.ultipro.com/services/employeessouser", "employeeIdentifier");
    private final static QName _SsnIdentifierSsn_QNAME = new QName("http://www.ultipro.com/contracts", "Ssn");
    private final static QName _GetSsoUserByEmployeeIdentifierResponseGetSsoUserByEmployeeIdentifierResult_QNAME = new QName("http://www.ultipro.com/services/employeessouser", "GetSsoUserByEmployeeIdentifierResult");
    private final static QName _EmployeeSsoUserSsoUsers_QNAME = new QName("http://www.ultipro.com/contracts", "SsoUsers");
    private final static QName _FindSsoUsersResponseFindSsoUsersResult_QNAME = new QName("http://www.ultipro.com/services/employeessouser", "FindSsoUsersResult");
    private final static QName _OperationMessageCode_QNAME = new QName("http://www.ultipro.com/contracts", "Code");
    private final static QName _OperationMessagePropertyName_QNAME = new QName("http://www.ultipro.com/contracts", "PropertyName");
    private final static QName _OperationMessageMessage_QNAME = new QName("http://www.ultipro.com/contracts", "Message");
    private final static QName _OperationMessageLogEntryId_QNAME = new QName("http://www.ultipro.com/contracts", "LogEntryId");
    private final static QName _EmailAddressIdentifierEmailAddress_QNAME = new QName("http://www.ultipro.com/contracts", "EmailAddress");
    private final static QName _JokerPingResult_QNAME = new QName("http://tempuri.org/", "PingResult");
    private final static QName _SsoUserClientUserName_QNAME = new QName("http://www.ultipro.com/contracts", "ClientUserName");
    private final static QName _SsoUserUltiProUserName_QNAME = new QName("http://www.ultipro.com/contracts", "UltiProUserName");
    private final static QName _FindSsoUsersQuery_QNAME = new QName("http://www.ultipro.com/services/employeessouser", "query");
    private final static QName _GetSsoUserByClientUserNameClientUserName_QNAME = new QName("http://www.ultipro.com/services/employeessouser", "clientUserName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.odysystems.soap.ultipro.SSOuser
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link GetSsoUserByEmployeeIdentifierResponse }
     * 
     */
    public GetSsoUserByEmployeeIdentifierResponse createGetSsoUserByEmployeeIdentifierResponse() {
        return new GetSsoUserByEmployeeIdentifierResponse();
    }

    /**
     * Create an instance of {@link SsoUserGetResponse }
     * 
     */
    public SsoUserGetResponse createSsoUserGetResponse() {
        return new SsoUserGetResponse();
    }

    /**
     * Create an instance of {@link GetSsoUserByClientUserName }
     * 
     */
    public GetSsoUserByClientUserName createGetSsoUserByClientUserName() {
        return new GetSsoUserByClientUserName();
    }

    /**
     * Create an instance of {@link CreateSsoUserResponse }
     * 
     */
    public CreateSsoUserResponse createCreateSsoUserResponse() {
        return new CreateSsoUserResponse();
    }

    /**
     * Create an instance of {@link SsoUserCreateResponse }
     * 
     */
    public SsoUserCreateResponse createSsoUserCreateResponse() {
        return new SsoUserCreateResponse();
    }

    /**
     * Create an instance of {@link UpdateSsoUserResponse }
     * 
     */
    public UpdateSsoUserResponse createUpdateSsoUserResponse() {
        return new UpdateSsoUserResponse();
    }

    /**
     * Create an instance of {@link SsoUserUpdateResponse }
     * 
     */
    public SsoUserUpdateResponse createSsoUserUpdateResponse() {
        return new SsoUserUpdateResponse();
    }

    /**
     * Create an instance of {@link DeleteSsoUserResponse }
     * 
     */
    public DeleteSsoUserResponse createDeleteSsoUserResponse() {
        return new DeleteSsoUserResponse();
    }

    /**
     * Create an instance of {@link SsoUserDeleteResponse }
     * 
     */
    public SsoUserDeleteResponse createSsoUserDeleteResponse() {
        return new SsoUserDeleteResponse();
    }

    /**
     * Create an instance of {@link GetSsoUserByEmployeeIdentifier }
     * 
     */
    public GetSsoUserByEmployeeIdentifier createGetSsoUserByEmployeeIdentifier() {
        return new GetSsoUserByEmployeeIdentifier();
    }

    /**
     * Create an instance of {@link EmployeeIdentifier }
     * 
     */
    public EmployeeIdentifier createEmployeeIdentifier() {
        return new EmployeeIdentifier();
    }

    /**
     * Create an instance of {@link UpdateSsoUser }
     * 
     */
    public UpdateSsoUser createUpdateSsoUser() {
        return new UpdateSsoUser();
    }

    /**
     * Create an instance of {@link ArrayOfSsoUser }
     * 
     */
    public ArrayOfSsoUser createArrayOfSsoUser() {
        return new ArrayOfSsoUser();
    }

    /**
     * Create an instance of {@link FindSsoUsers }
     * 
     */
    public FindSsoUsers createFindSsoUsers() {
        return new FindSsoUsers();
    }

    /**
     * Create an instance of {@link EmployeeQuery }
     * 
     */
    public EmployeeQuery createEmployeeQuery() {
        return new EmployeeQuery();
    }

    /**
     * Create an instance of {@link DeleteSsoUser }
     * 
     */
    public DeleteSsoUser createDeleteSsoUser() {
        return new DeleteSsoUser();
    }

    /**
     * Create an instance of {@link CreateSsoUser }
     * 
     */
    public CreateSsoUser createCreateSsoUser() {
        return new CreateSsoUser();
    }

    /**
     * Create an instance of {@link GetSsoUserByClientUserNameResponse }
     * 
     */
    public GetSsoUserByClientUserNameResponse createGetSsoUserByClientUserNameResponse() {
        return new GetSsoUserByClientUserNameResponse();
    }

    /**
     * Create an instance of {@link FindSsoUsersResponse }
     * 
     */
    public FindSsoUsersResponse createFindSsoUsersResponse() {
        return new FindSsoUsersResponse();
    }

    /**
     * Create an instance of {@link SsoUserFindResponse }
     * 
     */
    public SsoUserFindResponse createSsoUserFindResponse() {
        return new SsoUserFindResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
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
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
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
     * Create an instance of {@link ArrayOfEmployeeSsoUser }
     * 
     */
    public ArrayOfEmployeeSsoUser createArrayOfEmployeeSsoUser() {
        return new ArrayOfEmployeeSsoUser();
    }

    /**
     * Create an instance of {@link EmployeeSsoUser }
     * 
     */
    public EmployeeSsoUser createEmployeeSsoUser() {
        return new EmployeeSsoUser();
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
     * Create an instance of {@link SsoUser }
     * 
     */
    public SsoUser createSsoUser() {
        return new SsoUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeSsoUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeSsoUser")
    public JAXBElement<EmployeeSsoUser> createEmployeeSsoUser(EmployeeSsoUser value) {
        return new JAXBElement<EmployeeSsoUser>(_EmployeeSsoUser_QNAME, EmployeeSsoUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SsoUser")
    public JAXBElement<SsoUser> createSsoUser(SsoUser value) {
        return new JAXBElement<SsoUser>(_SsoUser_QNAME, SsoUser.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUserCreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SsoUserCreateResponse")
    public JAXBElement<SsoUserCreateResponse> createSsoUserCreateResponse(SsoUserCreateResponse value) {
        return new JAXBElement<SsoUserCreateResponse>(_SsoUserCreateResponse_QNAME, SsoUserCreateResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUserGetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SsoUserGetResponse")
    public JAXBElement<SsoUserGetResponse> createSsoUserGetResponse(SsoUserGetResponse value) {
        return new JAXBElement<SsoUserGetResponse>(_SsoUserGetResponse_QNAME, SsoUserGetResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ArrayOfSsoUser")
    public JAXBElement<ArrayOfSsoUser> createArrayOfSsoUser(ArrayOfSsoUser value) {
        return new JAXBElement<ArrayOfSsoUser>(_ArrayOfSsoUser_QNAME, ArrayOfSsoUser.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUserDeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SsoUserDeleteResponse")
    public JAXBElement<SsoUserDeleteResponse> createSsoUserDeleteResponse(SsoUserDeleteResponse value) {
        return new JAXBElement<SsoUserDeleteResponse>(_SsoUserDeleteResponse_QNAME, SsoUserDeleteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeSsoUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ArrayOfEmployeeSsoUser")
    public JAXBElement<ArrayOfEmployeeSsoUser> createArrayOfEmployeeSsoUser(ArrayOfEmployeeSsoUser value) {
        return new JAXBElement<ArrayOfEmployeeSsoUser>(_ArrayOfEmployeeSsoUser_QNAME, ArrayOfEmployeeSsoUser.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "DeleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUserUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SsoUserUpdateResponse")
    public JAXBElement<SsoUserUpdateResponse> createSsoUserUpdateResponse(SsoUserUpdateResponse value) {
        return new JAXBElement<SsoUserUpdateResponse>(_SsoUserUpdateResponse_QNAME, SsoUserUpdateResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUserFindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SsoUserFindResponse")
    public JAXBElement<SsoUserFindResponse> createSsoUserFindResponse(SsoUserFindResponse value) {
        return new JAXBElement<SsoUserFindResponse>(_SsoUserFindResponse_QNAME, SsoUserFindResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUserCreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "CreateSsoUserResult", scope = CreateSsoUserResponse.class)
    public JAXBElement<SsoUserCreateResponse> createCreateSsoUserResponseCreateSsoUserResult(SsoUserCreateResponse value) {
        return new JAXBElement<SsoUserCreateResponse>(_CreateSsoUserResponseCreateSsoUserResult_QNAME, SsoUserCreateResponse.class, CreateSsoUserResponse.class, value);
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
        return new JAXBElement<String>(_EmployeeLastName_QNAME, String.class, Employee.class, value);
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
        return new JAXBElement<String>(_EmployeeFirstName_QNAME, String.class, Employee.class, value);
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
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Sin", scope = SinIdentifier.class)
    public JAXBElement<String> createSinIdentifierSin(String value) {
        return new JAXBElement<String>(_SinIdentifierSin_QNAME, String.class, SinIdentifier.class, value);
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
        return new JAXBElement<String>(_EmployeeLastName_QNAME, String.class, EmployeeQuery.class, value);
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
        return new JAXBElement<String>(_EmployeeFirstName_QNAME, String.class, EmployeeQuery.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUserGetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "GetSsoUserByClientUserNameResult", scope = GetSsoUserByClientUserNameResponse.class)
    public JAXBElement<SsoUserGetResponse> createGetSsoUserByClientUserNameResponseGetSsoUserByClientUserNameResult(SsoUserGetResponse value) {
        return new JAXBElement<SsoUserGetResponse>(_GetSsoUserByClientUserNameResponseGetSsoUserByClientUserNameResult_QNAME, SsoUserGetResponse.class, GetSsoUserByClientUserNameResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUserUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "UpdateSsoUserResult", scope = UpdateSsoUserResponse.class)
    public JAXBElement<SsoUserUpdateResponse> createUpdateSsoUserResponseUpdateSsoUserResult(SsoUserUpdateResponse value) {
        return new JAXBElement<SsoUserUpdateResponse>(_UpdateSsoUserResponseUpdateSsoUserResult_QNAME, SsoUserUpdateResponse.class, UpdateSsoUserResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "entities", scope = DeleteSsoUser.class)
    public JAXBElement<ArrayOfSsoUser> createDeleteSsoUserEntities(ArrayOfSsoUser value) {
        return new JAXBElement<ArrayOfSsoUser>(_DeleteSsoUserEntities_QNAME, ArrayOfSsoUser.class, DeleteSsoUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUserDeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "DeleteSsoUserResult", scope = DeleteSsoUserResponse.class)
    public JAXBElement<SsoUserDeleteResponse> createDeleteSsoUserResponseDeleteSsoUserResult(SsoUserDeleteResponse value) {
        return new JAXBElement<SsoUserDeleteResponse>(_DeleteSsoUserResponseDeleteSsoUserResult_QNAME, SsoUserDeleteResponse.class, DeleteSsoUserResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "entities", scope = UpdateSsoUser.class)
    public JAXBElement<ArrayOfSsoUser> createUpdateSsoUserEntities(ArrayOfSsoUser value) {
        return new JAXBElement<ArrayOfSsoUser>(_DeleteSsoUserEntities_QNAME, ArrayOfSsoUser.class, UpdateSsoUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Results", scope = SsoUserGetResponse.class)
    public JAXBElement<ArrayOfSsoUser> createSsoUserGetResponseResults(ArrayOfSsoUser value) {
        return new JAXBElement<ArrayOfSsoUser>(_WriteResponseResults_QNAME, ArrayOfSsoUser.class, SsoUserGetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "employeeIdentifier", scope = GetSsoUserByEmployeeIdentifier.class)
    public JAXBElement<EmployeeIdentifier> createGetSsoUserByEmployeeIdentifierEmployeeIdentifier(EmployeeIdentifier value) {
        return new JAXBElement<EmployeeIdentifier>(_GetSsoUserByEmployeeIdentifierEmployeeIdentifier_QNAME, EmployeeIdentifier.class, GetSsoUserByEmployeeIdentifier.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeSsoUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "Results", scope = SsoUserFindResponse.class)
    public JAXBElement<ArrayOfEmployeeSsoUser> createSsoUserFindResponseResults(ArrayOfEmployeeSsoUser value) {
        return new JAXBElement<ArrayOfEmployeeSsoUser>(_WriteResponseResults_QNAME, ArrayOfEmployeeSsoUser.class, SsoUserFindResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUserGetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "GetSsoUserByEmployeeIdentifierResult", scope = GetSsoUserByEmployeeIdentifierResponse.class)
    public JAXBElement<SsoUserGetResponse> createGetSsoUserByEmployeeIdentifierResponseGetSsoUserByEmployeeIdentifierResult(SsoUserGetResponse value) {
        return new JAXBElement<SsoUserGetResponse>(_GetSsoUserByEmployeeIdentifierResponseGetSsoUserByEmployeeIdentifierResult_QNAME, SsoUserGetResponse.class, GetSsoUserByEmployeeIdentifierResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "SsoUsers", scope = EmployeeSsoUser.class)
    public JAXBElement<ArrayOfSsoUser> createEmployeeSsoUserSsoUsers(ArrayOfSsoUser value) {
        return new JAXBElement<ArrayOfSsoUser>(_EmployeeSsoUserSsoUsers_QNAME, ArrayOfSsoUser.class, EmployeeSsoUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoUserFindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "FindSsoUsersResult", scope = FindSsoUsersResponse.class)
    public JAXBElement<SsoUserFindResponse> createFindSsoUsersResponseFindSsoUsersResult(SsoUserFindResponse value) {
        return new JAXBElement<SsoUserFindResponse>(_FindSsoUsersResponseFindSsoUsersResult_QNAME, SsoUserFindResponse.class, FindSsoUsersResponse.class, value);
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
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmailAddress", scope = EmailAddressIdentifier.class)
    public JAXBElement<String> createEmailAddressIdentifierEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddressIdentifierEmailAddress_QNAME, String.class, EmailAddressIdentifier.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "EmployeeIdentifier", scope = SsoUser.class)
    public JAXBElement<EmployeeIdentifier> createSsoUserEmployeeIdentifier(EmployeeIdentifier value) {
        return new JAXBElement<EmployeeIdentifier>(_EmployeeIdentifier_QNAME, EmployeeIdentifier.class, SsoUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "ClientUserName", scope = SsoUser.class)
    public JAXBElement<String> createSsoUserClientUserName(String value) {
        return new JAXBElement<String>(_SsoUserClientUserName_QNAME, String.class, SsoUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "UltiProUserName", scope = SsoUser.class)
    public JAXBElement<String> createSsoUserUltiProUserName(String value) {
        return new JAXBElement<String>(_SsoUserUltiProUserName_QNAME, String.class, SsoUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "query", scope = FindSsoUsers.class)
    public JAXBElement<EmployeeQuery> createFindSsoUsersQuery(EmployeeQuery value) {
        return new JAXBElement<EmployeeQuery>(_FindSsoUsersQuery_QNAME, EmployeeQuery.class, FindSsoUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "clientUserName", scope = GetSsoUserByClientUserName.class)
    public JAXBElement<String> createGetSsoUserByClientUserNameClientUserName(String value) {
        return new JAXBElement<String>(_GetSsoUserByClientUserNameClientUserName_QNAME, String.class, GetSsoUserByClientUserName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/services/employeessouser", name = "entities", scope = CreateSsoUser.class)
    public JAXBElement<ArrayOfSsoUser> createCreateSsoUserEntities(ArrayOfSsoUser value) {
        return new JAXBElement<ArrayOfSsoUser>(_DeleteSsoUserEntities_QNAME, ArrayOfSsoUser.class, CreateSsoUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ultipro.com/contracts", name = "OperationResult", scope = ReadResponse.class)
    public JAXBElement<Result> createReadResponseOperationResult(Result value) {
        return new JAXBElement<Result>(_WriteResponseOperationResult_QNAME, Result.class, ReadResponse.class, value);
    }

}
