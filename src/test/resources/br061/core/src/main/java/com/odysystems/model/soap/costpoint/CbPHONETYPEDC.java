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
 * <p>Java class for cb_PHONE_TYPE_DC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cb_PHONE_TYPE_DC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="6"/>
 *     &lt;enumeration value="WORK"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="PAGER"/>
 *     &lt;enumeration value="EMERG"/>
 *     &lt;enumeration value="MISC1"/>
 *     &lt;enumeration value="MISC2"/>
 *     &lt;enumeration value="MISC3"/>
 *     &lt;enumeration value="HOME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cb_PHONE_TYPE_DC")
@XmlEnum
public enum CbPHONETYPEDC {

    WORK("WORK"),
    MOBILE("MOBILE"),
    FAX("FAX"),
    PAGER("PAGER"),
    EMERG("EMERG"),
    @XmlEnumValue("MISC1")
    MISC_1("MISC1"),
    @XmlEnumValue("MISC2")
    MISC_2("MISC2"),
    @XmlEnumValue("MISC3")
    MISC_3("MISC3"),
    HOME("HOME");
    private final String value;

    CbPHONETYPEDC(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbPHONETYPEDC fromValue(String v) {
        for (CbPHONETYPEDC c: CbPHONETYPEDC.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
