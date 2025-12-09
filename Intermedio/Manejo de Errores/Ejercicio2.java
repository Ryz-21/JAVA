

public  class  Ejercicio2{

    //ArrayIndexOutOfBoundsException
       public static void main (String[] args){
        // declaramos la variable con una lista nativa de java 
        int[] lista = {10,20,30,40,50};

        try {
            //intenamos acceder atraves de un system.out
            System.out.println("elemento en poscion" + lista[10]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Eror trataste de acceder a un numero fuera de la lista");
            System.out.println("EL ERROR ES " + e.getMessage());
        } finally {

        }
    } 
}