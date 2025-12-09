    package Ejercicio3;

    public class EmpleadoPorHora extends Empleado {

        private double tarifaHora;
        private int horasTrabajadas;

        public EmpleadoPorHora(String nombre, int id, double tarifaHora, int horasTrabajadas) {
            super(nombre, id);
            this.tarifaHora = tarifaHora;
            this.horasTrabajadas = horasTrabajadas;
        }

        @Override
        public double calcularSalario() {
            return tarifaHora * horasTrabajadas;
        }

        public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    }

