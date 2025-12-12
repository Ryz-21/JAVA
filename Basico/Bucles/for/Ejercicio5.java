public class Ejercicio5 {
    //Imprimir un triángulo de asteriscos de altura 5, como este:

    public static void astericos (double altura){
        for(int i = 1; i<= altura; i++){
         for (int j = 1; j<= i; j++){
            System.out.print("*");
           }
          System.out.println();
        }
    }
    public static void main(String[] args) {
        astericos(5);
    }
}
