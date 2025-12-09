package Sets;

import java.util.HashSet;

public class Ejercicio1{
    public static void main(String[] args) {
    /* 
        Crea un HashSet<String> con nombres de frutas. Luego, recórrelo con un bucle for-each e imprime cada elemento.
    */

      HashSet<String> frutas = new HashSet<>();

      frutas.add("platano");
      frutas.add("Manzana");
      frutas.add("pera");

      for(String f : frutas) {
        System.out.println("cada elemento es " + f);
      }
    
    

    }
}