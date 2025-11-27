package Ejercicio3;

import java.util.ArrayList;

public class Departamento {

    private ArrayList<Empleado> empleados = new ArrayList<>();
    private RegistroAsistencia registro = new RegistroAsistencia();

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void registrarHoras(int idEmpleado, int horas) {
        registro.registrar(idEmpleado, horas);
    }

    public double calcularNominaTotal() {
        double total = 0;

        for (Empleado e : empleados) {

            // Si es empleado por hora, actualizamos sus horas
            if (e instanceof EmpleadoPorHora) {
                int horasReg = registro.obtenerHoras(e.getId());
                  ((EmpleadoPorHora) e).setHorasTrabajadas(horasReg);
            }

            total += e.calcularSalario();
        }
        return total;
    }

    // ⭐ Clase interna privada
    private class RegistroAsistencia {
        private ArrayList<Integer> ids = new ArrayList<>();
        private ArrayList<Integer> horas = new ArrayList<>();

        void registrar(int id, int h) {
            ids.add(id);
            horas.add(h);
        }

        int obtenerHoras(int id) {
            for (int i = 0; i < ids.size(); i++) {
                if (ids.get(i) == id) {
                    return horas.get(i);
                }
            }
            return 0;
        }
    }
}
