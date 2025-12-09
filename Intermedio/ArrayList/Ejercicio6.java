package ArrayList;

import java.util.List;
import javax.swing.text.Position;

public class Ejercicio6 {
    public static void main(String[] args) {
        
    }
    public static void moverceros (List<Integer> lista){
        int posision = 0;

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) !=0){
                lista.set(posision, lista.get(i));
                posision++;
            }
        }

        while(posision < lista.size()){
            lista.set(posision, 0);
            posision++;
        }
    }
}
