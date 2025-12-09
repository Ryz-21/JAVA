import java.util.*;

/*
 * EJERCICIO 4: Clase Estudiante
 * 
 * Crea una clase Estudiante con los atributos:
 * - matricula (String)
 * - nombre (String)
 * - carrera (String)
 * - calificaciones (arreglo de double)
 * 
 * Implementa métodos para:
 * - agregarCalificacion(double nota)
 * - calcularPromedio()
 * - obtenerCalificacionMasAlta()
 * - obtenerCalificacionMasBaja()
 * - mostrarReporteEstudiante()
 * 
 * En main, crea un estudiante, agrega 5 calificaciones y muestra
 * su promedio, calificación más alta y más baja.
 * 
 * TODO: Implementar la clase con manejo de arreglo de calificaciones.
 */
class estudiante {
    String matricula;
    String nombre;
    String carrera;
    List<Double> calificaciones;

    public estudiante(String matricula, String nombre, String carrera) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.calificaciones = new ArrayList<>();
    }

   public void agregarCalificacion(double nota){
        if(nota >= 0 && nota <= 100){
            this.calificaciones.add(nota);
            System.out.println("calificacion " + nota + " agergada");
        } else {
            System.out.println("error la calificacion entre 0");
        }
    }

    public double calcularPromedio (){
        if(calificaciones.isEmpty()){
            return 0.0;
        }
        double suma = 0;
        for (double calificacion : calificaciones){
            suma += calificacion;
        }
        return Math.round((suma / calificaciones.size())* 100.0) / 100.0;
    }

    public double obtenerCalificacionMasAlta(){
        if(calificaciones.isEmpty()){
            return Double.MIN_VALUE;
        }
        return Collections.max(calificaciones);
    }

    public double obtenerCalificacionMasBaja(){
        if(calificaciones.isEmpty()){
            return Double.MAX_VALUE;
        }
        return Collections.min(calificaciones);
    }

    @Override 
    public String toString() {
        return "--- Reporte Estudiante ---\n" +
               "Matrícula: " + matricula + "\n" +
               "Nombre: " + nombre + "\n" +
               "Carrera: " + carrera + "\n" +
               "Total Calificaciones: " + calificaciones.size();
    }

    public void mostrarReporteEstudiante() {
        System.out.println(this.toString()); 
        if (!calificaciones.isEmpty()) {
            System.out.println("Promedio: " + calcularPromedio());
            System.out.println("Calificación más alta: " + obtenerCalificacionMasAlta());
            System.out.println("Calificación más baja: " + obtenerCalificacionMasBaja());
        }
    }

}
public class Ejercicio4 {
    public static void main(String[] args) {
        
        estudiante est1 = new estudiante("U12345", "Carlos Sanchez", "Sistemas");

        System.out.println("Agregando calificaciones a " + est1.nombre);
        est1.agregarCalificacion(85.0);
        est1.agregarCalificacion(90.5);
        est1.agregarCalificacion(77.0);
        est1.agregarCalificacion(95.0);
        est1.agregarCalificacion(88.5);

        est1.mostrarReporteEstudiante();
    }
}
