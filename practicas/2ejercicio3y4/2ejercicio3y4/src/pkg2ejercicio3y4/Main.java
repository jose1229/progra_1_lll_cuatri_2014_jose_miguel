/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ejercicio3y4;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println("............ejersicio3...........");

        int N = 5;
        System.out.println("Valor inicial de N = " + N);
        N = N + 77;
        System.out.println("N + 77 = " + N);
        N = N - 3;
        System.out.println("N - 3 = " + N);
        N = N * 2;
        System.out.println("N * 2 = " + N);

        System.out.println("..........fin   ejersicio3...........");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("............ejersicio4...........");

        Scanner leer = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        System.out.println("Ingrese el valor de A: ");
        A = leer.nextInt();
        System.out.println("Ingrese el valor de B: ");
        B = leer.nextInt();
        System.out.println("Ingrese el valor de C: ");
        C = leer.nextInt();
        System.out.println("Ingrese el valor de D: ");
        D = leer.nextInt();

        System.out.println("Valores invertidos:");
        int B1 = C;
        int C1 = A;
        int A1 = D;
        int D1 = B;
        System.out.println("B ahora es igual a: " + B1);
        System.out.println("C ahora es igual a: " + C1);
        System.out.println("A ahora es igual a: " + A1);
        System.out.println("D ahora es igual a: " + D1);
        System.out.println("............fin  ejersicio4...........");

    }

}


