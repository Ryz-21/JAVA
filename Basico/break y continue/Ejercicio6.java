public class Ejercicio6 {

    public static void tabla (){
        for(int i = 1; i <= 5; i ++){
            System.out.println("Tabla del " + i);
         for (int j = 1; j <= 10; j++) {
                int resultado = i * j;

                if (resultado > 12) {
                    break;
                }

                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println(); 
        }
    }
        
    

   public static void main(String[] args) {
    
   }
}
