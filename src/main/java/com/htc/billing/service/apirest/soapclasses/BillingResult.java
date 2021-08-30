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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para billingResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="billingResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codeEmployee" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nameEmployee" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nameClient" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfSell" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalSell" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="productsDetails" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="codProduct" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="presentationProduct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="nameProduct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="unitPriceProduct" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlType(name = "billingResult", propOrder = {
    "billingCode",
    "codeEmployee",
    "nameEmployee",
    "nameClient",
    "paymentType",
    "dateOfSell",
    "iva",
    "subtotal",
    "totalSell",
    "productsDetails"
})
public class BillingResult {

    protected long billingCode;
    protected long codeEmployee;
    @XmlElement(required = true)
    protected String nameEmployee;
    @XmlElement(required = true)
    protected String nameClient;
    @XmlElement(required = true)
    protected String paymentType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfSell;
    protected double iva;
    protected double subtotal;
    protected double totalSell;
    @XmlElement(required = true)
    protected List<BillingResult.ProductsDetails> productsDetails;

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
     * Obtiene el valor de la propiedad codeEmployee.
     * 
     */
    public long getCodeEmployee() {
        return codeEmployee;
    }

    /**
     * Define el valor de la propiedad codeEmployee.
     * 
     */
    public void setCodeEmployee(long value) {
        this.codeEmployee = value;
    }

    /**
     * Obtiene el valor de la propiedad nameEmployee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEmployee() {
        return nameEmployee;
    }

    /**
     * Define el valor de la propiedad nameEmployee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEmployee(String value) {
        this.nameEmployee = value;
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
     * Obtiene el valor de la propiedad dateOfSell.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfSell() {
        return dateOfSell;
    }

    /**
     * Define el valor de la propiedad dateOfSell.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfSell(XMLGregorianCalendar value) {
        this.dateOfSell = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     */
    public double getIva() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     */
    public void setIva(double value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotal.
     * 
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Define el valor de la propiedad subtotal.
     * 
     */
    public void setSubtotal(double value) {
        this.subtotal = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSell.
     * 
     */
    public double getTotalSell() {
        return totalSell;
    }

    /**
     * Define el valor de la propiedad totalSell.
     * 
     */
    public void setTotalSell(double value) {
        this.totalSell = value;
    }

    /**
     * Gets the value of the productsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingResult.ProductsDetails }
     * 
     * 
     */
    public List<BillingResult.ProductsDetails> getProductsDetails() {
        if (productsDetails == null) {
            productsDetails = new ArrayList<BillingResult.ProductsDetails>();
        }
        return this.productsDetails;
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
     *         &lt;element name="presentationProduct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="nameProduct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="unitPriceProduct" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
        "quantity",
        "presentationProduct",
        "nameProduct",
        "unitPriceProduct",
        "amount"
    })
    public static class ProductsDetails {

        protected long codProduct;
        protected int quantity;
        @XmlElement(required = true)
        protected String presentationProduct;
        @XmlElement(required = true)
        protected String nameProduct;
        protected double unitPriceProduct;
        protected double amount;

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

        /**
         * Obtiene el valor de la propiedad presentationProduct.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPresentationProduct() {
            return presentationProduct;
        }

        /**
         * Define el valor de la propiedad presentationProduct.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPresentationProduct(String value) {
            this.presentationProduct = value;
        }

        /**
         * Obtiene el valor de la propiedad nameProduct.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameProduct() {
            return nameProduct;
        }

        /**
         * Define el valor de la propiedad nameProduct.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameProduct(String value) {
            this.nameProduct = value;
        }

        /**
         * Obtiene el valor de la propiedad unitPriceProduct.
         * 
         */
        public double getUnitPriceProduct() {
            return unitPriceProduct;
        }

        /**
         * Define el valor de la propiedad unitPriceProduct.
         * 
         */
        public void setUnitPriceProduct(double value) {
            this.unitPriceProduct = value;
        }

        /**
         * Obtiene el valor de la propiedad amount.
         * 
         */
        public double getAmount() {
            return amount;
        }

        /**
         * Define el valor de la propiedad amount.
         * 
         */
        public void setAmount(double value) {
            this.amount = value;
        }

    }

}
