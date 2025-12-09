import java.util.*;

/*
Ejercicio 4 — Polimorfismo en productos de una tienda

Enunciado:
Modela productos de una tienda con diferentes reglas para calcular el precio final. Crea una clase base `Producto`
con atributos como `nombre`, `precioBase` y un método `public double calcularPrecioFinal()`.
Implementa subclases como `Libro` y `Electronico` que sobrescriban `calcularPrecioFinal()` para aplicar impuestos,
descuentos o costes de envío distintos.

Tareas:
- Implementar `Producto` y las subclases `Libro` y `Electronico` con sus reglas de precio.
- Crear una clase `Carrito` que contenga varios `Producto` y calcule el total usando polimorfismo.
- (Opcional) Añadir un método `aplicaDescuento(Cliente c)` que pueda comportarse distinto según el tipo de producto.
*/

abstract class producto {
    protected String nombre;
    protected double precioBase;

    public producto (String nombre , double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    abstract public double calcularPrecioFinal();
}

class libro extends producto {
    private double impuesto = 0.03;
    public libro (String nombre , double precioBase){
        super(nombre, precioBase);
    }
    @Override
    public double calcularPrecioFinal(){
        return precioBase+(precioBase*impuesto);
    }
}

class electronico extends producto {
    private double impuesto = 0.04;
    public electronico (String nombre, double precioBase){
        super(nombre, precioBase);
    }
    @Override
    public double calcularPrecioFinal(){
        return precioBase+(precioBase*impuesto);
    }
}

class carrito {
   private ArrayList<producto> productos = new ArrayList<>();
   public void agregarCarrito (producto c){
    productos.add(c);
   }
   public double SumarCarrito (){
    double total = 0;
     for(producto s : productos){
        total += s.calcularPrecioFinal(); 
    }
     return total;
   }
}

public class Ejercicio4 {

    public static void main(String[] args) {
        
        carrito carri = new carrito();

        carri.agregarCarrito(new electronico("samsumg a25", 500));
        carri.agregarCarrito(new libro("clean code",40));
    
       System.out.println("Total del carrito: " + carri.SumarCarrito());
    }   
}