/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2clase10;

/**
 *
 * @author Jose Miguel
 */
public class OrdenamientoInsercion {
  
    public int[] ordenarInsercion(int array[], String ordenamiento){
        
        int aux;
        
        for (int i = 1; i < ordenamiento.length(); i++) {
            aux = ordenamiento[i];
            for (int j = i-1; j >=0 && ordenamiento[j]>aux; j--) {
                ordenamiento[j+1]=ordenamiento[j];
                ordenamiento[j]=aux;
            }
        }
        return arreglo;
    }
}
