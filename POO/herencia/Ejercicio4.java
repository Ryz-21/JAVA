/*
Ejercicio 4: Jerarquía de animales: clase Animal con método hacerSonido() y alimentarse(). 
Crear Mamifero y Ave como subclases intermedias; luego Perro (con comportamiento de ladrar
y métodos de entrenamiento) y Pato (que puede nadar() y volar() o no).
 Diseña qué métodos son abstractos y cuáles no.
*/

// Clase base
abstract class Animal {
    abstract void hacerSonido();
    abstract void alimentarse();
}

// Subclase intermedia Mamífero
abstract class Mamifero extends Animal {
    // No obliga a nuevos métodos
}

// Subclase intermedia Ave
abstract class Ave extends Animal {
    // Por defecto, algunas aves no vuelan
    void volar() {
        System.out.println("Esta ave no puede volar.");
    }
}

// Clase concreta Perro
class Perro extends Mamifero {
    @Override
    void hacerSonido() { System.out.println("Guau!"); }

    @Override
    void alimentarse() { System.out.println("El perro come croquetas."); }

    void entrenar() {
        System.out.println("El perro está siendo entrenado.");
    }
}

// Clase concreta Pato
class Pato extends Ave {
    @Override
    void hacerSonido() { System.out.println("Cuac!"); }

    @Override
    void alimentarse() { System.out.println("El pato come granos."); }

    @Override
    void volar() {
        System.out.println("El pato vuela una corta distancia.");
    }

    void nadar() {
        System.out.println("El pato está nadando.");
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Perro p = new Perro();
        p.hacerSonido();
        p.entrenar();

        Pato pa = new Pato();
        pa.hacerSonido();
        pa.nadar();
        pa.volar();
    }
}
