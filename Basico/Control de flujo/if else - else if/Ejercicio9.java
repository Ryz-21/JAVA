public class Ejercicio9 {
    public static void main(String[] args) {
        int numero = 1;

        do { 
            System.out.println(numero);
            
            if (numero == 5) {
                System.out.println("Bucle detenido en el número " + numero);
                break; // Rompe el bucle cuando numero sea 5
            }

            numero++; // Incrementa el número
        } while (numero <= 10);
    }
}
