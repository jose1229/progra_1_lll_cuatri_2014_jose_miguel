/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase2;

/**
 *
 * @author Jimenez
 */
public class CuentaBancaria {
    
    private double saldoInicial;
    private boolean hayError;
    
    public CuentaBancaria()
    {
        saldoInicial=0;
        hayError=false;
    }
    
    /**
     * Este método sirve para aumentar la cuenta de un usuario
     * @param monto Parámetro para recibir el nuevo monto
     */
    public void Deposito(double monto)
    {
        setSaldoInicial(getSaldoInicial() + monto);
    }
    
    /**
     * Este método sirve para dismunuir la cuenta de un usuario
     * @param monto Parámetro para recibir el nuevo monto
     */
    public void Retiro(double monto)
    {
        if(getSaldoInicial()>=monto)
            setSaldoInicial(getSaldoInicial() - monto);
        else
            setHayError(true);
    }
    
    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public boolean isHayError() {
        return hayError;
    }

    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
   
}
