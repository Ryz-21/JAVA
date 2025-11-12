package Sets;

import java.util.HashSet;

public class Ejercicio4 {
    public static void main(String[] args) {
           /* 
             Elimina un elemento del Set y muestra el resultado antes y después.
            frutas.remove("Banana");
             */

             HashSet<String> elementos = new HashSet<>();

             elementos.add("banana");
             elementos.add("manzana");

             System.out.print("la lista de numeros" + elementos);

             elementos.remove("banana");

             System.out.println("la nueva lista de numeros " + elementos);
    }
}
