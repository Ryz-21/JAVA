package Sets;
import java.util.ArrayList;
import java.util.HashSet;
import  java.util.List;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
           /* 
             Une dos conjuntos (A y B) en uno solo sin duplicados.
             Set<Integer> union = new HashSet<>(A);
             union.addAll(B);
            */

            List<String> plantas = new ArrayList<>();
            plantas.add("rosas");
            plantas.add("lirios");

            List<String> plantas1 = new ArrayList<>();
            plantas.add("margaritas");
            plantas.add("tulipanes");
            plantas.add("rosas");

            List<String> lista = unionlistas(plantas, plantas1);

            System.out.println("la lista unida es " + lista);
    }

    public static <T> List <T> unionlistas (List<T> a, List<T> b){
      Set<T> newList= new HashSet<>(a);
      //addAll une todo
      newList.addAll(b);
      return  new ArrayList<>(newList);
    }
}
