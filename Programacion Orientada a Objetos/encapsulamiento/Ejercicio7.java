// EJERCICIO 7: Clase Biblioteca con gestión de libros
//
// Objetivo: Crear una clase Biblioteca que gestione libros con encapsulamiento
// Requiere una clase auxiliar Libro
//
// Clase Libro:
// - Atributos privados: ISBN, título, autor, año, disponible
// - ISBN es inmutable
// - Crear getters para todos los atributos
// - Crear método prestar() que cambie disponible a false
// - Crear método devolver() que cambie disponible a true
//
// Clase Biblioteca:
// - Atributos privados: nombre, lista de libros, capacidad máxima
// - Crear método agregarLibro(libro) con validación de capacidad
// - Crear método buscarPorISBN(isbn) que retorne el libro o null
// - Crear método buscarPorAutor(autor) que retorne lista de libros
// - Crear método prestarLibro(isbn) que lo marque como no disponible
// - Crear método devolverLibro(isbn) que lo marque como disponible
// - Crear método obtenerLibrosDisponibles() que retorne lista
// - Crear método obtenerLibrosNoDisponibles() que retorne lista
//
// TODO: Implementar la clase Libro con encapsulamiento
// TODO: Implementar métodos de Libro: prestar, devolver
// TODO: Implementar la clase Biblioteca
// TODO: Implementar método agregarLibro con validación
// TODO: Implementar métodos de búsqueda
// TODO: Implementar métodos de gestión (prestar, devolver)

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Clase Libro
class Libro {
    // Atributos privados
    private final String isbn; // Inmutable
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponible;

    /**
     * Constructor de la clase Libro.
     */
    public Libro(String isbn, String titulo, String autor, int ano) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponible = true; // Por defecto, el libro está disponible
    }

    // --- Getters ---

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // --- Métodos de gestión ---

    /**
     * Marca el libro como no disponible (prestado).
     * @return true si el préstamo fue exitoso, false si ya estaba prestado.
     */
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    /**
     * Marca el libro como disponible (devuelto).
     * @return true si la devolución fue exitosa, false si ya estaba disponible.
     */
    public boolean devolver() {
        if (!disponible) {
            disponible = true;
            return true;
        }
        return false;
    }

    // Método toString para una fácil impresión (opcional, pero útil)
    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Título: " + titulo + ", Autor: " + autor + 
               ", Año: " + ano + ", Disponible: " + (disponible ? "Sí" : "No");
    }
}


// Clase Biblioteca
class Biblioteca {
    // Atributos privados
    private String nombre;
    private List<Libro> listaDeLibros;
    private int capacidadMaxima;

    /**
     * Constructor de la clase Biblioteca.
     */
    public Biblioteca(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.listaDeLibros = new ArrayList<>();
    }

    // --- Métodos de gestión de libros ---

    /**
     * Agrega un libro a la biblioteca, validando la capacidad máxima.
     * @param libro El objeto Libro a agregar.
     * @return true si se agregó, false si se superó la capacidad.
     */
    public boolean agregarLibro(Libro libro) {
        if (listaDeLibros.size() < capacidadMaxima) {
            listaDeLibros.add(libro);
            return true;
        } else {
            System.out.println(" ERROR: La biblioteca ha alcanzado su capacidad máxima de " + capacidadMaxima + " libros.");
            return false;
        }
    }

