
import java.util.HashMap;
import java.util.Map;

import ArrayList.Ejercicio6;

/**
 * EJERCICIO 8: CACHÉ DE CONVERSIONES DE DIVISAS
 * 
 * PREGUNTA: Crea un sistema de caché que almacene conversiones de divisas ya 
 * realizadas para evitar cálculos repetidos. Si la conversión ya existe en 
 * caché, devuelve el valor guardado; si no, realiza la conversión y la guarda.
 * 
 * PISTA: Usa HashMap<String, Double> donde la clave es una combinación de 
 * las dos divisas (ej: "USD-EUR") y el valor es la tasa de conversión. 
 * Verifica si existe la clave con containsKey() antes de hacer cálculos. 
 * Guarda nuevas conversiones con put().
 */


public class Ejercicio8 {

    // 2) Caché de tasas: clave "USD-EUR", valor = tasa (ej: 0.92)
    private Map<String, Double> cache = new HashMap<>();

    // 3) Normaliza la clave
    private String clave(String origen, String destino) {
        return origen.toUpperCase() + "-" + destino.toUpperCase();
    }

    // 4) Agrega una tasa explícitamente a la caché
    public void agregarTasa(String origen, String destino, double tasa) {
        cache.put(clave(origen, destino), tasa);
    }

    // 5) Obtiene una tasa si existe; si no, intenta usar la inversa
    public Double obtenerTasa(String origen, String destino) {
        String k = clave(origen, destino);
        if (cache.containsKey(k)) {
            return cache.get(k);
        }
        // intentar hallar la inversa (ej: si USD-EUR no existe, pero EUR-USD sí)
        String inv = clave(destino, origen);
        if (cache.containsKey(inv)) {
            double tasaInv = cache.get(inv);
            if (tasaInv != 0.0) {
                return 1.0 / tasaInv;
            }
        }
        return null; // no hay tasa disponible
    }

    /**
     * 6) Convierte monto de origen -> destino.
     *    - Si la tasa está en caché o se puede inferir la inversa, la usa.
     *    - Si no está, usa 'tasaSiNoExiste' para guardarla y realizar la conversión.
     *
     * @param origen           código divisa origen (ej: "USD")
     * @param destino          código divisa destino (ej: "EUR")
     * @param monto            monto en la divisa origen
     * @param tasaSiNoExiste   tasa a usar y guardar si no hay nada en caché (ej: 0.92)
     * @return                 monto convertido en la divisa destino
     */
    public double convertir(String origen, String destino, double monto, double tasaSiNoExiste) {
        if (origen.equalsIgnoreCase(destino)) {
            return monto; // misma divisa, retorno directo
        }

        Double tasa = obtenerTasa(origen, destino);
        if (tasa != null) {
            // ya estaba en caché (o se pudo inferir)
            return monto * tasa;
        } else {
            // no estaba: guardamos la tasa proporcionada y convertimos
            agregarTasa(origen, destino, tasaSiNoExiste);
            return monto * tasaSiNoExiste;
        }
    }

    // 7) Mostrar cache para ver las tasas almacenadas
    public void mostrarCache() {
        System.out.println("Contenido de la caché:");
        cache.forEach((k, v) -> System.out.println(k + " = " + v));
    }

    // 8) Ejemplo de uso en main
    public static void main(String[] args) {
        Ejercicio8 caché = new Ejercicio8();

        // Primera conversión: no hay tasa en caché, usamos la tasa indicada y la guardamos
        double c1 = caché.convertir("USD", "EUR", 100.0, 0.92);
        System.out.println("100 USD a EUR = " + c1);

        // Segunda conversión mismo par: usa la tasa en caché (no se necesita pasar la tasa,
        // pero el método necesita un valor por si no existe; lo ignorará si ya existe)
        double c2 = caché.convertir("USD", "EUR", 50.0, 0.0);
        System.out.println("50 USD a EUR = " + c2);

        // Conversión inversa: si no está EUR-USD en caché, el método `obtenerTasa` intentará
        // usar la inversa 1/(USD-EUR) automáticamente.
        double c3 = caché.convertir("EUR", "USD", 100.0, 0.0);
        System.out.println("100 EUR a USD (usando inversa) = " + c3);

        // Si quieres forzar una tasa nueva para EUR-USD diferente, agrégala explícitamente
        caché.agregarTasa("EUR", "USD", 1.10); // ahora EUR->USD = 1.10 (sobrescribe si existía)
        double c4 = caché.convertir("EUR", "USD", 100.0, 0.0);
        System.out.println("100 EUR a USD (con tasa forzada 1.10) = " + c4);

        // Mostrar las tasas guardadas
        caché.mostrarCache();
    }
}


