/**
 * PREGUNTA 8: ¿Cuál es la diferencia entre parámetros y argumentos?
 * Respuesta: Los parámetros son las variables declaradas en la definición del método.
 * Los argumentos son los valores reales que se pasan cuando se llama al método.
 */

public class Ejercicio8 {

    // Método con parámetros (a y b son parámetros)
    public static void sumar(int a, int b) {
        System.out.println("Resultado: " + (a + b));
    }

    public static void main(String[] args) {

        // Llamada al método usando ARGUMENTOS (5 y 7 son argumentos)
        sumar(5, 7);

        // Otro ejemplo
        sumar(10, 20);
    }
}
