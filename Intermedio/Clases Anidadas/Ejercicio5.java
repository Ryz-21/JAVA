/*
Ejercicio 4: Clase anónima

Plantea un programa que use una clase anónima para implementar una interfaz Notificacion,
donde se muestre un mensaje distinto según el tipo de notificación.
 */

// Definimos la interfaz
interface Notificacion {
    void enviar(String mensaje);
}

public class Ejercicio5 {
    public static void main(String[] args) {
        
        // 1. Clase anónima para Notificación por Email
        Notificacion email = new Notificacion() {
            @Override
            public void enviar(String mensaje) {
                System.out.println("📧 Enviando Email: " + mensaje);
            }
        };

        // 2. Clase anónima para Notificación por SMS
        Notificacion sms = new Notificacion() {
            @Override
            public void enviar(String mensaje) {
                System.out.println("📱 Enviando SMS: " + mensaje);
            }
        };

        // Ejecutamos las notificaciones
        email.enviar("Su pedido ha sido enviado.");
        sms.enviar("Su código de verificación es 1234.");
    }
}
