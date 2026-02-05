class libro {

    libro() {
        System.out.println("libro creado");
    }
}

public class Ejercicio1 {
    public static void main(String args[]) {
        libro L1 = new libro();
        System.out.println(L1.toString());
    }
}