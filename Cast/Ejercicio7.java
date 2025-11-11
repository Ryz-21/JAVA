package Cast;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        int numero = 12;
        double numero2 = 123;

        String cadena1 = String.valueOf(numero);
        String cadena2 = String.valueOf(numero2);

        // También podrías usar:
        // String cadena1 = Integer.toString(numero);
        // String cadena2 = Double.toString(numero2);

        System.out.println("la cadena es " + cadena1);
        System.out.println("la cadena es " + cadena2);
    }
}
