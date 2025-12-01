    /*
     * PREGUNTA 7: ¿Qué es un método abstracto y cuándo se utiliza?
     * Respuesta: Un método abstracto es uno que se declara en una clase abstracta pero no tiene
     * implementación. Las clases hijas deben implementarlo obligatoriamente. Se usa para forzar
     * que las subclases implementen ciertos métodos.
     */

// Clase abstracta
abstract class Animal {

    // Método abstracto (sin implementación)
    public abstract void hacerSonido();

    // Método normal (con implementación)
    public void dormir() {
        System.out.println("El animal está durmiendo...");
    }
}

// Clase hija que está obligada a implementar el método abstracto
class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}

public class Ejercicio7 {

    public static void main(String[] args) {

        // No se puede crear objetos de una clase abstracta
        // Animal a = new Animal();  // ERROR

        Animal perro = new Perro();  // OK
        perro.hacerSonido();         // Implementación obligatoria
        perro.dormir();              // Método normal heredado
    }
}
