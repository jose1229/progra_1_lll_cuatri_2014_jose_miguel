/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class ejercicio4 {

    public class PruebaVector7 {

        private Scanner teclado;
        private int[] vec;

        public void cargar() {
            teclado = new Scanner(System.in);
            vec = new int[10];
            for (int f = 0; f < 10; f++) {
                System.out.print("Ingrese elemento:");
                vec[f] = teclado.nextInt();
            }
        }

        public void verificarOrdenado() {
            int orden = 1;
            for (int f = 0; f < 9; f++) {
                if (vec[f + 1] < vec[f]) {
                    orden = 0;
                }
            }
            if (orden == 1) {
                System.out.println("Esta ordenado de menor a mayor");
            } else {
                System.out.println("No esta ordenado de menor a mayor");
            }
        }

    }
}
