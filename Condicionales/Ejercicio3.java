package Condicionales;

import  java.util.Scanner;
//Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
//Si el segundo número es 0, debe mostrar un mensaje de error.
public class Ejercicio3 {
     public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        sc.close();

     }

     private void división (float a , float  b){
        if(b == 0){
            System.out.println("los numeros no pueden ser divididos por 0");
        } else {
            System.out.println(a/b);
        }
    }

}
