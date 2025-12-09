import java.util.*;
public class Ejercicio2{
     public static void main(String[] args) {
        //Convertir una lista de strings a mayúsculas
    }
    public List<String> convertirMayusculas (List<String> lista){
        List<String> nueva = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            String elemento = lista.get(i);
            nueva.add(elemento.toUpperCase());
        }
        return nueva;
    }
}