package Funciones;

public class Ejercicio2 {
        public static void main (String[] args){
        int ejemplo0 = 1;
        int ejemplo1 = 2;
        int ejemplo2  = 3;

        int mayor = Cuales(ejemplo0, ejemplo1, ejemplo2);
        System.out.println("el mayor es " + mayor);
    }

    //Crea una función que reciba tres números 
    //y retorne el mayor de ellos.

    public static int Cuales (int a , int b , int c)
    {
        int mayor;

        if(a>b & a>c){
           mayor = a;
        } else if (b>c & b>a) {
           mayor = b;
        } else {
           mayor = c;
        }
        return mayor;
    }
}
