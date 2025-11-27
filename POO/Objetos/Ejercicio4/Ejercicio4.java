package Ejercicio4;
public class Ejercicio4 {
      public static void main(String[] args) {

        Forma c = FabricaFormas.crearCirculo(5);

        System.out.println("Área del círculo: " + c.area());
        System.out.println("Perímetro del círculo: " + c.perimetro());
      }
}
