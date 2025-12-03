import java.util.ArrayList;
import java.util.List;

// EJERCICIO 3: Clase Producto de tienda
//
// Objetivo: Encapsular los datos de un producto con atributos
// código, nombre, precio y stock
//
// Requisitos:
// - Todos los atributos deben ser privados
// - El código del producto no puede cambiar una vez creado (inmutable)
// - El precio solo puede modificarse mediante un método especial
// - El método para cambiar precio debe registrar el cambio (guardar precio anterior)
// - El stock puede aumentar (reabastecimiento) o disminuir (venta)
// - Crear método vender(cantidad) que validate stock disponible
// - Crear método reabastecer(cantidad)
// - Crear método obtenerHistorialPrecios() que devuelva los precios anteriores
//
// TODO: Implementar la clase Producto
// TODO: Crear atributos privados (incluir lista de historial de precios)
// TODO: Implementar constructor con precio inicial
// TODO: Implementar método cambiarPrecio
// TODO: Implementar método vender con validación
// TODO: Implementar método reabastecer
// TODO: Implementar método obtenerHistorialPrecios



class Producto {

    // Atributos privados
    private final String codigo;        // inmutable
    private String nombre;
    private double precio;
    private int stock;

    // Historial de precios anteriores
    private List<Double> historialPrecios;

    // Constructor
    public Producto(String codigo, String nombre, double precioInicial, int stockInicial) {
        this.codigo = codigo;                 // no puede cambiar
        this.nombre = nombre;
        this.precio = precioInicial;
        this.stock = stockInicial;
        this.historialPrecios = new ArrayList<>();
    }

    // Getters
    public String getCodigo() {
        return codigo; // inmutable
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setter para nombre (permitido)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Cambiar precio (registrando el anterior)
    public void cambiarPrecio(double nuevoPrecio) {
        if (nuevoPrecio <= 0) {
            System.out.println(" El precio debe ser mayor que 0.");
            return;
        }

        historialPrecios.add(precio);  // Registrar el precio anterior
        this.precio = nuevoPrecio;

        System.out.println("✓ Precio actualizado. Nuevo precio: " + nuevoPrecio);
    }

    // Vender producto
    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println(" La cantidad debe ser positiva.");
            return;
        }

        if (cantidad > stock) {
            System.out.println(" Stock insuficiente. Stock actual: " + stock);
            return;
        }

        stock -= cantidad;
        System.out.println(" Venta realizada. Stock restante: " + stock);
    }

    // Reabastecer stock
    public void reabastecer(int cantidad) {
        if (cantidad <= 0) {
            System.out.println(" La cantidad debe ser positiva.");
            return;
        }

        stock += cantidad;
        System.out.println("✓ Producto reabastecido. Nuevo stock: " + stock);
    }

    // Devolver historial de precios
    public List<Double> obtenerHistorialPrecios() {
        return historialPrecios;
    }
}


public class Ejercicio3 {
      public static void main(String[] args) {

        Producto p = new Producto("A123", "Polo Oversize", 50.0, 20);

        p.vender(5);
        p.reabastecer(10);

        p.cambiarPrecio(55.0);
        p.cambiarPrecio(60.0);

        System.out.println("Historial de precios: " + p.obtenerHistorialPrecios());

    }
}
