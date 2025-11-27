
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {
        public static void main (String[] args){
       Scanner sc = new Scanner(System.in);

       try {
            System.out.println("ingrese un numero:");
            int numero = sc.nextInt();
            System.out.println("Numero ingresado" + numero);
       } catch (InputMismatchException e) {
            System.out.println("Error: ¡Debe ingresar un número entero, no texto!");
        }
    }
}
