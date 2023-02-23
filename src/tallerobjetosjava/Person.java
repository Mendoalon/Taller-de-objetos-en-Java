package tallerobjetosjava;

/**
 * Importación de paquete Date, ya que el tipo de dato utilizado en la propiedad
 * dateBirth es: Date
 */
import java.util.Date;

/**
 * Representa una persona con sus propiedades públicas.
 * @author Lmendoza
 */
public class Person {

    /**
     * Representa la propiedad pública name de la clase Person, tipo de dato: String.
     */
    public String name;

    /**
     * Representa la propiedad pública lastName de la clases person, tipo de dato: String.
     */
    public String lastName;
    
      /**
     * Representa la propiedad pública dateBirth de la clases person, tipo de dato: Date.
     */
    public Date dateBirth;
    
     /**
     * Representa la propiedad pública height de la clases person, tipo de dato: Float.
     */
    public float height;
    
      /**
     * Constructor: Crea una instancia de la clase Person.
     */
    public Person() {
    }

    
    /*
    * Método para obtener el valor de la propiedad name de la clase person.
    *@return Devuelve el valor de la propiedad name.
    */
    public String getName() {
        return name;
    }

    /*
    * Método para asignar  el valor a la propiedad name de la clase person.
    * @param name: Recibe el valor a asignar a la propiedad name.
    */
    public void setName(String name) {
        this.name = name;
    }

}
