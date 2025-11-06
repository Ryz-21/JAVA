package Cast;

public class Ejercicio4 {
    public static void main (String[] args){
        //Promedio truncado:Calcula el promedio de tres notas double, 
        //pero conviértelo a int antes de mostrar el resultado.

        double nota1 = 12;
        double nota2 = 14.5;
        double nota3 = 13.3;

        // si lo hago de esta manera saldra error
       // int promedio = (int) (nota1 + nota2 + nota3)/3;
       //la manera correcta es
       int promedio = (int) ((nota1+nota2+nota3)/3);
        System.out.print("promedio " + promedio);
    }
}
