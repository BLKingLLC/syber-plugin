
package com.odysystems.soap.ultipro.employeeAddress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}Employee">
 *       &lt;sequence>
 *         &lt;element name="Addresses" type="{http://www.ultipro.com/contracts}ArrayOfAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeAddress", propOrder = {
    "addresses"
})
public class EmployeeAddress
    extends Employee
{

    @XmlElementRef(name = "Addresses", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddress> addresses;

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddress> getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     *     
     */
    public void setAddresses(JAXBElement<ArrayOfAddress> value) {
        this.addresses = value;
    }

}
