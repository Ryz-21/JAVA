import java.util.*;
public class Ejercicio5 {
     public static void main(String[] args) {
        
    }
    //5. Filtrar palabras que comienzan con una letra
    public List<String> FiltrarLetra(List<String> lista, String letra) {
        List<String> resultado = new ArrayList<>();
        if (lista == null || letra == null || letra.isEmpty()) {
            return resultado;
        } else {
            String p = letra.toLowerCase();
            for (String s : lista) {
                if (s == null) continue;
                if (s.toLowerCase().startsWith(p)) {
                    resultado.add(s);
                }
            }
        }
        return resultado;
    }
}
