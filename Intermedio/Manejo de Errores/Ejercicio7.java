public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            lanzarExcepcion();
        } catch (Exception e) {
            System.out.println("Se capturó la excepción: " + e.getMessage());
        }
    }

    public static void lanzarExcepcion() {
        throw new RuntimeException("¡Esta es una excepción personalizada lanzada con throw!");
    }
}
