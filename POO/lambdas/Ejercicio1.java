
/**
 * EJERCICIO 1: Duplicar cada número de una lista
 * 
 * Enunciado:
 * Usa stream() y map() para duplicar cada número de una lista de enteros.
 * 
 * Concepto:
 * - stream(): Convierte una colección en un flujo de datos
 * - map(): Transforma cada elemento usando una función lambda
 * - Collectors.toList(): Recolecta los resultados en una lista
 * 
 * Estructura sugerida:
 * 1. Crear una lista de números enteros
 * 2. Usar stream() para obtener el flujo
 * 3. Aplicar map() con lambda que multiplique por 2
 * 4. Recolectar resultados con collect()
 * 5. Mostrar la lista original y la lista duplicada
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5); //declaracion de lista tipo int con metodo asList para dar los numeros 

        System.out.println("lista orginal: " + numeros);

        //usamos stream y map para duplicar cada numero
        List<Integer> duplicados = numeros.stream() //se utiliza para generar algun tipo de filtro
                                          .map(n -> n*2)  //cada numero multiplicado por dos
                                          .collect(Collectors.toList());

       System.out.println("lista duplicada:" + duplicados);
       
    }
}
