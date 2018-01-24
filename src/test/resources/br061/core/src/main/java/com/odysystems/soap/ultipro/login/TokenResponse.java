
package com.odysystems.soap.ultipro.login;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ultipro.com/services/loginservice}Status" minOccurs="0"/>
 *         &lt;element ref="{http://www.ultipro.com/services/loginservice}StatusMessage" minOccurs="0"/>
 *         &lt;element ref="{http://www.ultipro.com/services/loginservice}Token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "statusMessage",
    "token"
})
@XmlRootElement(name = "TokenResponse")
public class TokenResponse {

    @XmlElement(name = "Status", namespace = "http://www.ultipro.com/services/loginservice")
    @XmlSchemaType(name = "string")
    protected AuthenticationStatus status;
    @XmlElement(name = "StatusMessage", namespace = "http://www.ultipro.com/services/loginservice", nillable = true)
    protected String statusMessage;
    @XmlElement(name = "Token", namespace = "http://www.ultipro.com/services/loginservice", nillable = true)
    protected String token;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationStatus }
     *     
     */
    public AuthenticationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationStatus }
     *     
     */
    public void setStatus(AuthenticationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
