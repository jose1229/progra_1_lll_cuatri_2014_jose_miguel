/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class ejercicio6 {

    /**
     * 6.	Declare una variable B de tipo entero y asígnale un valor. A
     * continuación muestra un mensaje indicando si el valor de B es positivo o
     * negativo. Consideraremos el 0 como positivo. Utiliza el operador
     * condicional if para resolverlo.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int B = 0;
        System.out.println("Ingrese el valor de B: ");
        B = leer.nextInt();

        if (B >= 0) {

            System.out.println("B es un numero positivo");
        } else {

            System.out.println("B es un numero negativo ");
        }

    }
}
