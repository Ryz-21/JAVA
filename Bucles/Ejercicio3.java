
import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args){
        //Usa un do-while para pedir números al usuario hasta que ingrese un número negativo.
        Scanner  sc = new Scanner(System.in);
        double numero;
         sc.close();
        do { 
            numero = sc.nextDouble();
        
        } while (numero >= 0);
    }
}
