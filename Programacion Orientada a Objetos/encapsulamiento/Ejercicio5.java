import java.util.*;

// EJERCICIO 5: Clase Estudiante con calificaciones encapsuladas
//
// Objetivo: Crear una clase Estudiante que encapsule información académica
// y gestione calificaciones de forma segura
//
// Requisitos:
// - Atributos privados: nombre, matrícula, carrera, calificaciones (Lista)
// - La matrícula es inmutable y generada automáticamente
// - Las calificaciones válidas están entre 0 y 10 (inclusive)
// - Crear método agregarCalificacion(asignatura, nota) con validación
// - Crear método obtenerPromedio() que calcule el promedio de calificaciones
// - Crear método obtenerCalificacionesAprobadas() que retorne solo >=7
// - Crear método obtenerCalificacionesSuspensas() que retorne solo <7
// - Crear método obtenerMejorCalificacion()
// - Crear método obtenerPeorCalificacion()
//

// TODO: Implementar la clase Estudiante
// TODO: Crear atributos privados (incluir mapa o lista de calificaciones)
// TODO: Implementar constructor
// TODO: Implementar método agregarCalificacion con validación
// TODO: Implementar método obtenerPromedio
// TODO: Implementar métodos de consulta de calificaciones
// TODO: Implementar métodos de mejor y peor calificación
class Estudiante {
  
  private String nombre;
  private final int Matricula;
  private String carrera;
  private Map <String , Integer> calificaciones;

  private static int contadorMatricula = 1000; //generacion automatica 

  public Estudiante (String nombre, String carrera){
    this.nombre = nombre;
    this.carrera = carrera;
    this.Matricula = contadorMatricula; // llamamos la variable estatica
    this.calificaciones = new HashMap<>();
  }

  public void agregarCalificacion(String asignatura, int nota){
    if(nota < 0 || nota > 10){
      System.out.println("error, la nota debe ser entre 0 y 10");
      return;
    }

    calificaciones.put(asignatura, nota);
  }

  public double obtenerPromedio() {
        if (calificaciones.isEmpty()) return 0;

        double suma = 0;
        for (int nota : calificaciones.values()) {
            suma += nota;
        }

        return suma / calificaciones.size();
  }

  public Map<String, Integer>obtenerCalificacionesSuspensas(){
    Map<String, Integer> suspensas = new HashMap<>();

    for(var entry: calificaciones.entrySet()){
      if(entry.getValue() < 7 ){
        suspensas.put(entry.getKey(), entry.getValue());
      }
    }
    return suspensas;
  }

  public Map<String, Integer> obtenerCalifcacionesAprobadas(){
    Map<String, Integer> aprobadas = new HashMap<>();

    for(var entry: calificaciones.entrySet()){
      if(entry.getValue() >= 7){
        aprobadas.put(entry.getKey(), entry.getValue());
      }
    }
    return aprobadas;
  }

  public int obtenerMejorCalificacion(){
    if(calificaciones.isEmpty()) return 0;

    int mejor = Integer.MIN_VALUE; // le damos valor del menor valor para comprarlo con cada parte asi nos devolvera el que sea mayor que el 

    for(int nota: calificaciones.values()){
      if(nota > mejor) mejor = nota;
    }

    return mejor;
  }

  public int obtenerPeorCalificacion(){
    if(calificaciones.isEmpty()) return 0;

    int peor = Integer.MAX_VALUE; 

    for(int nota: calificaciones.values()){
      if(nota < peor){
        peor = nota;
      }
    }
    return peor;
  }


}

public class Ejercicio5 {
      public static void main(String[] args) {
        Estudiante est = new Estudiante("Juan Pèrez", "Ingeneria en sistemas");

        est.agregarCalificacion("Matemticas", 9);
        est.agregarCalificacion("Programación", 10);
        est.agregarCalificacion("Física", 6);

         System.out.println("Promedio: " + est.obtenerPromedio());
        System.out.println("Aprobadas: " + est.obtenerCalifcacionesAprobadas());
        System.out.println("Suspensas: " + est.obtenerCalificacionesSuspensas());
        System.out.println("Mejor nota: " + est.obtenerMejorCalificacion());
        System.out.println("Peor nota: " + est.obtenerPeorCalificacion());
    }
}
