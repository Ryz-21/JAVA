/**
 * EJERCICIO 5: Convertir strings a mayúsculas
 * 
 * Enunciado:
 * Usa stream() y map() para convertir una lista de strings a mayúsculas.
 * 
 * Concepto:
 * - map() funciona con cualquier tipo de objeto, no solo números
 * - Se puede encadenar con otros métodos (filter, forEach, etc)
 * - El método toUpperCase() convierte strings a mayúsculas
 * 
 * Estructura sugerida:
 * 1. Crear una lista de strings (palabras)
 * 2. Usar stream() para obtener el flujo
 * 3. Aplicar map() con lambda que llame a toUpperCase()
 * 4. Recolectar resultados con collect()
 * 5. Mostrar la lista original y la lista en mayúsculas
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Crear una lista de strings (palabras)
        List<String> palabras = Arrays.asList("java", "lambda", "streams", "funcional");
        
        System.out.println("Lista original: " + palabras);
        
        // Usar stream() y map() para convertir a mayúsculas
        List <String> mayusculas = palabras.stream()
                                           .map(s -> s.toUpperCase())
                                           .collect(Collectors.toList());
        
        System.out.println("Lista en mayúsculas: " + mayusculas);
    }
}
