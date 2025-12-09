package Cast;

public class Ejercicio2 {
    //Declara un double con decimales y conviértelo a int,
    // observando cómo se truncan los decimales.
    public static void main (String[] args){
      double decimal = 13.4;

      int sinDecimales = (int) decimal;

      System.err.println("con decimales " + decimal);
      System.err.println("sin decimales " + sinDecimales);
    }

}
