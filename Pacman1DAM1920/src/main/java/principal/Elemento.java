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
    
    public Elemento(){
        
    }
    
    public Elemento(int x, int y,char s){
        this.posX=x;
        this.posY=y;
        this.simbolo=s;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
    
}
