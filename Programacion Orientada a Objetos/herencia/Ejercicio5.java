/*
Ejercicio 5: Sistema de empleados: clase Empleado con nombre, salarioBase y método calcularSalario().
 Crear EmpleadoPorHoras (horas trabajadas + tarifa por hora) y EmpleadoAsalariado (salario mensual).
  Añadir Gerente que extiende EmpleadoAsalariado y tiene bono; sobrescribir calcularSalario() 
  según cada caso.
 */
// Clase base
abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();
}

// Empleado por horas
class EmpleadoPorHoras extends Empleado {
    private int horas;
    private double tarifa;

    public EmpleadoPorHoras(String nombre, double salarioBase, int horas, double tarifa) {
        super(nombre, salarioBase);
        this.horas = horas;
        this.tarifa = tarifa;
    }

    @Override
    double calcularSalario() {
        return salarioBase + (horas * tarifa);
    }
}

// Empleado asalariado
class EmpleadoAsalariado extends Empleado {
    public EmpleadoAsalariado(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    double calcularSalario() {
        return salarioBase; // salario mensual fijo
    }
}

// Gerente
class Gerente extends EmpleadoAsalariado {
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    double calcularSalario() {
        return super.calcularSalario() + bono;
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Empleado p1 = new EmpleadoPorHoras("Ana", 300, 40, 10);
        Empleado p2 = new EmpleadoAsalariado("Luis", 1500);
        Empleado g1 = new Gerente("Mario", 2000, 500);

        System.out.println(p1.calcularSalario());
        System.out.println(p2.calcularSalario());
        System.out.println(g1.calcularSalario());
    }
}
