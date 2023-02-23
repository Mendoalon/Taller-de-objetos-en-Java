
package tallerobjetosjava;

/**
 * Representa un tipo de licencia con sus propiedades privadas.
 * @author Luis mendoza
 */
public class License {
    /**
     * Representa el atributo privado name de la clase License, tipo de dato: String.
     */
    private String name; 
    
       /**
     * Representa el atributo privado type de la clase License, tipo de dato: String.
     */
     private  String type; 
     
          /**
     * Representa el atributo privado number de la clase License, tipo de dato: int.
     */
     private  int number; 

     
   /**
     * Constructor: Crea una instancia de la clase License con valor en los atributos.
     */
    public License(String name, String type, int number) {
        this.name = name;
        this.type = type;
        this.number = number;
    }

    
     /*
    * Método para obtener el valor de la propiedad name de la clase License.
    *@return Devuelve el valor de la propiedad name.
    */
    public String getName() {
        return name;
    }

    /*
    * Método para asignar  el valor a la propiedad name de la clase License.
    * @param name: Recibe el valor a asignar a la propiedad name.
    */
    public void setName(String name) {
        this.name = name;
    }

    /*
    * Método para obtener el valor de la propiedad type de la clase License.
    *@return Devuelve el valor de la propiedad name.
    */
    public String getType() {
        return type;
    }

       /*
    * Método para asignar  el valor a la propiedad type de la clase License.
    * @param type: Recibe el valor a asignar a la propiedad type.
    */
    public void setType(String type) {
        this.type = type;
    }

    /*
    * Método para obtener el valor de la propiedad number de la clase License.
    *@return Devuelve el valor de la propiedad number.
    */
    public int getNumber() {
        return number;
    }
    
       /*
    * Método para asignar  el valor a la propiedad number de la clase License.
    * @param number: Recibe el valor a asignar a la propiedad number.
    */
    public void setNumber(int number) {
        this.number = number;
    }
     
     
    
     
}
