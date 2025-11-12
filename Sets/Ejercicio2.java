package Sets;

import java.util.HashSet;

public class Ejercicio2 {
    public static void main(String[] args) {
            /* 
             Crea un HashSet<Integer> y agrega números del 1 al 5, 
             pero intenta añadir algunos repetidos. Imprime el conjunto para comprobar que los duplicados se eliminan.
            */

            HashSet<Integer> numeros = new HashSet<>();

            numeros.add(1);
            numeros.add(2);
            numeros.add(1);

            for (Object i : numeros) {
                System.out.println("la lista de numeros" + i);
            }
    }
}
