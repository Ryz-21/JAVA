package Funciones;

import java.sql.Array;
import java.util.ArrayList;

public class Ejercicio8 {
        public static void main (String[] args){
        //Crea una función que reciba un ArrayList<String> y devuelva una nueva lista con todos 
        //los elementos en mayúsculas.
    }

    public static ArrayList <String> convertirMayusculas (ArrayList <String> lista){
        ArrayList <String> listaMayusculas = new ArrayList<>(); // instanciamos arraylist
        for (String elemento : lista) // ternario que recorre cada elemento de la lista
        {
            listaMayusculas.add(elemento.toUpperCase()); 
        }
        return listaMayusculas;
    }
}
