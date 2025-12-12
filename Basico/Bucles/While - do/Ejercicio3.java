import java.util.Scanner;

public class Ejercicio3 {

    public double m_multiplicar (double a , double b){
        return a * b;
    }
    public double m_restar (double a , double b){
        return a-b;
    }
    public double m_sumar (double a , double b){
        return a + b;
    }

    public static void menu (){
        Scanner sc = new Scanner(System.in);
        Ejercicio3 calculadora = new Ejercicio3();
        int opcion;
        do{
          System.out.print("ingresar un numero del sistema");
          opcion = sc.nextInt();
          if(opcion == 1){
            double resultado = calculadora.m_sumar(4,5);
            System.out.println("el resultado es " + resultado);
           }
           else if (opcion == 2){
            double resultado = calculadora.m_restar(2, 1);
            System.out.println("el resultado es " + resultado);
           } else if (opcion == 3){
            double resultado = calculadora.m_multiplicar(2, 2);
            System.out.println("el resultado es " + resultado);
           }
        }while(opcion != 4);
        sc.close();
    }
     public static void main(String[] args) {
        menu();
    }
}
