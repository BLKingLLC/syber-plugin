
package com.odysystems.soap.ultipro.SSOuser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="GetSsoUserByEmployeeIdentifierResult" type="{http://www.ultipro.com/contracts}SsoUserGetResponse" minOccurs="0"/>
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
    "getSsoUserByEmployeeIdentifierResult"
})
@XmlRootElement(name = "GetSsoUserByEmployeeIdentifierResponse", namespace = "http://www.ultipro.com/services/employeessouser")
public class GetSsoUserByEmployeeIdentifierResponse {

    @XmlElementRef(name = "GetSsoUserByEmployeeIdentifierResult", namespace = "http://www.ultipro.com/services/employeessouser", type = JAXBElement.class, required = false)
    protected JAXBElement<SsoUserGetResponse> getSsoUserByEmployeeIdentifierResult;

    /**
     * Gets the value of the getSsoUserByEmployeeIdentifierResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SsoUserGetResponse }{@code >}
     *     
     */
    public JAXBElement<SsoUserGetResponse> getGetSsoUserByEmployeeIdentifierResult() {
        return getSsoUserByEmployeeIdentifierResult;
    }

    /**
     * Sets the value of the getSsoUserByEmployeeIdentifierResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SsoUserGetResponse }{@code >}
     *     
     */
    public void setGetSsoUserByEmployeeIdentifierResult(JAXBElement<SsoUserGetResponse> value) {
        this.getSsoUserByEmployeeIdentifierResult = value;
    }

}
