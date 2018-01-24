
package com.odysystems.soap.ultipro.employeeAddress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressGetResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressGetResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}GetResponse">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://www.ultipro.com/contracts}ArrayOfAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressGetResponse", propOrder = {
    "results"
})
public class AddressGetResponse
    extends GetResponse
{

    @XmlElementRef(name = "Results", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddress> results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddress> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddress }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfAddress> value) {
        this.results = value;
    }

}
