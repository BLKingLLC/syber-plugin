
package com.odysystems.soap.ultipro.EmployeeInfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeEmploymentInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeEmploymentInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}Employee">
 *       &lt;sequence>
 *         &lt;element name="EmploymentInformations" type="{http://www.ultipro.com/contracts}ArrayOfEmploymentInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeEmploymentInformation", propOrder = {
    "employmentInformations"
})
public class EmployeeEmploymentInformation
    extends Employee
{

    @XmlElementRef(name = "EmploymentInformations", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmploymentInformation> employmentInformations;

    /**
     * Gets the value of the employmentInformations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmploymentInformation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmploymentInformation> getEmploymentInformations() {
        return employmentInformations;
    }

    /**
     * Sets the value of the employmentInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmploymentInformation }{@code >}
     *     
     */
    public void setEmploymentInformations(JAXBElement<ArrayOfEmploymentInformation> value) {
        this.employmentInformations = value;
    }

}
