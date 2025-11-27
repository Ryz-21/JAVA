abstract class Vehiculo {
    private String modelo;
    public Vehiculo(String modelo) { this.modelo = modelo; }
    public String getModelo() { return modelo; }
    public abstract double costoMantenimiento();
}

class Auto extends Vehiculo {
    public Auto(String modelo) { super(modelo); }
    @Override
    public double costoMantenimiento() { return 250.0; }
}

class Moto extends Vehiculo {
    public Moto(String modelo) { super(modelo); }
    @Override
    public double costoMantenimiento() { return 150.0; }
}

class Mecanico {
    private String nombre;
    private Registro registro;
    private List<Vehiculo> vehiculos;

    public Mecanico(String nombre, String nivel) {
        this.nombre = nombre;
        this.registro = new Registro(nivel);
        this.vehiculos = new ArrayList<>();
    }

    public void asignarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void mostrarAtenciones() {
        System.out.println("Mecánico: " + nombre);
        System.out.println("Nivel: " + registro.getNivel());
        for (Vehiculo v : vehiculos) {
            System.out.println("- " + v.getModelo() + " → Costo: " + v.costoMantenimiento());
        }
        System.out.println();
    }

    private class Registro {
        private String nivel;
        public Registro(String nivel) { this.nivel = nivel; }
        public String getNivel() { return nivel; }
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Vehiculo auto = new Auto("Toyota");
        Vehiculo moto = new Moto("Yamaha");

        Mecanico pedro = new Mecanico("Pedro", "Experto");
        pedro.asignarVehiculo(auto);
        pedro.asignarVehiculo(moto);

        pedro.mostrarAtenciones();
    }
}
