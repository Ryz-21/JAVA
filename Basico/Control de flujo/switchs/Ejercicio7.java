/*
Calificación con letras
Pide una letra:
A → Excelente
B → Bueno
C → Regular
D → Deficiente
F → Reprobado
 */
public class Ejercicio7 {

    public static String elegirnotas (String clave){
        switch(clave){
            case "a" : return "Excelente";
            case "b" : return "Bueno";
            case "c" : return "Regular";
            case "d" : return "Deficiente";
            case "f" : return "Reprobado";
            default: return "error";

        }
    }
     public static void main(String[] args) {
        
    }
}
