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
public class ListaasPalabras {

    private NodoPalabra raiz;

    public void Insertar(NodoPalabra elemento) {

        NodoPalabra nuevo;
        nuevo = new NodoPalabra();
        nuevo.setPalabra(elemento.getPalabra());

        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoPalabra auxiliar = raiz;
            while (auxiliar.getNodoPalabra() != null) {
                auxiliar = auxiliar.getNodoPalabra();
            }
            auxiliar.setNodoPalabra(nuevo);
        }

    }

    public boolean Duplicado(String palabra) {
        NodoPalabra auxiliar = raiz;
        while (auxiliar != null) {
            if (auxiliar.getPalabra().equals(palabra)) {
                return true;
            } else {
                auxiliar = auxiliar.getNodoPalabra();
            }
        }
        return false;
    }

    public String Imprimir() {
        String retorno = "";
        NodoPalabra auxiliar = raiz;
        while (auxiliar != null) {
            retorno += auxiliar.getPalabra();
            auxiliar = auxiliar.getNodoPalabra();
        }
        return retorno;
    }
}
