public class Ejercicio4 {

    public static void Sumafila (int[][] matriz){
        int NumFilas = matriz.length;
        int NumColumnas = matriz[0].length;

        for(int j = 0; j<NumColumnas; j++){
            int sumaColumna = 0;

            for(int i = 0; i<NumFilas; i++){
                sumaColumna += matriz[i][j];
            }

          System.out.println("Suma de columnas " + j + ":" + sumaColumna);
        }
    }

    public static void main(String[] args) {
         int[][] datos = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Cálculo de sumas por columna:");
        Sumafila(datos);
    }
}
