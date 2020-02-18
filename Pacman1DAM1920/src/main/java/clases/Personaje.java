/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *Clase que define caracteristicas compartidas de los personajes del juego
 * 
 * @author Adrian
 */
public class Personaje extends Elemento{
    
    private boolean estaVivo;//Define si esta vivo (true) o muerto (false) el personaje
    private int velocidad;//Define la velocidad de movimiento de los personajes

  
    
    /**
     * Getter de la clase Personaje, para la variable estaVivo
     * @return 
     */
    public boolean isEstaVivo() {
        return estaVivo;
    }

     /**
     * Setter de la clase Personaje, para la variable estaVivo
     * @return 
     */
    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

     /**
     * Getter de la clase Personaje, para la variable velocidad
     * @return 
     */
    public int getVelocidad() {
        return velocidad;
    }

     /**
     * Setter de la clase Personaje, para la variable velocidad
     * @return 
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    
    /**
     * Constructor de la clase personaje
     * 
     * @param estaVivo define si esta vivo o muerto el personaje
     * @param velocidad velocidad personaje
     * @param x posicion x
     * @param y posicion y
     * @param s simbolo
     */
    public Personaje(boolean estaVivo, int velocidad, int x, int y, char s) {
        super(x, y, s);
        this.estaVivo = estaVivo;
        this.velocidad = velocidad;
    }  

}
