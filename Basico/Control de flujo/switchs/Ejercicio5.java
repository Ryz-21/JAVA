/*Pide un número del 1 al 12 y muestra el mes correspondiente. */

public class Ejercicio5 {

    // no me gusta para nada el switch es muy lavorioso esto con un for y un if estaba listo 
    /*
    public static String mes(int numero) {
      String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril",
        "Mayo", "Junio", "Julio", "Agosto",
        "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    if (numero < 1 || numero > 12) {
        return "Número inválido";
    }

    return meses[numero - 1]; esto lo haria todo por que menos 1? por que empieza desde 0 pes 
    }
    */
    public static String mes (int numero){
       switch(numero){
        case 1: return "enero";
        case 2: return "febrero";
        case 3: return "marzo";
        case 4: return "abril";
        case 5: return "mayo";
        case 6: return "junio";
        case 7: return "julio";
        case 8: return "agosto";
        case 9: return "Septiembre";
        case 10: return "octubre";
        case 11: return "noviembre";
        case 12: return "diciembre";
        default: return "numero invalido";
    }

    }
    public static void main(String[] args) {
        
    }
}
