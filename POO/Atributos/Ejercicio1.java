/*
 * EJERCICIO 1: Clase Persona
 * 
 * Crea una clase llamada Persona con los siguientes atributos:
 * - nombre (String)
 * - edad (int)
 * - altura (double)
 * - peso (double)
 * 
 * Estos atributos deben ser privados. Luego, crea un método main
 * que instancie un objeto Persona, asigne valores a sus atributos
 * (usando directamente si fuera posible, pero primero deberás crear
 * métodos setter) y muestre los valores en consola.
 * 
 * TODO: Implementar la clase Persona con atributos privados,
 *       crear getters y setters, e instanciar en main.
 */
class persona {

  private  String nombre;
  private  int edad;
  private  double altura;
  private  double peso;
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public int getEdad() {
    return edad;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }
  public double getAltura() {
    return altura;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }
  public double getPeso() {
    return peso;
  }
  public void setPeso(double peso) {
    this.peso = peso;
  }

}
public class Ejercicio1 {
    public static void main(String[] args) {
        persona perso = new persona();

      perso.setAltura(1.20);
      double altura =  perso.getAltura();
      System.out.println("la altura es " + altura);
    }
}