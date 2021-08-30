//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.30 a las 04:54:13 PM CST 
//


package com.htc.billing.service.apirest.soapclasses;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="billingCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codEmployee" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nameClient" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productDetails" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="codProduct" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "billingCode",
    "codEmployee",
    "nameClient",
    "paymentType",
    "productDetails"
})
@XmlRootElement(name = "updateBillingRequest")
public class UpdateBillingRequest {

    protected long billingCode;
    protected long codEmployee;
    @XmlElement(required = true)
    protected String nameClient;
    @XmlElement(required = true)
    protected String paymentType;
    @XmlElement(required = true)
    protected List<UpdateBillingRequest.ProductDetails> productDetails;

    /**
     * Obtiene el valor de la propiedad billingCode.
     * 
     */
    public long getBillingCode() {
        return billingCode;
    }

    /**
     * Define el valor de la propiedad billingCode.
     * 
     */
    public void setBillingCode(long value) {
        this.billingCode = value;
    }

    /**
     * Obtiene el valor de la propiedad codEmployee.
     * 
     */
    public long getCodEmployee() {
        return codEmployee;
    }

    /**
     * Define el valor de la propiedad codEmployee.
     * 
     */
    public void setCodEmployee(long value) {
        this.codEmployee = value;
    }

    /**
     * Obtiene el valor de la propiedad nameClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameClient() {
        return nameClient;
    }

    /**
     * Define el valor de la propiedad nameClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameClient(String value) {
        this.nameClient = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Define el valor de la propiedad paymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateBillingRequest.ProductDetails }
     * 
     * 
     */
    public List<UpdateBillingRequest.ProductDetails> getProductDetails() {
        if (productDetails == null) {
            productDetails = new ArrayList<UpdateBillingRequest.ProductDetails>();
        }
        return this.productDetails;
    }


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
     *         &lt;element name="codProduct" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "codProduct",
        "quantity"
    })
    public static class ProductDetails {

        protected long codProduct;
        protected int quantity;

        /**
         * Obtiene el valor de la propiedad codProduct.
         * 
         */
        public long getCodProduct() {
            return codProduct;
        }

        /**
         * Define el valor de la propiedad codProduct.
         * 
         */
        public void setCodProduct(long value) {
            this.codProduct = value;
        }

        /**
         * Obtiene el valor de la propiedad quantity.
         * 
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * Define el valor de la propiedad quantity.
         * 
         */
        public void setQuantity(int value) {
            this.quantity = value;
        }

    }

}
