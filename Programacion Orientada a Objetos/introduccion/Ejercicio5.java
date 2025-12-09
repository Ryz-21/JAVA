class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double  precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public String toString(){
        return  "Producto" + nombre + "Precio " + precio;
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Producto[] arrayProductos = new Producto[5];
        arrayProductos[0] = new Producto("Laptop", 999.99);
        for (Producto p : arrayProductos) {
            System.out.println(p.toString());
        }
    }
}
