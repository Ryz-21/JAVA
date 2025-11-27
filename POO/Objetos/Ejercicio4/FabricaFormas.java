package Ejercicio4;

public class FabricaFormas {

    // Clase privada interna para validar dimensiones
    private static class Validador {

        static void validarPositivo(double... valores) {
            for (double v : valores) {
                if (v <= 0) {
                    throw new IllegalArgumentException("Las dimensiones deben ser positivas.");
                }
            }
        }

        static void validarTriangulo(double a, double b, double c) {
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("No cumple la regla del triángulo.");
            }
        }
    }

    // Métodos para crear formas
    public static Circulo crearCirculo(double radio) {
        Validador.validarPositivo(radio);
        return new Circulo(radio);
    }

    public static Rectangulo crearRectangulo(double ancho, double alto) {
        Validador.validarPositivo(ancho, alto);
        return new Rectangulo(ancho, alto);
    }

    public static Triangulo crearTriangulo(double a, double b, double c) {
        Validador.validarPositivo(a, b, c);
        Validador.validarTriangulo(a, b, c);
        return new Triangulo(a, b, c);
    }
}
