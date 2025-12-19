public class Ejercicio6 {

    public static void transponerMatriz(int[][] matriz) {
        int filasOriginales = matriz.length; // 3
        int columnasOriginales = matriz[0].length; // 2

        // Creamos la nueva matriz con dimensiones invertidas (2x3)
        int[][] transpuesta = new int[columnasOriginales][filasOriginales];

        // Lógica de intercambio
        for (int i = 0; i < filasOriginales; i++) {
            for (int j = 0; j < columnasOriginales; j++) {
                // Lo que era fila i, columna j -> ahora es fila j, columna i
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar la matriz resultante
        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
    }
}
