
package com.odysystems.soap.ultipro.employeeNewHire;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmployeeAccrual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmployeeAccrual">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeAccrual" type="{http://www.ultipro.com/contracts}EmployeeAccrual" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmployeeAccrual", propOrder = {
    "employeeAccrual"
})
public class ArrayOfEmployeeAccrual {

    @XmlElement(name = "EmployeeAccrual", nillable = true)
    protected List<EmployeeAccrual> employeeAccrual;

    /**
     * Gets the value of the employeeAccrual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeAccrual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeAccrual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeAccrual }
     * 
     * 
     */
    public List<EmployeeAccrual> getEmployeeAccrual() {
        if (employeeAccrual == null) {
            employeeAccrual = new ArrayList<EmployeeAccrual>();
        }
        return this.employeeAccrual;
    }

}
