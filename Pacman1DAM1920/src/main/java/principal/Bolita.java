/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * Esta clase se encarga de definir los parámetros de la bola, ya sea grande o
 * pequeña.
 *
 * @author Adrian y Javier
 */

public class Bolita extends Elemento {

    private boolean tipoBola;

    /**
     * Getter de la clase bolita, para la variable tipoBola.
     *
     * @return un boolean
     */
    public boolean isTipoBola() {
        return tipoBola;
    }

    /**
     * Setter de la clase bolita, para la variable tipoBola.
     *
     * @param tipoBola Recibe por parámetros un boolean
     */
    public void setTipoBola(boolean tipoBola) {
        this.tipoBola = tipoBola;
    }

    /**
     * Este es el constructor de la clase Bolita
     *
     * @param x Recibe la posicion del eje x
     * @param y Recibe la posicion del eje y
     * @param tipoBola Recibe por parámetros un boolean
     */
    public Bolita(int x, int y, boolean tipoBola) {
        super(x, y, '•');
        this.tipoBola = tipoBola;

    }

    /**
     * Funcion de que suma puntos
     *
     * @return
     */
    public int sumarPuntos() {
        //TODO implementar la función
        return 0;
    }

    /**
     * Funcion que elimina las bolas del laberinto
     */
    public void desaparecer() {

    }
}
