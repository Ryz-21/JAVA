import java.util.Scanner;

public class Ejercicio5 {

    public static void get_edades(){
        Scanner sc = new Scanner(System.in);
        int acomulador = 0;
        int edad = 0;
        do{
            System.out.println("ingresar edades");
            edad = sc.nextInt();
            if (edad >= 18){
              acomulador ++;
              System.out.println("la cantidad de personas es " + acomulador);
            }
        }while(edad > 0);
        sc.close();
    }
     public static void main(String[] args) {
        //Un programa que pida edades y cuente cuántas personas son mayores de edad (>=18).
        // El ciclo termina cuando el usuario ingrese una edad negativa.
        get_edades();
    }
}
