public class Ejercicio3 {
    /*
Ejercicio 3: Suma de filas
En una matriz 3x3, muestra la suma de cada fila.
    */


    public static void sumaFilas (int[][] matriz){
        for(int i = 0;  i < matriz.length; i++){
            int sumafila = 0;

            for(int j = 0; j<matriz[i].length; i++){
                sumafila += matriz[i][j];
            }
            System.out.println("la suma de la fila es" + sumafila);
        }
    }
    public static void main(String[] args) {
        int[][] matriz = {
            {1,2,3},
            {2,3,4},
            {4,2,3},
        };

        sumaFilas(matriz);
    }
}
