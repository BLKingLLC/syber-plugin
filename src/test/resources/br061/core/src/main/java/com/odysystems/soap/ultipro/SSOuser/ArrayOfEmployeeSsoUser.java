
package com.odysystems.soap.ultipro.SSOuser;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmployeeSsoUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmployeeSsoUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeSsoUser" type="{http://www.ultipro.com/contracts}EmployeeSsoUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmployeeSsoUser", propOrder = {
    "employeeSsoUser"
})
public class ArrayOfEmployeeSsoUser {

    @XmlElement(name = "EmployeeSsoUser", nillable = true)
    protected List<EmployeeSsoUser> employeeSsoUser;

    /**
     * Gets the value of the employeeSsoUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeSsoUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeSsoUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeSsoUser }
     * 
     * 
     */
    public List<EmployeeSsoUser> getEmployeeSsoUser() {
        if (employeeSsoUser == null) {
            employeeSsoUser = new ArrayList<EmployeeSsoUser>();
        }
        return this.employeeSsoUser;
    }

}
