/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;

import java.util.Scanner;

/**Una de las técnicas de criptografía consiste en sustituir cada uno de los caracteres por otro situado n posiciones más
 * a la derecha. Si n = 2, por ejemplo, sustituiremos la a por la c, la b por la e, y así sucesivamente. El problema que 
 * aparece en las ultimas n letras del alfabeto tiene fácil solución: en el ejemplo, la letra y se sustituirá por la a y 
 * la letra z por la b. La sustitución debe aplicarse a las letras minúsculas y mayúsculas y a los dígitos (el 0 se sustituye
 * por el 2, el 1 por el 3 y así hasta llegar al 9, que se sustituye por el 1). Diseñe un programa que lea un texto y el valor 
 * de n  y muestre su versión criptográfica.
 *
 * @author Jose Miguel
 */
public class criptografia {
     public static void main(String[] args) {

        String[] alfabeto = {"abcdefghijklmnopqrstuvwyz"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String texto;
        int cadena;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba el texto  evaluar:");
        texto = sc.next();
        System.out.println("escriba el numero de saltos");
        num = sc.nextInt();
       
         String mensaje="El correo no contiene @";
        for (int i = 0; i < texto.length(); i++) {
            cadena=i;
            if(cadena.equalsTo.indexOf[numeros]){
                
            } else {
            }
        }
        for(int j=0;j<texto.length();j++)
            {
                mensaje="la letra es "+cadena;
            }            
        }
        

       // for (int i = 0; i < indexof(alfabeto.length()); i++) {  while (sTexto.indexOf(sTextoBuscado) > -1) {
	     // sTexto = sTexto.substring(sTexto.indexOf(
	       // sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
	     /* contador++; 
	    }

	    System.out.println (contador);
        }*/

    }

    
