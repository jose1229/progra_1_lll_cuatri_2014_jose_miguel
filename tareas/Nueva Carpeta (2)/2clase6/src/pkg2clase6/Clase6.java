/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2clase6;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */

public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ejercicio3 oEjercicio3=new ejercicio3();
        System.out.println("''liga campeon'' y ''somos lideres''al revez:");
        System.out.println(oEjercicio3.Rote("Liga campeon"));
        System.out.println(oEjercicio3.Palindromo("Somos lideres"));
        System.out.println("colocar un guion antes de ''mundial'':");
        System.out.println(oEjercicio3.MarcaPalabra("Vamos por ese mundial de clubes","mundial"));
        System.out.println("¿Cuantos ''campe'' hay en la oracion ''Vamos por el pentacampeonato, por que somos los campeones de por vida campeones?''");
        System.out.println(oEjercicio3.CantidadRepeticiones("Vamos por el pentacampeonato, por que somos los campeones de por vida campeones","campe"));
        System.out.println("¿que palabra esta entre el index 0 y 6 en la oracion 'somos lideres'");
        System.out.println(oEjercicio3.Substring("Somos lideres",0,6));
        System.out.println("somos lideres en mayuscula y en palindromo:");
        System.out.println(oEjercicio3.Mayuscula("Somos lideres"));
        
        int opcion=0;        
        Scanner oScanner=new Scanner(System.in);
        
        do{            
            System.out.println("Digite la opcion que desea : ");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            opcion=oScanner.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Digite el correo a evaluar");    
                    oScanner=new Scanner(System.in);
                    ejercicio1 oejercicio1=new ejercicio1(oScanner.nextLine());
                    System.out.println(oejercicio1.ValidarCorrreo());
                break;
                    
                case 2:
                    System.out.println("Digite la cadena a evaluar");        
                    ejercicio2 oejercicio2=new ejercicio2();
                    oScanner=new Scanner(System.in);
                    oejercicio2.setCadena(oScanner.nextLine());                    
                    System.out.println(oejercicio2.MediaCadena());
                    System.out.println(oejercicio2.UltimoValor());
                    System.out.println(oejercicio2.Alrevez());
                    System.out.println(oejercicio2.Guion());
                    System.out.println(oejercicio2.Vocales());
                    System.out.println(oejercicio2.Palindromo());
                break; 
            }            
        }while(opcion<=7);
    }
    
}











