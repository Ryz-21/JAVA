import java.util.*;
public class Ejercicio4 {
     public static void main(String[] args) {
        
    }
    //Obtener la longitud de cada palabra de una lista 
    public List<Integer> obtenerlongitud (List<String> lista){
        List<Integer> nueva = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            String elemento = lista.get(i);
            nueva.add(elemento.length());
        }
        return nueva;
    }
}
