import java.util.Scanner;

public class Ejercicio6 {
    //Pedir al usuario un número entre 1 y 5.
    //Repetir la petición hasta que ingrese un número válido.

    public static void get_peticion (){
        Scanner sc = new Scanner(System.in);
        int v_opcion;
        do{
        System.out.println("ingresa un numero ");
          v_opcion = sc.nextInt();
        } while(v_opcion > 0 && v_opcion < 5);
        sc.close();
    }
    
    public static void main(String[] args) {
        get_peticion();
    }
}
