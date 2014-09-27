/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2clase2;

/**
 *
 * @author Jose Miguel
 */
public class CuentaBancaria {
    private double saldoInicial;
    private boolean hayError;
    
    public CuentaBancaria(){
        saldoInicial=0;
        hayError=false;
    }
    /**
     * este metodo sirve para aumentar la cuenta de un usuario
     * @param monto parametro para recibir el nuevo monto
     */
    public void Deposito(double monto)
    {
        setSaldoInicial(getSaldoInicial()+ monto);
    }
    /**
     * este metodo sirve para disminuir la cuenta de un usuario
     * @param monto parametro para recibir el nuevo monto
     */
    public void Retiro(double monto){
        if(getSaldoInicial()>=monto)
            setSaldoInicial(getSaldoInicial()-monto);
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
