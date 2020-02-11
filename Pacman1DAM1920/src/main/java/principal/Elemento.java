/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author cenec
 */
public class Elemento {
    private int posX;
    private int posY;
    private char simbolo;
    /**
     * Constructor
     */
    public Elemento(){
        
    }
    /**
     * Constructor
     * @param x Cordenada X de la posicion
     * @param y Cordenada Y de la posicion
     * @param s  Simbolo
     */
    public Elemento(int x, int y,char s){
        this.posX=x;
        this.posY=y;
        this.simbolo=s;
    }
/**
 * getter posX
 * @return Posicion de la cordenada X
 */
    public int getPosX() {
        return posX;
    }
/**
 * Setter de posX
 * @param posX Cordenada X 
 */
    public void setPosX(int posX) {
        this.posX = posX;
    }
/**
 * Getter de posY
 * @return Posicion de la cordenada Y
 */
    public int getPosY() {
        return posY;
    }
    
    
/**
 * Setter de posY
 * @param posY Cordena Y
 */
    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
/**
 * Getter de simbolo
 * @return Un char que representa el simbolo
 */
    public char getSimbolo() {
        return simbolo;
    }

    
    /**
     * Setter de simbolo
     * @param simbolo Simbolo del elemento
     */
    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
    
}
