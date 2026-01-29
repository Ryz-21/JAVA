import java.util.*;

public class Ejercicio4 {

    public static String CorreoRepetidos(List<String> variable1) {
        Set<String> correos = new LinkedHashSet<>();
        for (String correo : variable1) {
            if (correos.contains(correo)) {
                return "Correo repetido";
            }
            correos.add(correo);
        }
        return "Correo no repetido";
    }

    public static void main(String[] args) {
        // likendhast de correos
        List<String> correos = Arrays.asList(
                "Darkltatagmail.com",
                "[EMAIL_ADDRESS]",
                "[EMAIL_ADDRESS]",
                "[EMAIL_ADDRESS]",
                "[EMAIL_ADDRESS]");

        System.out.println(CorreoRepetidos(correos));
    }
}
