/*
 * EJERCICIO 5: Clase Rectángulo
 * 
 * Crea una clase Rectangulo con los siguientes requisitos:
 * - Atributos: ancho (double), alto (double)
 * - Constructor que inicialice ancho y alto (validar que sean > 0)
 * - Método calcularArea() que devuelva el área del rectángulo
 * - Método calcularPerimetro() que devuelva el perímetro
 * - Método esUnCuadrado() que devuelva true si ancho == alto
 * - Métodos getter y setter para ancho y alto
 * - Método toString() que muestre las dimensiones, área y perímetro
 * 
 * En main, crea varios rectángulos y comprueba si son cuadrados,
 * calcula su área y perímetro.
 */
class Rectangulo {
    double ancho;
    double alto;

    // Constructor que inicializa ancho y alto, validando que sean > 0
    public Rectangulo(double ancho, double alto) {
        if (ancho <= 0 || alto <= 0) {
            throw new IllegalArgumentException("El ancho y el alto deben ser mayores a 0");
        }
        this.alto = alto;
        this.ancho = ancho;
    }

    // Método calcularArea() que devuelve el área del rectángulo
    public double calcularArea() {
        return ancho * alto;
    }

    // Método calcularPerimetro() que devuelve el perímetro
    public double calcularPerimetro() {
        // La fórmula del perímetro es 2 * (ancho + alto)
        return 2 * (ancho + alto);
    }

    // Método esUnCuadrado() que devuelve true si ancho == alto
    public boolean esUnCuadrado() {
        return ancho == alto;
    }

    // Métodos getter y setter para ancho y alto
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho <= 0) {
            throw new IllegalArgumentException("El ancho debe ser mayor a 0");
        }
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if (alto <= 0) {
            throw new IllegalArgumentException("El alto debe ser mayor que 0");
        }
        this.alto = alto;
    }

    // Método toString() que muestra las dimensiones, área y perímetro
    @Override
    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + ", area=" + calcularArea() + ", perimetro=" + calcularPerimetro() + "]";
    }
}

public class Ejercicio5 {
    
    public static void main(String[] args) {
        // Crear objetos y probar los métodos
        try {
            Rectangulo rectangulo1 = new Rectangulo(10.0, 5.0);
            Rectangulo rectangulo2 = new Rectangulo(7.0, 7.0);
            
            System.out.println("Rectángulo 1");
            System.out.println(rectangulo1.toString());
            System.out.println("¿Es un cuadrado? " + rectangulo1.esUnCuadrado());
            System.out.println("Área: " + rectangulo1.calcularArea());
            System.out.println("Perímetro: " + rectangulo1.calcularPerimetro());

            System.out.println("\n Rectángulo 2");
            System.out.println(rectangulo2.toString());
            System.out.println("¿Es un cuadrado? " + rectangulo2.esUnCuadrado());
            System.out.println("Área: " + rectangulo2.calcularArea());
            System.out.println("Perímetro: " + rectangulo2.calcularPerimetro());

            // Ejemplo de uso de setters y manejo de errores
            rectangulo1.setAncho(15.0);
            System.out.println("\n Rectángulo 1 (ancho modificado) ");
            System.out.println(rectangulo1.toString());

            // Intentar crear un rectángulo inválido para probar la validación del constructor
            // Rectangulo rectanguloInvalido = new Rectangulo(-2.0, 3.0); 

        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear o modificar rectángulo: " + e.getMessage());
        }
    }
}
