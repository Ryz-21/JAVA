public class Ejercicio1 {

    public static void imprimir (){
        for (int i= 0; i<10; i++){
            System.out.println("numero" + i);
            if (i == 6){
                System.out.println("el sistema se paro");
                break;
            }
        }
    }
     public static void main(String[] args) {
        imprimir();
    }

}