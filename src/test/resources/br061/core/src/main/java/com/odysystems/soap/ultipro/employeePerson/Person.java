
package com.odysystems.soap.ultipro.employeePerson;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternateEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeIdentifier" type="{http://www.ultipro.com/contracts}EmployeeIdentifier" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelfServiceProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuppressSSN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "alternateEmailAddress",
    "emailAddress",
    "employeeIdentifier",
    "firstName",
    "formerLastName",
    "lastName",
    "middleName",
    "preferredFirstName",
    "prefix",
    "ssn",
    "selfServiceProperties",
    "suffix",
    "suppressSSN",
    "lastNameString"
})
public class Person {
	String lastNameString;
	
    @XmlElementRef(name = "AlternateEmailAddress", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternateEmailAddress;
    @XmlElementRef(name = "EmailAddress", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "EmployeeIdentifier", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EmployeeIdentifier> employeeIdentifier;
    @XmlElementRef(name = "FirstName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "FormerLastName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formerLastName;
    @XmlElementRef(name = "LastName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "MiddleName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleName;
    @XmlElementRef(name = "PreferredFirstName", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredFirstName;
    @XmlElementRef(name = "Prefix", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prefix;
    @XmlElementRef(name = "SSN", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ssn;
    @XmlElementRef(name = "SelfServiceProperties", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> selfServiceProperties;
    @XmlElementRef(name = "Suffix", namespace = "http://www.ultipro.com/contracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suffix;
    @XmlElement(name = "SuppressSSN")
    protected Boolean suppressSSN;

    
    
    
    
    
    


	/**
     * Gets the value of the alternateEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternateEmailAddress() {
        return alternateEmailAddress;
    }

    /**
     * Sets the value of the alternateEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternateEmailAddress(JAXBElement<String> value) {
        this.alternateEmailAddress = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the employeeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}
     *     
     */
    public JAXBElement<EmployeeIdentifier> getEmployeeIdentifier() {
        return employeeIdentifier;
    }

    /**
     * Sets the value of the employeeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmployeeIdentifier }{@code >}
     *     
     */
    public void setEmployeeIdentifier(JAXBElement<EmployeeIdentifier> value) {
        this.employeeIdentifier = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the formerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormerLastName() {
        return formerLastName;
    }

    /**
     * Sets the value of the formerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormerLastName(JAXBElement<String> value) {
        this.formerLastName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleName(JAXBElement<String> value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the preferredFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredFirstName() {
        return preferredFirstName;
    }

    /**
     * Sets the value of the preferredFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredFirstName(JAXBElement<String> value) {
        this.preferredFirstName = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefix(JAXBElement<String> value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSN(JAXBElement<String> value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the selfServiceProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringstring> getSelfServiceProperties() {
        return selfServiceProperties;
    }

    /**
     * Sets the value of the selfServiceProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public void setSelfServiceProperties(JAXBElement<ArrayOfKeyValueOfstringstring> value) {
        this.selfServiceProperties = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuffix(JAXBElement<String> value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the suppressSSN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressSSN() {
        return suppressSSN;
    }

    /**
     * Sets the value of the suppressSSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressSSN(Boolean value) {
        this.suppressSSN = value;
    }

    public String getLastNameString() {
		return lastName.getValue();
	}

	public void setLastNameString(String lastNameString) {
		this.lastNameString = lastNameString;
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lastNameString == null) ? 0 : lastNameString.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (lastNameString == null) {
			if (other.lastNameString != null)
				return false;
		} else if (!lastNameString.equals(other.lastNameString))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [lastNameString=" + lastNameString + "]";
	}

}
