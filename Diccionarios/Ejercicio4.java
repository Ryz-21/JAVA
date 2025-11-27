import java.util.HashMap;
import java.util.Scanner;

/**
 * EJERCICIO 4: INVENTARIO DE TIENDA
 * 
 * PREGUNTA: Crea un sistema de inventario para una tienda. Cada producto 
 * debe tener un código único (clave) y almacenar su nombre, precio y cantidad. 
 * Implementa operaciones para añadir stock, vender productos y ver el valor 
 * total del inventario.
 * 
 * PISTA: Usa HashMap<String, Producto> donde Producto es una clase que 
 * contiene nombre, precio y cantidad. Usa una clase interna o crea una clase 
 * separada para Producto. Calcula el valor total multiplicando precio × cantidad.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        // TODO: Implementar la solución aquí
        Scanner sc = new Scanner(System.in);
        HashMap <String, Producto> map = new HashMap<>();

        int opcion; 

        System.out.println("escoge tu opcion");
        System.out.println("1 es para agregar");
        System.out.println("2 es para vender");
        System.out.println("3 ver valor inventario");
        opcion = sc.nextInt();
        sc.nextLine();

        switch(opcion){
    case 1:
        System.out.println("Codigo del producto");
        String codigo = sc.nextLine();

        System.out.println("Nombre del prodcuto");
        String nombre = sc.nextLine();

        System.out.println("ingresar precio del producto");
        double precio = sc.nextDouble();

        System.out.println("ingresar cantidad del producto");
        int cantidad = sc.nextInt();

        if(map.containsKey(codigo)){
            Producto p = map.get(codigo);
            p.cantidad += cantidad;
        } else {
            map.put(codigo, new Producto(nombre, precio, cantidad));
        }

        System.out.println("producto agregado correctamente");
        break;

    case 2:
        System.out.println("Codigo del producto");
        codigo = sc.nextLine();

        if(!map.containsKey(codigo)){
            System.out.println("el codigo no existe");
            break;
        }

        Producto p = map.get(codigo);

        System.out.println("Cantidad a vender");
        int vender = sc.nextInt();

        if(p.cantidad >= vender){ 
            p.cantidad -= vender; //p.cantidad = p.cantidad - vender;
            System.out.println("venta realizada");
        } else {
            System.out.println("no hay stock suficiente");
        }

        break; 

    case 3:
        double total = 0;

        for (Producto s : map.values()) {
            total += s.precio * s.cantidad;
        }

        System.out.println("el valor total del inventario es " + total);
        break;

       default:
          System.out.println("opcion no valida");
       }
    }

    public static class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}

}
