package Ejercicio2;


public class Ejercicio2 {

    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        b.agregarMaterial(new Libro(1, "Diccionario", 2000, true));
        b.agregarMaterial(new Libro(2, "Harry Potter", 1997, false));
        b.agregarMaterial(new Revista(3, "National Geographic", 2023));

        b.listarPrestables();
    }
}
