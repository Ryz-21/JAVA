import java.util.Scanner;

/*Pide un número del 1 al 7 y muestra el día correspondiente. */
public class Ejercicio1{

    public static void  dia (int a){
        switch (a) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4: 
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.print("sabado");
                break;
            case 7:
                System.out.println("domingo");
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresar un numero para la operacion");
        int resultado = sc.nextInt();
        dia(resultado);
    }
}