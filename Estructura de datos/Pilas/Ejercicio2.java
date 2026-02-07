import java.util.Stack;
import java.util.Scanner;

public class Ejercicio2 {
    /*
     * Ejercicio 2: Invertir una cadena usando una pila
     * Dada una cadena de texto ingresada por el usuario, inviértela usando una
     * pila.
     * Entrada: Hola
     * Salida: aloH
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();
        System.out.println("ingresar una cadena de texto");
        String texto = sc.nextLine();
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }
        StringBuilder invertido = new StringBuilder();
        while (!pila.isEmpty()) {
            invertido.append(pila.pop());
        }
        System.out.println("cadena invertida: " + invertido.toString());
        sc.close();

    }
}
