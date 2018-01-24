
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
 *         &lt;element name="UpdateSsoUserResult" type="{http://www.ultipro.com/contracts}SsoUserUpdateResponse" minOccurs="0"/>
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
    "updateSsoUserResult"
})
@XmlRootElement(name = "UpdateSsoUserResponse", namespace = "http://www.ultipro.com/services/employeessouser")
public class UpdateSsoUserResponse {

    @XmlElementRef(name = "UpdateSsoUserResult", namespace = "http://www.ultipro.com/services/employeessouser", type = JAXBElement.class, required = false)
    protected JAXBElement<SsoUserUpdateResponse> updateSsoUserResult;

    /**
     * Gets the value of the updateSsoUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SsoUserUpdateResponse }{@code >}
     *     
     */
    public JAXBElement<SsoUserUpdateResponse> getUpdateSsoUserResult() {
        return updateSsoUserResult;
    }

    /**
     * Sets the value of the updateSsoUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SsoUserUpdateResponse }{@code >}
     *     
     */
    public void setUpdateSsoUserResult(JAXBElement<SsoUserUpdateResponse> value) {
        this.updateSsoUserResult = value;
    }

}