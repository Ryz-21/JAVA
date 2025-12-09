
import java.util.Scanner;

public class Ejercicio3 {
        public static void main (String[] args){
        //NumberFormatException:
          String cadena;
          int resultado;

          Scanner sc = new Scanner(System.in);

          try {
            System.out.println("ingresar que quieres en la cadena");
                cadena = sc.nextLine();
                resultado = Integer.parseInt(cadena);

                System.out.println("el numero ingresado es " + resultado);

          } catch (NumberFormatException e) {
            System.out.println("no se puede hacer este proceso");
            System.out.println("el error es " + e.getMessage());
          }
        }
}
