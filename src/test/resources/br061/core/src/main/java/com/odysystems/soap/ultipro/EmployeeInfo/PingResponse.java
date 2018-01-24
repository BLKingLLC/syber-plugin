
package com.odysystems.soap.ultipro.EmployeeInfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppDomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallerIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Child" type="{http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base}PingResponse" minOccurs="0"/>
 *         &lt;element name="ExceptionDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Information" type="{http://schemas.datacontract.org/2004/07/System.Collections.Specialized}NameValueCollection" minOccurs="0"/>
 *         &lt;element name="ListenerUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PingResponse", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", propOrder = {
    "appDomainName",
    "callerIPAddress",
    "child",
    "exceptionDetails",
    "exceptionMessage",
    "information",
    "listenerUri",
    "machineName",
    "processName",
    "stackTrace",
    "targetUri"
})
public class PingResponse {

    @XmlElementRef(name = "AppDomainName", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", type = JAXBElement.class, required = false)
    protected JAXBElement<String> appDomainName;
    @XmlElementRef(name = "CallerIPAddress", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callerIPAddress;
    @XmlElementRef(name = "Child", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", type = JAXBElement.class, required = false)
    protected JAXBElement<PingResponse> child;
    @XmlElementRef(name = "ExceptionDetails", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exceptionDetails;
    @XmlElementRef(name = "ExceptionMessage", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exceptionMessage;
    @XmlElementRef(name = "Information", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", type = JAXBElement.class, required = false)
    protected JAXBElement<NameValueCollection> information;
    @XmlElementRef(name = "ListenerUri", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", type = JAXBElement.class, required = false)
    protected JAXBElement<String> listenerUri;
    @XmlElementRef(name = "MachineName", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", type = JAXBElement.class, required = false)
    protected JAXBElement<String> machineName;
    @XmlElementRef(name = "ProcessName", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processName;
    @XmlElementRef(name = "StackTrace", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stackTrace;
    @XmlElementRef(name = "TargetUri", namespace = "http://schemas.datacontract.org/2004/07/UltimateSoftware.WcfTypes.Base", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetUri;

    /**
     * Gets the value of the appDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppDomainName() {
        return appDomainName;
    }

    /**
     * Sets the value of the appDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppDomainName(JAXBElement<String> value) {
        this.appDomainName = value;
    }

    /**
     * Gets the value of the callerIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallerIPAddress() {
        return callerIPAddress;
    }

    /**
     * Sets the value of the callerIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallerIPAddress(JAXBElement<String> value) {
        this.callerIPAddress = value;
    }

    /**
     * Gets the value of the child property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PingResponse }{@code >}
     *     
     */
    public JAXBElement<PingResponse> getChild() {
        return child;
    }

    /**
     * Sets the value of the child property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PingResponse }{@code >}
     *     
     */
    public void setChild(JAXBElement<PingResponse> value) {
        this.child = value;
    }

    /**
     * Gets the value of the exceptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExceptionDetails() {
        return exceptionDetails;
    }

    /**
     * Sets the value of the exceptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExceptionDetails(JAXBElement<String> value) {
        this.exceptionDetails = value;
    }

    /**
     * Gets the value of the exceptionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Sets the value of the exceptionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExceptionMessage(JAXBElement<String> value) {
        this.exceptionMessage = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NameValueCollection }{@code >}
     *     
     */
    public JAXBElement<NameValueCollection> getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NameValueCollection }{@code >}
     *     
     */
    public void setInformation(JAXBElement<NameValueCollection> value) {
        this.information = value;
    }

    /**
     * Gets the value of the listenerUri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getListenerUri() {
        return listenerUri;
    }

    /**
     * Sets the value of the listenerUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setListenerUri(JAXBElement<String> value) {
        this.listenerUri = value;
    }

    /**
     * Gets the value of the machineName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMachineName() {
        return machineName;
    }

    /**
     * Sets the value of the machineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMachineName(JAXBElement<String> value) {
        this.machineName = value;
    }

    /**
     * Gets the value of the processName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessName() {
        return processName;
    }

    /**
     * Sets the value of the processName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessName(JAXBElement<String> value) {
        this.processName = value;
    }

    /**
     * Gets the value of the stackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStackTrace() {
        return stackTrace;
    }

    /**
     * Sets the value of the stackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStackTrace(JAXBElement<String> value) {
        this.stackTrace = value;
    }

    /**
     * Gets the value of the targetUri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTargetUri() {
        return targetUri;
    }

    /**
     * Sets the value of the targetUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTargetUri(JAXBElement<String> value) {
        this.targetUri = value;
    }

}
