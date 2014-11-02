/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;

/**
 *
 * @author Jose Miguel
 */
public class cambioletras {
    

 if (cantidad >= 0 && cantidad < 11) {
                 System.out.println(unidad[cantidad]);
                 } else if (cantidad < 20) {
                 System.out.println(unidades[cantidad - 11]);
                 } else if (cantidad < 100) {
                 System.out.println(decenas[cantidad - 21]);
                 } else if (cantidad < 1000) {
                 System.out.println(centenas[cantidad - 101]);
                 } else if (cantidad < 10000) {
                               
                
                                
                 int unid = cantidad% 10;  
                 int dec = cantidad/10;  
                 if(unid == 0)  
                 System.out.print('\n' + decenas[dec-2]);                  
                 else  
                 System.out.print('\n' + decenas[dec-2]  
                 + " y " + unidades[unid]);  
                 }  
                 else              
                 System.out.print("El numero debe ser menor a 10000");  
                 }      
                 }
    
    