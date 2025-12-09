// EJERCICIO 6: Clase Vehículo con encapsulamiento y control de estado
//
// Objetivo: Crear una clase Vehículo que encapsule datos como marca, modelo,
// velocidad actual, combustible, estado (encendido/apagado)
//
// Requisitos:
// - Todos los atributos deben ser privados
// - El vehículo no puede moverse si está apagado
// - La velocidad no puede superar 200 km/h
// - El combustible no puede ser negativo
// - Crear método encender() que solo funciona si el combustible > 0
// - Crear método apagar() que detiene el vehículo (velocidad = 0)
// - Crear método acelerar(incremento) con validación de límite y estado
// - Crear método desacelerar(decremento) que no permita velocidad negativa
// - Crear método consu
// mirCombustible(cantidad) que decremente combustible
// - Crear método recargarCombustible(litros) con límite de capacidad (60 litros)
//
// TODO: Implementar la clase Vehículo
// TODO: Crear atributos privados
// TODO: Implementar constructor
// TODO: Implementar métodos de control: encender, apagar
// TODO: Implementar métodos de movimiento: acelerar, desacelerar
// TODO: Implementar métodos de combustible: consumir, recargar
// TODO: Implementar validaciones en todos los métodos
class Vehículo {
  private String marca;
  private String modelo;
  private double velocidad_actual;
  private double combustible;
  private boolean estado;


  private final double VELOCIDAD_MAXIMA = 200;
  private final double COMBUSTIBLE_MAXIMO = 60;

  public Vehículo(String marca, String modelo, double combustible) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidad_actual = 0;

    if(combustible < 0) combustible = 0;
    if(combustible > COMBUSTIBLE_MAXIMO) combustible = COMBUSTIBLE_MAXIMO;

    this.combustible = combustible;
    this.estado = false;
  }

  public void encender (){
    if(estado){
      System.out.println("El vehiculo ya esta encendido");
      return;
    }

    if(combustible <= 0){
      System.out.println("no se puede encender, no hay combustible");
      return;
    }

    estado = true;
    System.out.println("estado encendido");
  }

  public void apagar(){
    if(!estado){
       System.out.println("El vehículo ya está apagado.");
            return;
    }

     estado = false;
        velocidad_actual = 0;  // se detiene
         System.out.println("Vehículo apagado.");
  }



   public void acelerar(double incremento) {
        if (!estado) {
            System.out.println("No se puede acelerar: el vehículo está apagado.");
            return;
        }

        if (incremento < 0) {
            System.out.println("El incremento no puede ser negativo.");
            return;
        }

        velocidad_actual += incremento;

        if (velocidad_actual > VELOCIDAD_MAXIMA) {
            velocidad_actual = VELOCIDAD_MAXIMA;
        }

        System.out.println("Aceleraste a " + velocidad_actual + " km/h.");
    }




     public void desacelerar(double decremento) {
        if (decremento < 0) {
            System.out.println("El decremento no puede ser negativo.");
            return;
        }

        velocidad_actual -= decremento;

        if (velocidad_actual < 0) velocidad_actual = 0;

        System.out.println("Desaceleraste a " + velocidad_actual + " km/h.");
    }

       public void consumirCombustible(double cantidad) {
        if (cantidad < 0) return;

        combustible -= cantidad;

        if (combustible < 0) combustible = 0;
    }
        public void recargarCombustible(double litros) {
        if (litros <= 0) {
            System.out.println("Cantidad inválida para recargar.");
            return;
        }

        combustible += litros;

        if (combustible > COMBUSTIBLE_MAXIMO) {
            combustible = COMBUSTIBLE_MAXIMO;
        }

        System.out.println("Combustible actual: " + combustible + " L.");
    }

}
public class Ejercicio6 {
      public static void main(String[] args) {
        
        Vehículo v = new Vehículo("Toyota", "Corolla", 20);

        v.encender();
        v.acelerar(50);
        v.desacelerar(20);
        v.consumirCombustible(5);
        v.apagar();

        v.recargarCombustible(30);
    }
}
