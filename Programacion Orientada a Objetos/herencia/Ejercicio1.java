/*
Ejercicio 1: Clase base Persona con atributos nombre, edad y método presentarse().
 Crear subclases Estudiante (atributo grado) y Profesor (atributo departamento).
  Diseña constructores y sobrescribe presentarse() en las subclases para mostrar información específica.
 */

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

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

   @Override
   public String toString(){
    return "mi nombre es " + nombre +" y mi edad es " + edad;
   }
}

class Estudiante extends Persona {

    String grado;

    public Estudiante (String nombre, int edad , String grado){
        super(nombre,edad);
        this.grado = grado;
    }

    @Override
    public String toString(){
        return "mi nombre es " + nombre + " y mi edad es " + edad + " mi grado es " + grado;
    }

}

class Profesor extends Persona{
  String departamento;
  public Profesor (String nombre, int edad, String departamento){
    super(nombre, edad);
    this.departamento = departamento;
}
    @Override
    public String toString(){
       return "mi nombre es " + nombre + " y mi edad es " + edad + " mi grado es " + departamento;
    }
  
}

public class Ejercicio1 {

     public static void main(String[] args) {
        Persona Peersonagenerica = new Persona("leo", 20);
         Estudiante pEstudiante = new Estudiante("leo", 14, "quinto");
          Profesor profesor1 = new Profesor("Dr. García", 45, "Matemáticas");

          System.out.println(Peersonagenerica.toString());
     }
}