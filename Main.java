import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sea usted bienvenido al programa de manipulacion de imagenes. :D ");
        System.out.println("Es hora de que usted ingrese su imagen en escala de grises.");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese el numero de filas de la imagen: ");
            int filas = sc.nextInt();
            System.out.println("Ingrese el numero de columnas de la imagen: ");
            int columnas = sc.nextInt();
            if (filas <= 0 || columnas <= 0) {
                System.out.println("El numero de filas y columnas debe ser mayor que cero.");
                return;
            }
            int[][] imagen = new int[filas][columnas];
            System.out.println("Ahora, ingrese los valores de los pixeles (0-255) fila por fila:");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.println("Valor del pixel en fila " + (i + 1) + ", columna " + (j + 1) + ": " );
                    int valor = sc.nextInt();
                    if (valor < 0 || valor > 255) {
                        System.out.println("El valor del pixel debe estar entre 0 y 255.");
                        return;
                    }
                    imagen[i][j] = valor;
                }
            }
            while (true) {
                System.out.println("Que quieres hacer?");
                System.out.println("0. Ver mi imagen original \n1. Rotar 90 grados a la derecha \n2. Voltear horizontalmente \n3. Voltear Verticalmente \n4. Transponer \n5. Salir");
                int opcion = sc.nextInt();
                switch (opcion){
                    case 0:
                        System.out.println("Esta es su imagen original:");
                        Image.imprimir(imagen);
                        break;
                    case 1:
                        System.out.println("Imagen rotada 90 grados hacia la derecha:");
                        int[][] rotada = Image.rotar90(imagen);
                        Image.imprimir(rotada);
                        break;
                    case 2:
                        System.out.println("Imagen volteada horizontalmente:");
                        int[][] volteada = Image.flipH(imagen);
                        Image.imprimir(volteada);
                        break;
                    case 3:
                        System.out.println("Imagen volteada verticalmente:");
                        int[][] volteadaV = Image.flipV(imagen);
                        Image.imprimir(volteadaV);
                        break;
                    case 4:
                        System.out.println("Imagen transpuesta:");
                        int[][] transpuesta = Image.transponer(imagen);
                        Image.imprimir(transpuesta);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa, Bye bye :D");
                        return;
                }
            }
        }catch(Exception e){
            System.out.println("Ha ocurrido un error. Por favor, intente de nuevo.");
        }
    }
}
