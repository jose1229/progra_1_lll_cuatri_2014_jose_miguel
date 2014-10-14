/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class ejercicio5 {

    /**
     * 5.	Declare una variable A de tipo entero y asígnale un valor. A
     * continuación muestra un mensaje indicando si A es par o impar. Utiliza el
     * operador condicional if para resolverlo. s
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A = 0;
        System.out.println("Ingrese el valor de A: ");
        A = leer.nextInt();

        A = A % 2;
        if (A == 0) {

            System.out.println("A es un numero par");
        } else {

            System.out.println("A es un numero impar ");
        }

    }
}

