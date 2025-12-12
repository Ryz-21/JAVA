import java.util.Scanner;

public class Ejercicio2 {

//Pedir al usuario que ingrese una contraseña.
//Repetir la solicitud hasta que escriba "admin123".



public static void getcontraseña (){
    Scanner sc = new Scanner(System.in);
    String contraseña = "admin123";
    String contra;
    do{
        System.out.println("ingresa una contraseña");
        contra = sc.nextLine();
    }while(!contra.equals(contraseña));
    sc.close();
}
     public static void main(String[] args) {
        getcontraseña();        
    }
}
