/*
Ejercicio 1 — Polimorfismo básico: Animales

Enunciado:
Diseña una jerarquía de clases para representar animales. Crea una clase base `Animal` con al menos el método
`public String hacerSonido()` (o `void hacerSonido()` si prefieres mostrar salida). Implementa las subclases
`Perro` y `Gato` que sobrescriban el método para devolver (o imprimir) el sonido correspondiente.

Tareas:
- Definir la clase `Animal` (puede ser abstracta) con el método `hacerSonido()`.
- Implementar `Perro` y `Gato` sobrescribiendo `hacerSonido()`.
- En una clase con `main`, crear un arreglo o lista de `Animal` que contenga instancias de `Perro` y `Gato` y
	recorrerla llamando a `hacerSonido()` para demostrar polimorfismo en tiempo de ejecución.

Opcional (reto):
- Agrega una interfaz `Mascota` con método `jugar()` e implementa dicha interfaz en `Perro` y `Gato`, mostrando
	cómo un mismo objeto puede tratarse por tipo de clase base o por interfaz.

Restricción: No incluyas la solución completa aquí; solo implementa las clases cuando resuelvas el ejercicio.
*/


abstract class Animales {
    String nombre;
    
    public Animales(String nombre) {
        this.nombre = nombre;
    }

    abstract String hacersonido ();
}

class gato extends Animales {

    public gato (String nombre){
        super(nombre);
    }

    public String hacersonido (){
        return "el gato de nombre " + nombre +" hace:GRRRRRRRRRR"; 
    }

}

class perro extends Animales {

    public perro (String nombre){
        super(nombre);
    }

    public String hacersonido (){
        return "el perro de nombre " + nombre + " hace:WOFFFFFFFFFFF"; 
    }

}

public class Ejercicio1 {

     public static void main(String[] args) {
        //SOLO LLAMADO
        perro perro1 = new perro("manuel");
        gato gato1 = new gato("junior");

        System.out.println(perro1.hacersonido());
        System.out.println(gato1.hacersonido());
        
        //separamos espacio en memoria
        //esta manera es lo mismo que : Aniamles[] lista = {new prerro(...),new gato(...)}
        //por que eso es la asignacion directa
        Animales[] lista = new Animales[2];
        lista[0]= new perro("manuelito");
        lista[1] = new gato("juanito");
        //ahora debemos demostrar el polimorfismo de esta manera 
        for (Animales a : lista){
            System.out.println(a.hacersonido());
        }

     }
}