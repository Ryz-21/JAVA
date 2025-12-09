import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio9 {
    //invertir una lista
     public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Elemento1");
        miLista.add("Elemento2");
        miLista.add("Elemento3");
        miLista.add("Elemento4");
        Collections.reverse(miLista);
        System.out.println("lal lista es" + miLista);
    }
}
