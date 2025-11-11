package Funciones;

public class Ejercicio3 {
        public static void main (String[] args){
        
            double[]lista ={1,2,3,4};
            double promediolista = promedio(lista);
            System.out.println("el promedio es " + promediolista);
    }

    //Crea una función que reciba un arreglo de double y retorne el promedio.
    //la sintaxis es crear un metodo asi (tipodearreglo[])
    public static double promedio (double[] numeros){
        double suma = 0.0;

        int tamaño = numeros.length;

        for (int i = 0; i < tamaño; i++) { // revisamos cada numeros del array 
            suma += numeros[i]; //suma cada uno de los elementos aumentandolo 
        }

        if(tamaño == 0){
            return  0.0;
        } else{
            return suma/tamaño;
        }
    }
}
