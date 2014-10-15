/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hola.mundo;

import java.util.Scanner;


/**
 *
 * @author Jose Miguel
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner oScanner=new Scanner(System.in);
        int x=10;
        int y=20;
        int suma=x+y;
        
        
        System.out.println("hola mundo");
        System.out.println("digite un valor");
        
        int valor=oScanner.nextInt();
        
        System.out.println(suma);
        System.out.println(valor);
    }
    
}
