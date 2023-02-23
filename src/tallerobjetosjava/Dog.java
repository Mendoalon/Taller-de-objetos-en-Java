
package tallerobjetosjava;

/**
 * Importación de paquete ArrayList, ya que el tipo de dato utilizado en la propiedad colors es: ArrayList.
 */
import java.util.ArrayList;

/**
 * Representa un tipo de Mesa con sus propiedades privada, protegida y publica.
 * @author Luis mendoza
 */
public class Dog {
    
    /**
     * Representa el atributo publico name de la clase Dog, tipo de dato: String.
     */
    public String name;
    
    /**
     * Representa el atributo protegido size de la clase Dog, tipo de dato: int.
     */
    private double size;
    
        /**
     * Representa el atributo protegido year de la clase Dog, tipo de dato: int.
     */
    protected int year;
    
       /**
     *Representa la propiedad privada colors de la clase Dog, tipo de dato: ArrayList < String >.
     */
    private ArrayList<String> colors;

    
       /**
     * Constructor: Crea una instancia de la clase Dog con valor en los atributos.
     */
    public Dog(String name, double size, int year, ArrayList<String> colors) {
        this.name = name;
        this.size = size;
        this.year = year;
        this.colors = colors;
    }
    
    /*
    * Método para obtener el valor de la propiedad name de la clase Dog.
    *@return Devuelve el valor de la propiedad name.
    */
    public String getName() {
        return name;
    }
    
  /*
    * Método para asignar  el valor a la propiedad name de la clase Dog.
    * @param name: Recibe el valor a asignar a la propiedad name.
    */
    public void setName(String name) {
        this.name = name;
    }

        /*
    * Método para obtener el valor de la propiedad size de la clase Dog.
    *@return Devuelve el valor de la propiedad size.
    */
    public double getSize() {
        return size;
    }

    /*
    * Método para asignar  el valor a la propiedad size de la clase Dog.
    * @param size: Recibe el valor a asignar a la propiedad size.
    */
    public void setSize(double size) {
        this.size = size;
    }

           /*
    * Método para obtener el valor de la propiedad year de la clase Dog.
    *@return Devuelve el valor de la propiedad year.
    */
    public int getYear() {
        return year;
    }

       /*
    * Método para asignar  el valor a la propiedad year de la clase Dog.
    * @param year: Recibe el valor a asignar a la propiedad year.
    */
    public void setYear(int year) {
        this.year = year;
    }

       /*
    * Método para obtener el valor de la propiedad colors de la clase Dog.
    *@return Devuelve el valor de la propiedad colors.
    */
    public ArrayList<String> getColors() {
        return colors;
    }

    /*
    * Método para asignar  el valor a la propiedad colors de la clase Dog.
    * @param colors: Recibe el valor a asignar a la propiedad colors.
    */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
   
    
}
