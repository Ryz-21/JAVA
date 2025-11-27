
/**
 * EJERCICIO 8: Mapear y filtrar combinado
 * 
 * Enunciado:
 * Usa stream() con map() y filter() combinados:
 * Duplica los números y luego filtra solo los mayores a 5.
 * 
 * Concepto:
 * - Se pueden encadenar múltiples operaciones intermedias
 * - El orden importa: primero duplica, luego filtra
 * - Cada operación transforma el stream anterior
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Crear una lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        System.out.println("Lista original: " + numeros);
        
        // Mapear y filtrar combinado:
        // 1. Duplica los números
        // 2. Luego filtra solo los mayores a 5
        List<Integer> resultado = numeros.stream()
                                          .map(n -> n * 2)  // Primero duplica
                                          .filter(n -> n > 5)  // Luego filtra > 5
                                          .collect(Collectors.toList());
        
        System.out.println("Números duplicados y filtrados (> 5): " + resultado);
        
        // Demostración del orden: si invertimos el orden
        List<Integer> ordenInvertido = numeros.stream()
                                               .filter(n -> n > 5)  // Primero filtra > 5
                                               .map(n -> n * 2)  // Luego duplica
                                               .collect(Collectors.toList());
        
        System.out.println("Con filtro primero (números > 5, luego duplicados): " + ordenInvertido);
    }
}