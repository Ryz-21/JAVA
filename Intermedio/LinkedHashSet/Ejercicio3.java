import java.util.*;

public class Ejercicio3 {

    //Agregar una lista de números (con repetidos) a un LinkedHashSet y mostrar el resultado.

    public static <T> List <T> sinDuplicados (List<T> variable1){
      Set<T> sinDuplicados = new LinkedHashSet<>(variable1);
      return new ArrayList<>(sinDuplicados);
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,2,3,10);
        List<Integer> resultado = sinDuplicados(numeros);

        System.out.println("Lista original: " + numeros);
        System.out.println("Lista sin duplicados: " + resultado);
    }
}