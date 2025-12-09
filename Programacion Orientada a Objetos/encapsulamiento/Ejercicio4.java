// EJERCICIO 4: Clase Empleado con encapsulamiento avanzado
//
// Objetivo: Crear una clase Empleado con encapsulamiento que gestione
// información laboral: nombre, ID, salario base, departamento, experiencia
//
// Requisitos:
// - Todos los atributos deben ser privados
// - El ID del empleado es inmutable y se genera automáticamente
// - El salario base solo puede cambiar mediante un método especial
// - Crear método actualizarSalario(porcentaje) que aumente el salario
// - El departamento solo puede cambiar si el ID de empleado es válido
// - Crear método agregarExperiencia(años) que valide años positivos
// - Crear método calcularSalarioAnual() que aplique bonificación por experiencia
//   (0% si <2 años, 5% si 2-5 años, 10% si >5 años)
// - Crear método obtenerInfo() que retorne información sin revelar datos sensibles
//
// TODO: Implementar la clase Empleado
// TODO: Crear atributos privados y contador estático para IDs
// TODO: Implementar constructor con validaciones
// TODO: Implementar método actualizarSalario
// TODO: Implementar método agregarExperiencia
// TODO: Implementar método calcularSalarioAnual
// TODO: Implementar método obtenerInfo
class Empleado {

 private String nombre;
  private int id;
   private double salario;
    private String departamento;
     private int experiencia;
      
     public String getNombre() {
      return nombre;
    }


     public void setNombre(String nombre) {
       this.nombre = nombre;
     }


     public int getId() {
       return id;
     }


     public void setId(int id) {
       this.id = id;
     }


     public double getSalario() {
       return salario;
     }


     public void setSalario(double salario) {
       this.salario = salario;
     }


     public String getDepartamento() {
       return departamento;
     }


     public void setDepartamento(String departamento) {
       this.departamento = departamento;
     }


     public int getExperiencia() {
       return experiencia;
     }


     public void setExperiencia(int experiencia) {
       this.experiencia = experiencia;
     }


     public static int getContadorId() {
       return contadorId;
     }


     public static void setContadorId(int contadorId) {
       Empleado.contadorId = contadorId;
     }

     private static int contadorId = 1;

     public Empleado (String nombre, double salario, String departamento, int experiencia){
      this.id = contadorId++;

      if(nombre == null || nombre.isEmpty()){
        throw new IllegalArgumentException("no puede estar vacio");
      }
      if(salario <= 0){
        throw new IllegalArgumentException(" salario base debe ser positivo");
      }
      if(experiencia < 0){
        throw new IllegalArgumentException("la experiencia no puede ser negativa");
      }

      this.nombre = nombre;
      this.salario = salario;
      this.departamento = departamento;
      this.experiencia = experiencia;
    }


    public void agregarExperiencia (int año){
      if(año <= 0){
        System.out.println("debe ser positivo");
        return;
      }
      experiencia = experiencia + año;
    }

    public void actualizarSalario (double porcentaje){
      if(porcentaje <= 0){
        System.out.println("el porcentaje debe ser mayor a 0");
        return;
      }
      salario = salario * (porcentaje/100);
    }

    public void cambiarDepartamento (String nuevoDepartamento , int idEmpleado){
      if(this.id == idEmpleado){
        this.departamento = nuevoDepartamento;
      }else {
        System.out.println("id correcto, no se puede cambiar el departamento");
      }
    }

    public double calcularSalarioAnual() {
        double bono = 0;

        if (experiencia >= 2 && experiencia <= 5) {
            bono = 0.05;
        } else if (experiencia > 5) {
            bono = 0.10;
        }

        return (salario * 12) * (1 + bono);
    }

        public String obtenerInfo() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", ID=" + id +
                ", Departamento='" + departamento + '\'' +
                ", Experiencia=" + experiencia + " años" +
                ", Salario Base=" + salario +
                '}';
    }
}

public class Ejercicio4 {
      public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos Pérez", 1500, "Sistemas", 3);
        emp.actualizarSalario(10);
        emp.agregarExperiencia(2);
        emp.cambiarDepartamento("Desarrollo", emp.getId());
        System.out.println(emp.obtenerInfo());
        System.out.println("Salario anual: " + emp.calcularSalarioAnual());
    }
}
