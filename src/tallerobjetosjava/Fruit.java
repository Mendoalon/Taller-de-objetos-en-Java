package tallerobjetosjava;

/**
 * Importación de paquete ArrayList, ya que el tipo de dato utilizado en la propiedad colors es: ArrayList.
 */
import java.util.ArrayList;

/**
 * Representa una fruta con sus propiedades públicas y privada.
 * @author Lmendoza
 */
public class Fruit {

    /**
     *Representa la propiedad pública name de la clase Fruit, tipo de dato: String.
     */
    public String name;

    /**
     *Representa la propiedad privada averageWeight de la clase Fruit, tipo de dato: float.
     */
    private float averageWeight;

    /**
     *Representa la propiedad pública colors de la clase Fruit, tipo de dato: ArrayList < String >.
     */
    public ArrayList<String> colors;

    /**
     * Constructor: Crea una instancia de la clase Fruit.
     */
    public Fruit() {
    }

      /*
    * Método para obtener el valor de la propiedad colors de la clase Fruit.
    *@return Devuelve el valor de la propiedad colors.
    */
    public ArrayList<String> getColors() {
        return colors;
    }

    /*
    * Método para asignar  el valor a la propiedad colors de la clase Fruit.
    * @param colors: Recibe un arrayList y lo asigna a la propiedad colors.
    */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

}
