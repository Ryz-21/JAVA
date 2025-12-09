package Ejercicio1;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo {
    int cilindrada;
    double gasolina;
    double peso;
    double pesoAñadido;

    private List<RegistroCarga> HistorialdeCargas = new ArrayList<>();

    public void RegistroCarga(double pesoCarga){
        HistorialdeCargas.add(new RegistroCarga(pesoCarga, LocalDate.now()));
        }
    
    public List<RegistroCarga> getObtenRegistroCargas (){
        return  HistorialdeCargas;
    }

    public Camion (String marca , String modelo , int año , int cilindrada , double gasolina , double peso , double pesoAñadido ){
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
        this.gasolina = gasolina;
        this.peso = peso;
        this.pesoAñadido = pesoAñadido;

        RegistroCarga(pesoAñadido);
    }

    @Override
    public double Calcularconsumo(){
        if(gasolina == 0){
            return  0;
        } else {
            return (cilindrada * 0.3) + (peso * 0.015) + (pesoAñadido * 0.01);
        }
    }
    @Override
    public String Descripcion(){
        return "auto: " + marca + "" + modelo + "(" + año + ")";
    }
    
    

    public static class RegistroCarga {
    
    private double pesoCarga;
    private LocalDate fecha;

    public RegistroCarga(double pesoCarga, LocalDate fecha){
        this.pesoCarga = pesoCarga;
        this.fecha = fecha;
    }
    @Override
    public String toString(){
        return "la fecha de el ingreso del peso fue " + fecha + "el peso fue de " + pesoCarga; 
    }
}
}



