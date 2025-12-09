package Funciones;

public class Ejercicio9 {
        public static void main (String[] args){
        //Crea una función que reciba una lista de enteros y un número,
        // y retorne true si el número está en la lista, false si no.

        int[] miArray = {10, 5, 20, 8, 15};
        
        // Prueba de búsqueda exitosa
        boolean encontrado1 = Busquedalineal(miArray, 20);
        System.out.println("¿Está 20 en la lista? " + encontrado1); // true
        
        // Prueba de búsqueda fallida
        boolean encontrado2 = Busquedalineal(miArray, 7);
        System.out.println("¿Está 7 en la lista? " + encontrado2); // false

    }

    public static boolean Busquedalineal (int[] lista , int numero){
        for (int i = 0; i < lista.length; i++) { //obtenemos el tamaño de la lista ara poder buscar en la lista
            if(numero == lista[i]){
                return  true;
            }
        }
        return  false;
    }

}
