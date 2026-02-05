class Empleado {
    String nombre;
    double sueldo;

    public Empleado() {
        this("sin nombre", 0);
    }

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void mostrar() {
        System.out.println("el nombre es " + nombre + " y el sueldo es " + sueldo);
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.mostrar();
        Empleado e2 = new Empleado("Juan", 1000);
        e2.mostrar();
    }
}
