/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalista1;

/**
 *
 * @author Jose Miguel
 */
public class NodoPalabra {

    String palabra;
    NodoPalabra nodoPalabra;

    public NodoPalabra() {
        palabra = "";
        nodoPalabra = null;

    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public NodoPalabra getNodoPalabra() {
        return nodoPalabra;
    }

    public void setNodoPalabra(NodoPalabra nodoPalabra) {
        this.nodoPalabra = nodoPalabra;
    }
}
