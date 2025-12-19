import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        for(int i = 0; i<10; i++){
            System.out.println("ingresar numeros");
            numeros[i] = sc.nextInt();
        }
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] % 2 == 0){
                pares++;
                System.out.println("es par");                
            } else {
                impares++;
                System.out.println("es impar");
            }
        }
        System.out.println("cantidad de pares " + pares);
                System.out.println("cantidad de pares " + impares);
        sc.close();
    }
}
/*Ejercicio 4: Contar números pares e impares

Enunciado:
Ingresar 10 números en un arreglo y mostrar cuántos son pares y cuántos impares.

Pista:
Un número es par si num % 2 == 0.
 */