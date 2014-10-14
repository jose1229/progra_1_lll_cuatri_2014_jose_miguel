/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.Scanner;

/**
 * Desarrollar un programa que permita ingresar un vector de 8 elementos, e
 * informe: El valor acumulado de todos los elementos del vector. El valor
 * acumulado de los elementos del vector que sean mayores a 36. Cantidad de
 * valores mayores a 50.
 *
 * @author Jose Miguel
 */
public class arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] ar) {
        int opcion;
        int valor1;
        int valor2;
        int valor3;
        int valor4;
        int valor5;
        int valor6;
        int valor7;
        int valor8;
        int resultado;
        int continuar;

        boolean Validar = true;

        Scanner teclado = new Scanner(System.in);

        ejercicio1 oejercicio1 = new ejercicio1();

        do {

            System.out.println("digite el numero de ejercicio: ");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("digite el valor del primer digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2 = Integer.parseInt(teclado.nextLine());

                    System.out.println("digite el valor del tercer digito");
                    valor3 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del cuarto digito");
                    valor4 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del quinto digito");
                    valor5 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del sexto digito");
                    valor6 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del septimo digito");
                    valor7 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del octavo digito");
                    valor8 = Integer.parseInt(teclado.nextLine());
                    resultado = oejercicio1.cargar(valor8);
                    //resultado=oOperaciones.Sumar(valor1, valor2);
                    System.out.println(resultado);
                    break;

                /*case 2:
                 System.out.println("digite el valor del primer digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2 = Integer.parseInt(teclado.nextLine());

                    System.out.println("digite el valor del tercer digito");
                    valor3 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del cuarto digito");
                    valor4 = Integer.parseInt(teclado.nextLine());
                    resultado = oejercicio1.cargar(valor8);
                    //resultado=oOperaciones.Sumar(valor1, valor2);
                    System.out.println(resultado);
                    break;
                    
                 case 3:
                 System.out.println("digite la primer nota");
                    nota1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite la segunda nota");
                    nota2 = Integer.parseInt(teclado.nextLine());

                    System.out.println("digite el valor del tercer digito");
                    valor3 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del cuarto digito");
                    valor4 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del quinto digito");
                    valor5 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del sexto digito");
                    valor6 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del septimo digito");
                    valor7 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del octavo digito");
                    valor8 = Integer.parseInt(teclado.nextLine());
                    resultado = oejercicio1.cargar(valor8);
                    //resultado=oOperaciones.Sumar(valor1, valor2);
                    System.out.println(resultado);
                    break;
                        
                 case 4:System.out.println("digite el valor del primer digito");
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del segundo digito");
                    valor2 = Integer.parseInt(teclado.nextLine());

                    System.out.println("digite el valor del tercer digito");
                    valor3 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del cuarto digito");
                    valor4 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del quinto digito");
                    valor5 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del sexto digito");
                    valor6 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del septimo digito");
                    valor7 = Integer.parseInt(teclado.nextLine());
                    System.out.println("digite el valor del octavo digito");
                    valor8 = Integer.parseInt(teclado.nextLine());
                    resultado = oejercicio1.cargar(valor8);
                    //resultado=oOperaciones.Sumar(valor1, valor2);
                    System.out.println(resultado);
                    break;
                 break;
                                           
                 default:
                     System.out.println("");
                    
                 break;
            
                 }*/
             
                 
        }
    

