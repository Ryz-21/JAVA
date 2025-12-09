package ArrayList;

import java.util.ArrayList;
import  java.util.List;

public class Ejercicio2 {
    //Devuelve cuántos números pares hay en una List<Integer>.
    public static void main(String[] args) {
        //declaramos la variable ArrayList en este caso Integer
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        int cantidadPares = ContarPares(lista);

        System.out.println("el contador es " + cantidadPares);
    }

     // la declaraciond de variable para metodos es List<tipo>
    public static int ContarPares (List<Integer> variable){
        int contador = 0;
        for (int i = 0; i < variable.size(); i++) {
            int numeroactual = variable.get(i);

              if (numeroactual % 2 == 0){
                contador++;
              }
            }
            return  contador;
        }
    }

