public class Ejercicio5 {

    public double AumentoenNUmero (double a , double b){
        a = a + b;
        return a;
        //que es lo mismo que  "a+=b"
    }
    public static void main(String[] args) {
    //incremento en variables en 1 

    Ejercicio5 aumento = new Ejercicio5();

    double a = 42.5;
    System.out.println("la variable tiene el valor de " + a );
    a++;
    System.out.println("la variable ahora tiene el valor de " + a);

    System.out.println(aumento.AumentoenNUmero(2, 4));
}
}
