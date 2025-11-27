
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EJERCICIO 5: CALIFICACIONES DE ESTUDIANTES
 * 
 * PREGUNTA: Crea un programa que almacene las calificaciones de estudiantes 
 * en un HashMap. Para cada estudiante, guarda múltiples calificaciones (en 
 * forma de lista o array). Calcula el promedio de cada estudiante y 
 * muestra quién tiene la mayor y menor calificación.
 * 
 * PISTA: Usa HashMap<String, ArrayList<Double>> o HashMap<String, Double[]> 
 * donde la clave sea el nombre del estudiante. Para obtener el promedio, 
 * suma todos los valores y divide entre la cantidad. Usa valores Double 
 * para mayor precisión.
 */

public class Ejercicio5 {

    public static void main(String[] args) {

        // 1. Almacenar calificaciones en un HashMap
        Map<String, List<Double>> calificaciones = new HashMap<>();

        // Agregar calificaciones para varios estudiantes
        List<Double> juanGrades = new ArrayList<>();
        juanGrades.add(8.5);
        juanGrades.add(9.0);
        juanGrades.add(7.8);
        calificaciones.put("Juan", juanGrades);

        List<Double> mariaGrades = new ArrayList<>();
        mariaGrades.add(9.2);
        mariaGrades.add(8.8);
        mariaGrades.add(9.5);
        calificaciones.put("María", mariaGrades);

        List<Double> pedroGrades = new ArrayList<>();
        pedroGrades.add(7.0);
        pedroGrades.add(6.5);
        calificaciones.put("Pedro", pedroGrades);

        // 2. Calcular promedio para cada estudiante y encontrar el promedio general
        Map<String, Double> promedios = new HashMap<>();
        double sumaTotalPromedios = 0;
        int contadorEstudiantes = 0;

        String mejorEstudiante = "";
        double mejorPromedio = -1;

        String peorEstudiante = "";
        double peorPromedio = 101; // Un valor mayor que cualquier calificación posible

        // Iterar a través del HashMap de calificaciones
        for (Map.Entry<String, List<Double>> entry : calificaciones.entrySet()) {
            String nombre = entry.getKey();
            List<Double> listaCalificaciones = entry.getValue();

            // Calcular el promedio de las calificaciones del estudiante actual
            double sumaCalificaciones = 0;
            for (double calificacion : listaCalificaciones) {
                sumaCalificaciones += calificacion;
            }
            double promedioEstudiante = sumaCalificaciones / listaCalificaciones.size();

            // Almacenar el promedio en el nuevo HashMap
            promedios.put(nombre, promedioEstudiante);

            // Actualizar el mejor y peor promedio
            if (promedioEstudiante > mejorPromedio) {
                mejorPromedio = promedioEstudiante;
                mejorEstudiante = nombre;
            }
            if (promedioEstudiante < peorPromedio) {
                peorPromedio = promedioEstudiante;
                peorEstudiante = nombre;
            }
        }

        // 3. Mostrar resultados
        System.out.println("Promedios de los estudiantes:");
        for (Map.Entry<String, Double> entry : promedios.entrySet()) {
            System.out.println(entry.getKey() + ": " + String.format("%.2f", entry.getValue()));
        }

        System.out.println("Mejor promedio: " + String.format("%.2f", mejorPromedio) + " (" + mejorEstudiante + ")");
        System.out.println("Peor promedio: " + String.format("%.2f", peorPromedio) + " (" + peorEstudiante + ")");
    }

    /**
     * Función auxiliar para calcular el promedio de una lista de números.
     * @param numeros Lista de números.
     * @return El promedio.
     */
    public static double calcularPromedio(List<Double> numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.size();
    }
}
