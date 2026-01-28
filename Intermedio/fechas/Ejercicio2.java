import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ejercicio2 {
    public static void main(String[] args) {

        // lamada como objeto
        LocalDateTime fecha = LocalDateTime.now();

        // DateTimeFormatter es para formatear la fecha en un formato personalizado
        System.out.println("Fecha actual: " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }
}
