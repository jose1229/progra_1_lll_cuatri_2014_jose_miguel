/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2tarea7;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class diadehoy {

    /**
     * •Preguntar que día de la semana fue el día 1 del mes actual y reportar el día de la semana que es hoy
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char dia1;
        int dia,x;
        System.out.println("el dia 1 cayo el? (L,K,M,J,V,S,D) :");
        dia1=in.nextLine().charAt(0);
        switch(dia1)
        {
            case 'L':case 'l': x=0;break;
            case 'K':case 'k': x=1;break;
            case 'M':case 'm': x=2;break;
            case 'J':case 'j': x=3;break;
            case 'V':case 'v': x=4;break;
            case 'S':case 's': x=5;break;
            case 'D':case 'd': x=6;break;
            default: System.out.println("numero incorrecto");break;
        }
        System.out.println("Ingrese la fecha del dia de hoy:");
        dia=in.nextInt();
        switch(dia%7)
        {
            case 0: System.out.println("hoy es Domingo");break;
            case 1: System.out.println("hoy es Lunes");break;
            case 2: System.out.println("hoy es Martes");break;
            case 3: System.out.println("hoy es Miercoles");break;
            case 4: System.out.println("hoy es Jueves");break;
            case 5: System.out.println("hoy es Viernes");break;
            case 6: System.out.println("hoy es Sabado");break;
            default: System.out.println("hoy es Numero fuera de rango");break;
        }
    }

}
