package Funciones;


public class Ejercicio4 {
        public static void main (String[] args){
        
    //Crea una función que reciba un arreglo de enteros y devuelva cuántos son pares.
      int[] numeros = {2, 5, 8, 11, 14, 17, 20};

        // Llama a la función y guarda el resultado
        int cantidadPares = pares(numeros);

        // Muestra el resultado
        System.out.println("Cantidad de números pares: " + cantidadPares);
     
    }
      public static int pares (int[] lista){
        int contador = 0;//contara los numeros pares
        int tamaño = lista.length;
        for (int i = 0; i < tamaño; i++) {
            if(lista[i] % 2 == 0){
                // ahora aumentamos la lista
              contador++;
            }
        }
        return  contador;
      }
}
