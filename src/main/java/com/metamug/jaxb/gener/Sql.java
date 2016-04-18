//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.01.02 at 06:40:50 PM IST
//
package com.metamug.jaxb.gener;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Java class for sql complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="sql">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" type="{}sqlType" default="query" />
 *       &lt;attribute name="on" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{}class" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sql", propOrder = {
    "value"
})
public class Sql {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "on")
    protected String on;
    @XmlAttribute(name = "class")
    protected String clazz;

    public Sql() {
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link SqlType }
     *
     */
    public String getType() {
        if (type == null) {
            return "query";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is {@link SqlType }
     *
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the on property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOn() {
        return on;
    }

    /**
     * Sets the value of the on property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOn(String value) {
        this.on = value;
    }

    /**
     * Gets the value of the clazz property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getClazz() {
        if (this.getType().equals("query")) {
            return clazz;
        } else {
            return null;
        }
    }

    /**
     * Sets the value of the clazz property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

}
