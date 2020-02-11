/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * Clase que define a las frutas del PacMan.
 *
 * @author Maria y Cristina
 */
public class fruta {

    private int puntosFruta;
    private int tiempoDesaparicion;
    private String tipoFruta;

    /**
     * Constructor de la clase fruta con todos sus datos.
     *
     * @param puntosFruta Puntos que obtiene el PacMan cuando come una fruta
     * @param tiempoDesaparicion Tiempo que aparecen y desaparecen las frutas
     * @param tipoFrutas tipo de fruta que aparece en el laberinto.
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
     * @return tiempo que permanece la fruta en el laberinto
     */
    public int getTiempoDesaparicion() {
        return tiempoDesaparicion;
    }

    /**
     *setter de TiempoDesaparicion
     * @param tiempoDesaparicion tiempo que permanece la fruta en el laberinto
     */
    public void setTiempoDesaparicion(int tiempoDesaparicion) {
        this.tiempoDesaparicion = tiempoDesaparicion;
    }

    /**
     * getter de tipoFruta
     * @return  tipo de fruta que aparece en el laberinto, la cereza.
     */
    public String getTipoFruta() {
        return tipoFruta;
    }

    /**
     * setter de tipoFruta
     * @param tipoFruta  fruta que aparece en el laberinto del PacMan.
     */
    public void setTipoFruta(String tipoFruta) {
        this.tipoFruta = tipoFruta;
    }
    
    public int darPuntos(){
        return 0;
    }
    public boolean desaparecer(){
        return true;
    }
}
