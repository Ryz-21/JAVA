public class Ejercicio3 {

    public void c_par (){
        for(int i = 0; i < 20; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("los numeros impares " + i);
        }
    }
     public static void main(String[] args) {
        Ejercicio3 metodo = new Ejercicio3();

        metodo.c_par();
    }
}
