public class Ejercicio5 {

/*
5. Enum de métodos de pago
Crea un enum llamado MetodoPago con valores como:
EFECTIVO, TARJETA, TRANSFERENCIA, YAPE.
Plantea un programa que calcule un recargo o descuento según el método de pago elegido.
 */

public enum MetodoPago {
    EFECTIVO, TARJETA, TRANSFERENCIA, YAPE
}
public static void calcularRecargo (MetodoPago TipoPago){
    switch (TipoPago) {
        case EFECTIVO:
            System.out.println("no hay comision ni aumento de pago");
            break;
        case TARJETA:
            System.out.println("el recargo de comision es de un %3");
            break;
        case TRANSFERENCIA:
            System.out.println("el recargo de comision es de un %5");
        case YAPE:
            System.out.println("no hay comesion ni aumento de pago");
    
        default:
            break;
    }
}
    public static void main(String[] args) {
        MetodoPago pago = MetodoPago.EFECTIVO;
        calcularRecargo(pago);        
    }
}
