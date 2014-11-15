/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.util.Scanner;

/**
 * Realice un programa que lea 10 números, del 1 al 10 y almacenelos en una
 * lista y muestre cuentas veces aparecen los números
 *
 * @author Jose Miguel
 */
public class Quiz2 {
    public static void main(String[] args) {
        
    

    Ejercicio1 oEjercicio1=new Ejercicio1();
        NodoNumeros nodoNumero;
        Scanner oScanner=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            nodoNumero=new NodoNumeros();
            System.out.println("Digite un numero del 1 al 10 seguido de un enter");
            nodoNumero.setNumero(oScanner.nextInt());
            oEjercicio1.Insertar(nodoNumero);
        }
        System.out.println(oEjercicio1.ContadorNumeros());
        
    }
}
    
