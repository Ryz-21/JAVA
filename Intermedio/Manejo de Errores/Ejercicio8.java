public class Ejercicio8 {
        public static void main (String[] args){
          try {
            metodoConThrows();
        } catch (Exception e) {
            System.out.println("Excepción propagada capturada en main: " + e.getMessage());
        }
    }
     public static void metodoConThrows() throws Exception {
        throw new Exception("Esta excepción fue propagada con 'throws'");
    }
}
