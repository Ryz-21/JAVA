/**
 *  * PREGUNTA 1: ¿Cuál es la diferencia entre un método de instancia y un método static?
 * ç
 * Respuesta: Un método de instancia pertenece a cada objeto creado de la clase y puede acceder
 * a las variables de instancia. Un método static pertenece a la clase misma y solo puede acceder
 * a variables static. Se llama sin necesidad de crear un objeto.
 */


class Calculadora {
    //atributo en la instancia 
    private int numero;

    //constructor
    public Calculadora (int numero){
        this.numero = numero;
    }

    // Método de instancia
    public int sumar (int valor){
        return numero+valor;
    }

      // Método static no depende de crear un objeeto
    public static int restar (int a , int b){
        return a-b;
    }
}
public class Ejercicio1 {

    public static void main(String[] args) {

          // Llamando método static (no se necesita crear objeto)
        int resultadoStatic = Calculadora.restar(10, 4);
        System.out.println("Resultado static: " + resultadoStatic);

        // Creando un objeto para usar métodos de instancia
        Calculadora calc = new Calculadora(20);

        // Llamando método de instancia (necesita un objeto)
        int resultadoInstancia = calc.sumar(5);
        System.out.println("Resultado instancia: " + resultadoInstancia);
    }
}