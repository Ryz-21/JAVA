import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio1 {

    public static void main (String[] args){

        //Crear una cola, insertar 5 números y luego mostrarlos en orden de salida (FIFO).
        Queue<Integer> colaEjemplo = new LinkedList<>();
        colaEjemplo.add(10);
        colaEjemplo.add(20);
        colaEjemplo.add(30);
        colaEjemplo.add(20);
        colaEjemplo.add(30);

        System.out.print("elementos en la cola: " + colaEjemplo);

    }
}