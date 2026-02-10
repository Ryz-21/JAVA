import java.util.Stack;

public class Ejercicio4 {

    // Crea un programa que determine si una expresión tiene los paréntesis
    // correctamente balanceados.
    public static void determinarexpresion(String expresion) {
        Stack<Character> pila = new Stack<>();

        // ToCharArray() convierte la expresion en un array de caracteres
        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c); // push es para agregar un elemento a la pila
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    System.out.println("Expresion no balanceada");
                    return;
                }
                char top = pila.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    System.out.println("Expresion no balanceada");
                    return;
                }
            }
        }

    }

    public static void main(String[] args) {
        determinarexpresion("()[]{}");
    }
}
