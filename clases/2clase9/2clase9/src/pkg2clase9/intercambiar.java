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
public class intercambiar {
    /*Crear una matriz de n * m filas (cargar n y m por teclado) 
     Intercambiar la primer fila con la segundo. Imprimir luego la matriz.*/

  private Scanner teclado;
    private int[][] mat;
    private int aux, aux2;
    
      public void crearmatriz() {
        teclado=new Scanner(System.in);
        mat=new int[aux][aux2];
        System.out.println("digite el tamaño de la columna:");
        aux=teclado.nextInt();
        System.out.println("digite el tamaño de la fila:");
        aux2=teclado.nextInt();
        
        for(int c=0;c<aux2;c++) {        
           for(int f=0;f<aux;f++) {
               
                System.out.print("Ingrese el tamaño de la fila " + f + " y la columna "+ c + " :");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<aux;f++) {
            for(int c=0;c<aux2;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    
}