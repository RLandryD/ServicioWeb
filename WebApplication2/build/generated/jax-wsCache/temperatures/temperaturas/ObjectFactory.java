
package temperaturas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the temperaturas package. 
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

    private final static QName _ConvCentAFahr_QNAME = new QName("http://temperaturas/", "convCentAFahr");
    private final static QName _ConvCentAFahrResponse_QNAME = new QName("http://temperaturas/", "convCentAFahrResponse");
    private final static QName _ConvFahrACent_QNAME = new QName("http://temperaturas/", "convFahrACent");
    private final static QName _ConvFahrACentResponse_QNAME = new QName("http://temperaturas/", "convFahrACentResponse");
    private final static QName _Hello_QNAME = new QName("http://temperaturas/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://temperaturas/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: temperaturas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvCentAFahr }
     * 
     */
    public ConvCentAFahr createConvCentAFahr() {
        return new ConvCentAFahr();
    }

    /**
     * Create an instance of {@link ConvCentAFahrResponse }
     * 
     */
    public ConvCentAFahrResponse createConvCentAFahrResponse() {
        return new ConvCentAFahrResponse();
    }

    /**
     * Create an instance of {@link ConvFahrACent }
     * 
     */
    public ConvFahrACent createConvFahrACent() {
        return new ConvFahrACent();
    }

    /**
     * Create an instance of {@link ConvFahrACentResponse }
     * 
     */
    public ConvFahrACentResponse createConvFahrACentResponse() {
        return new ConvFahrACentResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvCentAFahr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temperaturas/", name = "convCentAFahr")
    public JAXBElement<ConvCentAFahr> createConvCentAFahr(ConvCentAFahr value) {
        return new JAXBElement<ConvCentAFahr>(_ConvCentAFahr_QNAME, ConvCentAFahr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvCentAFahrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temperaturas/", name = "convCentAFahrResponse")
    public JAXBElement<ConvCentAFahrResponse> createConvCentAFahrResponse(ConvCentAFahrResponse value) {
        return new JAXBElement<ConvCentAFahrResponse>(_ConvCentAFahrResponse_QNAME, ConvCentAFahrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvFahrACent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temperaturas/", name = "convFahrACent")
    public JAXBElement<ConvFahrACent> createConvFahrACent(ConvFahrACent value) {
        return new JAXBElement<ConvFahrACent>(_ConvFahrACent_QNAME, ConvFahrACent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvFahrACentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temperaturas/", name = "convFahrACentResponse")
    public JAXBElement<ConvFahrACentResponse> createConvFahrACentResponse(ConvFahrACentResponse value) {
        return new JAXBElement<ConvFahrACentResponse>(_ConvFahrACentResponse_QNAME, ConvFahrACentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temperaturas/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temperaturas/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
