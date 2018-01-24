
package com.odysystems.soap.ultipro.employeeNewHire;

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
 *         &lt;element name="NewHireUsaResult" type="{http://www.ultipro.com/contracts}EmployeeCreateResponse" minOccurs="0"/>
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
    "newHireUsaResult"
})
@XmlRootElement(name = "NewHireUsaResponse", namespace = "http://www.ultipro.com/services/employeenewhire")
public class NewHireUsaResponse {

    @XmlElementRef(name = "NewHireUsaResult", namespace = "http://www.ultipro.com/services/employeenewhire", type = JAXBElement.class, required = false)
    protected JAXBElement<EmployeeCreateResponse> newHireUsaResult;

    /**
     * Gets the value of the newHireUsaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmployeeCreateResponse }{@code >}
     *     
     */
    public JAXBElement<EmployeeCreateResponse> getNewHireUsaResult() {
        return newHireUsaResult;
    }

    /**
     * Sets the value of the newHireUsaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmployeeCreateResponse }{@code >}
     *     
     */
    public void setNewHireUsaResult(JAXBElement<EmployeeCreateResponse> value) {
        this.newHireUsaResult = value;
    }

}
