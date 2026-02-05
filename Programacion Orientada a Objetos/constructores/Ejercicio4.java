class CuentaBancaria {
    double saldo;
    String titular;

    public CuentaBancaria() {
        saldo = 0;
        titular = "sin titular";
    }

    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    // constructor copia
    public CuentaBancaria(CuentaBancaria c) {
        this.saldo = c.saldo;
        this.titular = c.titular;
    }

    public void mostrar() {
        System.out.println("el saldo es " + saldo + " y el titular es " + titular);
    }

}

public class Ejercicio4 {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        c1.mostrar();
        CuentaBancaria c2 = new CuentaBancaria(100, "Juan");
        c2.mostrar();
        CuentaBancaria c3 = new CuentaBancaria(c2);
        c3.mostrar();
    }
}
