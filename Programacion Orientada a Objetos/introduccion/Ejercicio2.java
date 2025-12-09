
// Definición de la clase Auto fuera de Ejercicio2
class Auto {
    String marca;
    String modelo;
    int año;
    
    // Constructor vacío (sin parámetros)
    public Auto() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.año = 0;
    }
    
    // Constructor con parámetros para marca, modelo y año
    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método auxiliar para mostrar los detalles del auto
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }
}


public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear autos usando ambos constructores
        
        // Auto 1: Usando el constructor vacío
        Auto auto1 = new Auto();
        // Opcional: asignar valores después de la creación
        auto1.marca = "Toyota"; 
        auto1.modelo = "Corolla";
        auto1.año = 2022;

        System.out.println("Detalles del Auto 1:");
        auto1.mostrarDetalles();
        
        // Auto 2: Usando el constructor con parámetros
        Auto auto2 = new Auto("Ford", "Focus", 2024);

        System.out.println("Detalles del Auto 2:");
        auto2.mostrarDetalles();

        // Auto 3: Usando nuevamente el constructor con parámetros
        Auto auto3 = new Auto("Honda", "Civic", 2023);

        System.out.println("Detalles del Auto 3:");
        auto3.mostrarDetalles();
    }
}
