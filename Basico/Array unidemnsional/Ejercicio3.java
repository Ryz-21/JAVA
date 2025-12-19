import java.util.Scanner;

public class Ejercicio3 {
/*Ejercicio 3: Encontrar el mayor y el menor
Enunciado:
Leer 8 números y mostrar cuál es el mayor y cuál es el menor del arreglo.
 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] numeros = new int[8];
    
    for(int i = 0; i<8; i++){
        numeros[i] = sc.nextInt();
    }

    int Maximo = numeros[0];
    int Minimo =  numeros[0];

    for(int i = 0; i<numeros.length; i++){
        if (numeros[i] > Maximo){
            Maximo = numeros[i];
        }
        if(numeros[i]< Minimo){
            Minimo = numeros[i];
        }
    }

    System.out.println("el maximo es " + Maximo);
    System.out.println("el minimo es " + Minimo);
    
    sc.close();
  }
}
