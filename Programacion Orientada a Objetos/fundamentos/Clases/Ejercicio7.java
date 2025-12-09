/*
 * EJERCICIO 7: Clase Empleado
 * 
 * Crea una clase Empleado con los siguientes requisitos:
 * - Atributos: nombre (String), id (int), salario (double), departamento (String), tiempoServicio (int)
 * - Constructor que inicialice los atributos
 * - Método darAumento(double porcentaje) que incremente el salario por el porcentaje dado
 * - Método calcularBono() que devuelva:
 *   - 10% del salario si tiempoServicio < 5 años
 *   - 15% si tiempoServicio entre 5 y 10 años
 *   - 20% si tiempoServicio > 10 años
 * - Método esGerente() que devuelva true si el departamento es "Gerencia"
 * - Método toString() que muestre la información completa del empleado
 * 
 * En main, crea varios empleados de diferentes departamentos, 
 * calcula sus bonos y da aumentos.
 */

public class Ejercicio7 {
    
    // TODO: Implementar aquí
    // Definición de la clase Empleado
    public static class Empleado {
        // Atributos
        private String nombre;
        private int id;
        private double salario;
        private String departamento;
        private int tiempoServicio; // en años

        // Constructor
        public Empleado(String nombre, int id, double salario, String departamento, int tiempoServicio) {
            this.nombre = nombre;
            this.id = id;
            this.salario = salario;
            this.departamento = departamento;
            this.tiempoServicio = tiempoServicio;
        }

        // Método darAumento(double porcentaje)
        public void darAumento(double porcentaje) {
            if (porcentaje > 0) {
                this.salario += this.salario * (porcentaje / 100);
            }
        }

        // Método calcularBono()
        public double calcularBono() {
            double porcentajeBono;
            if (tiempoServicio < 5) {
                porcentajeBono = 0.10; // 10%
            } else if (tiempoServicio <= 10) {
                porcentajeBono = 0.15; // 15%
            } else {
                porcentajeBono = 0.20; // 20%
            }
            return this.salario * porcentajeBono;
        }

        // Método esGerente()
        public boolean esGerente() {
            return this.departamento.equalsIgnoreCase("Gerencia");
        }

        // Método toString()
        @Override
        public String toString() {
            return "Empleado{" +
                    "nombre='" + nombre + '\'' +
                    ", id=" + id +
                    ", salario=" + salario +
                    ", departamento='" + departamento + '\'' +
                    ", tiempoServicio=" + tiempoServicio + " años" +
                    '}';
        }
    }

    public static void main(String[] args) {
        // TODO: Crear objetos y probar los métodos

        // Crear varios empleados
        Empleado emp1 = new Empleado("Juan Pérez", 101, 50000.0, "Ventas", 3);
        Empleado emp2 = new Empleado("María García", 102, 70000.0, "Gerencia", 8);
        Empleado emp3 = new Empleado("Carlos López", 103, 45000.0, "IT", 12);

        // Mostrar información inicial
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println("\n");

        // Calcular y mostrar bonos
        System.out.printf("Bono para %s: %.2f\n", emp1.esGerente() ? emp1.toString().split("'")[1] : "Empleado 1 (Juan Pérez)", emp1.calcularBono());
        System.out.printf("Bono para %s: %.2f\n", emp2.esGerente() ? emp2.toString().split("'")[1] : "Empleado 2 (María García)", emp2.calcularBono());
        System.out.printf("Bono para %s: %.2f\n", emp3.esGerente() ? emp3.toString().split("'")[1] : "Empleado 3 (Carlos López)", emp3.calcularBono());
        System.out.println("\n");

        // Dar aumentos y mostrar información actualizada
        emp1.darAumento(10); // Aumento del 10%
        emp2.darAumento(5);  // Aumento del 5%
        emp3.darAumento(8);  // Aumento del 8%

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println("\n");
        
        // Verificar si son gerentes
        System.out.println(emp1.toString().split("'")[1] + " es gerente: " + emp1.esGerente());
        System.out.println(emp2.toString().split("'")[1] + " es gerente: " + emp2.esGerente());
        System.out.println(emp3.toString().split("'")[1] + " es gerente: " + emp3.esGerente());
    }
}
