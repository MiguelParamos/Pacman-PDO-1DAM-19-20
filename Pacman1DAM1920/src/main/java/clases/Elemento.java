/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Superclase de los diferentes elemetos como el pacman, la fruta y las bolitas.
 * @author Francisco
 * @author Jaime
 */
public class Elemento {
    private int posX;//Coordenada X de un elemento
    private int posY;//Coordenada Y de un elemento
    private char simbolo;//Simbolo del elemento
    
    /**
     * Constructor elemento
     */
    public Elemento(){
        
    }
    /**
     * Constructor
     * @param x Coordenada X de la posicion
     * @param y Coordenada Y de la posicion
     * @param s  Simbolo
     */
    public Elemento(int x, int y,char s){
        this.posX=x;
        this.posY=y;
        this.simbolo=s;
    }
/**
 * getter posX
 * @return Posicion de la coordenada X
 */
    public int getPosX() {
        return posX;
    }
/**
 * Setter de posX
 * @param posX Coordenada X 
 */
    public final void setPosX(int posX) {
        this.posX = posX;
    }
/**
 * Getter de posY
 * @return Posicion de la coordenada Y
 */
    public int getPosY() {
        return posY;
    }
    
    
/**
 * Setter de posY
 * @param posY Coordena Y
 */
    public final void setPosY(int posY) {
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
