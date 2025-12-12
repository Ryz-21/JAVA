public class Ejercicio3 {
    //Pedir un número al usuario y mostrar su tabla de multiplicar del 1 al 10 usando for.

    public static void t_multiplicar (int numero){
        double resultado = 0 ;
        for(int i = 1; i < 13; i++){
            resultado = i*numero;
            System.out.println("el resultado es " + resultado);
        }
    }
    public static void main(String[] args) {
        t_multiplicar(2);
    }
}
