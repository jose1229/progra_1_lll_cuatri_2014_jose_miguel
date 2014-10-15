/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tarea2;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Main {

    /**
     * •	Ingresar un numero entero, y si este termina en 2,5 u 8 reportar el
     * cuadrado del número, si este termina en 4,7 o 9 reportar el numero
     * multiplicado por 5 y reportar el mismo número en otro caso.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("ingrese un # entero:");
        int num = in.nextInt();

        switch (num % 10) {
            case 2:
            case 5:
            case 8:
                System.out.println("el cuadrado del numero "+num+ " es:" + num * num);
                break;
            case 4:
            case 7:
            case 9:
                System.out.println("el numero "+num+" multipicado por 5 es: " + num * 5);
                break;
            default:
                System.out.println("el numero digitado es: " + num);

        }

    }

}
