import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio1 {
    public static void main(String[] args) {
        // no instanciamos porque una lista T no la definimos tenemos
        // que hacer que se defina por si misma.
        // que es un hashset ? en pocas palabaras es un elemento que no permite
        // duplicados
        // LinkedHashSet mantiene el orden de insercion y tiene la eficencia de hashet
        // set de java utils solo permite unicos elementos

        // ejemplo del metodo utilizado

        List<String> lista = new ArrayList<>();
        lista.add("platano");
        lista.add("platano");
        lista.add("mandarina");

        List<String> variable = quitarDuplicados(lista);
        System.out.println("lista original : " + variable);
    }

    public static <T> List<T> quitarDuplicados(List<T> lista) {
        // El LinkedHashSet automáticamente elimina duplicados y respeta el orden.
        Set<T> setSinDuplicados = new LinkedHashSet<>(lista);

        List<T> listaSInDuplicados = new ArrayList<>(setSinDuplicados);

        return listaSInDuplicados;

    }
}
