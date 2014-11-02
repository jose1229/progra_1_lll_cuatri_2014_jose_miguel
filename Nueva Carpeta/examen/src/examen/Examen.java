/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Examen {

    /**
      Realiza un sistema que realice un desglose en billetes y monedas de una
 * cantidad exacta de colones y luego imprima el resultado en letras. Hay
 * billetes de 1000, 2000, 5000 y monedas de 500 y 100 y 50 y 25.
 *
 * Por ejemplo, si deseamos conocer el desglose de 5225
 *
 * El programa mostrara por pantalla el siguiente resultado:
 *
 * 1 billete de 5000 colones. 1 moneda de 2 monedas de 100 colones. 1 moneda de
 * 25 colones.
 *
 * El total es de cinco mil doscientos veinte y cinco
 *
     */
    public static void main(String[] args) {
 
        String unidad[]//declaracion de nombres para cambiar por numeros
                = {"cero", "uno", "dos", "tres", "cuatro", "cinco",
                    "seis", "siete", "ocho", "nueve", "diez"};
        String unidades[]
                = {"once", "doce", "trece", "catorce", "quince",
                    "diezciseis", "diecisiete", "dieciocho", "diecinueve"};
        String decenas[]
                = {"veinte", "treinta", "cuarenta", "cincuenta", "sesenta",
                    "setenta", "ochenta", "noventa"};
        String centenas[] = {"cien", "docientos", "trecientos", "cuatrocientos", "quinientos", "seicientos", "setecientos", "ochocientos",
            "novecientos"};
        String millares[] = {"mil", "dosmil", "tresmil", "cuatromil", "cincomil", "seismil", "sietemil", "ochomil",
            "nuevemil", "diezmil"};
//declaracion de variables, de billetes y monedas con su respectivo valor
        int billete1 = 1000;
        int billete2 = 2000;
        int billete3 = 5000;
        int moneda1 = 500;
        int moneda2 = 100;
        int moneda3 = 50;
        int moneda4 = 25;
        int cantidad = 0;
        int cant1, cant2, cant3, cant4, cant5, cant6, saldo;
        int cant;
        char validar;
        
         /* Scanner sc = new Scanner(System.in);
 System.out.println("ingrese la cantidad a desglosar entre del 25 al 10000:");
                cantidad = sc.nextInt();*/

        if ((cantidad <= 10000) || (cantidad >= 25)){ //||(cantidad==0) )condicion if para definir un parametro de valor a evalar


            do {//ciclo do while para validar si seguir o no
              Scanner sc = new Scanner(System.in);
                System.out.println("ingrese la cantidad a desglosar:");
                cantidad = sc.nextInt();

//billete3
                //while (cantidad<1000) {
                if ((cantidad <= billete3) && ((cantidad / billete3) == 1)) {//condicion para definir la cantidad de billetes de la denominacion 3 a definr
                    System.out.println("hay un billete de:" + billete3);
                    cant1 = 1;

                } else {
                    if ((cantidad % billete3 == 0)) {
                        cant = cantidad / billete3;
                        System.out.println("hay  " + cant + " billetes de " + billete3);
                        cant1 = cant;
                    } else {
                        if ((cantidad % billete3 != 0)) {
                            cant = cantidad / billete3;
                            System.out.println("hay  " + cant + " billetes de " + billete3);
                            saldo = cantidad - (cant * billete3);
                            //System.out.println(saldo);
                            cantidad = saldo;
                        }

                        //billete2
                        if ((cantidad <= billete2) && ((cantidad / billete2) == 1)) {//condicion para definir la cantidad de billetes de la denominacion 2 a imprimir
                            System.out.println("un billete de:" + billete2);

                        } else {
                            if ((cantidad % billete2 == 0)) {
                                cant = cantidad / billete2;
                                System.out.println("hay  " + cant + " billetes de " + billete2);
                                saldo = cantidad - (cant * billete2);
                                //System.out.println(saldo);

                            } else {
                                if ((cantidad % billete2 != 0)) {
                                    cant = cantidad / billete2;
                                    System.out.println("hay  " + cant + " billetes de " + billete2);
                                    saldo = cantidad - (cant * billete2);
                                    // System.out.println(saldo);
                                    cantidad = saldo;
                                }
//billete1
                            }
                            if ((cantidad <= billete1) && ((cantidad / billete1) == 1)) {//condicion para definir la cantidad de billetes de la denominacion 1 a imprimir
                                System.out.println("un billete de:" + billete1);

                            } else {
                                if ((cantidad % billete1 == 0)) {
                                    cant = cantidad / billete1;
                                    System.out.println("hay  " + cant + " billetes de " + billete1);
                                    cant2 = cant;
                                } else {
                                    if ((cantidad % billete1 != 0)) {
                                        cant = cantidad / billete1;
                                        System.out.println("hay  " + cant + " billetes de " + billete1);
                                        saldo = cantidad - (cant * billete1);
                                        // System.out.println(saldo);
                                        cantidad = saldo;
                                    }

//moneda1
                                }
                                if ((cantidad <= moneda1) && ((cantidad / moneda1) == 1)) {//condicion para definir la cantidad de monedas de la denominacion 1 a imprimir
                                    System.out.println("hay una moneda de:" + moneda1);

                                } else {
                                    if ((cantidad % moneda1 == 0)) {
                                        cant = cantidad / moneda1;
                                        System.out.println("hay  " + cant + " monedas de " + moneda1);
                                        cant3 = cant;
                                    } else {
                                        if ((cantidad % moneda1 != 0)) {
                                            cant = cantidad / moneda1;
                                            System.out.println("hay  " + cant + " moneda de " + moneda1);
                                            saldo = cantidad - (cant * moneda1);
                                            // System.out.println(saldo);
                                            cantidad = saldo;
                                        }
//moneda2
                                    }
                                    if ((cantidad <= moneda2) && ((cantidad / moneda2) == 1)) {//condicion para definir la cantidad de monedas de la denominacion 2 a imprimir
                                        System.out.println("una moneda de:" + moneda2);

                                    } else {
                                        if ((cantidad % moneda2 == 0)) {
                                            cant = cantidad / moneda2;
                                            System.out.println("hay  " + cant + " monedas de " + moneda2);
                                            cant4 = cant;
                                        } else {
                                            if ((cantidad % moneda2 != 0)) {
                                                cant = cantidad / moneda2;
                                                System.out.println("hay  " + cant + " moneda de " + moneda2);
                                                saldo = cantidad - (cant * moneda2);
                                                //System.out.println(saldo);
                                                cantidad = saldo;
                                            }
//moneda3
                                        }
                                        if ((cantidad <= moneda3) && ((cantidad / moneda3) == 1)) {//condicion para definir la cantidad de monedas de la denominacion 3 a imprimir
                                            System.out.println("hay una moneda de:" + moneda3);

                                        } else {
                                            if ((cantidad % moneda3 == 0)) {
                                                cant = cantidad / moneda3;
                                                System.out.println("hay  " + cant + " monedas de " + moneda3);
                                                cant5 = cant;
                                            } else {
                                                if ((cantidad % moneda3 != 0)) {
                                                    cant = cantidad / moneda3;
                                                    System.out.println("hay  " + cant + " moneda de " + moneda3);
                                                    saldo = cantidad - (cant * moneda3);
                                                    // System.out.println(saldo);
                                                    cantidad = saldo;
                                                }
//moneda4
                                            }
                                            if ((cantidad <= moneda4) && ((cantidad / moneda4) == 1)) {//condicion para definir la cantidad de monedas de la denominacion 4 a imprimir
                                                System.out.println("hay una moneda de " + moneda4);

                                            } else {
                                                if ((cantidad % moneda4 == 0)) {
                                                    cant = cantidad / moneda4;
                                                    System.out.println("hay  " + cant + " monedas de " + moneda4);
                                                    cant6 = cant;
                                                } else {
                                                    if ((cantidad % moneda4 != 0)) {
                                                        cant = cantidad / moneda4;
                                                        System.out.println("hay  " + cant + " moneda de " + moneda4);
                                                        saldo = cantidad - (cant * moneda4);
                                                        // System.out.println(saldo);
                                                        cantidad = saldo;
                                                        //System.out.println("...." + cantidad);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                System.out.println(">-----0-----<");
                System.out.println("desea continuar S/N");

                validar = sc.next().charAt(0);

            } while ((validar == 's' || validar == 'S'));
        
        } else {
            System.out.println("la cifra debe ser igual o menor a 10000");
        }

        
    }

}
   