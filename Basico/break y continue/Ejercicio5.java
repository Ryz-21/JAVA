public class Ejercicio5 {

    public static void mostrar50 (){
        for(int i = 1; i<50; i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println("el indice es " + i);
            if (i == 30){
                break;
            }
        }
    }
     public static void main(String[] args) {
        mostrar50();
    }
}
