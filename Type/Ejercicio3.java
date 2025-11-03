package Type;
import java.util.Scanner;

public class Ejercicio3 {
    //crea dos variables int y una double , realiza operaciones 
    //matematicas suma resta division , multiplicacion entre ellas observa
    // resultado

    public static void main (String[] args){
        int variable1;
        double variable2;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa la primera variable");
        variable1 = sc.nextInt();
        System.out.println("ingresar la segunda variable");
        variable2 = sc.nextDouble();

        System.out.println(variable1 + variable2);
        System.out.println(variable1 - variable2);
        System.out.println(variable1 * variable2);
        System.out.println(variable1 / variable2);

        sc.close();
    }
}
