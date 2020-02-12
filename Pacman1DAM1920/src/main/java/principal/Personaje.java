/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Adrian
 */
public class Personaje extends Elemento{
    
    private boolean estaVivo;
    private int velocidad;

  
    
    
    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    
    
    public Personaje(boolean estaVivo, int velocidad, int x, int y, char s) {
        super(x, y, s);
        this.estaVivo = estaVivo;
        this.velocidad = velocidad;
    }  

}
