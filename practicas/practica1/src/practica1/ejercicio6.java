/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

/**
 *
 * @author Jose Miguel
 */
public class ejercicio6 {
   /*  public String convertirmyusculasominusculas(String palabra) {
        String temporal = "";
         for (int i = 0; i < 100; i++) {
             temporal=temporal+"\n";
         }
         return temporal;
             
         }
     
     
    public String comvertir(String temporal){
        for (int i = 0; i < temporal.length(); i++) {
            if ((temporal.charAt(i)+"").toLowerCase().equals(temporal.charAt(i)+""))//las comillas coon para crearlo en forma string.
                    {
                temporal += temporal.charAt(i)+"".toUpperCase();
             
            } 
                    else 
                    {

              temporal+=temporal.charAt(i)+"".toLowerCase();
            }
        }
        return temporal;
    }
}  */ 
    
public String inversa(String palabra){
        String temporal="",muestra="",acum="";
         
        for (int i = 0; i < palabra.length(); i++) {
            temporal+=palabra.charAt(i);
            acum=temporal;
            if(temporal.toLowerCase().equals(acum)){
                muestra+=temporal.toUpperCase();
            }else{
                if(temporal.toUpperCase().equals(acum)){
                    muestra+=temporal.toLowerCase();
                }
            }
            temporal="";
        }
        return muestra;
    }
}