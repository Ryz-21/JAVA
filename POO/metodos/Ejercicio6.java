    /*
     * PREGUNTA 6: ¿Para qué sirven los métodos getters y setters?
     * Respuesta: Los getters devuelven el valor de un atributo privado. 
     * Los setters permiten modificar el valor de un atributo privado de forma controlada,
     * validando los datos.
     */

class Persona {

    private String nombre;   // Atributo privado
    private int edad;        // Atributo privado

    // Getter: devuelve el valor del atributo nombre
    public String getNombre() {
        return nombre;
    }

    // Setter: permite modificar nombre con validación
    public void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
        } else {
            this.nombre = nombre;
        }
    }

    // Getter de edad
    public int getEdad() {
        return edad;
    }

    // Setter de edad con validación
    public void setEdad(int edad) {
        if (edad < 0 || edad > 120) {
            System.out.println("Edad inválida.");
        } else {
            this.edad = edad;
        }
    }
}

public class Ejercicio6 {

    public static void main(String[] args) {

        Persona persona = new Persona();

        // Usando setters (modificar valores)
        persona.setNombre("Carlos");
        persona.setEdad(30);

        // Usando getters (obtener valores)
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
