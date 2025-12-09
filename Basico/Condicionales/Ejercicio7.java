package Condicionales;


public class Ejercicio7 {

    public static void main (String[] str){

    }

    // Math.sqrt() es la función para calcular la raíz cuadrada
    // Math.pow(a, b) es la función para calcular a elevado a b
    //math.abs() es la función para calcular el valor absoluto

    //Realiza un programa que pida los puntos centrales de dos circunferencias 
    // (x1, y1), (x2, y2) y los radios de las mismas (r1, r2).
    // El programa debe clasificar según corresponda como: exteriores, 
    // tangentes exteriores, secantes, tangentes interiores, interiores 
    // o concéntricas.
    public void puntosCentrales (double  x1 , double y1 , double x2 , double y2 , double r1 , double r2){

       double distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

       if (distancia == 0){
        System.out.print("Concentricas");
       } else if (distancia > (r1+r2)){
        System.out.println("Exteriores");
       } else if ((distancia > 0) && distancia < Math.abs(r1 - r2)){
        System.out.println("Interiores");
       } else if (distancia == (r1 + r2)){
        System.out.println("Tangentes exteriores");
       } else if (distancia == Math.abs(r1 - r2)){
        System.out.println("Tangentes interiores");
       } else {
        System.out.println("Secantes");
       }
    }

}
