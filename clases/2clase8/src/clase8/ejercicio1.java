/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class ejercicio1 {

    private Scanner teclado;
    private int[] vec;

    public int cargar(int num) {
        teclado = new Scanner(System.in);
        vec = new int[8];
        for (int f = 0; f < 8; f++) {
            System.out.print("Ingrese un numero:");
            vec[f] = teclado.nextInt();
        }
        return num;
    }

    public int acumularElementos(int aE) {
        int suma = 0;
        for (int f = 0; f < 8; f++) {
            suma = suma + vec[f];
        }
        //System.out.println("La suma total de los 8 elementos es:" + suma);
        return aE;
    }

    public int acumularMayores36(int aM) {
        int suma = 0;
        for (int f = 0; f < 8; f++) {
            if (vec[f] > 36) {
                suma = suma + vec[f];
            }
        }
        //System.out.println("La suma de los numeros ingresados mayores a 36 es:" + suma);
        return aM;
    }

    public int cantidadMayores50(int cant) {

        for (int f = 0; f < 8; f++) {
            if (vec[f] > 50) {
                cant++;
            }

        }
        // System.out.println("La cantidad de numeros mayores a 50 es:" + cant);
        return cant;
    }
}

/*public class Ejercicio2 {

    private Scanner teclado;
    private int[] vec1;
    private int[] vec2;
    private int[] vecSuma;

    public void Cargar() {
        teclado = new Scanner(System.in);
        vec1 = new int[4];
        vec2 = new int[4];
        System.out.println("Carga del primer vector.");
        for (int f = 0; f < 4; f++) {
            System.out.print("Ingrese elemento:");
            vec1[f] = teclado.nextInt();
        }
        System.out.println("Carga del segundo vector.");
        for (int f = 0; f < 4; f++) {
            System.out.print("Ingrese elemento:");
            vec2[f] = teclado.nextInt();
        }
    }

    public void sumarizarVectores() {
        vecSuma = new int[4];
        for (int f = 0; f < 4; f++) {
            vecSuma[f] = vec1[f] + vec2[f];
        }
        System.out.println("Vector resultante.");
        for (int f = 0; f < 4; f++) {
            System.out.println(vecSuma[f]);
        }
    }
}

public class ejercicio3 {

    private Scanner teclado;
    private int[] cursoa;
    private int[] cursob;
    private int[] vecSuma;

    public void cargar() {
        teclado = new Scanner(System.in);
        cursoa = new int[5];
        cursob = new int[5];
        System.out.println("Carga de notas del curso A");
        for (int f = 0; f < 5; f++) {
            System.out.print("Ingrese nota:");
            cursoa[f] = teclado.nextInt();
        }
        System.out.println("Carga del notas del curso B");
        for (int f = 0; f < 5; f++) {
            System.out.print("Ingrese nota:");
            cursob[f] = teclado.nextInt();
        }

    }

    public void calcularPromedios() {
        int suma1 = 0;
        int suma2 = 0;
        for (int f = 0; f < 5; f++) {
            suma1 = suma1 + cursoa[f];
            suma2 = suma2 + cursob[f];
        }
        int promedioa = suma1 / 5;
        int promediob = suma2 / 5;
        if (promedioa > promediob) {
            System.out.println("El curso A tiene un promedio mayor.");
        } else {
            System.out.println("El curso B tiene un promedio mayor.");
        }
    }
}



public class ejercicio4 {

    private Scanner teclado;
    private int[] vec;

    public void cargar() {
        teclado = new Scanner(System.in);
        vec = new int[10];
        for (int f = 0; f < 10; f++) {
            System.out.print("Ingrese elemento:");
            vec[f] = teclado.nextInt();
        }
    }

    public void verificarOrdenado() {
        int orden = 1;
        for (int f = 0; f < 9; f++) {
            if (vec[f + 1] < vec[f]) {
                orden = 0;
            }
        }
        if (orden == 1) {
            System.out.println("Esta ordenado de menor a mayor");
        } else {
            System.out.println("No esta ordenado de menor a mayor");
        }
    }*/

}
