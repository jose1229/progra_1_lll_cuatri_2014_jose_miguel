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

    public class Vector1 {

        private Scanner teclado;
        private String[] palabra;

        public void cargar() {
            teclado = new Scanner(System.in);
            palabra = new String[5];
            for (char f = 'a'; f < 'z'; f++) {
                System.out.print("Ingrese 5 palabras divididas por una coma");
                palabra[f] = teclado.nextLine();
            }
        }

        /*  public void imprimir() {
         for (int f = 0; f < 5; f++) {
         System.out.println(palabras[f]);
         }*/
        //}
        public void split() {

            String[] arraypalabra = palabra.Split(",");
            for (int i = 0; i < arraypalabra.length; i++) {
                System.out.print(arraypalabra[i] + " ");
            }
        
        
        

       /* public String mayoromenor() 
        {
            String temporal = "";
            String muestra = ""; 
            String acum = "";

            for (int i = 0; i < palabra.length(); i++) {
                temporal += palabra.charAt(i);
                acum = temporal;
                if (temporal.toLowerCase().equals(acum)) {
                    muestra += temporal.toUpperCase();
                } else {
                    if (temporal.toUpperCase().equals(acum)) {
                        muestra += temporal.toLowerCase();
                    }
                }
                temporal = "";
            }
            return muestra;
        }*/
    }
}
