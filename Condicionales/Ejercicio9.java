package Condicionales;
public class Ejercicio9 {
    
    public static void main (String[] args){
        
    }

    public void calcularaño (int año){
        if ((año % 4 == 0 && año % 100 !=0) || (año % 400 == 0)){
            System.out.println("el año"+ año + "es bisiesto.");
        } else {
            System.out.println("el año" + año + "no es bisiesto");
        }
    }
}
