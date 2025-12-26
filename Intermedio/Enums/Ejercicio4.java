public class Ejercicio4 {

    /*
    4. Enum de calificaciones académicas
Define un enum llamado Calificacion con valores como:
DEFICIENTE, REGULAR, BUENO, EXCELENTE.
Plantea un programa que reciba una calificación y muestre una recomendación académica
 */
public enum Calificaciones {
    DEFICIENTE, REGULAR, BUENO, EXCELENTE
}

public static void Calificacion (int nota){
    if(nota<10){
        System.out.println("el estado es " + Calificaciones.DEFICIENTE);
    } else if (10 < nota  && nota <= 15){
        System.out.println("el estado es " + Calificaciones.REGULAR);
    }else if (15 < nota && nota <= 18 ){
        System.out.println("el estado es " + Calificaciones.BUENO);
    } else if (18 < nota && nota <= 20){
        System.out.println("el estado es " + Calificaciones.EXCELENTE);
    }
}
    public static void main(String[] args) {
        Calificacion(9);
    }
}
