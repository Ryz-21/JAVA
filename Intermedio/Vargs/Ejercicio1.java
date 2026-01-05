public class Ejercicio1 {

    //Crea un método que reciba cualquier cantidad de números enteros y devuelva la suma.

    public static int retornarsuma(int... numero){
        int suma = 0;
        for (int i : numero){
            suma += i;
        }
        return suma;
    }
      public static void main(String[] args) {
       System.out.println(retornarsuma(2,4,5));
    }
}