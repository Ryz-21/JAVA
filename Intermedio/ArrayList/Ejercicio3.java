package ArrayList;

import java.util.*;

public abstract class Ejercicio3 {
    public static void main(String[] args) {
       

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int kIzquierda = 2; // Número de posiciones a rotar a la izquierda

        System.out.println("Lista original: " + numeros);
        List<Integer> listaRotadaIzquierda = rotarLista(numeros, kIzquierda);
        System.out.println("Lista rotada " + kIzquierda + " posiciones a la izquierda: " + listaRotadaIzquierda);
        //Rota los elementos de la lista hacia la derecha k posiciones 
    }

    public static <T> List <T> rotarLista (List<T> variable , int K){
                //declaramos la nueva lista
        List<T> resultado = new ArrayList<>(variable);

        if(resultado.isEmpty()){
            return  resultado;
        }
        
        //el parametro en postivo k rotara a la derecha pero si quiero rotar izquierda -k
        //Collections.rotate() sirve para realizar una rotacion circular
        Collections.rotate((resultado), K);

        return  resultado;
    }     
}
