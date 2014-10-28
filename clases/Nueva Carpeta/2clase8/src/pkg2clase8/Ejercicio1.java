/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2clase8;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Ejercicio1 {

    private int[][] matriz;

    public void CargarMatriz() {
        Random ramdom=new Random();
        Scanner teclado=new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=teclado.nextInt();

            }

        }
    }

    public String Imprimir() {

        String impresion = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                impresion += matriz[i][j] + "";
            }
            impresion += "\n";
        }
        return impresion;
    }
}
