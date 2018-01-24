
package com.odysystems.soap.ultipro.employeeNewHire;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ultipro.com/contracts}EntityIdentifier">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentifier")
@XmlSeeAlso({
    CompanyCodeIdentifier.class,
    FederalIdIdentifier.class,
    ImportCodeIdentifier.class
})
public class CompanyIdentifier
    extends EntityIdentifier
{


}
