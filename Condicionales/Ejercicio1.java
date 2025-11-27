package Condicionales;
import java.util.Scanner;
// scanea cada que necesitas que algo se devuelva 
public class Ejercicio1 {

    public static void main (String[] args) {

        //definimos el objeto scanner dentro del main por que afuera no se puede 
        Scanner scanner = new Scanner(System.in);
        //Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
        System.out.println("escribe el primer numero");
        int number = scanner.nextInt();

        System.out.println("escribe el segundo numero");
        int number2 = scanner.nextInt();


        if(number == number2){
            System.err.println("los numeros son iguales");
        } else {
            System.err.println("los numeros no son iguales");
        }
        scanner.close();
}

// metodo que define si dos numeros son iguales o no
   public void definir (int a , int b){
    if (a == b){
        System.out.println("ambos numeros son iguales");
    } else {
        System.out.println("ambos numeros no son iguales");
    }

   }
}