/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Esta clase se encarga de definir los parámetros de la bola, ya sea grande o
 * pequeña.
 *
 * @author Adrian
 * @author Javier
 */
public class Bolita extends Elemento {

    private boolean tipoBola;//Variable para saber el tipo de bola: true-> grande, false->pequeña

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
     * @param tipoBola Recibe por parámetros un boolean: true-> grande,false->pequeña
     */
    public void setTipoBola(boolean tipoBola) {
        this.tipoBola = tipoBola;
    }

    /**
     * Este es el constructor de la clase Bolita
     *
     * @param x Recibe la posicion del eje x
     * @param y Recibe la posicion del eje y
     * @param tipoBola Recibe por parámetros un boolean:true-> grande, false->pequeña
     */
    public Bolita(int x, int y, boolean tipoBola) {
        super(x, y, (tipoBola?'O':'o'));//Simbolo bola grande O
        this.tipoBola = tipoBola;
    }

    /**
     * Funcion de que suma puntos
     *
     * @return 1 punto si es pequeña, 10 si es grande
     */
    public int sumarPuntos() {
       return (tipoBola?10:1);
    }

    /**
     * Funcion que elimina las bolas del laberinto
     */
    public void desaparecer() {
        setPosX(-1);
        setPosY(-1);
    }
}
