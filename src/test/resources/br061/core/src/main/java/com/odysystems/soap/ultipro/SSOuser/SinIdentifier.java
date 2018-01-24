
package com.odysystems.soap.ultipro.SSOuser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SinIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SinIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}EmployeeIdentifier">
 *       &lt;sequence>
 *         &lt;element name="Sin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SinIdentifier", propOrder = {
    "sin"
})
public class SinIdentifier
    extends EmployeeIdentifier
{

    @XmlElementRef(name = "Sin", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sin;

    /**
     * Gets the value of the sin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSin() {
        return sin;
    }

    /**
     * Sets the value of the sin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSin(JAXBElement<String> value) {
        this.sin = value;
    }

}
