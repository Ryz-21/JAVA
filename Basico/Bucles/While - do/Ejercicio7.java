import java.util.Scanner;

public class Ejercicio7 {
//Solicitar al usuario letras y contar cuántas veces ingresó la letra 'a'.
//El ciclo termina cuando ingresa la letra 'x'.

public static void count_a (){
    String v_cadena;
    Scanner sc = new Scanner(System.in);

    do{
       System.out.println("ingresar letra contar");
       v_cadena = sc.nextLine();
    } while (!v_cadena.equals("x"));
}
public static void main(String[] args) {
    count_a();
}
}
