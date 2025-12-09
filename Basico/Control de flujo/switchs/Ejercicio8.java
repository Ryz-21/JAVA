/*Cajero automático (básico)
Menú:
1. Consultar saldo
2. Retirar dinero
3. Depositar dinero
4. Salir
 */


public class Ejercicio8 {

    public static void main(String[] args) {

        double saldo = 1000;
        int opcion = 1; // simula elección

        while (opcion != 4) {

            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");

            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo es: " + saldo);
                    opcion = 4; // forzamos salida
                    break;

                case 2:
                    System.out.println("Función retirar dinero");
                    opcion = 4;
                    break;

                case 3:
                    System.out.println("Función depositar dinero");
                    opcion = 4;
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
                    opcion = 4;
            }
        }
    }
}
