
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
 *         &lt;element name="DeleteSsoUserResult" type="{http://www.ultipro.com/contracts}SsoUserDeleteResponse" minOccurs="0"/>
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
    "deleteSsoUserResult"
})
@XmlRootElement(name = "DeleteSsoUserResponse", namespace = "http://www.ultipro.com/services/employeessouser")
public class DeleteSsoUserResponse {

    @XmlElementRef(name = "DeleteSsoUserResult", namespace = "http://www.ultipro.com/services/employeessouser", type = JAXBElement.class, required = false)
    protected JAXBElement<SsoUserDeleteResponse> deleteSsoUserResult;

    /**
     * Gets the value of the deleteSsoUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SsoUserDeleteResponse }{@code >}
     *     
     */
    public JAXBElement<SsoUserDeleteResponse> getDeleteSsoUserResult() {
        return deleteSsoUserResult;
    }

    /**
     * Sets the value of the deleteSsoUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SsoUserDeleteResponse }{@code >}
     *     
     */
    public void setDeleteSsoUserResult(JAXBElement<SsoUserDeleteResponse> value) {
        this.deleteSsoUserResult = value;
    }

}
