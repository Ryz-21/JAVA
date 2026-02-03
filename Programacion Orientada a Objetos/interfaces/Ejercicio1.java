interface Vehiculo {
  
  public String arrancar();
  public String detener();

}

class Auto implements Vehiculo {

    public Auto() {
    }

    @Override
    public String arrancar() {
        return "el carro arranca";
    }
    @Override
    public String detener() {
        return "el auto se detiene ";
    }
}

public class Ejercicio1 {
    public static void main (String [] args ){
        Auto Carro1 = new Auto();
        System.out.println(Carro1.arrancar());
        System.out.println(Carro1.detener());
    }
}