package lambdas;

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
public class Ejercicio1 {
    public static void main(String[] args) {
        // Aquí va tu código
        int func = (int n)_-> 2*n;
    }
}
