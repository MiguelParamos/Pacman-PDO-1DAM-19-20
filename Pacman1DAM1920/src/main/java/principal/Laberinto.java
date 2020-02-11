/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Alvaro Lopez
 * @author Alvaro Nuñez
 */
public class Laberinto {
    
    
    private int largo;
    private int ancho;

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Laberinto(int largo, int ancho) {
        this.largo = 30;
        this.ancho = 30;
    }
    
    
    public void InicializarMapa() {
        String mapa[][] = new String[largo][ancho];
    }
    
    
    
    
    
}
