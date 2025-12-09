// EJERCICIO 2: Clase Cuenta Bancaria
//
// Objetivo: Crear una clase CuentaBancaria que encapsule los datos
// de una cuenta: número de cuenta, titular, saldo, PIN
//
// Requisitos:
// - Todos los atributos deben ser privados
// - El saldo solo puede consultarse, no modificarse directamente
// - El PIN debe estar protegido (solo lectura)
// - Crear métodos: depositar(cantidad), retirar(cantidad, pin)
// - El método retirar debe validar el PIN antes de procesar
// - El método depositar debe validar que la cantidad sea positiva
// - Crear método consultarSaldo(pin) que requiera PIN para acceder
//
// TODO: Implementar la clase CuentaBancaria
// TODO: Crear atributos privados
// TODO: Implementar constructor
// TODO: Implementar método depositar con validación
// TODO: Implementar método retirar con validación de PIN
// TODO: Implementar método consultarSaldo con protección
class CuentaBancaria{

 private  int numerodecuenta;
 private  String titular;
 private double saldo;
 private int PIN;
 
 public int getNumerodecuenta() {
  return numerodecuenta;
}

 public void setNumerodecuenta(int numerodecuenta) {
  this.numerodecuenta = numerodecuenta;
 }

 public String getTitular() {
  return titular;
 }

 public void setTitular(String titular) {
  this.titular = titular;
 }

 public double getSaldo() {
  return saldo;
 }

 public void setSaldo(double saldo) {
  this.saldo = saldo;
 }

 public int getPIN() {
  return PIN;
 }

 public void setPIN(int pIN) {
  PIN = pIN;
 }

 public CuentaBancaria(int numerodecuenta, String titular, int pIN) {
  this.numerodecuenta = numerodecuenta;
  this.titular = titular;
  this.PIN = pIN;
  this.saldo = 0;

 }

 public double consultarSaldo (int pinIngresado){
  if(pinIngresado == PIN){
    return saldo;
  } else {
    System.out.println("pin incorrecto, prueba nuevamente");
    return -1;
  }
 }

 public void depositar (double cantidad){
  if(cantidad > 0){
    saldo += cantidad;
    System.out.println("se ingresa el nuevo deposito" + saldo);
  }
 }

 public void retirar (double cantidad , int pinIngresado){
  if(pinIngresado != PIN){
    System.out.println("Pin ingresado, no se puede retirar");
    return;
  }
  if(cantidad <= 0){
    System.out.println("la cantidad debe ser mayor a 0");
  }
  if (cantidad > saldo){
    System.out.println("Saldo insuficiente");
  }
  saldo -= cantidad;
  System.out.println("retiro exitoso. nuevo saldo" + saldo);
 }
}
public class Ejercicio2 {
      public static void main(String[] args) {
        
         CuentaBancaria cuenta = new CuentaBancaria(123456, "Leo Valdivia", 4321);

        cuenta.depositar(500);
        cuenta.retirar(200, 4321);

        System.out.println("Saldo consultado: " + cuenta.consultarSaldo(4321));

    }
}
