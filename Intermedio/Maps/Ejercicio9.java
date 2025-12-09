
/**
 * EJERCICIO 9: ANAGRAMA FINDER
 * 
 * PREGUNTA: Crea un programa que encuentre todos los anagramas de una palabra 
 * dada en una lista. Un anagrama es una palabra formada por las mismas letras 
 * en diferente orden. Usa un HashMap para agrupar palabras que son anagramas 
 * entre sí.
 * 
 * PISTA: Ordena las letras de cada palabra alfabéticamente para usarla como 
 * clave en el HashMap. Palabras con las mismas letras ordenadas serán 
 * anagramas. Usa HashMap<String, ArrayList<String>> donde la clave es la 
 * palabra ordenada y el valor es la lista de anagramas encontrados.
 */
import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {

        // Lista de palabras donde buscaremos anagramas
        List<String> palabras = Arrays.asList("roma", "amor", "mora", "carro", "arco", "roca");

        // HashMap donde:
        //  - clave  = palabra ordenada alfabéticamente (ej: "amor" -> "amor", "roma" -> "amor")
        //  - valor  = lista de palabras que comparten esas mismas letras (anagramas)
        HashMap<String, ArrayList<String>> grupos = new HashMap<>();

        // Recorremos cada palabra de la lista
        for (String palabra : palabras) {

            // Convertimos la palabra en un arreglo de caracteres para poder ordenarlos
            char[] letras = palabra.toCharArray();

            // Ordenamos las letras: así "roma", "amor" y "mora" se convierten en "amor"
            Arrays.sort(letras);

            // Convertimos el arreglo ordenado de nuevo a String (esta será la clave)
            String clave = new String(letras);

            // Si la clave aún no existe en el mapa, creamos una lista vacía
            grupos.putIfAbsent(clave, new ArrayList<>());

            // Agregamos la palabra original al grupo correcto
            grupos.get(clave).add(palabra);
        }

        // Imprimimos todos los grupos de anagramas
        System.out.println(grupos);
    }
}
