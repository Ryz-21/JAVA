public class Ejercicio4 {

    //Pedir al usuario un número N y mostrar la suma de los números desde 1 hasta N usando for.
    public static void s_arimetica (double numero){
        int sumatotal = 0;
        for(int i = 0; i<numero; i++){
            sumatotal += i;
            System.out.println("la suma es " + sumatotal);
        }
    }
    public static void main(String[] args) {
        s_arimetica(8);
    }    
}
