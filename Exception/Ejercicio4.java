
import java.util.Scanner;

public class Ejercicio4 {
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        //NullPointerException;
        String nulo = null;
        String resultado;

        //toUpperCase mayuscula todo
        //oLowerCase() minuscula todo 
        try {
            resultado = nulo.toUpperCase();
            System.out.println("el resultado es " + resultado);
        } catch (NullPointerException e) {
            System.out.println("Error: se intentó acceder a un objeto nulo.");
        }
    }
}
