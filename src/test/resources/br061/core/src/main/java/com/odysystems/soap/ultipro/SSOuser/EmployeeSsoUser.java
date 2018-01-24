
package com.odysystems.soap.ultipro.SSOuser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeSsoUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeSsoUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}Employee">
 *       &lt;sequence>
 *         &lt;element name="SsoUsers" type="{http://www.ultipro.com/contracts}ArrayOfSsoUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeSsoUser", propOrder = {
    "ssoUsers"
})
public class EmployeeSsoUser
    extends Employee
{

    @XmlElementRef(name = "SsoUsers", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSsoUser> ssoUsers;

    /**
     * Gets the value of the ssoUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSsoUser> getSsoUsers() {
        return ssoUsers;
    }

    /**
     * Sets the value of the ssoUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSsoUser }{@code >}
     *     
     */
    public void setSsoUsers(JAXBElement<ArrayOfSsoUser> value) {
        this.ssoUsers = value;
    }

}
