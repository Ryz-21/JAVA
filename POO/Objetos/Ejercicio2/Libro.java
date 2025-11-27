package Ejercicio2;

public class Libro extends  Material {
    
    private boolean referencia;

    public Libro (int id, String titulo, int año , boolean referencia){
        super(id, titulo, año);
        this.referencia = referencia;
    }

    @Override
    public boolean puedePrestarse(){
        return !referencia;
    }
}
