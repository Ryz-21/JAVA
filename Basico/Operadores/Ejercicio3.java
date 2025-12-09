public class Ejercicio3 {
    //division operator 
   public double division (double a , double b){
    if(a == 0){
        System.out.println("no se puede real");
    }
    return a / b;
   }
    public static void main(String[] args) {

        Ejercicio3 sc = new Ejercicio3();
        System.out.println(sc.division(5, 20));
    }
}
