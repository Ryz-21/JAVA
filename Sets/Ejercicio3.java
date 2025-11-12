package Sets;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
           /* 
             Pide al usuario que ingrese un nombre y 
             verifica si está en un HashSet<String>.

             if (frutas.contains("Manzana")) {
             ystem.out.println("Sí está en el conjunto.");
             }
            */

            HashSet<String> nombres = new HashSet<>();

            nombres.add("maria");
            nombres.add("manuel");
            nombres.add("Ines");


            Scanner sc = new Scanner(System.in);

            System.out.print("escribi un nombre");
            String nombre = sc.nextLine();
            if (nombres.contains(nombre)){
                System.err.println("si esta en la lista");
            } else {
                System.out.println("no esta en la lista");
            }
    }
}
