import java.util.Scanner;

public class Ejercicio8 {
//Pedir números mientras sean positivos.
//El ciclo termina cuando se ingresa un número negativo.

public static void numeroingresado (){
    Scanner sc = new Scanner(System.in);
    System.out.println("ingresar un numero");
    int numero = sc.nextInt();

    while(numero >=1){
        System.out.println("ingresar un numero");
         numero = sc.nextInt();
    }
} 
public static void main(String[] args) {
  numeroingresado();  
}
}