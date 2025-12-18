/*Ejercicio 1: Leer y mostrar un arreglo

Enunciado:
Crear un programa que lea 5 números enteros, los guarde en un arreglo y luego los muestre en pantalla.

Pista: usa for y Scanner.
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] numeros = new int[5];
       for(int i = 0; i<5; i++){
        System.out.println("ingrese el numero");
        numeros[i] = sc.nextInt();
       }
       for(int i = 0; i<5; i++){
        System.out.println(numeros[i]);
       }
       sc.close();
    }
}