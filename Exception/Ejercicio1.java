import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[] args){
         //ArithmeticException

        double resultado;
        double numero2;
        double numero;

        System.out.print("ingresar un numero");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextDouble();
        numero2 = sc.nextDouble();
        
        try {
            resultado = numero  /numero2;
            System.out.println("el resultado es " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("error por division por cero");
        } finally{
            System.out.println("todo el codigo ejecutado");
        }
    }
}