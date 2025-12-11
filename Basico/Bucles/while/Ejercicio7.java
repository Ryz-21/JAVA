public class Ejercicio7 {
    //Pedir un número y mostrar la suma de los números desde 1 hasta ese número usando while.
    
    public static void mostrarsuma (int numero){
        int contador = 1;
        int resultado = 1;
        while (contador < numero) {
            resultado += 1;
            System.out.println("el resultado es " + resultado);
            contador ++;
        }
    }
    
    public static void main(String[] args) {
        mostrarsuma(20);
    }
}
