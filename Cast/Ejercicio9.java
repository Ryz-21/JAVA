package Cast;

public class Ejercicio9 {
    //Convierte un long grande (por ejemplo 3000000000L) 
    // a int y observa el resultado.
    public static void main(String[] args) {
        long convertir = 3000000000L;
        int resultado = (int) convertir;
        System.out.println("Valor long: " + convertir);
        System.out.println("Valor int tras cast: " + resultado);
    }
}
