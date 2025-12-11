/*Pide dos números y una opción: sumar, multiplicar, restar , divir
*/



public class Ejercicio3 {

    public static double calcular (int a, int b , String opcion ){
        switch(opcion){
            case "sumar":
                System.err.println("se selecciono sumar");
                return a + b;
            case "restar":
                System.out.println("se selecciono restar");
                return a - b;
            case "multiplicar":
                System.out.println("se selecciono multiplicar");
                return a * b;
            case "dividir":
                if(b == 0){
                    System.out.println("no se puede realizar esta operacion");
                } else {
                    return a / b;
                }
            default:
                System.out.println("no se encuentra dentro del sistema");
                return -1;
        }
    }
    public static void main(String[] args) {
        
    }    
}
