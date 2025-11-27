package Ejercicio2;

public abstract class Material {
    protected int id;
    protected String titulo;
    protected int año;

    public Material(int id, String titulo, int año) {
        this.id = id;
        this.titulo = titulo;
        this.año = año;
    }

    public abstract boolean puedePrestarse();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
