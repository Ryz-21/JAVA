package Type;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        char letra;

        System.out.println("ingresar solo una letra");
        letra = sc.next().charAt(0);

        int ValorAscii = (int) letra;
        System.out.println("el codigo ASCII de la " + letra + " es " + ValorAscii);

        sc.close();
    }
}
