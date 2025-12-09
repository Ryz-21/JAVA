/*
Ejercicio 5 — Polimorfismo y gestión de flotas de vehículos

Enunciado:
Diseña una jerarquía de vehículos con una clase base `Vehiculo` que tenga métodos como
`public void mover()` y `public double consumirCombustible(double distancia)`. Implementa subclases
`Coche`, `Moto` y `Camion` que sobrescriban los métodos para reflejar comportamientos distintos (consumo,
velocidad, capacidad de carga).

Tareas:
- Definir `Vehiculo` y las subclases `Coche`, `Moto` y `Camion` con atributos y métodos apropiados.
- Implementar una clase `GestorFlota` que mantenga una lista de `Vehiculo` y tenga operaciones como
	`recorrerTodos(double distancia)` que llame a `mover()` y acumule combustible consumido usando
	`consumirCombustible(...)`, demostrando polimorfismo.
- (Reto) Añadir un comportamiento específico por tipo (por ejemplo, `Camion` puede cargar/descargar) y mostrar
	cómo usar `instanceof` o casting cuando sea estrictamente necesario.

Nota: Mantén las implementaciones abiertas para que puedas resolverlo tú mismo.
*/

 import java.util.*;

// Clase base
abstract class Vehiculo {
    protected String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public abstract void mover();

    public abstract double consumirCombustible(double distancia);
}


class Coche extends Vehiculo {
    private double consumoPorKm = 0.08; // 8 litros/100km

    public Coche(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " (Coche) avanzando...");
    }

    @Override
    public double consumirCombustible(double distancia) {
        return distancia * consumoPorKm;
    }
}

class Moto extends Vehiculo {
    private double consumoPorKm = 0.04; 

    public Moto(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " (Moto) avanzando...");
    }

    @Override
    public double consumirCombustible(double distancia) {
        return distancia * consumoPorKm;
    }
}

class Camion extends Vehiculo {
    private double consumoPorKm = 0.20; 

    public Camion(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " (Camión) avanzando pesadamente...");
    }

    @Override
    public double consumirCombustible(double distancia) {
        return distancia * consumoPorKm;
    }
}


class GestorFlota {
    private ArrayList<Vehiculo> flota = new ArrayList<>();

    public void agregar(Vehiculo v) {
        flota.add(v);
    }

    // Recorren todos los vehículos
    public double recorrerTodos(double distancia) {
        double total = 0;

        for (Vehiculo v : flota) {
            v.mover(); 
            total += v.consumirCombustible(distancia); 
        }

        return total;
    }
}


public class Ejercicio5 {
    public static void main(String[] args) {

        GestorFlota gestor = new GestorFlota();

        gestor.agregar(new Coche("Toyota"));
        gestor.agregar(new Moto("Honda"));
        gestor.agregar(new Camion("Volvo"));

        double total = gestor.recorrerTodos(50); // 50 km

        System.out.println("\nCombustible total consumido: " + total + " litros");
    }
}
