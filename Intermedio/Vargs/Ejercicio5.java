public class Ejercicio5 {
    //Crea un método que reciba varias palabras y devuelva cuántas recibió.

    public static void devolver (String... mensaje){
        System.out.println(mensaje.length);
    }
    public static void main(String[] args) {
        devolver("hola");
    }
}
