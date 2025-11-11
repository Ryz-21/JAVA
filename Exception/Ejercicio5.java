
import java.util.Scanner;

public class Ejercicio5 {
        public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int [] lista = new int[5]; //definimos el tamaño de la lista de esta manera
   
       try {
         System.out.println("ingresar numeros para la lista ");
       for (int i = 0; i < lista.length; i++) {
           System.out.println("numero" + (i+1) + ":");
           lista[i] = sc.nextInt();
          } 
          System.out.println("numeros ingresados son:");
          for(int num : lista){
            System.out.println(num);
          }
    } catch (Exception e) {
        System.out.println("detalles del error" + e.getMessage());
    } finally {
        System.out.println("programa finalizado");
    }
     sc.close();
    }
}
