/**
 * EJERCICIO 4: Verificar si todos los números son pares
 * 
 * Enunciado:
 * Usa stream() y allMatch() para verificar si todos los números son pares.
 * 
 * Concepto:
 * - allMatch(): Devuelve true si TODOS los elementos cumplen la condición
 * - anyMatch(): Devuelve true si AL MENOS UNO cumple la condición
 * - noneMatch(): Devuelve true si NINGUNO cumple la condición
 * - Para verificar si es par: n % 2 == 0
 * 
 * Estructura sugerida:
 * 1. Crear dos listas: una con solo pares, otra mixta
 * 2. Usar stream() en la primera lista
 * 3. Aplicar allMatch() con lambda que verifique si n % 2 == 0
 * 4. Repetir para la segunda lista
 * 5. Mostrar resultados booleanos
 */
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
     public static void main(String[] args) {
        // Crear lista con solo números pares
        List<Integer> soloParos = Arrays.asList(2, 4, 6, 8, 10);
        
        // Crear lista mixta
        List<Integer> mixta = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        System.out.println("Lista solo pares: " + soloParos);
        System.out.println("Lista mixta: " + mixta);
        
        // Verificar si TODOS los números son pares
        boolean todosParesSoloParos = soloParos.stream()
                                               .allMatch(n -> n % 2 == 0);
        
        boolean todosParosMixta = mixta.stream()
                                        .allMatch(n -> n % 2 == 0);
        
        System.out.println("¿Todos los números de soloParos son pares? " + todosParesSoloParos);
        System.out.println("¿Todos los números de mixta son pares? " + todosParosMixta);
        
        // Verificar si AL MENOS UNO es par
        boolean hayAlgunoPar = mixta.stream()
                                    .anyMatch(n -> n % 2 == 0);
        System.out.println("¿Hay al menos un número par en mixta? " + hayAlgunoPar);
        
        // Verificar si NINGUNO es par
        boolean ningunoPar = mixta.stream()
                                  .noneMatch(n -> n % 2 == 0);
        System.out.println("¿Ningún número es par en mixta? " + ningunoPar);
    }
}
