
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Calcular_QNAME = new QName("http://IVA.Calculador/", "Calcular");
    private final static QName _PerdirDatos_QNAME = new QName("http://IVA.Calculador/", "PerdirDatos");
    private final static QName _PerdirDatosResponse_QNAME = new QName("http://IVA.Calculador/", "PerdirDatosResponse");
    private final static QName _CalcularResponse_QNAME = new QName("http://IVA.Calculador/", "CalcularResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PerdirDatos }
     * 
     */
    public PerdirDatos createPerdirDatos() {
        return new PerdirDatos();
    }

    /**
     * Create an instance of {@link PerdirDatosResponse }
     * 
     */
    public PerdirDatosResponse createPerdirDatosResponse() {
        return new PerdirDatosResponse();
    }

    /**
     * Create an instance of {@link CalcularResponse }
     * 
     */
    public CalcularResponse createCalcularResponse() {
        return new CalcularResponse();
    }

    /**
     * Create an instance of {@link Calcular }
     * 
     */
    public Calcular createCalcular() {
        return new Calcular();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calcular }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://IVA.Calculador/", name = "Calcular")
    public JAXBElement<Calcular> createCalcular(Calcular value) {
        return new JAXBElement<Calcular>(_Calcular_QNAME, Calcular.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerdirDatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://IVA.Calculador/", name = "PerdirDatos")
    public JAXBElement<PerdirDatos> createPerdirDatos(PerdirDatos value) {
        return new JAXBElement<PerdirDatos>(_PerdirDatos_QNAME, PerdirDatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerdirDatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://IVA.Calculador/", name = "PerdirDatosResponse")
    public JAXBElement<PerdirDatosResponse> createPerdirDatosResponse(PerdirDatosResponse value) {
        return new JAXBElement<PerdirDatosResponse>(_PerdirDatosResponse_QNAME, PerdirDatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://IVA.Calculador/", name = "CalcularResponse")
    public JAXBElement<CalcularResponse> createCalcularResponse(CalcularResponse value) {
        return new JAXBElement<CalcularResponse>(_CalcularResponse_QNAME, CalcularResponse.class, null, value);
    }

}
