import java.util.Scanner;

public class Ejercicio2 {

    /*Ejercicio 2: Sumar los elementos del arreglo

Enunciado:
Ingresar 10 números enteros en un arreglo y calcular la suma total de sus elementos.
 */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[10];
    int total = 0;
    for(int i = 0; i<10; i++){
        System.out.println("ingresa un numero");
        numeros[i] = sc.nextInt();
    }
    for(int i = 0; i<numeros.length; i++){
        total += i; 
    }
    System.out.println("el total es " + total);
    sc.close();
  }
}
