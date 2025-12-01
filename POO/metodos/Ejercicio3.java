public class Ejercicio3 {
/*  PREGUNTA 3: ¿Cuál es la diferencia entre return y void en un método?
 * Respuesta: Un método con return devuelve un valor específico de un tipo determinado.
 * Un método void no devuelve ningún valor, solo ejecuta acciones. */

 
   public static double sumar (double a, double b){ // utilizamos static para poder llamarlo en la misma hoja
    return a+b; //return se sirve como devolucion de variable
   }

    public static void mostrarMensaje(String mensaje) {
        System.out.println("Mensaje recibido: " + mensaje);
    }
   public static void main(String[] args) {

      double resultado = sumar(10,5);
      System.out.println("Resultado de la suma: " + resultado);

     mostrarMensaje("Hola, este es un ejemplo de método void.");

   }
}
