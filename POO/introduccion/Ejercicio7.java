class Direccion {
    private String calle;
    private String ciudad;

    public Direccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public String obtenerdireccion (){
        return calle + "," + ciudad;
    }
}

class Alumno {
    private String nombre ; 
    private int edad;
    private Direccion direccion;

    public Alumno(Direccion direccion, int edad, String nombre) {
        this.direccion = direccion;
        this.edad = edad;
        this.nombre = nombre;
    }

    public void mostrar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad + " años");
        // Accedemos a los métodos del objeto Direccion que contiene Alumno
        System.out.println("Dirección: " + this.direccion.obtenerdireccion());
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        String laCalle = "Av. Siempre Viva 742";
        String laCiudad = "Springfield";
        
        Direccion dirAlumno = new Direccion(laCalle, laCiudad);
        
        String nombreAlumno = "Bart Simpson";
        int edadAlumno = 10;

        Alumno miAlumno = new Alumno(dirAlumno, edadAlumno, nombreAlumno);
        
        miAlumno.mostrar();
    }
}
