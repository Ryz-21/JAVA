import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * EJERCICIO 1: CONTAR FRECUENCIA DE PALABRAS
 * 
 * PREGUNTA: Crea un programa que lea una frase y cuente cuántas veces aparece 
 * cada palabra. Usa un HashMap para almacenar las palabras como clave y la 
 * frecuencia como valor.
 * 
 * PISTA: Convierte la frase a minúsculas, divídela por espacios y utiliza 
 * get() y put() para actualizar el contador de cada palabra.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa una frase ");
        String frase = sc.nextLine();
        sc.close();

        //Lo que hace es generar una nuena variable  quitando todo los elemtnos que no hacen pertenencia 
        String fraseLimpia = frase.toLowerCase().replaceAll("[^a-z0-9\\s]", " ");

        //divimos la clase en un arreglo con split osea a partir de cada parte de alli se genera otra parte 
        String[] palabras = fraseLimpia.split("\\s+");
        
        // Almacenaremos la palabra (String) y su frecuencia (Integer)
        Map<String, Integer> frecuenciaPalabras = new HashMap<>(); //asi sabemos cuantas veces se repite 

        for (String palabra : palabras) {
            // Asegurarse de que la palabra no esté vacía (puede pasar después de split)
            if (!palabra.isEmpty()) { 
                // Obtener la frecuencia actual de la palabra. Si no existe, devuelve 0.
                Integer cuentaActual = frecuenciaPalabras.getOrDefault(palabra, 0);
                
                // Incrementar la cuenta y actualizar el HashMap
                frecuenciaPalabras.put(palabra, cuentaActual + 1);
            }
        }
        System.out.println("\n--- Frecuencia de Palabras ---");
        
        // Iterar sobre las entradas del mapa para imprimir clave y valor
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            System.out.println("'" + entrada.getKey() + "': " + entrada.getValue());
        }
        
        System.out.println("-----------------------------");


    }
}