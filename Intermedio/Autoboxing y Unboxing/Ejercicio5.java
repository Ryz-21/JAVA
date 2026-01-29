import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        // crear un ArrayList de Integer
        ArrayList<Integer> numeros = new ArrayList<>();
        // agregar 10 numeros enteros al ArrayList
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
        // recorrer el ArrayList y mostrar cada numero
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
