import java.util.*;
/**
 * EJERCICIO 6: CONTADOR DE CARACTERES
 * 
 * PREGUNTA: Crea un programa que lea una palabra o frase y cuente cuántas 
 * veces aparece cada carácter (incluyendo espacios). Muestra los resultados 
 * ordenados por frecuencia.
 * 
 * PISTA: Usa HashMap<Character, Integer> para almacenar cada carácter y su 
 * frecuencia. Recorre la cadena carácter por carácter usando charAt() o 
 * toCharArray(). Para ordenar por frecuencia, puedes usar un TreeMap o 
 * convertir a una lista y ordenarla con Comparator.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String frase = "esto es una frase de prueba con espacios";
        Contaryordenar(frase);
    }

    public static void Contaryordenar (String texto){
        //creamos un HasMap para almacenar la frecuencia
        Map<Character, Integer> frecuenciaCaractares = new HashMap<>();

        //recorremos la cadena y contamos los caracteres
        //toCharArray() convierte una cadena string en una matriz array
        for (char caracter : texto.toCharArray()) {
            frecuenciaCaractares.put(caracter, frecuenciaCaractares.getOrDefault(caracter, 0) + 1);
        }//Convertir el hashMap a una lista de entrada para poder ordenar 
        List<Map.Entry<Character, Integer>> listaDeFrecuencia = new ArrayList<>(frecuenciaCaractares.entrySet());
        Collections.sort(listaDeFrecuencia, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                // Ordena en orden descendente de frecuencia
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println("Frecuencia de caracteres (ordenado por frecuencia):");
        for (Map.Entry<Character, Integer> entrada : listaDeFrecuencia) {
            System.out.println("'" + entrada.getKey() + "': " + entrada.getValue());
        }
    }
}
