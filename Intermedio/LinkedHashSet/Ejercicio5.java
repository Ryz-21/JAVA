import java.util.*;

public class Ejercicio5 {

    // set no permite duplicados
    // HashSet no mantiene el orden de insercion
    // LinkedHashSet mantiene el orden de insercion
    // TreeSet ordena los elementos

    /*
     * Ejercicio 5: Historial sin duplicados
     * Objetivo:
     * Simular un historial de páginas visitadas donde:
     * No se repiten URLs
     * Se mantiene el orden de visita
     */

    public static <T> List<T> quitarDuplicados(List<T> lista) {
        // El LinkedHashSet automáticamente elimina duplicados y respeta el orden.
        Set<T> setSinDuplicados = new LinkedHashSet<>(lista);
        List<T> listaSInDuplicados = new ArrayList<>(setSinDuplicados);
        return listaSInDuplicados;

    }

    public static void main(String[] args) {
        // lista de paginas visitadas

        List<String> paginas = Arrays.asList(
                "www.google.com",
                "www.facebook.com",
                "www.google.com",
                "www.youtube.com",
                "www.facebook.com",
                "www.instagram.com");
        List<String> variable = quitarDuplicados(paginas);
        System.out.println("lista original : " + paginas);
        System.out.println("lista sin duplicados : " + variable);
    }
}
