/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2clase10;

import java.time.temporal.Temporal;

/**
 *
 * @author Jose Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ordenamientoSeleccion oordenamientoSeleccion = new ordenamientoSeleccion();

        int[] arreglito = {8, 5, 2, 6, 0};

        // for(int i=0; i<arreglito.length;i++)
        //   System.out.print(arreglito[i]);
        int[] temporal = oordenamientoSeleccion.OrdenSeleccion(arreglito, "A");
        for (int i = 0; i < temporal.length; i++) {
            System.out.println(temporal[i]);
        }

        System.out.println();

        OrdenamientoBurbuja OordenamientoBurbuja = new OrdenamientoBurbuja();
        temporal = OordenamientoBurbuja.ordenamientoB(arreglito, "A");
        for (int i = 0; i < temporal.length; i++) {
            System.out.print(temporal[i]);
        }

        System.out.println();

        OrdenamientoInsercion OordenamientoInsercion = new OrdenamientoInsercion();
        temporal = OordenamientoInsercion.ordenarInsercion(arreglito);
        for (int i = 0; i < temporal.length; i++) {
            System.out.println(temporal[i]);

        }     //
        System.out.println();
    }
}
