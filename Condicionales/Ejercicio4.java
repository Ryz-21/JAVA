package Condicionales;

public class Ejercicio4 {

    //Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
    public static void main (String[] args){
        
    }

    private void leerCadena (String cadena){
     boolean tieneMayuscula = false;
     for (int i = 0; i <cadena.length(); i++){
        if(Character.isUpperCase(cadena.charAt(i))){
            tieneMayuscula = true;
            break;
        }
     }
     if(tieneMayuscula){
        System.err.println("la cadena contiene al menos una Mayuscula");
     }else {
        System.out.println("la cadena no contiene mayuscula");
     }
    }
}

