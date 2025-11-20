
/*
 * EJERCICIO 4: Clase Estudiante
 * Crea una clase Estudiante con los siguientes requisitos:
 * - Atributos: nombre (String), matricula (String), calificaciones (array de double)
 * - Constructor que inicialice nombre, matrícula y cree un array de 5 calificaciones
 * - Método agregarCalificacion(int indice, double nota) 
 * - Método calcularPromedio() que devuelva el promedio de calificaciones
 * - Método estaAprobado() que devuelva true si el promedio es >= 6.0
 * - Método obtenerMejorCalificacion() y obtenerPeorCalificacion()
 * - Método toString() que muestre nombre, matrícula y promedio
 * 
 * En main, crea un estudiante, agrega 5 calificaciones, 
 * y muestra su promedio, mejor y peor nota.
 */
class Estudiante{

    String nombre;
    String matricula;
    double [] calificaciones;

    public Estudiante(String matricula, String nombre) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificaciones = new double[5];
    }

    public void agregarCalificacion (int indice, double nota){
        if(indice >= 0 && indice < calificaciones.length){
            this.calificaciones[indice] = nota;
        }else{
            System.out.println("Error: indice d calificacion fuera de rango");
        }
    }

    public double calcularPromedio (){
        double suma = 0;
        for (double nota : calificaciones){
            suma += nota;
        }
        return  suma / calificaciones.length;
    }

    public boolean estaAprobado(){
       return calcularPromedio() >= 10;
    }

    public double obtenerMejorCalificacion(){
        double mejor = Double.MIN_VALUE;  //inicializa el nivel mas bajo posible
        for (double nota : calificaciones) {
            if (nota > mejor){
                mejor = nota;
            }
        }
        return mejor;
    }

    public double obtenerPeorCalificacion(){
        double menor = Double.MAX_VALUE;
        for(double nota : calificaciones){
            if(nota < menor){
                menor = nota;
            }
        }
        return  menor;
    }
     @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", matricula='" + matricula + '\'' +
                ", promedio=" + calcularPromedio() +
                '}';
    }
}
public class Ejercicio4 {
    
    // TODO: Implementar aquí
    
    public static void main(String[] args) {
        // TODO: Crear objeto y probar los métodos
        Estudiante estudiante = new Estudiante("Juan Perez", "1012345");

        estudiante.agregarCalificacion(0, 7.5);
        estudiante.agregarCalificacion(1, 5.0);
        estudiante.agregarCalificacion(2, 8.2);
        estudiante.agregarCalificacion(3, 6.0);
        estudiante.agregarCalificacion(4, 9.1);

        System.out.println(estudiante.toString());
        System.out.println("Promedio de calificaciones: " + estudiante.calcularPromedio());
        System.out.println("Mejor calificación: " + estudiante.obtenerMejorCalificacion());
        System.out.println("Peor calificación: " + estudiante.obtenerPeorCalificacion());
        System.out.println("¿Está aprobado? " + (estudiante.estaAprobado() ? "Sí" : "No"));
    }
}
