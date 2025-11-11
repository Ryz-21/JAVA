package Funciones;

public class Ejercicio7 {
        public static void main (String[] args){
        //Crea una función recursiva que calcule el factorial de un número.
        int resultado = factorial(5);
        System.out.println("el resultado es " + resultado);
    } 

    //recursion del numero adentro de si mismo 
    public static int factorial(int n){
        if (n<=1) return  1; //ternario
        return  n * factorial(n-1); // se llama asi mismo restando uno
    }
}
