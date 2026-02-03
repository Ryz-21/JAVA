//al ser una interface el GUI ya sabe que es un metodo abastrado sin implementar
class Cuadrado implements Figura {
  
    private double lado;

    public Cuadrado (){
    }

    public Cuadrado (double radio){
        this.lado = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * lado * lado;
        return resultado;
    }
}

public interface Figura {
    public double calcularArea();
}