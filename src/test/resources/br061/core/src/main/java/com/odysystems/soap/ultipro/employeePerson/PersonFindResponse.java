
package com.odysystems.soap.ultipro.employeePerson;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonFindResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonFindResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}FindResponse">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://www.ultipro.com/contracts}ArrayOfEmployeePerson" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonFindResponse", propOrder = {
    "results"
})
public class PersonFindResponse
    extends FindResponse
{

    @XmlElementRef(name = "Results", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmployeePerson> results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmployeePerson }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmployeePerson> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmployeePerson }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfEmployeePerson> value) {
        this.results = value;
    }

}
