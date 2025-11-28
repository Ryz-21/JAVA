public class Ejercicio2 {
/*
 * PREGUNTA 2: ¿Qué es la sobrecarga de métodos (Method Overloading)?

 * Respuesta: Es la capacidad de tener múltiples métodos con el mismo nombre pero con diferentes
 * parámetros (diferente número, tipo o orden). El compilador distingue cuál usar según los
 * argumentos pasados.
 *  */

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();

        System.out.println(calc.suma(5, 10));          // usa sumar(int, int)
        System.out.println(calc.suma(2, 3, 4));        // usa sumar(int, int, int)
        System.out.println(calc.suma(4.5, 6.2));  
    }
}
