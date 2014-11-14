/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatrix;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Practicamatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ejercicio1 oejercicio1=new ejercicio1();
ejercicio2 oejercicio2=new ejercicio2();
ejercicio3 oejercicio3=new ejercicio3();
        Scanner oScanner=new Scanner(System.in);
        System.out.println("digite el largo de las filas");
        int filas=oScanner.nextInt();
        System.out.println("digite el largo de las columnas ");
        int columnas=oScanner.nextInt();
        oejercicio1.iniciarMatrix(filas, columnas);
                oejercicio2.iniciarMatriz(filas, columnas);

        oejercicio1.llenar();
        oejercicio2.LLenar();
        System.out.println(oejercicio1.ImpresionPorFila());
         System.out.println(oejercicio1.ImpresionTriangularInferior());
        System.out.println(oejercicio1.ImpresionTriangularSuperior());
        System.out.println(oejercicio2.impresionDiagonalSuperior(filas, columnas));
        System.out.println(oejercicio3.impresion());
        
       
    }
    
}
