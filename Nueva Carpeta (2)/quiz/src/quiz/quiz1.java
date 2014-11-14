/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 * Diseñe un programa que le solicite al usuario digitar cinco palabras con
 * mayúscula y minúscula(estas pueden tomar cualquier orden).Se deben ordenar
 * estas 5 palabras en orden alfabético y ascendente, tomando en cuenta que las
 * mayúsculas van después de las minúsculas pero solo con respecto a la misma
 * letra. Un espacio en blanco va antes de cualquier letra Por ejemplo: Casa
 * cosa cOsa Cosa;Estas 5 palabras están ordenadas correctamente.
 *
 * @author Jose Miguel
 */
public class quiz1 {

    public class PruebaVector1 {

        private Scanner teclado;
        private String[] palabras;

        public void cargar() {
            teclado = new Scanner(System.in);
            palabras = new String[5];
            for (int f = 0; f < 5; f++) {
                System.out.print("Ingrese 5 palabras");
                palabras[f] = teclado.nextLine();
            }
        }

        public void imprimir() {
            for (int f = 0; f < 5; f++) {
                System.out.println(palabras[f]);
            }
        }

    }
}
