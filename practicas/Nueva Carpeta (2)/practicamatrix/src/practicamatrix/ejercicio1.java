/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatrix;

import java.util.Random;

/**
 *diseñe un programa que lea una matriz de n filas por n numeros de columnas. se debe imprimir la matriz.
 * por filas
 * triangular superios
 * triangular inferior
 * @author Jose Miguel
 */
public class ejercicio1 {

    int[][] matrixA = new int[0][0];

    public void iniciarMatrix(int filas, int columnas) {
        matrixA = new int[filas][columnas];
    }

    public void llenar() {
        Random oRandom = new Random();
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixA[i][j] =oRandom.nextInt(6) + 10;

            }

        }
    }

    public String ImpresionPorFila() {
        String temporal = "";
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                temporal += String.valueOf(matrixA[i][j])+"-";
            }
            temporal+="\n";
        }
        return temporal;
    }
    public String ImpresionTriangularSuperior(){
        String temporal="";
        for (int i = 1; i <matrixA.length; i++) {
            for (int j = 1; j <i; j++) {
                temporal+=String.valueOf(matrixA[i][j])+"-";
            }
            temporal+="\n";
        }
        return temporal;
    }

    public String ImpresionTriangularInferior(){
        String temporal="";
        for (int i =matrixA.length-2;i>=0; i--) {
            for (int j =matrixA[0].length-1; j >i; j--) {
                temporal+=String.valueOf(matrixA[i][j])+"-";
            }
            temporal+="\n";
        }
        return temporal;
    }
 
}
