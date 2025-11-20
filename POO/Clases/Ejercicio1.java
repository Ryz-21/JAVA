/*
 * EJERCICIO 1: Clase Persona
 * 
 * Crea una clase Persona con los siguientes requisitos:
 * - Atributos: nombre (String), edad (int), altura (double)
 * - Métodos getter y setter para cada atributo
 * - Método toString() que devuelva la información de la persona en formato legible
 * - Método esMayorDeEdad() que devuelva true si la edad es >= 18
 * - Método presentarse() que imprima: "Hola, me llamo [nombre] y tengo [edad] años"
 * 
 * En la clase main, crea dos objetos Persona, establece sus valores y 
 * prueba todos los métodos.
 */

class Persona {

    String nombre;
    int edad;
    double altura;

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
    @Override //sobreescribe
    public String toString (){
        return " nombre:" + nombre + " edad:" + edad + " altura:" + altura;
    }

    public boolean esmayor (){
        if(this.edad>=18){
            return true;
        }else{
            return false;
        }
    }
    public void presentarse (){
        System.out.print("hola mi nombre es " + nombre + " y mi edad es " + edad);
    }
}
public class Ejercicio1 {
    
    // TODO: Implementar aquí
    
    public static void main(String[] args) {
        // TODO: Crear objetos y probar los métodos
        Persona persona1 = new Persona();

        persona1.setNombre("juan");
        persona1.setEdad(18);
        persona1.setAltura(1.78);

      
        System.out.println("el nombre es " + persona1.toString());
        System.out.println("la persona es " + persona1.esmayor());
        persona1.presentarse();
    }
}
