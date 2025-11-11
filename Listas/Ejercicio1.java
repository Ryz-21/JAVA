package Listas;

<<<<<<< HEAD
import java.util.ArrayList; //traer la clase arraylist 
import java.util.List; 

public class Ejercicio1 {

    //Dada una List<Integer>, devuelve la suma de sus elementos.
     public static void main (String[] args){
    //incianilizamos la variable de Array tipo int
     List<Integer> lista = new ArrayList<>();
    //como son listas dinamicas podemos hacer esto
    lista.add(10);
    lista.add(12);
    lista.add(13);

    //creamos la variable que acomulara
    int resultado = 0;
    //ahora debemos sumar todo utilizamos size para obtener el ancho 
    for (int i = 0; i < lista.size(); i++) {
       resultado += lista.get(i); // get para obtener la lista 
    }
    System.out.println("el resultado es" + resultado);
}
=======
public class Ejercicio1 {
    
>>>>>>> fabe4c415ad2dbaa15ab2829583b7a7a7ac99792
}
