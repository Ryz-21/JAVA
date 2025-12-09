package Condicionales;

public class Ejercicio5 {

    public static void main (String[] args){
        potenciaNumero(2, 3); 
    }
    private static void potenciaNumero (double numero , double exponente){
        double resultado = 0;
        if (exponente>0){ // si exponente es mayor 
          resultado = Math.pow(numero, exponente); //Math.pow exponentes
        } else if(exponente == 0){
            resultado = 1;            
        } else if (exponente < 0){//si exponente es menor 
            resultado = 1 /Math.pow(numero, Math.abs(exponente));
            //Math.abs devuelve el valor absoluto
            //Math.pow eleva el numero al exponente
        }
        System.out.println("Resultado " + resultado);
    }
}
