class CuentaBancaria{
    private double salario;

   public CuentaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.salario = saldoInicial;
        } else {
            System.out.println("El saldo inicial no puede ser negativo. Se establece en 0.");
            this.salario = 0;
        }
    }
    public double getSaldo (){
        return salario;
    }
    public void depositar (double cantidad){
        if(cantidad > 0){
            this.salario += cantidad;
            System.out.println("Deposito de" + cantidad + "realizo. sado actual " + this.salario);
        }else{
            System.out.println("la cnatidad a depositar debe ser positiva");
        }
    }
    public void retirardinero (double cantidad){
        if(cantidad > 0 && cantidad <= this.salario){
            this.salario -= cantidad;
            System.out.println("retiro de " + cantidad + "realizo. saldo actual: " + this.salario);
        }else if (cantidad > this.salario){
            System.out.println("saldo insuficiente para retirar" + cantidad);
        }else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        CuentaBancaria micuenta = new CuentaBancaria(1000);

        System.out.println("saldo inicial :" + micuenta.getSaldo());
        micuenta.depositar(1000);
        System.out.println("saldo actual " + micuenta.getSaldo());
        micuenta.retirardinero(200.00);   
        System.out.println("saldo actual " + micuenta.getSaldo());

    }

}