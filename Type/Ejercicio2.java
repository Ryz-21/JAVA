package Type;

import java.util.Scanner;

public class Ejercicio2 {
    
     //declara una variable de tipo int sin inicializar 
    //y luego asignale un valor dentro el main y muestralo 
    public static void main (String[] args){

        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el valor para nuestra variable");
        valor = sc.nextInt(); // vacio por que debe recibir nuestro parametro osea no aplica nextInt("") eso no es poible
        System.out.println("el nuevo valor es " + valor);
        sc.close();
    }
   
}
