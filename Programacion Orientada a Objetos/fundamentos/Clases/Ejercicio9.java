/*
 * EJERCICIO 9: Clase Mascotas
 * 
 * Crea una clase Mascota con los siguientes requisitos:
 * - Atributos: nombre (String), especie (String), edad (int), peso (double), 
 *   energia (int entre 0 y 100)
 * - Constructor que inicialice todos los atributos
 * - Método alimentar() que incremente la energía en 15 (máximo 100)
 * - Método jugar() que disminuya la energía en 20 (mínimo 0)
 * - Método dormir(int horas) que aumente energía en 10 * horas (máximo 100)
 * - Método estaEnergica() que devuelva true si energía > 60
 * - Método estaAgotada() que devuelva true si energía < 20
 * - Método crecer(int anios) que incremente la edad
 * - Método toString() que muestre toda la información de la mascota
 * 
 * En main, crea una mascota y simula diferentes acciones: juega, come, duerme,
 * observando cómo cambia su estado de energía.
 */

class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;
    int energia;

    public Mascota(String nombre, String especie, int edad, double peso, int energia) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.energia = Math.max(0, Math.min(energia, 100));
    }

    public void crecer (int a){
        this.edad += a;
    }
    
    public boolean estaenergia (){
        return this.energia > 60;
    }

    public boolean agotada (){
        return this.energia < 20;
    }
    private void ajustarEnergia(int cambio){
        int nuevaEnergia = this.energia + cambio;
        this.energia = Math.max(0, Math.min(nuevaEnergia, 100));
        System.out.println("-> Cambio de energía: " + cambio + ". Energía actual: " + this.energia);
    }

    public void dormir (int horas){
        System.out.println("la mascota esta durmiendo");
        ajustarEnergia(15*horas);
    }
    public void alimentar (){
        System.out.println(nombre + "esta comiendo");
        ajustarEnergia(15);
    }

    public void jugar(){
        System.out.println("esta jugando inentsamente");
        ajustarEnergia(-20);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}

public class Ejercicio9 {
    
    // TODO: Implementar aquí
    
    public static void main(String[] args) {
        // TODO: Crear objeto y simular acciones
            // Crear objeto de Mascota con energía inicial 50
        Mascota miMascota = new Mascota("Max", "Perro", 2, 15.5, 50);

        System.out.println("--- Inicio de la simulación ---");
        System.out.println(miMascota.toString());
        
        System.out.println("\n--- Acciones ---");
        
        // Simular jugar (usa el método público)
        miMascota.jugar(); 
        System.out.println(miMascota.toString());

        // Simular jugar de nuevo (usa el método público)
        miMascota.jugar(); 
        System.out.println(miMascota.toString());

        // Simular comer (usa el método público)
        miMascota.alimentar(); 
        System.out.println(miMascota.toString());

        // Simular dormir (usa el método público con parámetro)
        miMascota.dormir(5); // Debería llegar a 100
        System.out.println(miMascota.toString());

        // Simular crecer (usa el método público con parámetro)
        miMascota.crecer(1);
        System.out.println(miMascota.toString());
    }
}
