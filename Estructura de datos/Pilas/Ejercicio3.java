import java.util.Stack;

public class Ejercicio3 {
  /*
   * Evaluar una expresión matemática simple
   * Usa una pila para evaluar una expresión postfija (notación polaca inversa).
   * Ejemplo
   * Expresión: 5 3 +
   * Resultado: 8
   * Otro ejemplo:
   */

  public static void evaluarExpresion(String epresion) {
    Stack<Integer> pila = new Stack<>();
    String[] tokems = epresion.split(" ");
    for (String token : tokems) {
      if (token.matches("\\d+")) {
        pila.push(Integer.parseInt(token));
      } else {
        int num2 = pila.pop(); // pop es para sacar el ultimo elemento de la pila
        int num1 = pila.pop();
        int resultado = 0;
        switch (token) {
          case "+":
            resultado = num1 + num2;
            break;
          case "-":
            resultado = num1 - num2;
            break;
          case "*":
            resultado = num1 * num2;
            break;
          case "/":
            resultado = num1 / num2;
            break;
        }
        pila.push(resultado);
      }
    }
    System.out.println("resultado: " + pila.pop());
  }

  public static void main(String[] args) {
    evaluarExpresion("5 3 +");
  }
}
