
package tallerobjetosjava;

/**
 * Representa un tipo de Mesa con sus propiedades privada, protegida y publica.
 * @author Luis mendoza
 */
public class Table {
    
    /**
     * Representa el atributo privado widths de la clase Table, tipo de dato: double.
     */
    private double widths ;
    
  /**
     * Representa el atributo protegido heights de la clase Table, tipo de dato: double.
     */
    protected double heights ;
    
      /**
     * Representa el atributo publico lengths de la clase Table, tipo de dato: double.
     */
    public double lengths;

       /**
     * Constructor: Crea una instancia de la clase Table sin valor en los atributos.
     */
    public Table() {
    }

      /**
     * Constructor: Crea una instancia de la clase Table con valor en los atributos.
     */
    public Table(double widths, double heights, double lengths) {
        this.widths = widths;
        this.heights = heights;
        this.lengths = lengths;
    }

       /*
    * Método para obtener el valor de la propiedad widths de la clase Table.
    *@return Devuelve el valor de la propiedad widths.
    */
    public double getWidths() {
        return widths;
    }

     /*
    * Método para asignar  el valor a la propiedad widths de la clase Table.
    * @param widths: Recibe el valor a asignar a la propiedad widths.
    */
    public void setWidths(double widths) {
        this.widths = widths;
    }

       /*
    * Método para obtener el valor de la propiedad heights de la clase Table.
    *@return Devuelve el valor de la propiedad heights.
    */
    public double getHeights() {
        return heights;
    }

      /*
    * Método para asignar  el valor a la propiedad heights de la clase Table.
    * @param heights: Recibe el valor a asignar a la propiedad heights.
    */
    public void setHeights(double heights) {
        this.heights = heights;
    }

     /*
    * Método para obtener el valor de la propiedad lengths de la clase Table.
    *@return Devuelve el valor de la propiedad lengths.
    */
    public double getLengths() {
        return lengths;
    }

    /*
    * Método para asignar  el valor a la propiedad lengths de la clase Table.
    * @param lengths: Recibe el valor a asignar a la propiedad lengths.
    */
    public void setLengths(double lengths) {
        this.lengths = lengths;
    }


    


 
    
}
