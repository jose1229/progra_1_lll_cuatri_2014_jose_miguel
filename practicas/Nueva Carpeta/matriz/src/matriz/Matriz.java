/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author Jose Miguel
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] ar) {
        ejercicio1 oejercicio1 = new ejercicio1();
        oejercicio1.cargar();
        oejercicio1.imprimir();
        ejercicio2 oejerciicio2 = new ejercicio2();
        oejerciicio2.cargar();
        oejerciicio2.intercambiar();
        oejerciicio2.imprimir();

        ejerciciio3 oejerciciio3 = new ejerciciio3();
        oejerciciio3.cargar();
        oejerciciio3.imprimirVertices();
        
      
        ejercicio4 oejercicio4=new ejercicio4();
        oejercicio4.cargar();
        oejercicio4.imprimirMayor();
    }   
}
    
