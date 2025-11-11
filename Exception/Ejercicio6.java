import java.util.Scanner;

public class Ejercicio6 {
        public static void main (String[] args){
           Scanner sc = new Scanner(System.in);

        try {
            // --- 1 Número entero ---
            System.out.print("Ingresa un número entero: ");
            int numero = Integer.parseInt(sc.nextLine()); // puede causar NumberFormatException

            // --- 2 División ---
            System.out.print("Ingresa un divisor: ");
            int divisor = sc.nextInt(); // puede causar InputMismatchException
            int resultado = numero / divisor; // puede causar ArithmeticException

            // --- 3 Arreglo ---
            int[] arreglo = {10, 20, 30};
            System.out.print("Elige una posición (0-2): ");
            int posicion = sc.nextInt();
            System.out.println("Elemento: " + arreglo[posicion]); // puede causar ArrayIndexOutOfBoundsException

            System.out.println("\n Todo salió bien. Resultado de la división: " + resultado);

        } 
        catch (NumberFormatException e) {
            System.out.println(" Error: Debes ingresar un número válido.");
        } 
        catch (ArithmeticException e) {
            System.out.println(" Error: No se puede dividir entre cero.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Error: El índice está fuera del rango del arreglo.");
        } 
        catch (Exception e) {
            System.out.println(" Error inesperado: " + e.getMessage());
        } 
        finally {
            sc.close();
            System.out.println("\nPrograma finalizado.");
        }
    }
}

