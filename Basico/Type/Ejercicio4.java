package Type;

import java.util.Scanner;

public  class Ejercicio4 {

     public static void main(String[] args){

        double nota1 , nota2 , nota3 , promedio; 
        int resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa la primera nota");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        promedio = (nota1+nota2+nota3)/3;

        resultado = (int) Math.round(promedio);

        System.out.print("el resultado del promedio de las notas es" + resultado);
        sc.close(); 
    } 

}
