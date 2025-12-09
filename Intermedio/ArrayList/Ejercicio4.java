package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class  Ejercicio4{
    public static void main(String[] args) {
        //Determina si la lista es igual leída desde el principio y desde el final.
        // si es palindromo sacara true si no sacara false 
        List <String> palindromo = List.of("o" , "s" ,"o");
        List <Integer> nopalinrome = List.of(1,2,3);

        System.err.println("lista 1 es palindrome?" + palindrome(palindromo) + "lista dos es palindrome?" + palindrome(nopalinrome));
    }

    public static <T> Boolean palindrome (List <T> variable){
        List <T> ejemplo = new ArrayList<>();
        Collections.reverse(ejemplo);
        return variable.equals(ejemplo);
    }
}