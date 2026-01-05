public class Ejercicio2 {
    
    //Crea un método que calcule el promedio de varias notas decimales.
    public static Double Promedio (double... notas){
        double nota = 0;
        for(double i : notas){
            nota += i;
        }
        return nota/notas.length;
    }
    public static void main(String[] args) {
        System.out.println(Promedio(10,10,20));
    }
}
