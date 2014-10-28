/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2clase9;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class matriz {

    private Scanner teclado;
    private int[][] matr;

    public void cargar() {/*Crear una matriz de 2 filas y 5 columnas.Realizar la carga de componentes por 
         columna (es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente)
         Imprimir luego la matriz.*/

        teclado = new Scanner(System.in);
        matr = new int[2][5];
        for (int i = 0; i < 5; ++i) {
            for (int f = 0; f < 2; f++) {

                System.out.print("por favor ingrese un numero:");
                matr[f][i] = teclado.nextInt();
            }
        }
    }

    public void imprimir() {
        for (int f = 0; f < 2; f++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(matr[f][i] + " ");
            }
            System.out.println();
        }
    }
    
}
