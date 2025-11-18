import java.util.*;
public class Ejercicio8 {
     public static void main(String[] args) {
        
    }
    //Quitar duplicados de una lista
    public <T>List<T> quitarDuplicados (List<T> lista){
        Set<T> elementosunicos = new HashSet<>(lista);
        return new ArrayList<>(elementosunicos);   
    }
}
