/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11;

/**
 *
 * @author Jose Miguel
 */
public class busquedalineal {
   /***      *****para hacer esto se hace lo siguiente ''/***'' y enter.
    * 
    * @param arreglo este parametro sirve para enviar por parametro el arreglo
    * @param elemento este parametro sirve para pasar por parametro el elemento a comparar
    * @return 
    */

    public int BusquedaLineal(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

}
