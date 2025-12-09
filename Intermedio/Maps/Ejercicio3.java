
import java.util.HashMap;
import java.util.Scanner;


/**
 * EJERCICIO 3: AGENDA TELEFÓNICA
 * 
 * PREGUNTA: Desarrolla una agenda telefónica donde puedas guardar nombres y 
 * sus números de teléfono. Implementa opciones para agregar, buscar, eliminar 
 * y listar todos los contactos.
 * 
 * PISTA: Usa HashMap<String, String> donde la clave es el nombre y el valor 
 * es el teléfono. Utiliza put() para agregar, get() para buscar, remove() 
 * para eliminar, y values() o entrySet() para listar todos.
 */


public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> glosarioTelefono = new HashMap<>();

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Listar todos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (opcion == 1) {
                // AGREGAR
                System.out.print("Ingrese el nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Ingrese el número: ");
                String numero = sc.nextLine();

                glosarioTelefono.put(nombre, numero);
                System.out.println("Contacto agregado.");

            } else if (opcion == 2) {
                // BUSCAR
                System.out.print("Ingrese el nombre a buscar: ");
                String nombre = sc.nextLine();

                String resultado = glosarioTelefono.get(nombre);

                if (resultado != null) {
                    System.out.println("Número encontrado: " + resultado);
                } else {
                    System.out.println("No existe ese contacto.");
                }

            } else if (opcion == 3) {
                // ELIMINAR
                System.out.print("Ingrese el nombre a eliminar: ");
                String nombre = sc.nextLine();

                if (glosarioTelefono.remove(nombre) != null) {
                    System.out.println("Contacto eliminado.");
                } else {
                    System.out.println("Ese contacto no existe.");
                }

            } else if (opcion == 4) {
                // Lista con entry set  
               if(glosarioTelefono.isEmpty()){
                System.out.println("No hay contactos");
               }else{
                for(var entry: glosarioTelefono.entrySet()) {
                    System.out.println("nombre: " + entry.getKey() + "telefono " + entry.getValue());
                }
            }
        } else if (opcion == 5){
            System.out.println("opcion invalida");
        }
        System.out.println("Saliendo del sistema...");
    }
    }
}

