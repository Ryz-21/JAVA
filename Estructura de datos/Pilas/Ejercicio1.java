import java.util.Stack;
import java.util.Scanner;

public class Ejercicio1 {

    // Crea una pila de números enteros con las siguientes operaciones:

    /*
     * Crea una pila de números enteros con las siguientes operaciones:
     * Insertar un elemento (push)
     * Eliminar el elemento superior (pop)
     * Mostrar el elemento superior (peek)
     * Verificar si la pila está vacía
     */

    public static void opciones(int opcion, Stack<Integer> objeto1) {
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("ingresar un numero");
                int numero = sc.nextInt();
                objeto1.push(numero);
                break;
            case 2:
                System.out.println("eliminar el elemento superior");
                objeto1.pop();
                break;
            case 3:
                System.out.println("mostrar el elemento superior");
                System.out.println(objeto1.peek());
                break;
            case 4:
                System.out.println("verificar si la pila esta vacia");
                System.out.println(objeto1.isEmpty());
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {

        Stack<Integer> objeto1 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar una operacion de ( 1 al 4)");
        int opcion = sc.nextInt();

        opciones(opcion, objeto1);
    }
}