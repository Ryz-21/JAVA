/*
Ejercicio 3: Clase local

Dentro de un método de una clase Pedido, define una clase local Descuento.
Plantea un programa que aplique un descuento solo dentro de ese método.
 */

class Pedido {
    private double total;
    
    public void procesarDescuento(double porcentaje){
        //clase local dentro del metodo
        class Descuento {
            public double aplicar() {
                return total - (total * (porcentaje / 100));
            }
        }

        Descuento miDescuento = new Descuento();
        double PrecioFinal = miDescuento.aplicar();

        System.out.println("total original "+ total);
        System.out.println("Aplicando " + porcentaje + "% descuento");
        System.out.println("el precio final es "  + PrecioFinal);

    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
    Pedido mPedido = new Pedido();
    mPedido.procesarDescuento(5.5);
    
    }
}
