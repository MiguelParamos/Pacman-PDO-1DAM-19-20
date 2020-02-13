/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * Clase que define a las frutas del PacMan.
 *@author Maria Sanchez
 * @author  Cristina Carrillo
 */
public class Fruta extends Elemento {

    private int puntosFruta; //puntos de las frutas
    private int tiempoDesaparicion; //tiempo que desaparece la fruta del laberinto.
    private String tipoFruta;//frutas del PacMan (cerezas) (representado con una estrella)

    /**
     * Constructor de la clase fruta con todos sus datos.
     *
     * @param puntosFruta Puntos que obtiene el PacMan cuando come una fruta
     * @param tiempoDesaparicion Tiempo que aparecen y desaparecen las frutas
     * @param tipoFruta tipo de fruta que aparece en el laberinto.
     * @param posX posicion x
     * @param posY posicion y 
     */
    public Fruta(int puntosFruta, int tiempoDesaparicion, String tipoFruta, int posX, int posY) { 
        super(posX,posY,'✰');
        this.puntosFruta = puntosFruta;
        this.tiempoDesaparicion = tiempoDesaparicion;
        this.tipoFruta = tipoFruta;
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
    
    /**
     * Funcion darPuntos
     * @return int de puntos
     */
    public int darPuntos(){
        return 200; 
    }
    /**
     * Funcion que hace desaparecer a la fruta
     */
    public void desaparecer(){
       this.posY=-1;
       this.posX=-1;
    }
}
