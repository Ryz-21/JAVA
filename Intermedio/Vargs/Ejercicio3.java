public class Ejercicio3 {

    //Crea un método que muestre todos los mensajes recibidos.

    public static void  mostrarMensaje (String... mensaje){
        for(String m : mensaje){
            System.out.println(m);
        }
    }
      public static void main(String[] args) {
        mostrarMensaje("hola");
    }
}
