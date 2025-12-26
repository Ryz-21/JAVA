public class Ejercicio1 {
    
/*
Enum de días de la semana
Crea un enum llamado DiaSemana que represente los días de la semana.
Plantea un programa que reciba un día y determine si es día laboral o fin de semana.
 */

public enum DiaSemana{
    LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
}
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.SABADO;

        if(dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO){
            System.out.println("es fin de semana");
        }else {
            System.out.println("es dia laboral");
        }
    }
}