/*
 * EJERCICIO 5: Clase Producto
 * 
 * Crea una clase Producto con los atributos:
 * - codigo (String)
 * - nombre (String)
 * - precioUnitario (double)
 * - cantidadStock (int)
 * - categoria (String)
 * 
 * Implementa métodos para:
 * - agregarStock(int cantidad)
 * - retirarStock(int cantidad) - validar stock disponible
 * - calcularValorTotalStock()
 * - aplicarDescuento(double porcentaje)
 * - mostrarDetalles()
 * 
 * En main, crea tres productos, realiza operaciones de stock,
 * aplica descuentos y muestra sus detalles.
 * 
 * TODO: Implementar la clase con gestión de inventario.
 */

class Producto {
    private String codigo;
    private String nombre;
    private double precioUnitario;
    private int cantidadStock;
    private String categoria;

    // Constructor
    public Producto(String codigo, String nombre, double precioUnitario, int cantidadStock, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = cantidadStock;
        this.categoria = categoria;
    }

    // Agregar stock
    public void agregarStock(int cantidad) {
        if (cantidad > 0) {
            this.cantidadStock += cantidad;
            System.out.println("Se agregaron " + cantidad + " unidades a " + nombre);
        } else {
            System.out.println("Cantidad inválida.");
        }
    }

    // Retirar stock con validación
    public void retirarStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida.");
        } else if (cantidad > this.cantidadStock) {
            System.out.println("No hay suficiente stock de " + nombre);
        } else {
            this.cantidadStock -= cantidad;
            System.out.println("Se retiraron " + cantidad + " unidades de " + nombre);
        }
    }

    // Calcular valor total del stock
    public double calcularValorTotalStock() {
        return this.precioUnitario * this.cantidadStock;
    }

    // Aplicar descuento
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = (precioUnitario * porcentaje) / 100;
            precioUnitario -= descuento;
            System.out.println("Se aplicó un descuento de " + porcentaje + "% a " + nombre);
        } else {
            System.out.println("Porcentaje inválido.");
        }
    }

    // Mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio Unitario: S/ " + precioUnitario);
        System.out.println("Stock Disponible: " + cantidadStock);
        System.out.println("Categoría: " + categoria);
        System.out.println("Valor Total en Stock: S/ " + calcularValorTotalStock());
    }
}


public class Ejercicio5 {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("P001", "Laptop Lenovo", 2500.0, 5, "Tecnología");
        Producto p2 = new Producto("P002", "Silla Gamer", 450.0, 10, "Muebles");
        Producto p3 = new Producto("P003", "Teclado Mecánico", 150.0, 20, "Accesorios");

        // Operaciones
        p1.agregarStock(3);
        p1.retirarStock(2);
        p1.aplicarDescuento(10);

        p2.retirarStock(5);
        p2.aplicarDescuento(20);

        p3.agregarStock(10);
        p3.retirarStock(15);

        // Mostrar detalles
        p1.mostrarDetalles();
        p2.mostrarDetalles();
        p3.mostrarDetalles();
    }
}
