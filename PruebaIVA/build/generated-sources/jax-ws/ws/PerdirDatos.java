
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PerdirDatos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PerdirDatos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Producto1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Producto2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerdirDatos", propOrder = {
    "producto1",
    "producto2"
})
public class PerdirDatos {

    @XmlElement(name = "Producto1")
    protected double producto1;
    @XmlElement(name = "Producto2")
    protected double producto2;

    /**
     * Obtiene el valor de la propiedad producto1.
     * 
     */
    public double getProducto1() {
        return producto1;
    }

    /**
     * Define el valor de la propiedad producto1.
     * 
     */
    public void setProducto1(double value) {
        this.producto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad producto2.
     * 
     */
    public double getProducto2() {
        return producto2;
    }

    /**
     * Define el valor de la propiedad producto2.
     * 
     */
    public void setProducto2(double value) {
        this.producto2 = value;
    }

}
