

package matriz;

import static java.lang.System.in;
import java.util.Scanner;

/**
 * Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir los cuatro
 * valores que se encuentran en los vértices de la misma (matriz [0] [0] etc.)
 * @author Jose Miguel
 */
public class ejerciciio3 {
    
     private Scanner teclado;
    private int[][] matriz;
    
    
    public void cargar() {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        matriz=new int[filas][columnas];
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print("Ingrese componente:");
                matriz[f][c]=teclado.nextInt();
            }
        }
    }
           
    public void imprimirVertices() {
    	System.out.println("Vértice superior izquierdo:");
        System.out.println(matriz[0][0]);
    	System.out.println("Vértice superior derecho:");        
        System.out.println(matriz[0][matriz[0].length-1]);
    	System.out.println("Vértice inferior izquierdo:");        
        System.out.println(matriz[matriz.length-1][0]);
    	System.out.println("Vértice inferior derecho:");        
        System.out.println(matriz[matriz.length-1][matriz[matriz.length-1].length-1]);
    }    
}