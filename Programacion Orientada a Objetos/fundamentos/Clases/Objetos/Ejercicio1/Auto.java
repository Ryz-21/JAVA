package Ejercicio1;

public class Auto extends Vehiculo { // de la clase vehiculo extendelo a autos

    private int cilindrada;
    private double gasolina;
    private double peso;

    public Auto (String marca, String modelo, int año , int cilindrada , double peso , double gasolina){
        super(marca,modelo,año); // llama al constructor de vehiculo
        this.cilindrada = cilindrada;
        this.gasolina = gasolina;
        this.peso = peso;
    }
    
    @Override
    public double Calcularconsumo(){
        if( this.gasolina == 0){
            return 0;
        } else {
            return (cilindrada * 0.2) + (peso * 0.01);
        }
    }

    @Override
    public String Descripcion(){
        return "auto: " + marca + "" + modelo + "(" + año + ")";
    }
}
