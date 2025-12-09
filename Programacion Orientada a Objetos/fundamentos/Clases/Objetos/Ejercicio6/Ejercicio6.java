package Ejercicio6;

import java.util.*;
abstract class Animal {
    private String nombre; 

    public Animal (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public abstract void emitirSonido();
    public abstract String alimentacion();
}

class Mamifero extends Animal {
    
    public Mamifero (String nombre){
        super(nombre);
    }

    @Override
    public void emitirSonido (){
        System.out.println(getNombre() +"RAWRRRRRRRRRRRRR");
    }

    @Override
    public String alimentacion (){
        return "- leche - carnivoro - hervivioro (segun especie)";
    }
}

class Ave extends Animal {
    public Ave (String nombre){
        super(nombre);
    }
    @Override
    public void emitirSonido(){
        System.out.println("COCOROOOOK");
    }
    @Override
    public String alimentacion(){
        return "granos - plantas - etc";
    }
}


class cuidador {    
    private String nombre;
    private List<Animal> animalesAcargo;
    private Agenda Agenda;

    public cuidador(String nombre, String turno) {
        this.nombre = nombre;
        this.animalesAcargo = new ArrayList<>();
        this.Agenda = new Agenda(turno);
    }

    public void asignarAnimal (Animal animal ){
        animalesAcargo.add(animal);
    }

       public void mostrarAnimales() {
        System.out.println("Cuidador: " + nombre);
        System.out.println("Turno: " + Agenda.ObtenerTurno());
        System.out.println("Animales a cargo:");

        for (Animal a : animalesAcargo) {
            System.out.println(" - " + a.getNombre() + " (" + a.getClass().getSimpleName() + ")");
        }
        System.out.println();
    }
    
    private class Agenda {
    private String turno;
    public Agenda (String turno){
        this.turno = turno;
    }
    public String ObtenerTurno() {
        return turno;
    }
  }
}
public class Ejercicio6 {
    /*
Ejercicio 6 — Zoo con animales y cuidadores
Objetivo: Representar animales con comportamientos comunes y cuidadores asignados.
Clases a implementar:

public abstract class Animal — métodos abstractos: void emitirSonido() y String alimentacion().
public class Mamifero extends Animal, public class Ave extends Animal.
public class Cuidador (pública) — dentro, una private class Agenda para turnos diarios.
Relaciones: asignar cuidadores a animales.
Requisitos y notas:
Animal es abstracta; subclases usan extends.
Agenda privada como inner class.
Nivel: Medio
Ejemplo: listar qué cuidador cuida a qué animales y sus turnos (esquema).*/
    public static void main(String[] args) {

     Animal leon = new Mamifero("León");
        Animal mono = new Mamifero("Mono");
        Animal aguila = new Ave("Águila");

        // Crear cuidadores
        cuidador juan = new cuidador("Juan", "Mañana");
        cuidador maria = new cuidador("María", "Tarde");

        // Asignar animales
        juan.asignarAnimal(leon);
        juan.asignarAnimal(aguila);

        maria.asignarAnimal(mono);

        // Mostrar información
        juan.mostrarAnimales();
        maria.mostrarAnimales();

        // Mostrar sonidos
        leon.emitirSonido();
        aguila.emitirSonido();
        mono.emitirSonido();

        System.out.println("\nAlimentación del León: " + leon.alimentacion());

}
}