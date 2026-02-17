import java.util.Stack;

public class Ejercicio5 {
/*
Ejercicio 5: Ordenar una pila
Dada una pila de números desordenados, ordénala de menor a mayor usando solo pilas, sin usar arreglos ni listas.
*/

public static void ordenarPila (Stack<Integer> pila){
    Stack<Integer> pil4 = new Stack<>();
    while (!pila.isEmpty()){
        int temp = pila.pop();
        while (!pil4.isEmpty() && pil4.peek() > temp){
            pila.push(pil4.pop());
        }
        pil4.push(temp);
    } 
}
    public static void main(String[] args) {
     Stack<Integer> pila = new Stack<>();
     pila.push(5);
     pila.push(2);
     pila.push(8);
     pila.push(1);
     pila.push(9);

     ordenarPila(pila);
     System.out.println(pila);   
    }
}
