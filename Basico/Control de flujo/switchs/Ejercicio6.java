/*Tipo de figura geométrica
Pide una opción: 
1. Cuadrado
2. Rectángulo
3. Triángulo
*/
public class Ejercicio6 {

    public static String figura (int llave){
        switch(llave){
            case 1 : return "cuadrado";
            case 2 : return "rectangulo";
            case 3 : return "triangulo";
            default: return "sistema no valido";
        }
    }
     public static void main(String[] args) {
        
    }
}
