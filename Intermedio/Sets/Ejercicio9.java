import java.util.List;
import  java.util.Set;
import java.util.Arrays;
import  java.util.HashSet;

public class Ejercicio9 {
    public static void main(String[] args) {
            List<Integer> lista = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
            Set<Integer> sinDuplicados = new HashSet<>(lista);
            System.out.println(sinDuplicados);
    }
}
