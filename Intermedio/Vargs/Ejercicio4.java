public class Ejercicio4 {

    //Crea un método que reciba varios números y devuelva el mayor.
    public static double numeros (double... lista){
        double max = lista[0];
        for(double numero : lista){
            if(numero > max){
                max = numero;
            }
        }
        return max;
    }
      public static void main(String[] args) {
        System.out.println(numeros(1,2,3,4,5));
    }
}
