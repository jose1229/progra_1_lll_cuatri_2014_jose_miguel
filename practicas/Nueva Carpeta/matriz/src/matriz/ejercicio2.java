package matriz;

import java.util.Scanner;

/**
 * Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la
 * primer fila con la segundo. Imprimir luego la matriz.
 *
 * @author Jose Miguel
 */
public class ejercicio2 {

    private Scanner teclado;
    private int[][] matriz;

    public void cargar() {
        teclado = new Scanner(System.in);
        System.out.print("ingrese la cantidad de filas que desea que contenga la matriz:");
        int filas = teclado.nextInt();
        System.out.print("Cuantas columnas desea que contenga la matriz:");
        int columnas = teclado.nextInt();
        matriz = new int[filas][columnas];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print("Ingrese el valor o componente que desea que contenga el campo:");
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

    public void intercambiar() {
        for (int c = 0; c < matriz[0].length; c++) {
            int aux = matriz[0][c];
            matriz[0][c] = matriz[1][c];
            matriz[1][c] = aux;
        }
    }

    public void imprimir() {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

}
