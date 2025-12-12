import java.util.*;

public class Ejercicio1 {
 
    public static void getnumero (){
       int numero;
       Scanner sc = new Scanner(System.in);
        do {
            System.out.println("ingresar numero");
             numero = sc.nextInt();
        } while (numero >= 0);
        sc.close();
    }
    public static void main(String[] args) {
        //Pedir un número al usuario y repetir la petición mientras sea negativo.
        // Al final, mostrar el número positivo ingresado.
        getnumero();
    }
}