
package com.odysystems.soap.ultipro.employeePerson;

import java.io.Serializable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeePerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeePerson">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}Employee">
 *       &lt;sequence>
 *         &lt;element name="People" type="{http://www.ultipro.com/contracts}ArrayOfPerson" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeePerson", propOrder = {
    "people"
})
public class EmployeePerson
    extends Employee implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -7808350426429573983L;
	@XmlElementRef(name = "People", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPerson> people;

    /**
     * Gets the value of the people property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPerson> getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}
     *     
     */
    public void setPeople(JAXBElement<ArrayOfPerson> value) {
        this.people = value;
    }

}
