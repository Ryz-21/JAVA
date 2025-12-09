package Ejercicio3;

public class EmpleadoFijo extends Empleado {

    private double salarioMensual;

    public EmpleadoFijo(String nombre, int id, double salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}
