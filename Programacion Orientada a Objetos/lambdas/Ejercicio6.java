
import java.util.*;
/**
 * EJERCICIO 6: Contar números que cumplen una condición
 * 
 * Enunciado:
 * Usa stream() y count() para contar cuántos números son mayores a 3.
 * 
 * Concepto:
 * - count(): Terminal operation que devuelve el número de elementos
 * - Se usa con filter para contar elementos que cumplen una condición
 * - Devuelve un long
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        // Crear una lista de números

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("la lista de numeros es " + numeros);

        long CantidadMayor3 = numeros.stream()
                                     .filter(n -> n > 3 )
                                     .count();

        System.out.println("la nueva lista es " + CantidadMayor3);
    }
}
