import java.util.Scanner;

public class Ejercicio4 {


    public static void get_acomulacion(){
        Scanner sc = new Scanner(System.in);
        double n_suma;
        double acomulador = 0 ;
        do {
           System.out.println("ingresar numero");
           n_suma = sc.nextInt();
           if (n_suma > 0){
            acomulador += n_suma;
            System.out.println("el resultado es " + acomulador);
           }
        } while (n_suma>0);
        sc.close();
    }
    public static void main(String[] args) {
//Ingresar números y sumar todos los positivos.
//El ciclo termina cuando el usuario ingresa un número cero.
//Mostrar la suma total.        
    } 
}
