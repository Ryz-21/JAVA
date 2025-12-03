// EJERCICIO 1: Clase Persona con encapsulamiento básico
// Clase Persona con validaciones

class Persona {

    private String nombre;
    private int edad;
    private String dni; // Debe ser 8 dígitos + 1 letra

    // Constructor con validaciones
    public Persona(String nombre, int edad, String dni) {
        setNombre(nombre);
        setEdad(edad);
        setDNI(dni);
    }

    // Getter nombre en mayúsculas
    public String getNombre() {
        return nombre.toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter edad con validación
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        if(edad < 0 || edad > 150 ){
            throw new IllegalArgumentException("la edad debe ser entre 0 y 150");
        }
        this.edad = edad;
    }

    // Getter y Setter DNI con validación
    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        // Validación: 8 dígitos + 1 letra (Ej: 12345678A)
        if (!dni.matches("^[0-9]{8}[A-Za-z]$")) {
            throw new IllegalArgumentException("El DNI debe tener 8 dígitos seguidos de una letra.");
        }
        this.dni = dni;
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {

        // Ejemplo de uso
        Persona p = new Persona("Leo", 25, "12345678A");

        System.out.println("Nombre: " + p.getNombre()); // LEO
        System.out.println("Edad: " + p.getEdad());
        System.out.println("DNI: " + p.getDNI());
    }
}
