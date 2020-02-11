/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

/**
 *
 * @author salva
 * @author hgonz
 */
public class Fantasma {
   
    //VARIABLES INTERNAS
    private boolean azul;
    private boolean estaVivo;
    private int velocidad;
    private char color;

    
    //CONSTRUCTORES
    
    
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
