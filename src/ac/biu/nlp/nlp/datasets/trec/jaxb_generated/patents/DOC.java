//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.28 at 10:37:56 AM GMT+02:00 
//


package ac.biu.nlp.nlp.datasets.trec.jaxb_generated.patents;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ac.biu.nlp.nlp.datasets.trec.Doc;
import ac.biu.nlp.nlp.datasets.trec.jaxb_generated.fr94.TEXT;


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
 *         &lt;element ref="{}DOCNO"/>
 *         &lt;element ref="{}WKU"/>
 *         &lt;element ref="{}SRC"/>
 *         &lt;element ref="{}APN"/>
 *         &lt;element ref="{}APT"/>
 *         &lt;element ref="{}ART"/>
 *         &lt;element ref="{}APD"/>
 *         &lt;element ref="{}TTL"/>
 *         &lt;element ref="{}ISD"/>
 *         &lt;element ref="{}NCL"/>
 *         &lt;element ref="{}ECL"/>
 *         &lt;element ref="{}EXA" minOccurs="0"/>
 *         &lt;element ref="{}EXP"/>
 *         &lt;element ref="{}NDR"/>
 *         &lt;element ref="{}NFG"/>
 *         &lt;element ref="{}DCD" minOccurs="0"/>
 *         &lt;element ref="{}INVT" maxOccurs="unbounded"/>
 *         &lt;element ref="{}ASSG" minOccurs="0"/>
 *         &lt;element ref="{}PRIR" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}RLAP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}CLAS"/>
 *         &lt;element ref="{}UREF" maxOccurs="unbounded"/>
 *         &lt;element ref="{}FREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OREF" minOccurs="0"/>
 *         &lt;element ref="{}LREP" minOccurs="0"/>
 *         &lt;element ref="{}PCTA" minOccurs="0"/>
 *         &lt;element ref="{}TEXT"/>
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
    "docno",
    "wku",
    "src",
    "apn",
    "apt",
    "art",
    "apd",
    "ttl",
    "isd",
    "ncl",
    "ecl",
    "exa",
    "exp",
    "ndr",
    "nfg",
    "dcd",
    "invt",
    "assg",
    "prir",
    "rlap",
    "clas",
    "uref",
    "fref",
    "oref",
    "lrep",
    "pcta",
    "text"
})
@XmlRootElement(name = "DOC")
public class DOC implements Doc {

