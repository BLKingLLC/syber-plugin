
package com.odysystems.soap.ultipro.employeeNewHire;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}EntityIdentifier">
 *       &lt;sequence>
 *         &lt;element name="CompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeIdentifier", propOrder = {
    "companyCode"
})
@XmlSeeAlso({
    SsnIdentifier.class,
    NationalIdentifier.class,
    UserDefinedIdentifier.class,
    EmployeeNumberIdentifier.class,
    SinIdentifier.class,
    EmailAddressIdentifier.class
})
public class EmployeeIdentifier
    extends EntityIdentifier
{

    @XmlElementRef(name = "CompanyCode", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyCode;

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyCode(JAXBElement<String> value) {
        this.companyCode = value;
    }

}
