//clase que implementa varias interfaces
interface Volador {
 void volar ();
}

interface Nadador {
 void nadar();
}

class pato implements Volador , Nadador {
    
    public pato() {
    }

    @Override
    public void volar() {
        System.out.println("esta volando");        
    }
    @Override
    public void nadar(){
        System.out.println("estas nadando");
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
            pato animal1 = new pato();
            animal1.volar();
    }
    
}
