//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.20 at 04:11:25 PM EST 
//


package com.odysystems.model.soap.costpoint;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cb_TYPE_ADR.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cb_TYPE_ADR">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="20"/>
 *     &lt;enumeration value="EMERGENCY CONTACT 1"/>
 *     &lt;enumeration value="EMERGENCY CONTACT 2"/>
 *     &lt;enumeration value="HOME"/>
 *     &lt;enumeration value="OFFICE"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="OVERSEAS"/>
 *     &lt;enumeration value="TEMPORARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cb_TYPE_ADR")
@XmlEnum
public enum CbTYPEADR {

    @XmlEnumValue("EMERGENCY CONTACT 1")
    EMERGENCY_CONTACT_1("EMERGENCY CONTACT 1"),
    @XmlEnumValue("EMERGENCY CONTACT 2")
    EMERGENCY_CONTACT_2("EMERGENCY CONTACT 2"),
    HOME("HOME"),
    OFFICE("OFFICE"),
    OTHER("OTHER"),
    OVERSEAS("OVERSEAS"),
    TEMPORARY("TEMPORARY");
    private final String value;

    CbTYPEADR(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbTYPEADR fromValue(String v) {
        for (CbTYPEADR c: CbTYPEADR.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
