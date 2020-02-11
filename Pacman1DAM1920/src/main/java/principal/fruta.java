/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * Clase que define a las frutas del PacMan
 *
 * @author Maria y Cristina
 */
public class fruta {

    private int puntosFruta;
    private int tiempoDesaparicion;
    private String tipoFrutas;

    /**
     * Constructor de la clase fruta con todos sus datos.
     *
     * @param puntosFruta putos que da la fruta al PacMan
     * @param tiempoDesaparicion tiempo que aparece y desaparece la fruta.
     * @param tipoFrutas tipo de fruta que aparece en el mapa.
     */
    public fruta(int puntosFruta, int tiempoDesaparicion, String tipoFrutas) {
        this.puntosFruta = puntosFruta;
        this.tiempoDesaparicion = tiempoDesaparicion;
        this.tipoFrutas = tipoFrutas;
    }

    /**
     * getter de puntosFruta     
     * @return puntos
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

    public int getTiempoDesaparicion() {
        return tiempoDesaparicion;
    }

    public void setTiempoDesaparicion(int tiempoDesaparicion) {
        this.tiempoDesaparicion = tiempoDesaparicion;
    }

    public String getTipoFrutas() {
        return tipoFrutas;
    }

    public void setTipoFrutas(String tipoFrutas) {
        this.tipoFrutas = tipoFrutas;
    }

}
