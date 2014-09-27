/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2clase2;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar=true;
        int opcion;
        char continuar;
        double monto;
        
        CuentaBancaria oCuentaBancaria=new CuentaBancaria();
        Scanner teclado=new Scanner(System.in);
        while(validar)
        {
            System.out.println("digite 1 si quiere realizar un deposito y 2 si quiere realizar un retiro");
            opcion=teclado.nextInt();
            
            if(opcion==1)
            {
                System.out.println("digite el monto a depositar");
                monto=teclado.nextDouble();
                oCuentaBancaria.Deposito(monto);
                
            }
            if (opcion==2);
            {
                System.out.println("digite el monto a retirar");
                monto=teclado.nextDouble();
                oCuentaBancaria.Retiro(monto);
                if(oCuentaBancaria.isHayError())
                {
                    System.out.println("el monto que usted va a retirar no puede ser retirado");
                }
            }
            System.out.println("el salo final es de"+oCuentaBancaria.getSaldoInicial());
            System.out.println("desea continuar con otra transacion S/N");
            teclado=new Scanner(System.in);//hay q poner esta instancia para q no de errores
            continuar=teclado.nextLine().charAt(0);
            if((continuar=='S')||(continuar=='s'))
            {
                validar=true;
            }
            if((continuar=='N')||(continuar=='n'))
                validar=false;
        }
    }
    
}
