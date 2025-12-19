public class Ejercicio3 {
/*

Ejercicio 3: Verificar si es palíndromo
Descripción: Escribe un método que determine si un String es un palíndromo (se lee igual de adelante hacia atrás).
*/

    public static boolean esPalindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        int n = texto.length();
        for (int i = 0; i < n / 2; i++) {
            if (texto.charAt(i) != texto.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
