// EJERCICIO 8: Clase Rectángulo con validación de dimensiones
//
// Objetivo: Crear una clase Rectángulo que encapsule ancho y alto
// con validación y cálculos geométricos
//
// Requisitos:
// - Atributos privados: ancho, alto (ambos deben ser positivos)
// - Crear constructor que valide que ambas dimensiones sean > 0
// - Crear setters que validen los valores antes de asignarlos
// - Si un setter recibe un valor inválido, no modifica el atributo
//   y retorna false, si es válido retorna true
// - Crear método obtenerArea() que retorne ancho * alto
// - Crear método obtenerPerimetro() que retorne 2*(ancho + alto)
// - Crear método obtenerDiagonal() usando Pitágoras
// - Crear método esRectangulo() que retorne true si ancho != alto
// - Crear método esCuadrado() que retorne true si ancho == alto
// - Crear método obtenerInfo() que retorne representación formateada
// - Sobreescribir toString()
//
// TODO: Implementar la clase Rectángulo
// TODO: Implementar atributos privados
// TODO: Implementar constructor con validación
// TODO: Implementar setters que retornen boolean
// TODO: Implementar métodos de cálculo: área, perímetro, diagonal
// TODO: Implementar métodos de consulta: esRectangulo, esCuadrado
// TODO: Implementar método obtenerInfo y toString

class Rectangulo {

    // Atributos privados
    private double ancho;
    private double alto;

    // Constructor con validación
    public Rectangulo(double ancho, double alto) {
        if (ancho > 0 && alto > 0) {
            this.ancho = ancho;
            this.alto = alto;
        } else {
            // Si son inválidos, se asignan valores por defecto
            this.ancho = 1;
            this.alto = 1;
        }
    }

    // Setter ancho (retorna boolean)
    public boolean setAncho(double ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
            return true;
        }
        return false;
    }

    // Setter alto (retorna boolean)
    public boolean setAlto(double alto) {
        if (alto > 0) {
            this.alto = alto;
            return true;
        }
        return false;
    }

    // Métodos de cálculo
    public double obtenerArea() {
        return ancho * alto;
    }

    public double obtenerPerimetro() {
        return 2 * (ancho + alto);
    }

    public double obtenerDiagonal() {
        return Math.sqrt(ancho * ancho + alto * alto);
    }

    // Métodos de consulta
    public boolean esRectangulo() {
        return ancho != alto;
    }

    public boolean esCuadrado() {
        return ancho == alto;
    }

    // Método obtenerInfo()
    public String obtenerInfo() {
        return "Rectángulo:\n" +
               "Ancho: " + ancho + "\n" +
               "Alto: " + alto + "\n" +
               "Área: " + obtenerArea() + "\n" +
               "Perímetro: " + obtenerPerimetro() + "\n" +
               "Diagonal: " + obtenerDiagonal();
    }

    // Sobrescribir toString()
    @Override
    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
    }
}


public class Ejercicio8 {
      public static void main(String[] args) {
        
        Rectangulo r = new Rectangulo(5, 3);

        System.out.println(r.obtenerInfo());
        System.out.println("¿Es rectángulo? " + r.esRectangulo());
        System.out.println("¿Es cuadrado? " + r.esCuadrado());
        System.out.println(r);
    }
}
