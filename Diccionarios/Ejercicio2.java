
import java.util.HashMap;
import java.util.Scanner;


/**
 * EJERCICIO 2: TRADUCTOR SIMPLE
 * 
 * PREGUNTA: Crea un traductor que almacene pares de palabras español-inglés 
 * en un HashMap. El usuario debe poder buscar una palabra y obtener su 
 * traducción.
 * 
 * PISTA: Crea un HashMap<String, String> donde la clave sea la palabra en 
 * español y el valor sea la traducción en inglés. Usa Scanner para leer 
 * entrada del usuario y containsKey() para verificar si existe la palabra.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<>();
        map.put("hola", "hello");
        map.put("gato", "cats");
        System.out.println("ingresar palabra clave");
        String palabra = sc.nextLine();
        String resultado = map.get(palabra);
        if(palabra != null){
            System.out.println("la palabra guarda es" + resultado);
        } else {
            System.out.println("el resultado no existe");
        }
        sc.close();
    }
}
