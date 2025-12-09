/*
 * EJERCICIO 7: Clase Empleado
 * 
 * Crea una clase Empleado con los atributos:
 * - id (int)
 * - nombre (String)
 * - apellido (String)
 * - salarioMensual (double)
 * - departamento (String)
 * - fechaContratacion (String)
 * 
 * Implementa métodos para:
 * - calcularSalarioAnual()
 * - aplicarAumento(double porcentaje)
 * - calcularAntiguedad(int añoActual)
 * - cambiarDepartamento(String nuevoDepartamento)
 * - mostrarInformacionCompleta()
 * 
 * En main, crea tres empleados, aplica aumentos, cámbialos de
 * departamento y muestra su información.
 * 
 * TODO: Implementar la clase con cálculos de salarios y años.
 */



class Empleado {
     int id;
     String nombre;
     String apellido;
     double salarioMensual;
     String departamento;
     String fechaContratacion; 

    // Constructor
    public Empleado(int id, String nombre, String apellido, double salarioMensual, String departamento, String fechaContratacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
        this.departamento = departamento;
        this.fechaContratacion = fechaContratacion;
    }

    // Calcular salario anual
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }

    // Aplicar aumento
    public void aplicarAumento(double porcentaje) {
        if (porcentaje > 0) {
            double aumento = salarioMensual * (porcentaje / 100);
            salarioMensual += aumento;
            System.out.println("Se aplicó un aumento de " + porcentaje + "% a " + nombre);
        } else {
            System.out.println("Porcentaje inválido.");
        }
    }

    // Calcular antigüedad tomando solo el año
    public int calcularAntiguedad(int añoActual) {
        try {
            int añoContratacion = Integer.parseInt(fechaContratacion);
            return añoActual - añoContratacion;
        } catch (NumberFormatException e) {
            System.out.println("Formato de fecha inválido para el empleado " + nombre);
            return 0;
        }
    }

    // Cambiar departamento
    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
        System.out.println(nombre + " ahora pertenece al departamento de " + nuevoDepartamento);
    }

    // Mostrar información completa
    public void mostrarInformacionCompleta() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Salario Mensual: S/ " + salarioMensual);
        System.out.println("Salario Anual: S/ " + calcularSalarioAnual());
        System.out.println("Departamento: " + departamento);
        System.out.println("Fecha de Contratación: " + fechaContratacion);
    }
}


public class Ejercicio7 {
    public static void main(String[] args) {

        // Crear empleados
        Empleado e1 = new Empleado(1, "Carlos", "Ramírez", 2500.0, "Ventas", "2019");
        Empleado e2 = new Empleado(2, "Lucía", "Torres", 3200.0, "Marketing", "2017");
        Empleado e3 = new Empleado(3, "Jorge", "Pérez", 4500.0, "TI", "2015");

        // Aplicar aumentos
        e1.aplicarAumento(10);
        e2.aplicarAumento(5);
        e3.aplicarAumento(12);

        // Cambiar de departamento
        e1.cambiarDepartamento("Logística");
        e2.cambiarDepartamento("Investigación");
        e3.cambiarDepartamento("Seguridad Informática");

        // Mostrar información completa
        e1.mostrarInformacionCompleta();
        e2.mostrarInformacionCompleta();
        e3.mostrarInformacionCompleta();

        // Mostrar antigüedad con año actual 2025
        int añoActual = 2025;
        System.out.println("Antigüedad de " + e1.nombre + ": " + e1.calcularAntiguedad(añoActual) + " años");
        System.out.println("Antigüedad de " + e2.nombre + ": " + e2.calcularAntiguedad(añoActual) + " años");
        System.out.println("Antigüedad de " + e3.nombre + ": " + e3.calcularAntiguedad(añoActual) + " años");
    }
}
