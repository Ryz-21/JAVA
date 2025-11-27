import java.util.ArrayList;

class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + nombre + " | S/ " + precio;
    }
}

class Tienda {
    private ArrayList<Producto> productos = new ArrayList<>();

    // Agregar un producto a la lista
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Listar todos los productos
    public void listarProductos() {
        System.out.println("=== Lista de Productos ===");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    // Buscar producto por nombre
    public void buscarPorNombre(String nombre) {
        System.out.println("\nBuscando: " + nombre);
        boolean encontrado = false;

        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Encontrado → " + p);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró el producto.");
        }
    }
}

public class Ejercicio9 {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        // Agregar 3 productos
        tienda.agregarProducto(new Producto(1, "Pan", 1.50));
        tienda.agregarProducto(new Producto(2, "Leche", 4.20));
        tienda.agregarProducto(new Producto(3, "Huevos", 6.00));

        // Listar todos
        tienda.listarProductos();

        // Buscar "Pan"
        tienda.buscarPorNombre("Pan");
    }
}
