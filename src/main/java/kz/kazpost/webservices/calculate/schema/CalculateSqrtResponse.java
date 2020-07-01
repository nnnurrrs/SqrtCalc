
package kz.kazpost.webservices.calculate.schema;

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
 *         &lt;element name="result_sqrt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "resultSqrt"
})
@XmlRootElement(name = "CalculateSqrtResponse", namespace = "http://webservices.kazpost.kz/calculate/schema")
public class CalculateSqrtResponse {

    @XmlElement(name = "result_sqrt", namespace = "http://webservices.kazpost.kz/calculate/schema")
    protected Double resultSqrt;

    /**
     * Gets the value of the resultSqrt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResultSqrt() {
        return resultSqrt;
    }

    /**
     * Sets the value of the resultSqrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResultSqrt(Double value) {
        this.resultSqrt = value;
    }

}