    /**
     * Busca un libro por su ISBN.
     * @param isbn El ISBN a buscar.
     * @return El objeto Libro si se encuentra, o null si no existe.
     */
    public Libro buscarPorISBN(String isbn) {
        for (Libro libro : listaDeLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null; // No encontrado
        // Alternativa con Streams:
        // return listaDeLibros.stream()
        //         .filter(libro -> libro.getIsbn().equals(isbn))
        //         .findFirst()
        //         .orElse(null);
    }

    /**
     * Busca todos los libros escritos por un autor.
     * @param autor El nombre del autor a buscar.
     * @return Una lista de objetos Libro. La lista puede estar vacía.
     */
    public List<Libro> buscarPorAutor(String autor) {
        return listaDeLibros.stream()
                .filter(libro -> libro.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    /**
     * Marca un libro como no disponible (prestado) buscando por ISBN.
     * @param isbn El ISBN del libro a prestar.
     * @return true si se pudo prestar, false si no se encontró o ya estaba prestado.
     */
    public boolean prestarLibro(String isbn) {
        Libro libro = buscarPorISBN(isbn);
        if (libro != null) {
            return libro.prestar(); // Llama al método prestar() de la clase Libro
        }
        return false; // Libro no encontrado
    }

    /**
     * Marca un libro como disponible (devuelto) buscando por ISBN.
     * @param isbn El ISBN del libro a devolver.
     * @return true si se pudo devolver, false si no se encontró o ya estaba disponible.
     */
    public boolean devolverLibro(String isbn) {
        Libro libro = buscarPorISBN(isbn);
        if (libro != null) {
            return libro.devolver(); // Llama al método devolver() de la clase Libro
        }
        return false; // Libro no encontrado
    }

    /**
     * Obtiene una lista de todos los libros que están disponibles.
     * @return Una lista de objetos Libro disponibles.
     */
    public List<Libro> obtenerLibrosDisponibles() {
        return listaDeLibros.stream()
                .filter(Libro::isDisponible)
                .collect(Collectors.toList());
    }

    /**
     * Obtiene una lista de todos los libros que no están disponibles.
     * @return Una lista de objetos Libro no disponibles.
     */
    public List<Libro> obtenerLibrosNoDisponibles() {
        return listaDeLibros.stream()
                .filter(libro -> !libro.isDisponible())
                .collect(Collectors.toList());
    }

    public String getNombre() {
        return nombre;
    }
}


public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Inicializando la gestión de la biblioteca.");

        // 1. Crear la Biblioteca con una capacidad máxima de 3 libros para la prueba
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central", 3);

        // 2. Crear algunos libros
        Libro libro1 = new Libro("978-0321765723", "Effective Java", "Joshua Bloch", 2018);
        Libro libro2 = new Libro("978-8420471181", "Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro3 = new Libro("978-0134685991", "The Java Programming Language", "Ken Arnold", 2005);
        Libro libro4 = new Libro("978-0123456789", "Libro Extra", "Autor Extra", 2020);

        // 3. Agregar libros
        System.out.println("\n--- Agregando Libros ---");
        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);
        miBiblioteca.agregarLibro(libro3);

        // Prueba de capacidad máxima (debe fallar)
        miBiblioteca.agregarLibro(libro4); 

        // 4. Buscar y Prestar un Libro
        System.out.println("\n--- Gestión de Préstamos y Devoluciones ---");
        String isbnAprestar = "978-0321765723";
        if (miBiblioteca.prestarLibro(isbnAprestar)) {
            System.out.println("Libro prestado exitosamente (ISBN: " + isbnAprestar + ")");
        } else {
            System.out.println(" Fallo al prestar el libro (ISBN: " + isbnAprestar + ")");
        }

        // Intento de prestar un libro ya prestado
        if (!miBiblioteca.prestarLibro(isbnAprestar)) {
            System.out.println("Intento de prestar el mismo libro: Falló como se esperaba (ya está prestado).");
        }

        // 5. Buscar Libros por Autor
        System.out.println("\n--- Búsqueda por Autor ---");
        List<Libro> librosGGM = miBiblioteca.buscarPorAutor("Gabriel García Márquez");
        System.out.println("Libros de 'Gabriel García Márquez' (" + librosGGM.size() + "):");
        for (Libro libro : librosGGM) {
            System.out.println(" -> " + libro.getTitulo());
        }

        // 6. Listar libros disponibles y no disponibles
        System.out.println("\n--- Libros Disponibles ---");
        miBiblioteca.obtenerLibrosDisponibles().forEach(libro -> System.out.println(" Disponible: " + libro));

        System.out.println("\n--- Libros No Disponibles (Prestados) ---");
        miBiblioteca.obtenerLibrosNoDisponibles().forEach(libro -> System.out.println(" Prestado: " + libro));
        
        System.out.println("\n--- Devolución ---");
        if (miBiblioteca.devolverLibro(isbnAprestar)) {
            System.out.println(" Libro devuelto exitosamente (ISBN: " + isbnAprestar + ")");
        }

        // Listar disponibles de nuevo para verificar la devolución
        System.out.println("\n--- Libros Disponibles después de la devolución ---");
        miBiblioteca.obtenerLibrosDisponibles().forEach(libro -> System.out.println(" Disponible: " + libro));
    }
}