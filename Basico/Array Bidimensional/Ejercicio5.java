public class Ejercicio5 {
/*

Ejercicio 5: Encontrar el número mayor

Dada una matriz 5x5, encuentra y muestra:

El número mayor

Su posición (fila y columna)

*/

public static void numeroMayor (int[][] matriz){
    int mayor = matriz[0][0];
    int filaMayor = 0;
    int ColumnaMayor = 0;

    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz[i].length; j++){
            if (matriz[i][j] > mayor){
                mayor = matriz [i][j];
                filaMayor = i;
                ColumnaMayor = j;
            }
        }
        System.out.println("el numero mayor " + mayor);
        System.out.println("Se encuentra en la posición: Fila " + filaMayor + ", Columna " + ColumnaMayor);
    }
}
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 12, 7, 21, 3},
            {1, 45, 8, 14, 22},
            {9, 11, 67, 2, 18},
            {33, 5, 10, 89, 4},
            {15, 20, 6, 71, 0}
        };

        numeroMayor(matriz);
    }
}
