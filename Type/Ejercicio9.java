package Type;

public class Ejercicio9 {
    //var no convierte a Java en un lenguaje de tipado dinámico
    // El tipo se infiere solo una vez durante la compilación y nunca puede cambiar.

    public static void main(String[] args) {
        
        //infiere el tipo a int
        var contador = 120;
        System.out.println("Variable 'contador' (Valor: " + contador + ") - Tipo inferido: " + ((Object)contador).getClass().getSimpleName());
    }    
}