    @XmlElement(name = "DOCNO", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String docno;
    @XmlElement(name = "WKU", required = true)
    protected BigInteger wku;
    @XmlElement(name = "SRC", required = true)
    protected BigInteger src;
    @XmlElement(name = "APN", required = true)
    protected String apn;
    @XmlElement(name = "APT", required = true)
    protected BigInteger apt;
    @XmlElement(name = "ART", required = true)
    protected BigInteger art;
    @XmlElement(name = "APD", required = true)
    protected BigInteger apd;
    @XmlElement(name = "TTL", required = true)
    protected String ttl;
    @XmlElement(name = "ISD", required = true)
    protected BigInteger isd;
    @XmlElement(name = "NCL", required = true)
    protected BigInteger ncl;
    @XmlElement(name = "ECL", required = true)
    protected BigInteger ecl;
    @XmlElement(name = "EXA")
    protected String exa;
    @XmlElement(name = "EXP", required = true)
    protected String exp;
    @XmlElement(name = "NDR", required = true)
    protected BigInteger ndr;
    @XmlElement(name = "NFG", required = true)
    protected BigInteger nfg;
    @XmlElement(name = "DCD")
    protected BigInteger dcd;
    @XmlElement(name = "INVT", required = true)
    protected List<INVT> invt;
    @XmlElement(name = "ASSG")
    protected ASSG assg;
    @XmlElement(name = "PRIR")
    protected List<PRIR> prir;
    @XmlElement(name = "RLAP")
    protected List<RLAP> rlap;
    @XmlElement(name = "CLAS", required = true)
    protected CLAS clas;
    @XmlElement(name = "UREF", required = true)
    protected List<UREF> uref;
    @XmlElement(name = "FREF")
    protected List<FREF> fref;
    @XmlElement(name = "OREF")
    protected OREF oref;
    @XmlElement(name = "LREP")
    protected LREP lrep;
    @XmlElement(name = "PCTA")
    protected PCTA pcta;
    @XmlElement(name = "TEXT", required = true)
    protected TEXT text;

    /**
     * Gets the value of the docno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCNO() {
        return docno;
    }

    /**
     * Sets the value of the docno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCNO(String value) {
        this.docno = value;
    }

    /**
     * Gets the value of the wku property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWKU() {
        return wku;
    }

    /**
     * Sets the value of the wku property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWKU(BigInteger value) {
        this.wku = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSRC() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSRC(BigInteger value) {
        this.src = value;
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
     * Gets the value of the apt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAPT() {
        return apt;
    }

    /**
     * Sets the value of the apt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAPT(BigInteger value) {
        this.apt = value;
    }

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getART() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setART(BigInteger value) {
        this.art = value;
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
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTL() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTL(String value) {
        this.ttl = value;
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

    /**
     * Gets the value of the ncl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNCL() {
        return ncl;
    }

    /**
     * Sets the value of the ncl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNCL(BigInteger value) {
        this.ncl = value;
    }

    /**
     * Gets the value of the ecl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getECL() {
        return ecl;
    }

    /**
     * Sets the value of the ecl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setECL(BigInteger value) {
        this.ecl = value;
    }

    /**
     * Gets the value of the exa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXA() {
        return exa;
    }

    /**
     * Sets the value of the exa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXA(String value) {
        this.exa = value;
    }

    /**
     * Gets the value of the exp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXP() {
        return exp;
    }

    /**
     * Sets the value of the exp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXP(String value) {
        this.exp = value;
    }

    /**
     * Gets the value of the ndr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNDR() {
        return ndr;
    }

    /**
     * Sets the value of the ndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNDR(BigInteger value) {
        this.ndr = value;
    }

    /**
     * Gets the value of the nfg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNFG() {
        return nfg;
    }

    /**
     * Sets the value of the nfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNFG(BigInteger value) {
        this.nfg = value;
    }

    /**
     * Gets the value of the dcd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDCD() {
        return dcd;
    }

    /**
     * Sets the value of the dcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDCD(BigInteger value) {
        this.dcd = value;
    }

    /**
     * Gets the value of the invt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINVT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INVT }
     * 
     * 
     */
    public List<INVT> getINVT() {
        if (invt == null) {
            invt = new ArrayList<INVT>();
        }
        return this.invt;
    }

    /**
     * Gets the value of the assg property.
     * 
     * @return
     *     possible object is
     *     {@link ASSG }
     *     
     */
    public ASSG getASSG() {
        return assg;
    }

    /**
     * Sets the value of the assg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSG }
     *     
     */
    public void setASSG(ASSG value) {
        this.assg = value;
    }

    /**
     * Gets the value of the prir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prir property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRIR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRIR }
     * 
     * 
     */
    public List<PRIR> getPRIR() {
        if (prir == null) {
            prir = new ArrayList<PRIR>();
        }
        return this.prir;
    }

    /**
     * Gets the value of the rlap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rlap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRLAP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RLAP }
     * 
     * 
     */
    public List<RLAP> getRLAP() {
        if (rlap == null) {
            rlap = new ArrayList<RLAP>();
        }
        return this.rlap;
    }

    /**
     * Gets the value of the clas property.
     * 
     * @return
     *     possible object is
     *     {@link CLAS }
     *     
     */
    public CLAS getCLAS() {
        return clas;
    }

    /**
     * Sets the value of the clas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLAS }
     *     
     */
    public void setCLAS(CLAS value) {
        this.clas = value;
    }

    /**
     * Gets the value of the uref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UREF }
     * 
     * 
     */
    public List<UREF> getUREF() {
        if (uref == null) {
            uref = new ArrayList<UREF>();
        }
        return this.uref;
    }

    /**
     * Gets the value of the fref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFREF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FREF }
     * 
     * 
     */
    public List<FREF> getFREF() {
        if (fref == null) {
            fref = new ArrayList<FREF>();
        }
        return this.fref;
    }

    /**
     * Gets the value of the oref property.
     * 
     * @return
     *     possible object is
     *     {@link OREF }
     *     
     */
    public OREF getOREF() {
        return oref;
    }

    /**
     * Sets the value of the oref property.
     * 
     * @param value
     *     allowed object is
     *     {@link OREF }
     *     
     */
    public void setOREF(OREF value) {
        this.oref = value;
    }

    /**
     * Gets the value of the lrep property.
     * 
     * @return
     *     possible object is
     *     {@link LREP }
     *     
     */
    public LREP getLREP() {
        return lrep;
    }

    /**
     * Sets the value of the lrep property.
     * 
     * @param value
     *     allowed object is
     *     {@link LREP }
     *     
     */
    public void setLREP(LREP value) {
        this.lrep = value;
    }

    /**
     * Gets the value of the pcta property.
     * 
     * @return
     *     possible object is
     *     {@link PCTA }
     *     
     */
    public PCTA getPCTA() {
        return pcta;
    }

    /**
     * Sets the value of the pcta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCTA }
     *     
     */
    public void setPCTA(PCTA value) {
        this.pcta = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link TEXT }
     *     
     */
    public TEXT getTEXT() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEXT }
     *     
     */
    public void setTEXT(TEXT value) {
        this.text = value;
    }

	/* (non-Javadoc)
	 * @see org.BIU.NLP.corpora.trec_new.Doc#getTexts()
	 */
	public List<String> getTexts() {
		StringBuilder buf = new StringBuilder();
		TEXT textObj = this.getTEXT();
		// FIXME there's some conflict over the DOCNO here...
		for (Object obj: textObj.getContent())
		{
			buf.append(obj);
			if (obj.toString().length() > 300)
				obj = null;
//			QName qName = obj.getName();
//			if (qName.toString().equals(TEXT))
//					buf.append(obj.getValue());
		}

		List<String> texts = new Vector<String>();
		texts.add(buf.toString());
		return texts;
	}

}
