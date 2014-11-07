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
public class busquedaBinaria {

    public int busquedaBinaria(int[] arreglo, int elemento) {

        int inicial = 0;
        int _final = arreglo.length - 1;
        while (inicial <= _final) {
            
                int central = (inicial + _final) / 2;//me va a devolver el puro centro del arreglo
                if (elemento > arreglo[central])//si elemento a bscar es mayor que index arreglo
                {
                   inicial= central + 1;//central+1 va ser inicial
                  // inicial=inicial-1;
                } else {
                    if (elemento < arreglo[central])//si elemento a bscar es mayor que index arreglo
                    {
                        _final= central - 1;//central+1 va ser inicial
                    } else {
                        return central;
                    }
                }

            }

        
           return -1;
        
    }
}
