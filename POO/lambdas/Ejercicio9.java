
/**
 * EJERCICIO 9: Procesar con forEach
 * 
 * Enunciado:
 * Usa stream() y forEach() para procesar cada elemento sin recolectar resultados.
 * 
 * Concepto:
 * - forEach(): Terminal operation que itera sobre cada elemento
 * - Se usa para efectos secundarios (imprimir, guardar, etc)
 * - No devuelve un valor ni un nuevo stream
 * - Útil cuando solo queremos procesar sin transformar
 */
import java.util.Arrays;
import java.util.List;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Crear una lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        System.out.println("Lista original: " + numeros);
        System.out.println("\nProcesando con forEach():");
        
        // Usar stream() y forEach() para procesar cada elemento
        numeros.stream()
               .forEach(n -> System.out.println("  Número: " + n + ", Cuadrado: " + (n * n)));
        
        // Procesar con condición
        System.out.println("\nNúmeros pares:");
        numeros.stream()
               .filter(n -> n % 2 == 0)
               .forEach(n -> System.out.println("  - " + n));
        
        // Procesar strings
        List<String> palabras = Arrays.asList("Java", "Lambda", "Streams");
        System.out.println("\nPalabras en mayúsculas:");
        palabras.stream()
                .map(String::toUpperCase)
                .forEach(p -> System.out.println("  * " + p));
    } 
}


