package Condicionales;

public class Ejercicio8 {

    public static void main (String[] args){
        
    }

    public void CalcularTriangulo (double a , double b , double c){
        if(a+b>c && a+c>b && c+b>a ){
          System.err.println("es un triangulo");
        if(a == b && b==c){
            System.out.println("equilatero todos los lados son iguales ");
        }else if(a == b || a == c || b == c){
            System.out.println("Isosceles no todos los lados son iguales pero tienen dos lados");
        }else if(a != b && b!= c && a!=c){
            System.out.println("Escaleno todos los lados son diferentes");
        }
    } else {
        System.err.println("no es un triangulo");
    }
  }
}
