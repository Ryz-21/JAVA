    /*
    Ejercicio 2: Clase abstracta CuentaBancaria con métodos depositar(double) y retirar(double)
    (este último abstracto). Implementar CuentaAhorros (con interés anual) y CuentaCorriente 
    (con sobregiro permitido). Modela la lógica básica de cada tipo sin implementar los métodos
    en la clase abstracta.
    */
    abstract class CuentaBancaria {
        protected double saldo;

        public CuentaBancaria (double saldo){
            this.saldo = saldo;
        }

        public double getSalario (){
            return saldo;
        }

        public void depostiar (double monto){
            if(monto > 0){
                saldo += monto;
                System.out.println("se aumento el saldo");
            } else {
                System.out.println("error");
            }
        }

        public abstract void retirar (double monto);
    }

    class CuentaAhorros extends CuentaBancaria {
        private double interes;

        public CuentaAhorros(double saldo, double interes){
            super(saldo);
            this.interes = interes;
        }


     
        public void retirar (double monto){
            if(monto > 0 && monto <= saldo){
                saldo -= monto;
                System.out.println("se a procesado su retiro de manera exitosa ");
            }
        }     
    }


    class CuentaCorriente extends CuentaBancaria {
    
    private double limiteSobregiros;

    
    public CuentaCorriente(double saldo, double limiteSobregiros){
        super(saldo);
        this.limiteSobregiros = limiteSobregiros;
    }

    public void retirar (double monto){
         if (monto > 0 && (saldo - monto) >= -limiteSobregiros) {
            saldo -= monto;
            System.out.println("Retiro (Corriente): " + monto + ". Saldo restante: " + saldo);
        } else {
            System.out.println("Error: Límite de sobregiro excedido.");
        }
    }
    
} 


    public class Ejercicio2 {
        public static void main(String[] args) {
              CuentaAhorros ca = new CuentaAhorros(100.0, 0.05);
        CuentaCorriente cc = new CuentaCorriente(50.0, 200.0);

        ca.depostiar(50);
        ca.retirar(120.0); // Falla por saldo insuficiente
        ca.retirar(40.0);  // Exitoso

        cc.depostiar(120);
        cc.retirar(300.0); // Exitoso (saldo queda en -150, dentro del límite de 200)
        cc.retirar(60.0);  // Falla (excede el límite de sobregiro)
        }
    }
