package pkg2clase6;

/**
 *
 * @author Jose Miguel
 */
public class ejercicio2 {

    private String cadena;

    public String MediaCadena() {
        String retorno = "";
        for (int i = 0; i < getCadena().length() / 2; i++) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String UltimoValor() {
        return getCadena().charAt(getCadena().length() - 1) + "";
    }

    public String Alrevez() {
        String retorno = "";

        for (int i = getCadena().length() - 1; i >= 0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String Guion() {
        String retorno = "";
        for (int i = 0; i < getCadena().length(); i++) {

            if (getCadena().length() - 1 == i) {
                retorno += getCadena().charAt(i);
            } else {
                retorno += getCadena().charAt(i) + "-";
            }
        }
        return retorno;

    }

    public int Vocales() {
        int cantidadVocales = 0;
        for (int i = 0; i < getCadena().length(); i++) {

            if ((getCadena().charAt(i) == 'a')
                    || (getCadena().charAt(i) == 'A')
                    || (getCadena().charAt(i) == 'e')
                    || (getCadena().charAt(i) == 'E')
                    || (getCadena().charAt(i) == 'i')
                    || (getCadena().charAt(i) == 'I')
                    || (getCadena().charAt(i) == 'o')
                    || (getCadena().charAt(i) == 'O')
                    || (getCadena().charAt(i) == 's')
                    || (getCadena().charAt(i) == 'S')
                    || (getCadena().charAt(i) == 'm')
                    || (getCadena().charAt(i) == 'M')
                    || (getCadena().charAt(i) == 'l')
                    || (getCadena().charAt(i) == 'L')
                    || (getCadena().charAt(i) == 'd')
                    || (getCadena().charAt(i) == 'D')
                    || (getCadena().charAt(i) == 'r')
                    || (getCadena().charAt(i) == 'R')
                    || (getCadena().charAt(i) == 'u')
                    || (getCadena().charAt(i) == 'U')) {
                cantidadVocales++;
            }
        }
        return cantidadVocales;
    }

    public boolean Palindromo() {
        String palabraAlrevez = "";

        for (int i = getCadena().length() - 1; i >= 0; i--) {
            palabraAlrevez += getCadena().charAt(i);
        }

        if (getCadena().equals(palabraAlrevez)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

}
