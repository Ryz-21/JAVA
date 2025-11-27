
import java.util.*;

public class Ejercicio7 {
     public static void main(String[] args) {
        
    }
    //7. Convertir una lista de enteros a strings
    public List<String> convertir (List<Integer>lista){
        List<String> nuevalista = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            int elemento = lista.get(i);
            String nuevo = String.valueOf(elemento);
            nuevalista.add(nuevo);
        }
        return nuevalista;
    }
}
