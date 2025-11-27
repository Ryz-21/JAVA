public class Ejercicio8 {

    public void imprimir(String texto) {
        System.out.println("Texto: " + texto);
    }

    public void imprimir(int numero) {
        System.out.println("Número: " + numero);
    }

    // imprimir un texto varias veces
    public void imprimir(String texto, int veces) {
        for (int i = 1; i <= veces; i++) {
            System.out.println("[" + i + "] " + texto);
        }
    }

    public static void main(String[] args) {
        Ejercicio8 imp = new Ejercicio8();

        imp.imprimir("Hola mundo");
        imp.imprimir(123);
        imp.imprimir("Repetición", 3);
    }
}
