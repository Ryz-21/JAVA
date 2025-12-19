public class Ejercicio4 {


    //Descripción: Contar cuántas veces aparece una palabra dentro de un String.

    public static int contarPalabras (String texto, String palabra){
        String[] palabras = texto.split("\\s+");
        int contador = 0;
        for(String p : palabras){
            if(p.equalsIgnoreCase(palabra)){
                contador++;
            }
        }
        return contador;
    }
     public static void main(String[] args) {
        
    }
}
