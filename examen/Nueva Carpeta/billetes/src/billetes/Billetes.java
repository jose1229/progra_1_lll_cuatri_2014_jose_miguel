/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billetes;

import java.util.Scanner;

/**
 * Realiza un sistema que realice un desglose en billetes y monedas de una
 * cantidad exacta de colones y luego imprima el resultado en letras. Hay
 * billetes de 1000, 2000, 5000 y monedas de 500 y 100 y 50 y 25.
 *
 * Por ejemplo, si deseamos conocer el desglose de 5225
 *
 * El programa mostrara por pantalla el siguiente resultado:
 *
 * 1 billete de 5000 colones. 1 moneda de 2 monedas de 100 colones. 1 moneda de
 * 25 colones.
 *
 * El total es de cinco mil doscientos veinte y cinco
 *
 * @author Jose Miguel
 */
public class Billetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int billete1 = 1000;
        int billete2 = 2000;
        int billete3 = 5000;
        int moneda1 = 500;
        int moneda2 = 100;
        int moneda3 = 50;
        int moneda4 = 25;
        int cantidad;
        int div;
        int cant;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad a desglosar:");
        cantidad = sc.nextInt();

        if ((cantidad <= billete3) && ((cantidad / billete3) == 1)) {
            System.out.println("un billete de:" + billete3);

        }
        if ((cantidad % billete3 == 0)) {
            cant = cantidad / billete3;
            System.out.println("hay  " + cant + " billetes de " + billete3);

        } else {
            if ((cantidad <= billete2) && ((cantidad / billete2) == 1)) {
                System.out.println("un billete de:" + billete2);

            }
            if ((cantidad % billete2 == 0)) {
                cant = cantidad / billete3;
                System.out.println("hay  " + cant + " billetes de " + billete2);

            } else {
                if ((cantidad <= billete1) && ((cantidad / billete1) == 1)) {
                    System.out.println("un billete de:" + billete1);

                }
                if ((cantidad % billete1 == 0)) {
                    cant = cantidad / billete3;
                    System.out.println("hay  " + cant + " billetes de " + billete1);

                }
            }

        }
    }
}