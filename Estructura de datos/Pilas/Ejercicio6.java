import java.util.Stack;

public class Ejercicio6 {
/*
Ejercicio 6: Simular el botón “Deshacer” (Undo)
Simula el funcionamiento de Undo en un editor de texto usando una pila.
 */

    public static void desahcer(Stack<String> pila){
        if(!pila.isEmpty()){
            pila.pop();
        }   
    }
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        pila.push("hola");
        pila.push("mundo");
        pila.push("!");
        desahcer(pila);
        System.out.println(pila);        
    }
}
