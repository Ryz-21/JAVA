/*
 * EJERCICIO 2: Clase Coche
 * 
 * Diseña una clase Coche con los atributos:
 * - marca (String)
 * - modelo (String)
 * - año (int)
 * - velocidadMaxima (int)
 * - velocidadActual (int)
 * 
 * Crea un constructor que inicialice marca, modelo y año.
 * Implementa métodos para acelerar, frenar y obtener información del coche.
 * En main, crea dos instancias de Coche y simula cambios de velocidad.
 * 
 * TODO: Implementar constructor, métodos de aceleración/frenado,
 *       y mostrar el estado del coche en consola.
 */
class Coche {

    String marca;
    String modelo;
    int año;
    int velocidadMaxima;
    int velocidadActual = 0;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadMaxima = 200; // valor por defecto
    }

    public Coche(String marca, String modelo, int año, int velocidadMaxima) {
        this(marca, modelo, año);
        this.velocidadMaxima = velocidadMaxima;
    }

    public void frenar() {
        if (velocidadActual - 10 < 0) {
            velocidadActual = 0;
        } else {
            velocidadActual -= 10;
        }
    }

    public void acelerar() {
        if (velocidadActual + 10 > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        } else {
            velocidadActual += 10;
        }
    }

   @Override
   public String toString(){
     return "la informacion del coche es marca " + marca + "el modelo es" + modelo + "el año es : " + año + "la velocidad maxima es " + velocidadMaxima + "velocdad actual " + velocidadActual ;
   }
}
public class Ejercicio2 {
    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla", 2020, 180);
        Coche c2 = new Coche("Mazda", "3", 2019, 200);

        c1.acelerar();
        c1.acelerar();
        c1.frenar();

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        System.out.println(c1);
        System.out.println(c2);
    }   
}