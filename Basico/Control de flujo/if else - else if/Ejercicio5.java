import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args){
        //Muestra la tabla de multiplicar del número 7 (del 1 al 10) con un for.

        double resultado;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<11; i++){
            resultado = i * 7;
            System.err.println("el reulstado es " + resultado );
        }
        sc.close();
    }
}


