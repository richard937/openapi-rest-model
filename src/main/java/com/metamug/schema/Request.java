//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.01.07 at 10:53:17 AM IST
//
package com.metamug.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = {
    "desc",
    "param",
    "execute",
    "sql",
    "descOrParamOrExecute"
    "sql"
})
public class Request {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Param")
    protected List<Param> param;
    @XmlElement(name = "Execute")
    protected List<Execute> execute;
    @XmlElements({
        @XmlElement(name = "Sql", type = Sql.class)
        ,
        @XmlElement(name = "Query", type = Query.class)
        ,
        @XmlElement(name = "Update", type = Update.class)
    })
    protected List<Sql> sql;
    @XmlAttribute(name = "status")
    protected Integer status;
    @XmlAttribute(name = "method")
    protected Method method;
    @XmlAttribute(name = "item")
    protected Boolean item;

    public Request() {
    }

    public Request(Method method) {
        this.method = method;
    }

    public List<Param> getParam() {
        if (param == null) {
            param = new ArrayList<>();
        }
        return this.param;
    }

    public List<Execute> getExecute() {
        if (execute == null) {
            execute = new ArrayList<>();
        }
        return this.execute;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String value) {
        this.desc = value;
    }

    public List<Sql> getSql() {
        if (sql == null) {
            sql = new ArrayList<>();
        }
        return this.sql;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer value) {
        this.status = value;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method value) {
        this.method = value;
    }

    public boolean isItem() {
        if (item == null) {
            return false;
        } else {
            return item;
        }
    }

    public void setItem(Boolean value) {
        this.item = value;
    }

}
