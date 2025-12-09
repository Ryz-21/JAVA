package Type;


public class Ejercicio1 {
    public static void main (String[] args){

        //declaracion de variables de cada tipo existente en java
        int numero = 12; // tipo entero
        double numeros = 12.2; // tipo decimal double , double es mas grande que float
        float decimal = 12.5f; // tipo decimal float , float es mas pequeño que double
        char letra = 'a'; // unidad de variable en forma de caracter
        boolean estado = true; // tipo logico, puede ser true o fals
        String palabra = "Hola Mundo"; // tipo cadena de texto
        Long numeroGrande = 123456789L; // tipo entero grande que es de 64 bits sirve para almacenar numeros grandes
        Short numeroPequeno = 1234; // tipo entero pequeño que es de 16 bits que sirve para ahorrar memoria
        byte byteVariable = 100; // tipo entero muy pequeño que es de 8 bits que sirve para ahorrar memoria

        System.out.println("Valor entero: " + numero);
        System.out.println("Valor double:" + numeros);
        System.out.println("Valor float: " + decimal);
        System.out.println("Valor char: " + letra);
        System.out.println("Valor bolean: " + estado);
        System.out.println("Valor String: " + palabra);
        System.out.println("Valor Long: " + numeroGrande);
        System.out.println("valor short:" + numeroPequeno);
        System.out.println("Valor byte: " + byteVariable); 

    }

    
}

