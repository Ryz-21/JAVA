package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
          List<String> lista = Arrays.asList("uno", "dos", "tres", "cuatro", "sol", "mar");
        Map<Integer, List<String>> resultado = agruparPorLongitud(lista);
        
        System.out.println(resultado);
    }
    public static Map<Integer, List<String>> agruparPorLongitud(List<String> palabras) {
        // Creamos un mapa donde la clave será la longitud, y el valor una lista de palabras
        Map<Integer, List<String>> mapa = new HashMap<>();

        for (String palabra : palabras) {
            int longitud = palabra.length(); // obtenemos la longitud

            // Si la clave no existe, se crea una nueva lista automáticamente
            mapa.computeIfAbsent(longitud, k -> new ArrayList<>()).add(palabra);
        }

        return mapa;
    }
}
