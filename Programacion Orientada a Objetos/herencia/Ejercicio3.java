/*
Ejercicio 3: Clase Vehiculo con marca, modelo y método mover(). 
Crear Coche (atributo numPuertas), Bicicleta (atributo tipoCambio) y Barco (atributo tonelaje).
 Añadir un método detalle() que sea común y otro modoPropulsion() que puedan sobrescribir las subclases.
 */

abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método abstracto que debe ser implementado por todos
    public abstract void mover();
    
    // Método común a todas las clases (no abstracto)
    public void detalle() {
        System.out.println("Vehículo: Marca=" + marca + ", Modelo=" + modelo);
    }
    
    // Método que las subclases *pueden* sobrescribir (no abstracto, con implementación por defecto)
    public void modoPropulsion() {
        System.out.println("Se propulsa mediante un método genérico.");
    }
}

// Subclase Coche
class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int numPuertas) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mover() {
        System.out.println("El coche se desplaza por carretera.");
    }
    
    // Sobrescribimos detalle para añadir información extra
    @Override
    public void detalle() {
        super.detalle(); // Llama al detalle de la clase base
        System.out.println("Tiene " + numPuertas + " puertas.");
    }

    @Override
    public void modoPropulsion() {
        System.out.println("Se propulsa usando un motor de combustión.");
    }
}

class Bicicleta extends Vehiculo {
    private String tipoCambio;

    public Bicicleta(String marca, String modelo, String tipoCambio) {
        super(marca, modelo);
        this.tipoCambio = tipoCambio;
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta se desplaza pedaleando.");
    }

    @Override
    public void detalle() {
        super.detalle();
        System.out.println("Tiene tipo de cambio: " + tipoCambio);
    }
    
    @Override
    public void modoPropulsion() {
        System.out.println("Se propulsa con energía humana.");
    }
}

class Barco extends Vehiculo {
    private double tonelaje;

    public Barco(String marca, String modelo, double tonelaje) {
        super(marca, modelo);
        this.tonelaje = tonelaje;
    }

    @Override
    public void mover() {
        System.out.println("El barco navega sobre el agua.");
    }

    @Override
    public void detalle() {
        super.detalle();
        System.out.println("Tiene un tonelaje de: " + tonelaje + " toneladas.");
    }
    
    // Este usa el modoPropulsion() genérico de la clase padre si no lo sobrescribimos,
    // pero el ejercicio pide que puedan sobrescribirlo, así que lo hacemos aquí:
    @Override
    public void modoPropulsion() {
        System.out.println("Se propulsa con un motor diésel marino.");
    }
}


// Clase principal para probar el código
public class Ejercicio3 {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 4);
        Bicicleta miBici = new Bicicleta("Orbea", "Alma", "Shimano XT");
        Barco miBarco = new Barco("Princess", "V40", 12.5);

        miCoche.mover();
        miCoche.detalle();
        miCoche.modoPropulsion();

        miBici.mover();
        miBici.detalle();
        miBici.modoPropulsion();
        
        miBarco.mover();
        miBarco.detalle();
        miBarco.modoPropulsion();
    }
}
