/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase12;

/**
 *
 * @author Jose Miguel
 */
public class Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NodoDeLista nodoDeLista1=new NodoDeLista();
        nodoDeLista1.setMatricula("01");
        nodoDeLista1.setDueno("jose miguel");
        nodoDeLista1.setMarca("toyota");
        
        
         NodoDeLista nodoDeLista2=new NodoDeLista();
          nodoDeLista2.setMatricula("02");
        nodoDeLista2.setDueno("marito mortadela");
        nodoDeLista2.setMarca("vaca");
        
        Lista olista=new Lista();
        olista.Insertar(nodoDeLista1);
         olista.Insertar(nodoDeLista2);
         olista.Imprimir();
        
    }
    
}
