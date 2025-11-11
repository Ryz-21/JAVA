import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("escribir la cantidad de caracteres para el cuadro");
        int cantidad = sc.nextInt();
    
        for (int i = 0; i<cantidad; i++){
            for(int j = 0; j<cantidad; j++){
              System.out.print("*"); //todo en la misma llinea
            }
            System.out.println(); // salto en lineas distintas 
        }
        sc.close();
}
}