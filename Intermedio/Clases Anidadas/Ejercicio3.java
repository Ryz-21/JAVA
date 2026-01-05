/*
Ejercicio 2: Clase anidada estática
Crea una clase Banco con una clase anidada estática TasaInteres.
Plantea un programa que calcule intereses usando la clase interna sin crear un objeto Banco.
 */
class Banco {
    private static String nombreBanco = "BCP";
    
    static class TasaInteres {
        private double porcentaje;

        public TasaInteres (Double porcentaje){
            this.porcentaje = porcentaje;
        }

        public double calcularInteres (double monto){
            System.out.println("Calculando para :" + nombreBanco);
            return monto * (porcentaje / 100);
        }
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Banco.TasaInteres tasa = new Banco.TasaInteres(5.5);
        double montoPrestamo = 1000.0;
        double resultado = tasa.calcularInteres(montoPrestamo);
        
        System.out.println("El interés para $" + montoPrestamo + " es: $" + resultado);
    }
}