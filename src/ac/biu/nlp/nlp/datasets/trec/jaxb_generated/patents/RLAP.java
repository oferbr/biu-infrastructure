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
 *       &lt;sequence>
 *         &lt;element ref="{}COD"/>
 *         &lt;element ref="{}APN"/>
 *         &lt;element ref="{}APD"/>
 *         &lt;element ref="{}PSC" minOccurs="0"/>
 *         &lt;element ref="{}PNO" minOccurs="0"/>
 *         &lt;element ref="{}ISD" minOccurs="0"/>
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
    "cod",
    "apn",
    "apd",
    "psc",
    "pno",
    "isd"
})
@XmlRootElement(name = "RLAP")
public class RLAP {

    @XmlElement(name = "COD", required = true)
    protected BigInteger cod;
    @XmlElement(name = "APN", required = true)
    protected String apn;
    @XmlElement(name = "APD", required = true)
    protected BigInteger apd;
    @XmlElement(name = "PSC")
    protected BigInteger psc;
    @XmlElement(name = "PNO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String pno;
    @XmlElement(name = "ISD")
    protected BigInteger isd;

    /**
     * Gets the value of the cod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCOD() {
        return cod;
    }

    /**
     * Sets the value of the cod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCOD(BigInteger value) {
        this.cod = value;
    }

    /**
     * Gets the value of the apn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPN() {
        return apn;
    }

    /**
     * Sets the value of the apn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPN(String value) {
        this.apn = value;
    }

    /**
     * Gets the value of the apd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAPD() {
        return apd;
    }

    /**
     * Sets the value of the apd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAPD(BigInteger value) {
        this.apd = value;
    }

    /**
     * Gets the value of the psc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPSC() {
        return psc;
    }

    /**
     * Sets the value of the psc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPSC(BigInteger value) {
        this.psc = value;
    }

    /**
     * Gets the value of the pno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNO() {
        return pno;
    }

    /**
     * Sets the value of the pno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNO(String value) {
        this.pno = value;
    }

    /**
     * Gets the value of the isd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getISD() {
        return isd;
    }

    /**
     * Sets the value of the isd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setISD(BigInteger value) {
        this.isd = value;
    }

}
