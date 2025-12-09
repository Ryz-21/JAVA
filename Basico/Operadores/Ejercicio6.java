public class Ejercicio6 {

    public double restar (double a , double b){
        a = a - b;
        return a;
        //lo mismo que "a-=b"
    }
    public static void main(String[] args) {
    double decrecimiento = 25;
    System.out.println("el valor es " + decrecimiento);
    decrecimiento--;
    System.out.println("el valor es " + decrecimiento);

    Ejercicio6 objeto = new Ejercicio6();

    System.out.println(objeto.restar(2, 5));
}
}
