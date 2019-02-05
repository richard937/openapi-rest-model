//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 01:54:54 PM IST 
//


package net.metamug.xml.resource._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 For processing incoming request and sending back response.
 *             
 * 
 * <p>Java class for request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Desc" type="{http://xml.metamug.net/resource/1.0}desc" minOccurs="0"/>
 *         &lt;element name="Param" type="{http://xml.metamug.net/resource/1.0}param" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Execute" type="{http://xml.metamug.net/resource/1.0}execute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://xml.metamug.net/resource/1.0}query" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Update" type="{http://xml.metamug.net/resource/1.0}update" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="XRequest" type="{http://xml.metamug.net/resource/1.0}xrequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="method" use="required" type="{http://xml.metamug.net/resource/1.0}method" />
 *       &lt;attribute name="status" type="{http://xml.metamug.net/resource/1.0}status" />
 *       &lt;attribute name="item" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = {
    "descOrParamOrExecute"
})
public class Request {

    @XmlElements({
        @XmlElement(name = "Desc", type = String.class),
        @XmlElement(name = "Param", type = Param.class),
        @XmlElement(name = "Execute", type = Execute.class),
        @XmlElement(name = "Query", type = Query.class),
        @XmlElement(name = "Update", type = Update.class),
        @XmlElement(name = "XRequest", type = Xrequest.class)
    })
    protected List<Object> descOrParamOrExecute;
    @XmlAttribute(name = "method", required = true)
    protected Method method;
    @XmlAttribute(name = "status")
    protected Integer status;
    @XmlAttribute(name = "item")
    protected Boolean item;

    /**
     * Gets the value of the descOrParamOrExecute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descOrParamOrExecute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescOrParamOrExecute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link Param }
     * {@link Execute }
     * {@link Query }
     * {@link Update }
     * {@link Xrequest }
     * 
     * 
     */
    public List<Object> getDescOrParamOrExecute() {
        if (descOrParamOrExecute == null) {
            descOrParamOrExecute = new ArrayList<Object>();
        }
        return this.descOrParamOrExecute;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link Method }
     *     
     */
    public Method getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link Method }
     *     
     */
    public void setMethod(Method value) {
        this.method = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isItem() {
        if (item == null) {
            return false;
        } else {
            return item;
        }
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItem(Boolean value) {
        this.item = value;
    }

}
