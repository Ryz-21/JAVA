import java.util.Scanner;

public class Ejercicio5 {
    public static void pedirnumero (){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numeroingresado;
        System.out.println("ingresar un numero");
        numeroingresado = sc.nextInt();

        while(numeroingresado != 0){
            contador++;
            System.out.println("ingrese otro numero");
            numeroingresado = sc.nextInt();
        }
        sc.close();
        System.out.println("se ingresaroon esta cantidad de numeros " + contador);
    }

    public static void main(String[] args) {
                pedirnumero(); 
    }
}
