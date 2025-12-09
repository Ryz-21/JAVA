package LinkedHashSet;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Devuelve una List<T> que contenga los elementos comunes entre a y b, 
        // sin duplicados en el resultado.
        List<String> lista1 = Arrays.asList("");
        List<String> lista2 = Arrays.asList("");

        List<String> comunes = Intersección(lista1, lista2);
        System.out.println("Elementos comunes: " + comunes);
    }
    
    public static <T> List <T> Intersección (List<T> varaible1 , List<T> variable2){
    //declaramos la nueva lista en la que iran los nuevos resultados
    //recibe como parametro la variable1 hereda
    List<T> resultado = new ArrayList<>(varaible1);
    //retainall(Collection<?> c) esto es un metodo integrado
    //sirve para que solo contenga elementos de ambos sirve asi 
    resultado.retainAll(variable2); // le damos como segundo parametro la variable2

    // es como hash eliminada duplicados y mantiene el orden
    Set<T> SinDUplicados = new LinkedHashSet<>(resultado);

    return  new ArrayList<>(SinDUplicados);
    }
}