public class Ejercicio2 {
    /*
Ejercicio 2: Invertir un String
Descripción: Crear un método que devuelva el String invertido.
 */

public static String invertir (String texto){
    String invertido = "";
    for(int i = texto.length() -1; i>=0; i--){
        invertido += texto.charAt(i);
    }
    return invertido;
}
     public static void main(String[] args) {
        
    }
}
