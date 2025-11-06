package Cast;

public class Ejercicio6 {
    public static void main(String[] args) {
        String CADENA1 = "123";
        String CADENA2 = "45.6";

        int entero = Integer.parseInt(CADENA1);
        double decimal = Double.parseDouble(CADENA2);

        System.err.println("" + entero);
        System.out.print("" + decimal);
    }
}
