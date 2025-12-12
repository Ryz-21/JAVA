public class Ejercicio2 {

    public static void m_pares (int numero){
        for(int i = 1; i<numero; i++){
            if(i % 2 == 0){
                System.out.println("el numero es " + i);
            }
        }
    }
    public static void main(String[] args) {
        m_pares(50);
    }
}
