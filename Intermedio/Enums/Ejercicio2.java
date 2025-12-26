public class Ejercicio2 {
/*
2. Enum de estados de un pedido
Define un enum llamado EstadoPedido con estados como:
PENDIENTE, PROCESANDO, ENVIADO, ENTREGADO, CANCELADO.
Plantea un programa que muestre un mensaje distinto según el estado del pedido.
 */
public enum EstadoPedido {
            PENDIENTE, PROCESANDO, ENVIADO, ENTREGADO, CANCELADO
}

public static void main(String[] args) {
    EstadoPedido estado = EstadoPedido.CANCELADO;

    switch (estado) {
        case PENDIENTE:
            System.out.println("el proceso se encuentra pediente");
            break;
        case PROCESANDO:
            System.out.println("se encuentra en proceso");
        case ENVIADO:
            System.out.println("esta en envio");
        case ENTREGADO: 
            System.out.println("su pedido se encuentra entregado");
        case CANCELADO:
            System.out.println("Se encuentra cancelado");
        default:
            System.out.println("se ejecuto el bloque switch");
            break;
    }
}
}