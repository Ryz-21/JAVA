
import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String[] args){
        //Pide un número al usuario 
        //y calcula su factorial usando un bucle for.
        Scanner sc = new Scanner(System.in);
        System.err.println("ingresar el numero para sacar su factorial");
        int numero = sc.nextInt();
        
        long factorial = 1;
        for (int i = 0; i <= numero; i++) {
            factorial *=1; //multiplicara el numero por cada indice hasta recorrerlo
        }

        System.out.println("" + factorial);
    }
}
