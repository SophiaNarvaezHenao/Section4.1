public class Image {
    public static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] rotar90(int[][] imagen) {
        int filas = imagen.length;
        int columnas = imagen[0].length;
        int[][] rotada = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                rotada[j][filas - 1 - i] = imagen[i][j];
            }
        }
        return rotada;
    }
    public static int[][] flipH(int[][] imagen) {
        int filas = imagen.length;
        int columnas = imagen[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][columnas - 1 - j] = imagen[i][j];
            }
        }
        return resultado;
    }
    public static int[][] flipV(int[][] imagen) {
        int filas = imagen.length;
        int columnas = imagen[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[filas - 1 - i][j] = imagen[i][j];
            }
        }
        return resultado;
    }

    public static int[][] transponer(int[][] imagen) {
        int filas = imagen.length;
        int columnas = imagen[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = imagen[i][j];
            }
        }

        return transpuesta;
    }
}
