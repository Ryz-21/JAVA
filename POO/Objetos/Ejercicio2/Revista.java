package Ejercicio2;

public class Revista extends Material {

    public Revista (int id , String titulo , int año){
        super(id, titulo, año);
    }

    @Override
    public boolean puedePrestarse(){
        return true;
    }
}
