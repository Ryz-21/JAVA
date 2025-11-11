package Condicionales;

public class Ejercicio6 {
    public static void main(String[] args) {
                AceptarSolicitud(6, 20, "M");
    } 

    //equalsIgnore Case permite COmparar cadenas sin importar lo largo del texto
    private static void AceptarSolicitud (int nota, int edad, String sexo){
        if(nota >= 5 & edad >= 18 & sexo.equalsIgnoreCase("M")){
            System.out.println("Posible");
        } else if (nota>= 5 & edad >= 18 & sexo.equalsIgnoreCase("F")){
            System.out.println("Aceptada");
        } else {
            System.err.println("no aceptada");
        }
    }
}
