/*
 * EJERCICIO 3: Clase Cuenta Bancaria
 * 
 * Crea una clase CuentaBancaria con los siguientes requisitos:
 * - Atributos: numeroCuenta (String), titular (String), saldo (double)
 * - Constructor que inicialice los tres atributos
 * - Método depositar(double cantidad) que agregue dinero a la cuenta
 * - Método retirar(double cantidad) que quite dinero (validar que no sea mayor al saldo)
 * - Método consultarSaldo() que devuelva el saldo actual
 * - Método toString() que muestre los datos de la cuenta
 * 
 * En main, crea una cuenta, realiza varios depósitos y retiros, 
 * y muestra el estado final de la cuenta.
 */
class CuentaBancaria{
   int numeroCuenta; 
   String titular;
   double saldo;

    public CuentaBancaria(int numeroCuenta, String titular, double saldo) {
    this.numeroCuenta = numeroCuenta;
    this.titular = titular;
    this.saldo = saldo;
    }

    @Override
    public String toString(){
        return "los datos son" + numeroCuenta + "titular es " + titular + "el saldo es " + saldo;
    }

    public void consultarSaldo(){
        System.out.println("el saldo total es " + saldo);
    }

    public void depositar (double monto) {
    this.saldo += monto;
    System.out.println("monto actual es " + monto);
   }

    public void retirar (double monto){
    this.saldo -= monto;
    System.out.println("monto actual es" + monto);
   }
}

public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO: Crear objeto y probar las operaciones
        CuentaBancaria cuenta1 = new CuentaBancaria(1230400403, "leo valdivia", 0);
        
        cuenta1.consultarSaldo();
        cuenta1.depositar(200);
        cuenta1.retirar(12);

        System.out.println("el monto es " + cuenta1.toString());
    }
}
