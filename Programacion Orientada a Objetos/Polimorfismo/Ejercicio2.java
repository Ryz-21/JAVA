/*
Ejercicio 2 — Polimorfismo en un sistema bancario

Enunciado:
Modela un sistema bancario simple usando polimorfismo. Crea una clase base `Cuenta` con métodos como
`public void depositar(double cantidad)`, `public boolean retirar(double cantidad)` y `public double calcularInteres()`.
Implementa al menos dos subclases: `CuentaAhorro` y `CuentaCorriente`, donde cada una calcula el interés o comisiones
de forma diferente (sobrescribiendo `calcularInteres()` o añadiendo comportamientos propios).

Tareas:
- Definir la clase `Cuenta` con atributos básicos (titular, saldo) y los métodos indicados.
- Implementar `CuentaAhorro` y `CuentaCorriente` con sus reglas (por ejemplo, interés positivo para ahorro y comisión
	por descubierto para corriente).
- Crear una clase `Banco` que tenga una lista de `Cuenta` y un método `actualizarCuentas()` que recorra todas las
	cuentas y aplique `calcularInteres()` o cobros correspondientes, demostrando polimorfismo.

Entregable: Clases y una clase `main` que cree varias cuentas y muestre el comportamiento polimórfico.
*/

import java.util.ArrayList;

abstract class cuenta {

    protected String titular;
    protected Double saldo;
    
    public cuenta (String titular, Double saldo ){
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void depositar(double cantidad);
    public abstract boolean retirar (double cantidad);

    public abstract double calcularInteres();

}

class CuentaCorriente extends cuenta {

    
    public CuentaCorriente (String titular , double saldo){
        super(titular, saldo);
    }

    @Override
    public void depositar (double cantidad){
        if(cantidad <= 0){
            System.out.println("no se puede ejecuta esta operacion");
        }else {
            saldo += cantidad; 
            System.out.println("se realizo la operacion");
        }
    }

    public boolean retirar (double cantidad){
        if(cantidad <= 0 || cantidad > saldo){
            System.out.println("no se puede realizar la operacion");
            return false;
        }else {
            saldo -= cantidad;
            System.out.println("retiro exitoso");
            return true;
        }
    }

    public double calcularInteres () {
        if (saldo >= 0){
            return saldo*0.01;
        } else {
            return -20;
        }
    }


}

class CuentaAhorro extends cuenta {
    

    public CuentaAhorro (String titular, double saldo){
        super(titular,saldo);
    }

    @Override
    public boolean retirar (double cantidad){
        if(cantidad> saldo || cantidad <= 0){
            System.out.println("no se puede realizar la operacion");
            return false;
        }else{
            saldo -= cantidad;
            System.out.println("retiro exitoso");
            return true;
        }
    }

    @Override
    public void depositar (double cantidad){
        if(cantidad <= 0){
            System.out.println("no se puede realizar esta operacion");
        }else{
            saldo += cantidad;
            System.out.println("operacion exitosa");
        }
    }

    @Override
    public double calcularInteres(){
       return saldo * 0.03; //interes de 3 
    }
}

class banco {
     private ArrayList<cuenta> cuentas = new ArrayList<>();


     public void agregarCuenta(cuenta c){
        cuentas.add(c);
     }

    public void demostrarpolimorfismo (){
            for(cuenta c : cuentas){
                double interes = c.calcularInteres();
                c.saldo += interes;
                System.out.println(c.titular + " actualizado: +" + interes);
            }
        }

}
public class Ejercicio2 {


    public static void main(String[] args) {
    
        banco banco = new banco();

        cuenta c1 = new CuentaAhorro("Luis", 1000);
        cuenta c2 = new CuentaCorriente("Maria", 500);

        banco.agregarCuenta(c1);
        banco.agregarCuenta(c2);
        
        banco.demostrarpolimorfismo();
       
    }
}