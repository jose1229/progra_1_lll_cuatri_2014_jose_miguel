/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meses;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 12:");

        int mes = in.nextInt();

        switch (mes) {
            case 1:
                System.out.println("estamos en el mes de: enero");

                break;
            case 2:
                System.out.println("estamos en el mes de: febero");

                break;
            case 3:
                System.out.println(" estamos en el mes de: marzo");

                break;
            case 4:
                System.out.println("estamos en el mes de: abril");

                break;
            case 5:
                System.out.println("estamos en el mes de: mayo");

                break;
            case 6:
                System.out.println("estamos en el mes de: junio");
                break;
            case 7:
                System.out.println("estamos en el mes de: julio");

                break;
            case 8:
                System.out.println("estamos en el mes de: agosto");

                break;
            case 9:
                System.out.println("estamos en el mes de: septiembre");

                break;
            case 10:
                System.out.println("estamos en el mes de: octubre");

                break;
            case 11:
                System.out.println("estamos en el mes de: noviembre");

                break;
            case 12:
                System.out.println("estamos en el mes de: diciembre");

                break;
            default:
                System.out.println("estamos en el mes de: solo se permite ingresar un numero del 1 al 12., por favor ingrese un nuevo numero.");

        }

    }
}
