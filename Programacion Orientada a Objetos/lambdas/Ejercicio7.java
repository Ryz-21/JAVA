

/**
 * EJERCICIO 7: Encontrar el número máximo
 * 
 * Enunciado:
 * Usa stream() y max() para encontrar el número máximo de una lista.
 * 
 * Concepto:
 * - max(): Encuentra el valor máximo según un comparador
 * - Devuelve un Optional (puede estar vacío si la lista está vacía)
 * - min(): Encuentra el valor mínimo
 * - Se usa con comparadores (Integer::compareTo, (a,b) -> Integer.compare(a,b))
 */
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ejercicio7 {
    public static void main(String[] args) {

        // Crear una lista de números

        List<Integer> numeros = Arrays.asList(5,2,9,1,7,4);
        
        System.out.println("lista original es " + numeros);
        
        // Usar stream() y max() para encontrar el número máximo
        Optional<Integer> maximo = numeros.stream()
                                          .max((a,b) -> Integer.compare(a, b));
        
        if (maximo.isPresent()) {//is present sirve para verificar si existe un valor dentro de optional
            System.out.println("Número máximo: " + maximo.get());
        }
    }
}
