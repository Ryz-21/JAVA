import java.util.Scanner;

public class Ejercicio4 {

    public static void menu(){
        Scanner sc = new Scanner(System.in);        
        while(true){ 
            System.out.println("Ingresa un número (o un número negativo para detener el programa):");
            int numero = sc.nextInt();
            if (numero < 0){
                System.out.println("Se ingresó un número negativo. ¡Programa detenido!");
                break; 
            }
            System.out.println("El número ingresado fue: " + numero);
        }
        sc.close(); 
    }
    
    public static void main(String[] args) {
        menu();
    }
}