import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Ejercicio3 {

    //Verificar si una palabra es palíndromo usando cola y stack.

    public static boolean esPalindromo (String palabra ){
        Queue<Character> cola = new LinkedList<>();
        Stack<Character> pila = new Stack<>();
        
        //CharArray toCharArray() en Java es una función de la clase String que convierte una cadena de texto en un nuevo array de caracteres (char[])
        for(char letra : palabra.toCharArray()){
            cola.add(letra);
            pila.push(letra);
        }

        while (!cola.isEmpty()){
            //El método poll() en Java, perteneciente a la interfaz Queue (cola), se utiliza para recuperar y eliminar el elemento de la cabecera (el primero) de la cola
            if (cola.poll() != pila.pop()){
                return false;
            }
        }
        return true;
    }
     public static void main (String[] args){
        String palabra1 = "hola";
        String palabra2 = "somos";
        System.out.println("¿Es " + palabra1 + " un palíndromo? " + esPalindromo(palabra1));
        System.out.println("¿Es " + palabra2 + " un palíndromo? " + esPalindromo(palabra2));
    }
}
