//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.27 at 11:54:07 PM EEST 
//


package ac.biu.nlp.nlp.datasets.trec.jaxb_generated.latimes;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}CELLRULE"/>
 *         &lt;element ref="{}TABLECELL"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cellruleOrTABLECELL"
})
@XmlRootElement(name = "TABLEROW")
public class TABLEROW {

    @XmlElements({
        @XmlElement(name = "TABLECELL", type = TABLECELL.class),
        @XmlElement(name = "CELLRULE", type = CELLRULE.class)
    })
    protected List<Object> cellruleOrTABLECELL;

    /**
     * Gets the value of the cellruleOrTABLECELL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellruleOrTABLECELL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCELLRULEOrTABLECELL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TABLECELL }
     * {@link CELLRULE }
     * 
     * 
     */
    public List<Object> getCELLRULEOrTABLECELL() {
        if (cellruleOrTABLECELL == null) {
            cellruleOrTABLECELL = new ArrayList<Object>();
        }
        return this.cellruleOrTABLECELL;
    }

}
