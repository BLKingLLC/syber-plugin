
package com.odysystems.soap.ultipro.employeeNewHireGlobal;

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
 *         &lt;element name="NewHireGlobalResult" type="{http://www.ultipro.com/contracts}GlobalEmployeeCreateResponse" minOccurs="0"/>
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
    "newHireGlobalResult"
})
@XmlRootElement(name = "NewHireGlobalResponse", namespace = "http://www.ultipro.com/services/employeeglobalnewhire")
public class NewHireGlobalResponse {

    @XmlElementRef(name = "NewHireGlobalResult", namespace = "http://www.ultipro.com/services/employeeglobalnewhire", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalEmployeeCreateResponse> newHireGlobalResult;

    /**
     * Gets the value of the newHireGlobalResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalEmployeeCreateResponse }{@code >}
     *     
     */
    public JAXBElement<GlobalEmployeeCreateResponse> getNewHireGlobalResult() {
        return newHireGlobalResult;
    }

    /**
     * Sets the value of the newHireGlobalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalEmployeeCreateResponse }{@code >}
     *     
     */
    public void setNewHireGlobalResult(JAXBElement<GlobalEmployeeCreateResponse> value) {
        this.newHireGlobalResult = value;
    }

}
