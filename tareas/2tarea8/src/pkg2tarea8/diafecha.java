/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tarea8;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class diafecha {

    /**
     * •	Ingresar día de una fecha, reportar el día de la semana que le
     * corresponde, suponiendo que el día 1 de dicho mes fue lunes.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia;
        System.out.print("Ingrese el dia :");
        dia = in.nextInt();
        switch (dia % 7) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero fuera de rango");
                break;
        }
    }
}

