/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tarea3;

import com.sun.org.apache.bcel.internal.generic.InstructionComparator;
import com.sun.scenario.animation.shared.AnimationAccessor;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Jose Miguel
 */
public class Main {

    /**
     * •	Ingresar una letra entre a y e y reportar el mensaje de acuerdo a: A
     * excelente B bueno C regular D malo E pésimo
     *
     */
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
         System.out.println("digite una letra:a, b, c, d o e ");
         char letra;
         letra=in.nextLine().charAt(0);
          Letras oletra=new Letras();
          String resultado;
        
          switch(letra){
            case ('a'): 
                resultado=oletra.a();
                System.out.println(resultado); 
                break;
            case 'b': 
                resultado=oletra.b();
                System.out.println(resultado);
                break;      
            case 'c':  
                resultado=oletra.c();
                System.out.println(resultado);
            break;
            case 'd':  
                resultado=oletra.d();
                System.out.println(resultado); 
            break;
            case 'e':  
                resultado=oletra.e();
                System.out.println(resultado);
            break;
                
            default:
                System.out.println("digite una letra:a, b, c, d o e");
            
                
        }
    }
    
}
