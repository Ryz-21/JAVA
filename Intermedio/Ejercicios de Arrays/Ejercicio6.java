import java.util.List;
public class Ejercicio6 {
     public static void main(String[] args) {
        
    }
    //6. Sumar todos los números de una lista
    public Integer lista (List<Integer> lista){
        int resultado = 0;
        for (int i : lista) {
            resultado += i;
        }
        return resultado;
    }
}
