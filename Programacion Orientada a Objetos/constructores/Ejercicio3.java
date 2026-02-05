/*
Clase Producto:
Constructor sin parámetros
Constructor con nombre y precio
 */

class Producto {
    String nombre;
    double precio;

    Producto() {
        nombre = "sin nombre";
        precio = 0;
    }

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "el nombre es " + nombre + " y el precio es " + precio;
    }
}

public class Ejercicio3 {
    public static void main(String args[]) {
        Producto p1 = new Producto();
        System.out.println(p1.toString());
        Producto p2 = new Producto("manzana", 1.5);
        System.out.println(p2.toString());
    }
}
