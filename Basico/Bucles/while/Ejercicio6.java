import java.util.Scanner;

public class Ejercicio6 {
    //Pedir una contraseña hasta que el usuario escriba "java123".
    public static void validacontra(){
        Scanner sc = new Scanner(System.in);
        String contraseña;
        String contra = "java123";
        System.out.println("ingresar contraseña");
        contraseña = sc.nextLine();

        //equals contenido identico dentro: ! indicamos mientras el contenido no es identico se ejecuta  
        while (!contraseña.equals(contra)) {
            System.out.println("ingresar su contraseña nuevamente");
            contraseña = sc.nextLine();
        }
    }
    public static void main(String[] args) {
        validacontra();
    }
}
