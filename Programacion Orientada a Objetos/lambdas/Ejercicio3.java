/**
 * EJERCICIO 3: Sumar todos los números de una lista
 * 
 * Enunciado:
 * Usa stream() y reduce() para sumar todos los números de una lista.
 * 
 * Concepto:
 * - reduce(): Combina todos los elementos en un único valor
 * - Toma un valor inicial (identidad para la operación)
 * - Aplica una función binaria para combinar pares de elementos
 * - Devuelve un Optional que puede estar vacío
 * 
 * Estructura sugerida:
 * 1. Crear una lista de números enteros
 * 2. Usar stream() para obtener el flujo
 * 3. Aplicar reduce() con valor inicial 0
 * 4. La lambda acumula: (a, b) -> a + b
 * 5. Mostrar la lista original y la suma total
 */
import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
     public static void main(String[] args) {
        // Crear una lista de números enteros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("Lista original: " + numeros);
        
        // Usar stream() y reduce() para sumar todos los números
        int suma = numeros.stream()
                          .reduce(0, (a, b) -> a + b);
        
        System.out.println("Suma total: " + suma);
    }
}
