
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
 *         &lt;element name="CreateSsoUserResult" type="{http://www.ultipro.com/contracts}SsoUserCreateResponse" minOccurs="0"/>
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
    "createSsoUserResult"
})
@XmlRootElement(name = "CreateSsoUserResponse", namespace = "http://www.ultipro.com/services/employeessouser")
public class CreateSsoUserResponse {

    @XmlElementRef(name = "CreateSsoUserResult", namespace = "http://www.ultipro.com/services/employeessouser", type = JAXBElement.class, required = false)
    protected JAXBElement<SsoUserCreateResponse> createSsoUserResult;

    /**
     * Gets the value of the createSsoUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SsoUserCreateResponse }{@code >}
     *     
     */
    public JAXBElement<SsoUserCreateResponse> getCreateSsoUserResult() {
        return createSsoUserResult;
    }

    /**
     * Sets the value of the createSsoUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SsoUserCreateResponse }{@code >}
     *     
     */
    public void setCreateSsoUserResult(JAXBElement<SsoUserCreateResponse> value) {
        this.createSsoUserResult = value;
    }

}
