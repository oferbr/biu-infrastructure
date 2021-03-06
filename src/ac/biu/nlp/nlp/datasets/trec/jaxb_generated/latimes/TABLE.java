//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.27 at 11:54:07 PM EEST 
//


package ac.biu.nlp.nlp.datasets.trec.jaxb_generated.latimes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{}ROWRULE"/>
 *         &lt;element ref="{}TABLEROW"/>
 *       &lt;/choice>
 *       &lt;attribute name="CWL" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="NCOLS" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="WDM" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rowruleOrTABLEROW"
})
@XmlRootElement(name = "TABLE")
public class TABLE {

    @XmlElements({
        @XmlElement(name = "ROWRULE", type = ROWRULE.class),
        @XmlElement(name = "TABLEROW", type = TABLEROW.class)
    })
    protected List<Object> rowruleOrTABLEROW;
    @XmlAttribute(name = "CWL", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String cwl;
    @XmlAttribute(name = "NCOLS", required = true)
    protected BigInteger ncols;
    @XmlAttribute(name = "WDM", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String wdm;

    /**
     * Gets the value of the rowruleOrTABLEROW property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rowruleOrTABLEROW property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getROWRULEOrTABLEROW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROWRULE }
     * {@link TABLEROW }
     * 
     * 
     */
    public List<Object> getROWRULEOrTABLEROW() {
        if (rowruleOrTABLEROW == null) {
            rowruleOrTABLEROW = new ArrayList<Object>();
        }
        return this.rowruleOrTABLEROW;
    }

    /**
     * Gets the value of the cwl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCWL() {
        return cwl;
    }

    /**
     * Sets the value of the cwl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCWL(String value) {
        this.cwl = value;
    }

    /**
     * Gets the value of the ncols property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNCOLS() {
        return ncols;
    }

    /**
     * Sets the value of the ncols property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNCOLS(BigInteger value) {
        this.ncols = value;
    }

    /**
     * Gets the value of the wdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWDM() {
        return wdm;
    }

    /**
     * Sets the value of the wdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWDM(String value) {
        this.wdm = value;
    }

}
