public class Ejercicio1 {
/*Ejercicio 1: Contar vocales
Descripción: Escribe un método que reciba un String y cuente cuántas vocales tiene.
 */
    public static int ContarVocales (String texto){
        int contador = 0;
        texto = texto.toLowerCase();
        for(int i = 0; i<texto.length(); i++){
            char c = texto.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){

            }
        }
        return contador;
    }
    public static void main(String[] args) {
        
    }
}