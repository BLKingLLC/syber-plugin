
package com.odysystems.soap.ultipro.employeeNewHireGlobal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportCodeIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportCodeIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}CompanyIdentifier">
 *       &lt;sequence>
 *         &lt;element name="ImportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportCodeIdentifier", propOrder = {
    "importCode"
})
public class ImportCodeIdentifier
    extends CompanyIdentifier
{

    @XmlElementRef(name = "ImportCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importCode;

    /**
     * Gets the value of the importCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportCode() {
        return importCode;
    }

    /**
     * Sets the value of the importCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportCode(JAXBElement<String> value) {
        this.importCode = value;
    }

}
