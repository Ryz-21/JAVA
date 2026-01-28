import java.time.LocalDate;

public class Ejercicio4 {

    // plusDays()
    // minusMonths()

    /*
     * A una fecha dada:
     * Sumar 10 días Restar 2 meses
     */

    public static void Aumetar(LocalDate fecha, int dias) {
        fecha.plusDays(dias);
    }

    public static void SumarFecha(LocalDate fecha) {
        fecha.plusDays(10);
    }

    public static void RestarFecha(LocalDate fecha) {
        fecha.minusMonths(2);
    }

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        LocalDate fecha2 = LocalDate.of(2020, 1, 1);
        SumarFecha(fecha);
        RestarFecha(fecha);
        Aumetar(fecha2, 10);
    }
}
