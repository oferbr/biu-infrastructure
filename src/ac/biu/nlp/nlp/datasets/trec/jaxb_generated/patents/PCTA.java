//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.28 at 10:37:56 AM GMT+02:00 
//


package ac.biu.nlp.nlp.datasets.trec.jaxb_generated.patents;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}PCN"/>
 *         &lt;element ref="{}PD1"/>
 *         &lt;element ref="{}PD2"/>
 *         &lt;element ref="{}PD3"/>
 *         &lt;element ref="{}PCP"/>
 *         &lt;element ref="{}PCD"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pcn",
    "pd1",
    "pd2",
    "pd3",
    "pcp",
    "pcd"
})
@XmlRootElement(name = "PCTA")
public class PCTA {

    @XmlElement(name = "PCN", required = true)
    protected String pcn;
    @XmlElement(name = "PD1", required = true)
    protected BigInteger pd1;
    @XmlElement(name = "PD2", required = true)
    protected BigInteger pd2;
    @XmlElement(name = "PD3", required = true)
    protected BigInteger pd3;
    @XmlElement(name = "PCP", required = true)
    protected String pcp;
    @XmlElement(name = "PCD", required = true)
    protected BigInteger pcd;

    /**
     * Gets the value of the pcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCN() {
        return pcn;
    }

    /**
     * Sets the value of the pcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCN(String value) {
        this.pcn = value;
    }

    /**
     * Gets the value of the pd1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPD1() {
        return pd1;
    }

    /**
     * Sets the value of the pd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPD1(BigInteger value) {
        this.pd1 = value;
    }

    /**
     * Gets the value of the pd2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPD2() {
        return pd2;
    }

    /**
     * Sets the value of the pd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPD2(BigInteger value) {
        this.pd2 = value;
    }

    /**
     * Gets the value of the pd3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPD3() {
        return pd3;
    }

    /**
     * Sets the value of the pd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPD3(BigInteger value) {
        this.pd3 = value;
    }

    /**
     * Gets the value of the pcp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCP() {
        return pcp;
    }

    /**
     * Sets the value of the pcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCP(String value) {
        this.pcp = value;
    }

    /**
     * Gets the value of the pcd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPCD() {
        return pcd;
    }

    /**
     * Sets the value of the pcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPCD(BigInteger value) {
        this.pcd = value;
    }

}