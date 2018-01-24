
package com.odysystems.soap.ultipro.employeeNewHire;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDirectDeposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDirectDeposit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DirectDeposit" type="{http://www.ultipro.com/contracts}DirectDeposit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDirectDeposit", propOrder = {
    "directDeposit"
})
public class ArrayOfDirectDeposit {

    @XmlElement(name = "DirectDeposit", nillable = true)
    protected List<DirectDeposit> directDeposit;

    /**
     * Gets the value of the directDeposit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directDeposit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectDeposit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectDeposit }
     * 
     * 
     */
    public List<DirectDeposit> getDirectDeposit() {
        if (directDeposit == null) {
            directDeposit = new ArrayList<DirectDeposit>();
        }
        return this.directDeposit;
    }

}
