public class Ejercicio1 {
    public static void main(String[] args) {
         Ejercicio1 InstanciaExterna = new Ejercicio1();
        Ejercicio1.Persona persona1 = InstanciaExterna.new  Persona();
        persona1.nombre = "Leo";
        persona1.edad = 20;

        String resultado = persona1.nombre();

        System.out.println("el resultado es" + resultado);
        }

    public class Persona {
        String nombre;
        int edad;

        public String nombre(){
            return "nombre"+nombre+" edad "+edad;
        }
    }
}
