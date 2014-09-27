/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2clase3;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        System.out.println("digite el numero de impresiones que desea ver");
        ejercicio1 oejercicio1=new ejercicio1(Integer.parseInt(teclado.nextLine()));
        System.out.print(oejercicio1.getNumeros());

        //ciclo for
        int cantidad;
        int suma = 0;

         teclado=new Scanner(System.in);
        System.out.println("digite el numero de impresiones que desea ver");
        
        cantidad=Integer.parseInt(teclado.nextLine());
    

        for (int i = 0; i <= cantidad; i++) {
            System.out.println(i);

        }
        System.out.print("\n");
        System.out.println("inverso");
        System.out.println("\n");
        for (int i = cantidad; i > 0; i--) {
            System.out.println(i);
        }

        // ciclo while
        while (suma <= cantidad) {
            System.out.println(suma);
            System.out.print(" - ");
            suma = suma + 1;
        }

        System.out.print("/n");
        suma = cantidad;
        while (suma >= 0) {
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma - 1;
        }

        //ciclo do while
        System.out.print("\n");
        suma = 0;
        do {
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma + 1;
        } while (suma <= cantidad);
        System.out.print("\n");
        suma = cantidad;

        do {
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma - 1;
        } while (suma >= 0);

    }
}


