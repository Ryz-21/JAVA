/*
 * EJERCICIO 8: Clase Libro
 * 
 * Crea una clase Libro con los atributos:
 * - isbn (String)
 * - titulo (String)
 * - autor (String)
 * - año (int)
 * - numeroPaginas (int)
 * - precioCompra (double)
 * - precioVenta (double)
 * - copias (int)
 * 
 * Implementa métodos para:
 * - calcularGanancia() - retorna precioVenta - precioCompra
 * - calcularGananciaTotal() - ganancia * copias
 * - agregarCopias(int cantidad)
 * - venderCopias(int cantidad)
 * - mostrarInformacionLibro()
 * - esLibroAntiguo() - retorna true si año < 1980
 * 
 * En main, crea dos libros, realiza operaciones de venta y
 * muestra información sobre ganancias.
 * 
 * TODO: Implementar la clase con gestión de ventas.
 */

class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int año;
    private int numeroPaginas;
    private double precioCompra;
    private double precioVenta;
    private int copias;

    // Constructor
    public Libro(String isbn, String titulo, String autor, int año, int numeroPaginas,
                 double precioCompra, double precioVenta, int copias) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.numeroPaginas = numeroPaginas;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.copias = copias;
    }

    // Ganancia por copia
    public double calcularGanancia() {
        return precioVenta - precioCompra;
    }

    // Ganancia total
    public double calcularGananciaTotal() {
        return calcularGanancia() * copias;
    }

    // Agregar copias al inventario
    public void agregarCopias(int cantidad) {
        if (cantidad > 0) {
            copias += cantidad;
            System.out.println("Se agregaron " + cantidad + " copias del libro \"" + titulo + "\"");
        } else {
            System.out.println("Cantidad inválida.");
        }
    }

    // Vender copias
    public void venderCopias(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida.");
        } else if (cantidad > copias) {
            System.out.println("No hay suficientes copias de \"" + titulo + "\" para la venta.");
        } else {
            copias -= cantidad;
            System.out.println("Se vendieron " + cantidad + " copias de \"" + titulo + "\"");
        }
    }

    // Información del libro
    public void mostrarInformacionLibro() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Precio de compra: S/ " + precioCompra);
        System.out.println("Precio de venta: S/ " + precioVenta);
        System.out.println("Copias disponibles: " + copias);
        System.out.println("Ganancia por copia: S/ " + calcularGanancia());
        System.out.println("Ganancia total: S/ " + calcularGananciaTotal());
        System.out.println("¿Libro antiguo?: " + (esLibroAntiguo() ? "Sí" : "No"));
    }

    // Determinar si es libro antiguo
    public boolean esLibroAntiguo() {
        return año < 1980;
    }
}


public class Ejercicio8 {
    public static void main(String[] args) {

        // Crear libros
        Libro l1 = new Libro("ISBN001", "Cien Años de Soledad", "Gabriel García Márquez",
                             1967, 471, 30.0, 60.0, 10);

        Libro l2 = new Libro("ISBN002", "El Principito", "Antoine de Saint-Exupéry",
                             1943, 120, 15.0, 35.0, 20);

        // Operaciones
        l1.venderCopias(3);
        l1.agregarCopias(5);

        l2.venderCopias(10);
        l2.agregarCopias(2);

        // Mostrar información
        l1.mostrarInformacionLibro();
        l2.mostrarInformacionLibro();

        // Mostrar ganancia total después de operaciones
        System.out.println("Ganancia total actual de l1: S/ " + l1.calcularGananciaTotal());
        System.out.println("Ganancia total actual de l2: S/ " + l2.calcularGananciaTotal());
    }
}
