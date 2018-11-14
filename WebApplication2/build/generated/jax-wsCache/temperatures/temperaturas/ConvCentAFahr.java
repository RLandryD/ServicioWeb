
package temperaturas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para convCentAFahr complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="convCentAFahr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gCent" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convCentAFahr", propOrder = {
    "gCent"
})
public class ConvCentAFahr {

    protected double gCent;

    /**
     * Obtiene el valor de la propiedad gCent.
     * 
     */
    public double getGCent() {
        return gCent;
    }

    /**
     * Define el valor de la propiedad gCent.
     * 
     */
    public void setGCent(double value) {
        this.gCent = value;
    }

}
