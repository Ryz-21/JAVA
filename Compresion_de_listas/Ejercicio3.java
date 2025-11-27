
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
     public static void main(String[] args) {
        
    }
    //Filtrar solo los números pares
    public List<Integer> numerosPares(List<Integer> lista){
        List<Integer> nuevalista = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            int elemento =lista.get(i);
            if (elemento % 2 == 0){
                nuevalista.add(elemento);
            }
        }
        return nuevalista;
    }
}
