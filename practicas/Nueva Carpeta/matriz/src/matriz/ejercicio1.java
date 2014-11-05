/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 * 1.	Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes
 * por columna (es decir primero ingresar toda la primer columna, luego la
 * segunda columna y así sucesivamente) Imprimir luego la matriz.
 *
 * @author Jose Miguel
 */
public class ejercicio1 {

    private Scanner teclado;
    private int[][] mat;

    public void cargar() {
        teclado = new Scanner(System.in);
        mat = new int[2][5];
        System.out.println("Cargar la matriz por columna:");
        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.print("Ingrese el tamaño de la fila " + f + " y la columna " + c + " :");
                mat[f][c] = teclado.nextInt();
            }
        }
    }

    public void imprimir() {
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(mat[f][c] + " ");
            }
            System.out.println();
        }
    }
}