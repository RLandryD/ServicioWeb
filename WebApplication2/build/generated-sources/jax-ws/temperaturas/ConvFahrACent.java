
package temperaturas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para convFahrACent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="convFahrACent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gFahr" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convFahrACent", propOrder = {
    "gFahr"
})
public class ConvFahrACent {

    protected double gFahr;

    /**
     * Obtiene el valor de la propiedad gFahr.
     * 
     */
    public double getGFahr() {
        return gFahr;
    }

    /**
     * Define el valor de la propiedad gFahr.
     * 
     */
    public void setGFahr(double value) {
        this.gFahr = value;
    }

}
