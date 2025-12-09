package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio5 {
    public static void main(String[] args) {
           /* 
             Dado dos conjuntos de enteros (A y B), crea un nuevo conjunto que contenga 
             solo los elementos comunes (intersección).

             Set<Integer> interseccion = new HashSet<>(A);
             interseccion.retainAll(B);
            */

            //ejemplo de uso

            List<String> plantas = new ArrayList<>();
            plantas.add("lirios");
            plantas.add("girasoles");
            
            List<String> plantasf = new ArrayList<>();
            plantasf.add("rosas");
            plantasf.add("lirios");
            plantasf.add("girasoles");

            List<String> resultado = intereseccion(plantas, plantasf);

            System.out.println("la interseccion de las listas es : " + resultado);
    }

    public static <T> List <T> intereseccion (List<T> a ,List<T> b ){
      Set<T> newlist = new HashSet<>(a);
      //retainall solo trae elementos comunes de ambas listas
      newlist.retainAll(b);
      //devolvemos la nueva lista
      return new ArrayList<>(newlist);
    }
}

