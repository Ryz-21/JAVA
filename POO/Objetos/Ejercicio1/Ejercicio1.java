package Ejercicio1;
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Camion c = new Camion("Volvo", "FH16", 2022,
                16000, 200, 8000, 1200);

        System.out.println(c.Descripcion());
        System.out.println("Consumo: " + c.Calcularconsumo());

        c.RegistroCarga(500);
        c.RegistroCarga(800);

        System.out.println("Historial de cargas:");
        for (var carga : c.getObtenRegistroCargas()) {
            System.out.println(carga);
        }
    }
}

