public class Ejercicio2 {

    public static void calcularSuma (int[][] matriz){
        int acomulador = 0;
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                acomulador += matriz[i][j];
            }
        }
        System.out.println("el total es " + acomulador);
    }
    public static void main(String[] args) {
        //Dada una matriz 4x2, calcula y muestra la suma total de todos sus elementos.
        int[][] matriz = {
            {1,2,3,4},
            {1,2,3,5}
        };

        calcularSuma(matriz);
    }
}
