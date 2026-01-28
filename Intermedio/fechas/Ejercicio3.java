import java.time.LocalDate;

public class Ejercicio3 {

    public static int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        return edad;
    }

    public static void main(String[] args) {
        // Pedir una fecha de nacimiento y calcular la edad actual.
        LocalDate fechaNac = LocalDate.of(2000, 1, 1);
        System.out.println("la edad es " + calcularEdad(fechaNac));
    }
}
