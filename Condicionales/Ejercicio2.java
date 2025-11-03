package Condicionales;

import java.util.Scanner;

public class Ejercicio2 {
    //Realiza un programa que pida un número por teclado y nos indique si es par o impar.
    public static void main (String[] args){

        //definimos Scanner
        Scanner sc = new Scanner(System.in);

        System.err.println("ingresar el numero que vamos a deifinir si es par o inpar");
        float number1 = sc.nextFloat();

        if (number1 % 2 == 0 ){
            System.out.print("el numero es par");
        } else {
            System.out.print("el numero es impar");
        }

        sc.close();
    }

    private static void definirpar(float a) {
        if (a % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
