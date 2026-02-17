import java.util.LinkedList;
import java.util.Queue;

class Cliente {
    String nombre;
    int turno;

    public Cliente(String nombre, int turno){
        this.nombre = nombre;
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Cliente " + nombre + " su turno es el " + turno;
    }
}

public class Ejercicio2 {
     public static void main (String[] args){
        
        Cliente cliente1 = new Cliente("Juan", 1);
        Cliente cliente2 = new Cliente("Maria", 2);
        Cliente cliente3 = new Cliente("Juan", 3);
        Cliente cliente4 = new Cliente("Maria", 4);
        Cliente cliente5 = new Cliente("Maria", 5);
        
        Queue<Cliente> colaClientes = new LinkedList<>();
        colaClientes.add(cliente1);
        colaClientes.add(cliente2);
        colaClientes.add(cliente3);
        colaClientes.add(cliente4);
        colaClientes.add(cliente5);

        System.out.println("Clientes en la cola:");
        for (Cliente cliente : colaClientes) {
            System.out.println(cliente);
        }


    }
}
