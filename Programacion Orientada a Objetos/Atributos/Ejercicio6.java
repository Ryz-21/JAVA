/*
 * EJERCICIO 6: Clase Rectángulo
 * 
 * Crea una clase Rectangulo con los atributos:
 * - ancho (double)
 * - alto (double)
 * - color (String)
 * 
 * Implementa métodos para:
 * - calcularArea()
 * - calcularPerimetro()
 * - cambiarDimensiones(double nuevoAncho, double nuevoAlto)
 * - cambiarColor(String nuevoColor)
 * - mostrarPropiedades()
 * - esCuadrado() - retorna true si ancho == alto
 * 
 * En main, crea dos rectángulos, calcula sus áreas y perímetros,
 * verifica si alguno es cuadrado y muestra sus propiedades.
 * 
 * TODO: Implementar la clase con cálculos geométricos.
 */


class Rectangulo {
    private double ancho;
    private double alto;
    private String color;

    // Constructor
    public Rectangulo(double ancho, double alto, String color) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }

    // Calcular área
    public double calcularArea() {
        return ancho * alto;
    }

    // Calcular perímetro
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    // Cambiar dimensiones
    public void cambiarDimensiones(double nuevoAncho, double nuevoAlto) {
        if (nuevoAncho > 0 && nuevoAlto > 0) {
            this.ancho = nuevoAncho;
            this.alto = nuevoAlto;
            System.out.println("Dimensiones actualizadas correctamente.");
        } else {
            System.out.println("Las dimensiones deben ser mayores que cero.");
        }
    }

    // Cambiar color
    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("Color actualizado a " + nuevoColor);
    }

    // Mostrar propiedades
    public void mostrarPropiedades() {
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Color: " + color);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("¿Es cuadrado?: " + (esCuadrado() ? "Sí" : "No"));
    }

    // Es cuadrado
    public boolean esCuadrado() {
        return ancho == alto;
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {

        // Crear rectángulos
        Rectangulo r1 = new Rectangulo(10.5, 5.5, "Rojo");
        Rectangulo r2 = new Rectangulo(7.0, 7.0, "Azul");

        // Mostrar propiedades
        r1.mostrarPropiedades();
        r2.mostrarPropiedades();

        // Verificación adicional de cuadrado
        System.out.println("¿R1 es cuadrado? " + r1.esCuadrado());
        System.out.println("¿R2 es cuadrado? " + r2.esCuadrado());
    }
}
