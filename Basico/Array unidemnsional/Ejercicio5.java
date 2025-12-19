import java.util.Scanner;

public class Ejercicio5 {
/*Ejercicio 5: Buscar un número en el arreglo
Enunciado:
Leer 7 números, luego pedir al usuario un número adicional y verificar si existe o no dentro del arreglo.
 */

    public static void Busqueda (int[] arreglo, int numero){
        boolean encontrado = false;
        for(int i = 0; i<arreglo.length; i++){
            if(numero == arreglo[i]){
                encontrado = true;
                break;
            }
        }
          if (encontrado) {
            System.out.println("El número existe en el arreglo");
        } else {
            System.out.println("El número no existe en el arreglo");
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese número: ");
            arreglo[i] = sc.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        int numero = sc.nextInt();

        Busqueda(arreglo, numero);
        sc.close();
    
    }
}
