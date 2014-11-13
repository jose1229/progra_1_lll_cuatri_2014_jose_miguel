/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("digite una palabra, la cual se imprimira alrevez");
        Scanner oscanner=new Scanner(System.in);
        ejercicio1 oejercicio1=new ejercicio1();
        System.out.println(oejercicio1.Alrevez(oscanner.nextLine()));
        
        ejercicio2 oejercicio2=new ejercicio2();
        System.out.println("digite una palabra para visualizar las letras de la siguiente forma:primero, segundo, penultimo, tercero, antepenultimo");
         Scanner OscanneR=new Scanner(System.in);
        System.out.println( oejercicio2.Impresion(OscanneR.nextLine()));
        
        ejercicio3 oejercicio3=new ejercicio3();
         Scanner OscannER=new Scanner(System.in);
         System.out.println("digite una oracion a la cual se le eliminara los espacios");
        System.out.println(oejercicio3.eliminarespacios(OscannER.nextLine()));
        
         ejercicio4 oejercicio4=new ejercicio4();
         Scanner Osc=new Scanner(System.in);
         System.out.println("digite una serie de caracteres y numeros en orden cuales quiera que sea., y el progra devolvera los numeros que hay o existen en la hilera de forma concatenada");
        System.out.println(oejercicio4.Numeros(Osc.nextLine()));
        
         ejercicio5 oejercicio5=new ejercicio5();
         Scanner Oscan=new Scanner(System.in);
         System.out.println("digite una palabra a la cual se le repetira 100 veces");
        System.out.println(oejercicio5.repetirpalabra(Oscan.nextLine()));
        
         ejercicio6 oejercicio6=new ejercicio6();
         Scanner leer=new Scanner(System.in);
         System.out.println("digite una palabra sea mayuscula o minuscula, o ambas y el programa cambiara");
      //  System.out.println(oejercicio6.convertirmyusculasominusculas(leer.nextLine()));
      //  System.out.println(oejercicio6.convertirmyusculasominusculas(leer.nextLine()));
        System.out.println(oejercicio6.inversa(leer.nextLine()));
    }
    
}
