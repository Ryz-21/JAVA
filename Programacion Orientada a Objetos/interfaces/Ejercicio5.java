/*
 Ejercicio 5 – Abstract class vs Interface (caso real)
Tema: diferencias reales y cuándo usar cada una
Enunciado
Diseña un sistema de empleados:
Interface Bonificable
Método calcularBono()
Clase abstracta Empleado
Atributos: nombre, sueldo
Método concreto: mostrarDatos()
Método abstracto: calcularSueldoFinal()
Crea las clases:
EmpleadoTiempoCompleto
EmpleadoPorHoras
Ambas:
Extienden Empleado
Implementan Bonificable
Objetivo
Ver claramente:
Interface → capacidades
Abstract class → base con estado y comportamiento
*/

interface Bonificable{
    public double calcularBono();
}
abstract class Empleado {
    protected String nombre;
    protected Double sueldo;

    public Empleado (String nombre , Double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + " Sueldo: " + sueldo);
    }
    public abstract double calcularSueldoFinal();
}
class EmpleadoTiempoCompleto extends Empleado implements Bonificable{
    private double bonoAnual;
    public EmpleadoTiempoCompleto(String nombre, Double sueldo, double bonoAnual){
        super(nombre, sueldo);
        this.bonoAnual = bonoAnual;
    }
    @Override
    public double calcularBono(){
        return bonoAnual;
    }
    @Override
    public double calcularSueldoFinal(){
        return sueldo + bonoAnual;
    }
}
class EmpleadoPorHoras extends Empleado implements Bonificable{
    private int horasTrabajadas;
    private double tarifaPorHora;
    public EmpleadoPorHoras(String nombre, Double sueldo, int horasTrabajadas, double tarifaPorHora){
        super(nombre, sueldo);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    @Override
    public double calcularBono(){
        return horasTrabajadas * tarifaPorHora * 0.1;
    }
    @Override
    public double calcularSueldoFinal(){
        return sueldo + horasTrabajadas * tarifaPorHora;
    }
}
public class Ejercicio5 {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Juan", 1000.0, 100.0);
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Maria", 1000.0, 10, 10.0);
        empleado1.mostrarDatos();
        empleado2.mostrarDatos();
    }
}
