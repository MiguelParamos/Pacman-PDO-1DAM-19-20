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
    private char color;                      //Color del fantasma, hay 4 colores (Rojo, Celeste, Amarillo, Morado)

    
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
    /**
     * Getter de la variable azul
     * @return variable azul
     */
    public boolean isAzul() {
        return azul;

    }

    /**
     * Getter de la variable estaVivo
     * @return variable estaVivo
     */
    public boolean isEstaVivo() {
        return estaVivo;
    }

    /**
     * Getter de la variable velocidad
     * @return variable velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Getter de la variable color
     * @return variable color
     */
    public char getColor() {
        return color;
    }
    
    //SETTER

    
    public void setAzul(boolean azul) {
        this.azul = azul;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setColor(char color) {
        this.color = color;
    }
    
    
    //FUNCIONES
    /**
     * 
     * @param posX
     * @param posY 
     */
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
