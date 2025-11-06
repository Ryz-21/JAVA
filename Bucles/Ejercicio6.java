public class Ejercicio6 {
    public static void main (String[] args){
        //Usa un for o while para contar cuántos números pares
        // hay del 1 al 100.
        
        int contarpares = 0;
        for(int i = 1; i < 100; i++){
            if(i % 2 == 0){
                contarpares++;
            } 
        }
        System.err.println("hay" + contarpares);
    }
}
