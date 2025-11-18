class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double CalularArea (){
        return base * altura;
    }
    public double CalcularPerimetro(){
        return 2*base+2*altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
public class Ejercicio4 {
    public static void main(String[] args) {
        Rectangulo mirectangulo = new Rectangulo(10.5, 5.0);

        double area = mirectangulo.CalularArea();
        System.out.println("la base del recantgulo es :" + mirectangulo.getBase());
        System.out.println("La altura del rectángulo es: " + mirectangulo.getAltura());
        System.out.println("El área del rectángulo es: " + area);

        double perimetro = mirectangulo.CalcularPerimetro();
                System.out.println("El perímetro del rectángulo es: " + perimetro);
                mirectangulo.setBase(7.0);
        mirectangulo.setAltura(3.0);
        System.out.println("\nDespués de cambiar dimensiones:");
        System.out.println("Nueva área: " + mirectangulo.CalularArea());
        System.out.println("Nuevo perímetro: " + mirectangulo.CalcularPerimetro());
        System.out.println("Nueva área: " + mirectangulo.CalcularPerimetro());
    }
}
