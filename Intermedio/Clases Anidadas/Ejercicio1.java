class clase_externa {
    int x = 10;
    class clase_interna{
        int y = 10;
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        
        clase_externa externa = new clase_externa();
        clase_externa.clase_interna interno = externa.new clase_interna();
        System.out.println(externa.x + interno.y); 
    }   
}