
import java.time.*;
/*
 * EJERCICIO 6: Clase Libro
 * 
 * Crea una clase Libro con los siguientes requisitos:
 * - Atributos: titulo (String), autor (String), isbn (String), paginas (int), anioPublicacion (int)
 * - Constructor que inicialice todos los atributos
 * - Métodos getter y setter para cada atributo
 * - Método esReciente() que devuelva true si fue publicado hace menos de 10 años
 * - Método esClasico() que devuelva true si fue publicado hace más de 50 años
 * - Método compararPorPaginas(Libro otro) que devuelva:
 *   - Negativo si este libro tiene menos páginas
 *   - 0 si tienen la misma cantidad
 *   - Positivo si este libro tiene más páginas
 * - Método toString() que muestre toda la información del libro
 * 
 * En main, crea varios libros y compara sus características.
 */

class Libro {
    
    String titulo;
    String autor;
    String isbn;
    int paginas;
    int añoPublicacion;

    public Libro(String autor, int añoPublicacion, String isbn, int paginas, String titulo) {
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.paginas = paginas;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean esReciente (){
        int fecha = Year.now().getValue(); //obtenme de año , actual el valor y almacenalo en fecha 
        return (fecha - this.añoPublicacion) < 10; //retornara true si es publicado hace menos de 10 años
    }

    public boolean esClasico (){
        int fecha = Year.now().getValue();
        return  (fecha - this.añoPublicacion) > 50; //retornar true si fue publicado hace mas de 50 años 
    }

    public int compararPorPaginas(Libro otroLibro){
        return this.paginas - otroLibro.paginas;
    }
     @Override
    public String toString() {
        return "Libro{" +
               "titulo='" + titulo + '\'' +
               ", autor='" + autor + '\'' +
               ", isbn='" + isbn + '\'' +
               ", paginas=" + paginas +
               ", añoPublicacion=" + añoPublicacion +
               '}';
    }
    
}

public class Ejercicio6 {
    
    // TODO: Implementar aquí
    
    public static void main(String[] args) {
        // TODO: Crear objetos y probar los métodos
          Libro libro1 = new Libro("Gabriel García Márquez", 1967, "978-3-16-148410-0", 471, "Cien años de soledad");
        Libro libro2 = new Libro("Dan Brown", 2003, "978-0-307-47427-8", 464, "El código Da Vinci");
        Libro libro3 = new Libro("Barry Burd", 2023, "978-1-119-23511-2", 672, "Java for Dummies");

        System.out.println(libro1.getTitulo() + " es clásico: " + libro1.esClasico());
        System.out.println(libro1.getTitulo() + " es reciente: " + libro1.esReciente());
        System.out.println(libro3.getTitulo() + " es clásico: " + libro3.esClasico());
        System.out.println(libro3.getTitulo() + " es reciente: " + libro3.esReciente());
        System.out.println();

        int comparacion1y2 = libro1.compararPorPaginas(libro2);
        System.out.println("Comparando \"" + libro1.getTitulo() + "\" y \"" + libro2.getTitulo() + "\": " + comparacion1y2);
        
        int comparacion2y3 = libro2.compararPorPaginas(libro3);
        System.out.println("Comparando \"" + libro2.getTitulo() + "\" y \"" + libro3.getTitulo() + "\": " + comparacion2y3);
        
        int comparacion1y1 = libro1.compararPorPaginas(libro1);
        System.out.println("Comparando \"" + libro1.getTitulo() + "\" consigo mismo: " + comparacion1y1);

    }
}
