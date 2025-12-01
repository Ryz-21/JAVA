/*
PREGUNTA 5: ¿Cuál es la diferencia entre los modificadores de acceso public, private y protected?
 * Respuesta: 
 * - public: el método es accesible desde cualquier clase
 * - private: el método solo es accesible dentro de la misma clase
 * - protected: el método es accesible dentro del paquete y por clases hijas
 *  */

class Persona {

    public String nombre = "Juan";      // Accesible desde cualquier clase
    private int edad = 25;              // Solo accesible dentro de esta clase
    protected String nacionalidad = "Peruana"; // Acceso dentro del paquete y clases hijas

    // Método para mostrar la edad (porque es private)
    public int getEdad() {
        return edad;
    }
}
class Estudiante extends Persona {
    public void mostrarDatosHeredados() {
        System.out.println("Nombre (public): " + nombre);
        System.out.println("Nacionalidad (protected): " + nacionalidad);
        // System.out.println(edad); // ERROR: edad es private
    }
}

public class Ejercicio5 {

   public static void main(String[] args) {
       Persona persona = new Persona();
        System.out.println(persona.nombre);       // OK (public)
        System.out.println(persona.getEdad());    // OK vía getter (edad es private)

        Estudiante estudiante = new Estudiante();
        estudiante.mostrarDatosHeredados();       // Accede a public + protected
   }

}
