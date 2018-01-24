
package com.odysystems.soap.ultipro.employeeNewHireGlobal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalNewHire complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalNewHire">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GlobalNewHire" type="{http://www.ultipro.com/contracts}GlobalNewHire" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalNewHire", propOrder = {
    "globalNewHire"
})
public class ArrayOfGlobalNewHire {

    @XmlElement(name = "GlobalNewHire", nillable = true)
    protected List<GlobalNewHire> globalNewHire;

    /**
     * Gets the value of the globalNewHire property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalNewHire property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalNewHire().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalNewHire }
     * 
     * 
     */
    public List<GlobalNewHire> getGlobalNewHire() {
        if (globalNewHire == null) {
            globalNewHire = new ArrayList<GlobalNewHire>();
        }
        return this.globalNewHire;
    }

}
