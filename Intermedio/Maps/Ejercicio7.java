
/**
 * EJERCICIO 7: GESTOR DE EMPLEADOS
 * 
 * PREGUNTA: Desarrolla un sistema de gestión de empleados donde cada empleado 
 * tiene ID único, nombre, departamento y salario. Implementa funciones para 
 * añadir empleados, actualizar salarios, buscar por departamento y calcular 
 * la nómina total.
 * 
 * PISTA: Crea una clase Empleado con atributos (nombre, departamento, salario). 
 * Usa HashMap<Integer, Empleado> donde la clave es el ID. Para buscar por 
 * departamento, itera sobre los valores del mapa. Usa streams o bucles para 
 * filtrar y calcular totales.
 */
import java.util.HashMap;
import java.util.Map;

import ArrayList.Ejercicio5;

class Empleado {
    private String nombre;
    private String departamento;
    private double salario;

    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nombre + " | " + departamento + " | $" + salario;
    }
}

public class Ejercicio7 {

    private Map<Integer, Empleado> empleados = new HashMap<>();

    //1: Agregar empleado
    public void agregarEmpleado(int id, String nombre, String departamento, double salario) {
        empleados.put(id, new Empleado(nombre, departamento, salario));
    }

    //Método 2: Actualizar salario
    public boolean actualizarSalario(int id, double nuevoSalario) {
        Empleado e = empleados.get(id);
        if (e != null) {
            e.setSalario(nuevoSalario);
            return true;
        }
        return false;
    }

    // Método 3: Buscar empleados por departamento
    public void buscarPorDepartamento(String depto) {
        System.out.println("Empleados del departamento " + depto + ":");
        empleados.values().stream()
                .filter(e -> e.getDepartamento().equalsIgnoreCase(depto))
                .forEach(System.out::println);
    }

    // Método 4: Calcular nómina total
    public double calcularNominaTotal() {
        return empleados.values().stream()
                .mapToDouble(Empleado::getSalario)
                .sum();
    }

    public static void main(String[] args) {
        Ejercicio7 gestor = new Ejercicio7();

        gestor.agregarEmpleado(1, "Luis", "Sistemas", 3500);
        gestor.agregarEmpleado(2, "Ana", "RRHH", 2800);
        gestor.agregarEmpleado(3, "Carlos", "Sistemas", 4000);

        gestor.buscarPorDepartamento("Sistemas");

        gestor.actualizarSalario(1, 3800);

        System.out.println("Nómina total: $" + gestor.calcularNominaTotal());
    }
}
