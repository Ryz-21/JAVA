/**
 * EJERCICIO 2: Filtrar números mayores a 5
 * 
 * Enunciado:
 * Usa stream() y filter() para obtener solo los números mayores a 5.
 * 
 * Concepto:
 * - filter(): Selecciona elementos que cumplen una condición (predicado)
 * - La lambda devuelve true/false para determinar si incluir el elemento
 * - Solo los elementos que devuelven true pasan al siguiente paso
 * 
 * Estructura sugerida:
 * 1. Crear una lista de números enteros
 * 2. Usar stream() para obtener el flujo
 * 3. Aplicar filter() con lambda que verifique si n > 5
 * 4. Recolectar resultados con collect()
 * 5. Mostrar la lista original y la lista filtrada
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
     public static void main(String[] args) {
        // Crear una lista de números enteros
        List<Integer> numeros = Arrays.asList(2,4,7,8,9,6);        
        System.out.println("Lista original: " + numeros);
        
        // Usar stream() y filter() para obtener números mayores a 5
       List<Integer> mayoresA5 = numeros.stream()
                                        .filter(n -> n > 5)
                                        .collect(Collectors.toList());
        
        System.out.println("Números mayores a 5: " + mayoresA5);
    }
}