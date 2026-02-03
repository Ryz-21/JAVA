
interface PagoOnline {
 default void ProcesarPago(){
    System.out.println("Procesando pago ONLINE");
 }
}

interface PagoFisico {
 default void ProcesarPago(){
    System.out.println("Procesando pago FÍSICO");
 }
}
class Tienda implements PagoFisico, PagoOnline {
    
    public Tienda(){
        
    }
    @Override
    public void ProcesarPago (){
        PagoFisico.super.ProcesarPago();
        PagoOnline.super.ProcesarPago();
        System.out.println("Pago procesado en la tienda");
    }
}
public class Ejercicio4 {
  public static void main(String[] args) {
      Tienda pago1 = new Tienda();
      pago1.ProcesarPago();
  }
}
