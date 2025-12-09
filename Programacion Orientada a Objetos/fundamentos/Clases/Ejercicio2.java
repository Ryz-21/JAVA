/*
 * EJERCICIO 2: Clase Coche
 * 
 * Crea una clase Coche con los siguientes requisitos:
 * - Atributos: marca (String), modelo (String), año (int), velocidad (int)
 * - Constructor que inicialice marca, modelo y año (velocidad comienza en 0)
 * - Métodos getter y setter para cada atributo
 * - Método acelerar() que incremente la velocidad en 10
 * - Método frenar() que disminuya la velocidad en 10 (mínimo 0)
 * - Método toString() que muestre todos los datos del coche
 * 
 * En main, crea un coche, aceléralo varias veces, frena y muestra su estado.
 */

class Coche {

    String marca;
    String modelo;
    int año;
    int velocidad = 0;
    
    public Coche(String marca, String modelo, int año, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
      //metodo acelarar - metodo frenar - metodo toString 
      public void acelarar(){
        this.velocidad +=10;
        System.out.println("la velocidad actual es " + velocidad);
      }

      @Override
      public String toString(){
        return " tu coche actual es :" + modelo + " de la marca :" + marca + " del año :" + año;
      }

      public void frenar(){
        if(this.velocidad >= 10){
            velocidad -= 10;
            System.out.println("la velocidad actual es" + velocidad);
        }else{
            System.out.println("la velocoidad no se puede reducir si es 0");
            velocidad = 0;
        }
      }

}

public class Ejercicio2 {
    
    // TODO: Implementar aquí
    
    public static void main(String[] args) {
        // TODO: Crear objeto y probar los métodos
        Coche Lamborguini = new Coche("Lamborguini", "egoista", 22020, 320);
        Lamborguini.acelarar();
        Lamborguini.acelarar();
        Lamborguini.frenar();
        System.out.println("el auto es " + Lamborguini.toString());
    }
}
