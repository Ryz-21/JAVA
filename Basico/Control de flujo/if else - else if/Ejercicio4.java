
import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        double resultado;
        double nota;
        for(int i = 0; i<5; i++){
            System.err.println("ingresar nota");
            nota = sc.nextDouble();
            resultado = nota + i;
            System.err.println("el resultado es:" + resultado);
        }
        sc.close();
    }
}
