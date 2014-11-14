/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatrix;

import java.util.Random;

/**
 *diseñe un programa que indique si una matrix  que indique si una matrix de n por n columnas es diagonal superior, 
 * una matrix es diagonal superior si todos sus elementos ubicados por debajo de la diagonal principal son ceros
 * @author Jose Miguel
 */
public class ejercicio2 {
     int[][] matrixA=new int[0][0];
    public void iniciarMatriz(int filas,int columnas){
        matrixA=new int[filas][columnas];
    }
    public void LLenar(){
        Random oRandom=new Random();
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixA[i][j]=(int)(oRandom.nextInt(6)+10);//crea un random de seis espacios con diez numeros
            }
        }
    }
   
        public boolean impresionDiagonalSuperior(int filas,int columnas){
      boolean validar=false;
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < i; j++) {
                    if(matrixA[i][j]==0){
                        validar=true;
                    }else{
                        validar=false;
                        break;
                    }
                }
            }
            return validar;
        }
}