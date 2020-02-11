/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * Clase que define a las frutas del PacMan.
 * @author Maria Sanchez
 * @author  Cristina Carrillo
 */
public class fruta {

    private int puntosFruta;
    private int tiempoDesaparicion;
    private String tipoFruta;

    /**
     * Constructor de la clase fruta con todos sus datos.     
     * @param puntosFruta Puntos que obtiene el PacMan cuando come una fruta.
     * @param tiempoDesaparicion Tiempo que desaparecen las frutas en el laberinto.
     * @param tipoFrutas tipo de fruta que aparece en el laberinto (cerezas)
     */
    public fruta(int puntosFruta, int tiempoDesaparicion, String tipoFrutas) {
        this.puntosFruta = puntosFruta;
        this.tiempoDesaparicion = tiempoDesaparicion;
        this.tipoFruta = tipoFrutas;
    }

    /**
     * getter de puntosFruta
     *
     * @return puntos que obtiene el PacMan al comer una fruta.
     */
    public int getPuntosFruta() {
        return puntosFruta;
    }

    /**
     * setter de puntosFruta     
     * @param puntosFruta puntos que da al PacMan cuando se come la fruta
     */
    public void setPuntosFruta(int puntosFruta) {
        this.puntosFruta = puntosFruta;
    }

    /**
     * getter de TiempoDesaparicion     
     * @return tiempo que desaparece la fruta en el laberinto
     */
    public int getTiempoDesaparicion() {
        return tiempoDesaparicion;
    }

    /**
     *setter de TiempoDesaparicion
     * @param tiempoDesaparicion tiempo que desaparece la fruta en el laberinto
     */
    public void setTiempoDesaparicion(int tiempoDesaparicion) {
        this.tiempoDesaparicion = tiempoDesaparicion;
    }

    /**
     * getter de tipoFruta
     * @return   fruta que aparece en el laberinto (cerezas).
     */
    public String getTipoFruta() {
        return tipoFruta;
    }

    /**
     * setter de tipoFruta
     * @param tipoFruta  fruta que aparece en el laberinto (cerezas).
     */
    public void setTipoFruta(String tipoFruta) {
        this.tipoFruta = tipoFruta;
    }

    /**
     * 
     */
    public void darPuntos() {

    }

}
