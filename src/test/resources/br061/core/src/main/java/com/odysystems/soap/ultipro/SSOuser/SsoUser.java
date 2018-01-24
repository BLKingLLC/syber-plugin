
package com.odysystems.soap.ultipro.SSOuser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsoUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsoUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivationKey" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ClientUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeIdentifier" type="{http://www.ultipro.com/contracts}EmployeeIdentifier" minOccurs="0"/>
 *         &lt;element name="RetryAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UltiProUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsoUser", propOrder = {
    "activationKey",
    "clientUserName",
    "employeeIdentifier",
    "retryAttempts",
    "status",
    "ultiProUserName"
})
public class SsoUser {

    @XmlElement(name = "ActivationKey")
    protected String activationKey;
    @XmlElementRef(name = "ClientUserName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientUserName;
    @XmlElementRef(name = "EmployeeIdentifier", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EmployeeIdentifier> employeeIdentifier;
    @XmlElement(name = "RetryAttempts")
    protected Integer retryAttempts;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElementRef(name = "UltiProUserName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ultiProUserName;

    /**
     * Gets the value of the activationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationKey() {
        return activationKey;
    }

    /**
     * Sets the value of the activationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationKey(String value) {
        this.activationKey = value;
    }

    /**
     * Gets the value of the clientUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientUserName() {
        return clientUserName;
    }

    /**
     * Sets the value of the clientUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientUserName(JAXBElement<String> value) {
        this.clientUserName = value;
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
     * Gets the value of the retryAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetryAttempts() {
        return retryAttempts;
    }

    /**
     * Sets the value of the retryAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetryAttempts(Integer value) {
        this.retryAttempts = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the ultiProUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUltiProUserName() {
        return ultiProUserName;
    }

    /**
     * Sets the value of the ultiProUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUltiProUserName(JAXBElement<String> value) {
        this.ultiProUserName = value;
    }

}
