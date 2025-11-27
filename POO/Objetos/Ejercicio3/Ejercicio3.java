package Ejercicio3;


public class Ejercicio3 {
     public static void main(String[] args) {

        Departamento d = new Departamento();

        Empleado fijo1 = new EmpleadoFijo("Ana", 1, 2500);
        Empleado fijo2 = new EmpleadoFijo("Carlos", 2, 3000);

        EmpleadoPorHora h1 = new EmpleadoPorHora("Luis", 3, 20, 0);
        EmpleadoPorHora h2 = new EmpleadoPorHora("Marta", 4, 25, 0);

        d.agregarEmpleado(fijo1);
        d.agregarEmpleado(fijo2);
        d.agregarEmpleado(h1);
        d.agregarEmpleado(h2);

        // Registrar horas para empleados por hora
        d.registrarHoras(3, 40);
        d.registrarHoras(4, 35);

        double total = d.calcularNominaTotal();
        System.out.println("Nómina total del departamento: " + total);
    }
}
