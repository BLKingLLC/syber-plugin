
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
 *         &lt;element name="FindSsoUsersResult" type="{http://www.ultipro.com/contracts}SsoUserFindResponse" minOccurs="0"/>
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
    "findSsoUsersResult"
})
@XmlRootElement(name = "FindSsoUsersResponse", namespace = "http://www.ultipro.com/services/employeessouser")
public class FindSsoUsersResponse {

    @XmlElementRef(name = "FindSsoUsersResult", namespace = "http://www.ultipro.com/services/employeessouser", type = JAXBElement.class, required = false)
    protected JAXBElement<SsoUserFindResponse> findSsoUsersResult;

    /**
     * Gets the value of the findSsoUsersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SsoUserFindResponse }{@code >}
     *     
     */
    public JAXBElement<SsoUserFindResponse> getFindSsoUsersResult() {
        return findSsoUsersResult;
    }

    /**
     * Sets the value of the findSsoUsersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SsoUserFindResponse }{@code >}
     *     
     */
    public void setFindSsoUsersResult(JAXBElement<SsoUserFindResponse> value) {
        this.findSsoUsersResult = value;
    }

}
