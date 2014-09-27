/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2clase3;

/**
 *
 * @author Jose Miguel
 */
public class ejercicio1 {
    //escribir un programa q solicite la carga de un valor positivo y nos mueste desde 1 hasta el valor ingresado de uno en uno

    private String numeros = "";

    public ejercicio1(int numero) {

        this.ImprimirNumeros(numero);
    }

    private String ImprimirNumeros(int numero) {

        for (int i = 0; i < numero; i++) {
            numeros += i + "";

        }
        return getNumeros();

    }
    /*retur the numeros
     */

    public String getNumeros() {
        return numeros;
    }

}
