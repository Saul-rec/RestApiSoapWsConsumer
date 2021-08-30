//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.30 a las 04:54:13 PM CST 
//


package com.htc.billing.service.apirest.soapclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingResult" type="{http://www.htc.com/billing/service/generated}billingResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "billingResult"
})
@XmlRootElement(name = "findByBillingCodeResponse")
public class FindByBillingCodeResponse {

    @XmlElement(required = true)
    protected BillingResult billingResult;

    /**
     * Obtiene el valor de la propiedad billingResult.
     * 
     * @return
     *     possible object is
     *     {@link BillingResult }
     *     
     */
    public BillingResult getBillingResult() {
        return billingResult;
    }

    /**
     * Define el valor de la propiedad billingResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingResult }
     *     
     */
    public void setBillingResult(BillingResult value) {
        this.billingResult = value;
    }

}
