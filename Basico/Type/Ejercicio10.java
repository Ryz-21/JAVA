package Type;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("porfavor ingresar una edad");
        int edad = sc.nextInt();
        System.out.println("porfavor ingresar una estatura");
        double estatura = sc.nextDouble();
        System.out.println("porfavor ingresar un nombre");
        String name = sc.nextLine();
        System.out.println("tu nombre es " + name + " , tu edad es " + edad + " y tu estatura es " + estatura);
        sc.close();

    }
}
