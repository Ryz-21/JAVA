public class Ejercicio2 {

    public static void contar (){
        for(int i = 1; i <11; i++){
            if (i == 5){
                continue;
            }
         System.out.println("indice" + i);
        }
    }
    public static void main(String[] args) {
        contar();
    }
}
