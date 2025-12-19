public class Ejercicio1 {
    /*
    Ejercicio 1: Mostrar una matriz
Crea una matriz de 3x3 con números enteros y muéstrala en forma de tabla.
    */
public static void mostrarMatriz () {
    /*
         // 1. Declaración e inicialización de la matriz 3x3
        int[][] matriz = new int[3][3];
        matriz[0][0] = 10; 
        matriz[0][1] = 20;
        matriz[0][2] = 10;
        matriz[1][0] = 5;  matriz[1][1] = 15; matriz[1][2] = 25; // Valores adicionales de ejemplo
        matriz[2][0] = 30; matriz[2][1] = 40; matriz[2][2] = 50;
     */
    int[][] matriz = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    for(int i = 0; i<matriz.length; i++){
        for(int j = 0; j<matriz[i].length; j++){
            System.out.print(matriz[i][j] + "\t");
        }
        System.out.println();
    }
}   
public static void main(String[] args) {
    mostrarMatriz();
}
}