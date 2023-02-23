package tallerobjetosjava;

import java.util.ArrayList;

/**
 * Representa la clase principal del proyecto.
 * @author Luis mendoza
 */
public class TallerObjetosJava {

    /*
    * Método pricipal del proyecto.
     */
    public static void main(String[] args) {

        /**
         * Creación de un objeto de la clase person.
         */
        Person person1 = new Person();

        /**
         * Se asigna valor a la propiedad name de la clase Person utilizado el método setName.
         */
        person1.setName("Luis");

        /**
         * Se imprime el valor de la propiedad name de la clase Person utilizado el método getName.
         */
        System.out.println("Nombre de persona 1: " + person1.getName());
        
        
         /**
         * Creación de un objeto de la clase Fruit.
         */
        Fruit fruit1 = new Fruit();
        
           /**
         * Se crea la variable coloresFruta1 de tipo arrayList.
         */
        ArrayList<String> coloresFruta1 = new ArrayList<String>();
        
        /**
         * Se asigna algunos valores a la variable coloresFruta1.
         */
        coloresFruta1.add("morado");
        coloresFruta1.add("verde");

        /**
         * Se asigna valor a la propiedad colors de la clase Fruit utilizado el método setName.
         */
        fruit1.setColors(coloresFruta1);
        
        /**
         * Se imprime el valor de la propiedad colors de la clase Fruit utilizado el método getColors.
         */
        System.out.println("Colores de la fruta 1: " + fruit1.getColors());

        
          /**
         * Creación de un objeto de la clase BankAccount.
         */
        BankAccount bankAccount1 = new BankAccount();
        
        /**
         * Se asigna valor a la propiedad activated de la clase BankAccount utilizado el método setActivated.
         */
        bankAccount1.setActivated(true);
        
        /**
         * Se imprime el valor de la propiedad activated de la clase BankAccount utilizado el método isActivated.
         */
        System.out.println("la cuenta se encuetra : " + bankAccount1.accountStatus());
        
        
        /**
         * Creación de objeto y se asigna los valores de los atributos de la clase Table.
         */
        Table table1 = new Table(5,7,9);
        
           /**
         * Se imprime el valor de las propiedades de la clase Table utilizando los metodos getHeights, .getLengths y getWidths.
         */
        System.out.println("La mesa tiene las siguiente medidas: " + "Alto: "+ table1.getHeights() + ", largo: " + table1.getLengths() + ", ancho: " + table1.getWidths());
        
        
        
           /**
         * Creación de objeto y se asigna los valores de los atributos de la clase License.
         */
           License license1 = new License("automovil", "C2",  10148374);
           
           /**
         * Se imprime el valor de las propiedades de la clase Table utilizando los metodos getName, getType y getNumber.
         */
           System.out.println("La licencia 1 tiene los siguinete datos: " +"Typo: " + license1.getName() + ", Categoria: " + license1.getType() + ", numero: " + license1.getNumber());
           
      
           /**
         * Se crea la variable coloresDog1 de tipo arrayList.
         */
        ArrayList<String> coloresDog1 = new ArrayList<String>();
        
        /**
         * Se asigna algunos valores a la variable coloresDog1.
         */
        coloresDog1.add("blanco");
        coloresDog1.add("negro");
        
        /**
         * Creación de objeto y se asigna los valores de los atributos de la clase Dog.
         */
          Dog dog1 = new Dog("Caicer", 5.6, 4,coloresDog1);
          
            /**
         * Se imprime el valor de las propiedades de la clase Table utilizando los metodos getName, getSize, getYear y getColors.
         */
          System.out.println("El perro 1 tiene las siguiente caracteristicas: " + "Nombre: " + dog1.getName() + ", tamaño: "+ dog1.getSize() + ", anios: " + dog1.getYear() + ", colores: "+ dog1.getColors() );
    }

}
