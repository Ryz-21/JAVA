public class Ejercicio6 {

    //Descripción: Crear un método que devuelva una subcadena entre dos posiciones.
    public static String extraerSubcadena (String texto, int inicio , int fin){
        if(inicio < 0 || fin > texto.length() || inicio > fin){
            return "Posiciones invalidas";
        }
        return texto.substring(inicio,fin);
    }
     public static void main(String[] args) {
        
    }
}
