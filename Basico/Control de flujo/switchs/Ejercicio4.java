/*Vocal o consonante
Pide una letra y determina si es:
Vocal
Consonante */

import java.util.Scanner;

public class Ejercicio4 {

    public static void Consonaste (String a){
        switch(a){
            case "a":
                System.out.println("vocal");
                break;
            case "e":
                System.out.println("vocal");
                break;
            case "i":
                System.out.println("vocal");
                break;
            case "o":
                System.out.println("vocal");
                break;
            case "u":
                System.out.println("vocal");
                break;
            default:
                System.out.println("consonantes");
                break;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar vocal");
        String vocal = sc.nextLine();

        Consonaste(vocal);
        sc.close();
    }
}
