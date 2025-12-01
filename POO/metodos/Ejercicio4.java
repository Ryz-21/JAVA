/** PREGUNTA 4: ¿Qué es la sobreescritura de métodos (Method Overriding)?
 * Respuesta: Es cuando una clase hija hereda un método de la clase padre y lo reimplementa
 * de forma diferente, usando la anotación @Override. Solo ocurre en herencia.
 *  */


class Animal {
    // Método que será sobrescrito
    public void sonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {

    @Override
    public void sonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}

public class Ejercicio4 {
   public static void main(String[] args) {
      Animal animal = new Animal();
        animal.sonido();  // Llama al método de la clase padre

        Perro perro = new Perro();
        perro.sonido();   // Llama al método sobrescrito en la clase hija
   }
}
