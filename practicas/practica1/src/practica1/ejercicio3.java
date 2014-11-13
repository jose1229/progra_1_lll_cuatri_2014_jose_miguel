/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

/**
 *
 * @author Jose Miguel
 */
public class ejercicio3 {
     public String eliminarespacios(String palabra) {
        String temporal = "";
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != ' ') {
                temporal += palabra.charAt(i);
            } else {

                contador++;
            }
        }
        return "la palabra final es " + temporal
                + " y la cantidad de espacios son " + contador;

    }
    
}
