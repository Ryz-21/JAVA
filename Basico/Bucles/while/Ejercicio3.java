public class Ejercicio3 {
    //Mostrar los números pares del 1 al 20 usando while.
    public static void pares (){
        int numero = 1;
        while(numero<20){
            if(numero % 2 == 0){
                System.out.println("el numero es " + numero);
            }
          numero++;
        }
    }
    
    public static void main(String[] args) {
        pares();
    }
}
