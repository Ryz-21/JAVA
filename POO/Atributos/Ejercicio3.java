/*
 * EJERCICIO 3: Clase CuentaBancaria
 * 
 * Crea una clase CuentaBancaria con los atributos:
 * - numeroCuenta (String)
 * - titularCuenta (String)
 * - saldoActual (double)
 * 
 * Implementa métodos para:
 * - depositar(double cantidad)
 * - retirar(double cantidad) - validar que no retire más de lo disponible
 * - consultarSaldo()
 * - mostrarInformacion()
 * 
 * En main, crea una cuenta, realiza varios depósitos y retiros,
 * y muestra el estado final de la cuenta.
 * 
 * TODO: Implementar la clase con validaciones y operaciones bancarias.
 */
class CuentaBancaria {
    String numeroCuenta;
    String titularCuenta;
    double saldoActual;


    public CuentaBancaria(String numeroCuenta, String titularCuenta, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.titularCuenta = titularCuenta;
        this.saldoActual = saldoActual;
    }

    public void depositar (double cantidad){
        if(cantidad <= 0) {
            System.out.println("no se puede agregar cantidades menor a 0");
        } else {
            saldoActual += cantidad;
            System.out.println("Deposito realizado " + cantidad);
        }
    }

    public void retirar (double cantidad){
        if(cantidad <= 0){
            System.out.println("no se puede retirar una cantidad de dinero negativo");
        }else if (cantidad > saldoActual){
            System.out.println("no se puede retirar una cantidad mayor al saldo actual");
        }else{
            saldoActual -= cantidad;
            System.out.println("Retiro realizado " + cantidad);
        }
    }

    @Override
    public String toString(){
        return "informacion de la cuenta : " + "numero de cuenta : " + numeroCuenta + "titular :" + titularCuenta + "saldo actual : " + saldoActual ;
    }

    public double consultarSaldo (){
        return saldoActual;
    }
}
public class Ejercicio3 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("987-654", "Leo Suasnabar", 1000);
        cuenta.depositar(500);      
        cuenta.retirar(200);        
        cuenta.retirar(2000);       
        cuenta.depositar(-50);     
        cuenta.retirar(300);    
        
        System.out.println(cuenta);

        System.out.println("Saldo final: " + cuenta.consultarSaldo());

    }
}
