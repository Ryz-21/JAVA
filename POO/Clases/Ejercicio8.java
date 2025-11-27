/*
 * EJERCICIO 8: Clase Producto
 * 
 * Crea una clase Producto con los siguientes requisitos:
 * - Atributos: nombre (String), codigo (String), precioBase (double), 
 *   impuesto (double), stock (int)
 * - Constructor que inicialice todos los atributos
 * - Método calcularPrecioFinal() que devuelva el precio con impuesto incluido
 * - Método aplicarDescuento(double porcentaje) que reduzca el precioBase
 * - Método agregarStock(int cantidad) y restarStock(int cantidad)
 * - Método hayDisponibilidad(int cantidad) que verifique si hay stock suficiente
 * - Método valorTotalStock() que devuelva precioFinal * stock
 * - Método toString() que muestre todos los datos del producto
 * 
 * En main, crea varios productos, aplica descuentos, modifica el stock
 * y calcula el valor total del inventario.
 */

public class Ejercicio8 {
    
    public static class Producto { //clase interna

        private String nombre;
        private String codigo;
        private double precioBase;
        private double impuesto; // Almacenado como porcentaje (ej. 0.18 para 18%)
        private int stock;

          public Producto(String nombre, String codigo, double precioBase, double impuesto, int stock) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.precioBase = precioBase;
            this.impuesto = impuesto;
            this.stock = stock;
        }

     public double calcularPrecioFinal (){
        return  this.precioBase * (1+this.impuesto);
    }

     public void aplicarDescuento(double porcentaje) {
            if (porcentaje > 0 && porcentaje <= 100) {
                this.precioBase = this.precioBase * (1 - (porcentaje / 100.0));
                System.out.println("Se aplicó un descuento del " + porcentaje + "% al producto " + this.nombre + ". Nuevo precio base: " + this.precioBase);
            } else {
                System.out.println("Porcentaje de descuento inválido.");
            }
        }
     public void agregarStock(int cantidad) {
            if (cantidad > 0) {
                this.stock += cantidad;
                System.out.println("Se agregaron " + cantidad + " unidades a " + this.nombre + ". Stock actual: " + this.stock);
            }
        }

    public boolean hayDisponibilidad (int cantidad){
        return  this.stock >= cantidad;
    }
    
    public void restarStock(int cantidad) {
            if (cantidad > 0 && hayDisponibilidad(cantidad)) {
                this.stock-= cantidad;
                System.out.println("Se restaron " + cantidad + " unidades de " + this.nombre + ". Stock actual: " + this.stock);
            } else if (cantidad > 0) {
                System.out.println("No hay suficiente stock para restar " + cantidad + " unidades de " + this.nombre);
            }
        }
     public double valorTotalStock (){
        return calcularPrecioFinal()* this.stock;
    }

       @Override
        public String toString() {
            return "Producto {" +
                    "Nombre: '" + nombre + '\'' +
                    ", Código: '" + codigo + '\'' +
                    ", Precio Base: " + String.format("%.2f", precioBase) +
                    ", Impuesto: " + (impuesto * 100) + "%" +
                    ", Stock: " + stock +
                    ", Precio Final (con impuesto): " + String.format("%.2f", calcularPrecioFinal()) +
                    '}';
        }

    }

   

    public static void main(String[] args) {
        // TODO: Crear objetos y probar los métodos
          Producto leche = new Producto("Leche Entera", "LCH001", 1.50, 0.10, 50); // 10% impuesto
        Producto pan = new Producto("Pan Integral", "PAN002", 2.20, 0.05, 100); // 5% impuesto
        Producto manzanas = new Producto("Manzanas x Kg", "FRU003", 3.00, 0.18, 20); // 18% impuesto

        System.out.println(leche.toString());
        System.out.println(pan.toString());
        System.out.println(manzanas.toString());

        leche.aplicarDescuento(10); // Aplicar 10% descuento a la leche
        pan.restarStock(10); // Restar 10 unidades de pan
        manzanas.agregarStock(30); // Agregar 30 unidades de manzanas

        System.out.println(manzanas.toString());

    }
}
