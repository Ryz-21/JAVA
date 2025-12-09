import java.util.ArrayList;
import java.util.HashSet;
import  java.util.List;
import java.util.Set;
public class Ejercicio7{
    public static void main(String[] args) {
           /* 
             Crea un conjunto que contenga los elementos 
             que están en A pero no en B.

            */
    }

    public static <T> List <T> remover (List<T> a , List<T> b){
      Set<T> diferencia= new HashSet<>(a);
      diferencia.removeAll(b);
      return new ArrayList<>(diferencia);
    }
}