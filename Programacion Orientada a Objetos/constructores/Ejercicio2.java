class Alumno {
    String nombre;
    int edad;

    Alumno() {
        nombre = "Leo Yosmar";
        edad = 21;
    }

    @Override
    public String toString() {
        return "el nombre es " + nombre + " y la edad es " + edad;
    }
}

public class Ejercicio2 {
    public static void main(String args[]) {
        Alumno a1 = new Alumno();
        System.out.println(a1.toString());
    }
}
