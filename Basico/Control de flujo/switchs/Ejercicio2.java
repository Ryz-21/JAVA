/* Menú de opciones
Muestra un menú:
1. Saludar
2. Despedirse
3. Mostrar fecha
*/

import java.time.*;
public class Ejercicio2 {



    public static void Menu (int opcion, LocalDateTime localDateTime){
        switch(opcion){
            case 1:
                System.out.println("Hola");
                break;
            case 2:
                System.out.println("Despedirse");
                break;
            case 3:
                System.out.println("" + localDateTime);
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }
    }
    public static void main(String[] args) {
            LocalDateTime ahora = LocalDateTime.now();
            int opcion = 3;
            Menu(opcion,ahora);
    }
}