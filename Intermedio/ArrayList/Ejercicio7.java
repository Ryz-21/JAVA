package ArrayList;

import java.util.List;

public class Ejercicio7 {
    
    public static void main (String[] args){
        
    }

     
    public static int maxSubarray(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0;

        int maxActual = lista.get(0);
        int maxGlobal = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            int num = lista.get(i);

            // Elegimos: continuar la suma actual o empezar una nueva desde num
            maxActual = Math.max(num, maxActual + num);

            // Actualizamos el máximo global si encontramos una suma mayor
            if (maxActual > maxGlobal) {
                maxGlobal = maxActual;
            }
        }

        return maxGlobal;
    }
}
