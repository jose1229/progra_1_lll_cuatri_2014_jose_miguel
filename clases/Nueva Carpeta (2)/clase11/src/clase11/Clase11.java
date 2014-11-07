

package clase11;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Clase11 {
  /***
   * 
   * @param args 
   */

    public static void main(String[] args) {
        System.out.println("digite un numero");
        busquedalineal oblineal=new busquedalineal();
        busquedaBinaria obusquedaBinaria=new busquedaBinaria();
        Scanner teclado=new Scanner(System.in);
        int[]arreglo={1,2,3,4,5,6,7,8,9};
        int elemento=teclado.nextInt();
        System.out.println("el index devuelto con la busqueda lineal es :"+oblineal.BusquedaLineal(arreglo, elemento));
        
         System.out.println("el index devuelto con la busqueda binaria es :"+obusquedaBinaria.busquedaBinaria(arreglo, elemento));
        System.out.println();
        System.out.println();
        
    }
    
}
