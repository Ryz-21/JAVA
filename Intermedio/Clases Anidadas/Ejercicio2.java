/*
Ejercicio 1: Clase interna normal

Crea una clase Computadora que contenga una clase interna Procesador.
Plantea un programa donde el procesador muestre información de la computadora a la que pertenece.

en java */
class Computadora {
    private String marca;
    private String modelo;

    public Computadora(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    class Procesador{
        private String nombreReferencia;
        private double frecuenciaGHz;

        public Procesador (String nombreReferencia, double frecuenciaGHz){
            this.nombreReferencia = nombreReferencia;
            this.frecuenciaGHz = frecuenciaGHz;
        }

        public void mostrarDetalles() {
            // Acceso directo a los atributos de la clase externa (Computadora)
            System.out.println("--- Detalles del Sistema ---");
            System.out.println("Computadora: " + marca + " " + modelo);
            System.out.println("Procesador: " + nombreReferencia + " a " + frecuenciaGHz + "GHz");
        }
    }
}
public class Ejercicio2 {
   public static void main(String[] args) {
      Computadora miPc = new Computadora("DELL", "xps-13");
      Computadora.Procesador miCPU = miPc.new Procesador("Intel i7", 4.8);
      miCPU.mostrarDetalles();
   } 
}
