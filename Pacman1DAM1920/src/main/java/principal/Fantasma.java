/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

/**
 * Clase que representa a fantasma
 * @author salva
 * @author hgonz
 */
public class Fantasma {
   
    //VARIABLES INTERNAS
    private boolean azul;                   //Color cuando el Pacman se come una bolita grande
    private boolean estaVivo;           //Estado del fantasma 
    private int velocidad;                 //La velocidad del fantasma
    private char color;                      //Color del fantasma, hay 4 tipos de colores

    
    //CONSTRUCTORES
    
        /**
     * Constructor de la clase fantasma con todos sus datos.
     *
     * @param azul Color que se activa si Pacman come una bolita grande
     * @param estaVivo Estado del fantasma
     * @param velocidad velocidad del fantasma
     * @param color color del fantasma
     */
    public Fantasma(boolean azul, boolean estaVivo, int velocidad, char color) {
        this.azul = azul;
        this.estaVivo = estaVivo;
        this.velocidad = velocidad;
        this.color = color;
    }
    
    
    //GETTER
    public boolean isAzul() {
        return azul;

    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public char getColor() {
        return color;
    }
    
    //SETTER

    /**
     * Setter de la variable azul
     * @param variable azul
     */
    public void setAzul(boolean azul) {
        this.azul = azul;
    }

    /**
     * Setter de la variable estaVivo
     * @param variable estaVivo
     */
    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    /**
     * Setter de la variable velocidad
     * @param variable velocidad
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Setter de la variable color
     * @param variable color
     */
    public void setColor(char color) {
        this.color = color;
    }
    
    
    //FUNCIONES
    public Fantasma(int posX, int posY) {
    }

    public void chocarConPacman() {

    }

    public void moverse() {

    }

    public void morir() {

    }

    public void sonidoMoverse() {

    }

    public void sonidoMorir() {

    }

}
