import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio5 {
    /**
     * Ejercicio 5: Días entre dos fechas
     * 
     * Objetivo:
     * Calcular cuántos días hay entre dos fechas ingresadas.
     * 
     * Pista:
     * 
     * ChronoUnit.DAYS.between()
     * 
     */

    public static void DiasEntreFechas(LocalDate fecha1, LocalDate fecha2) {
        long dias = ChronoUnit.DAYS.between(fecha1, fecha2);
        System.out.println("La diferencia en dias es: " + dias);

    }

    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2000, 1, 1);
        LocalDate fecha2 = LocalDate.now();
        DiasEntreFechas(fecha1, fecha2);
    }
}
