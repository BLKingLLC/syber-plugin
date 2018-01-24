
package com.odysystems.soap.ultipro.employeeNewHireGlobal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GlobalEmployee" type="{http://www.ultipro.com/contracts}GlobalEmployee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalEmployee", propOrder = {
    "globalEmployee"
})
public class ArrayOfGlobalEmployee {

    @XmlElement(name = "GlobalEmployee", nillable = true)
    protected List<GlobalEmployee> globalEmployee;

    /**
     * Gets the value of the globalEmployee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalEmployee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalEmployee }
     * 
     * 
     */
    public List<GlobalEmployee> getGlobalEmployee() {
        if (globalEmployee == null) {
            globalEmployee = new ArrayList<GlobalEmployee>();
        }
        return this.globalEmployee;
    }

}
