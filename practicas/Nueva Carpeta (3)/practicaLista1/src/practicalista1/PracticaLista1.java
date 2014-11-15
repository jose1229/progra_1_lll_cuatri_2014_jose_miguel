/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicalista1;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class PracticaLista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner oScanner=new Scanner(System.in);
        System.out.println("digite la cantidad de palabras a ingresar");
        int cantidad=oScanner.nextInt();
        ListaasPalabras oListaasPalabras=new ListaasPalabras();
        oScanner=new Scanner(System.in);
        String Palabra=oScanner.nextLine();
        
       for (int i = 0; i < 10; i++) {
            System.out.println("Inserte la palabra"+(i+1));
            oScanner=new Scanner(System.in);
            String palabra=oScanner.nextLine();
            NodoPalabra oNodoPalabras=new NodoPalabra();
            oNodoPalabras.setPalabra(palabra);
            
            if(oListaasPalabras.Duplicado(palabra)){
                 System.out.println("Palabra duplicada");
                i--;
            }else{
                oListaasPalabras.Insertar(oNodoPalabras);
            }
        }
        System.out.println(oListaasPalabras.Imprimir());
       
    }
    
}
