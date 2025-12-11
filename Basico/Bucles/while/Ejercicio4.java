//Pedir un número por teclado y mostrar su tabla de multiplicar del 1 al 12 usando while.

public class Ejercicio4 {
    public static void  mostrartabla (int numero){
        int contador = 1;
        while( contador <= 12){
            int resultado = contador * numero ;
            System.out.println("el resultado es " + resultado);
            contador ++;
        }
    }

    public static void main(String[] args) {
        mostrartabla(2);
    }
}
