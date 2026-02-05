public class Constructores {

}

// constructor por defecto
class persona {
    String nombre;

    persona() {
        nombre = "sin nombre";
    }
}

// constructor con parametros
class persona2 {
    String nombre;

    persona2(String nombre) {
        this.nombre = nombre;
    }
}

// constructor sobrecargado
class persona3 {
    String nombre;
    int edad;

    persona3() {
        nombre = "Desconocido";
        edad = 0;
    }

    persona3(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

// constructor copia
class persona4 {
    String nombre;
    int edad;

    persona4(persona4 p) {
        this.nombre = p.nombre;
        this.edad = p.edad;
    }
}

// constructor privado

class persona5 {

    private persona5() {
        System.out.println("constructor privado");
    }
}

// constructor con this

class auto {
    String marca;
    int año;

    auto() {
        this("sin marca", 0); // this se aplica porque se esta llamando a otro constructor
    }

    auto(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }
}
