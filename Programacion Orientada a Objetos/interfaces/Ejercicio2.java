interface imprimible {
    public String mostrarformato ();
    public String info();
}

class Factura implements imprimible {

    public Factura() {

    }

    @Override
    public String mostrarformato (){
        return "el formato de compra es boleta simple";
    }
    @Override
    public String info (){
        return "la informacion del producto es (inserte informacion )";
    }
}
public class Ejercicio2 {
    public static void main(String[] args) {
            Factura boleta = new Factura();
            System.out.println(boleta.info());
    }
}