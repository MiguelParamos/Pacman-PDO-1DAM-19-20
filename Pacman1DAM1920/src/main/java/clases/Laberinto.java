/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Clase que representa al laberinto del Pacman
 *
 * @author Alvaro Lopez
 * @author Alvaro Nuñez
 */
public class Laberinto {

    private Elemento[][] mapa; // INICIALIZAMOS LA VARIABLE MAPA, EN LA CUAL APARECERAN LOS ELEMENTOS
    private Fantasma[] fantasma; // INICIALIZACION DEL NUMERO DE FANTASMAS INCLUIDOS EN EL JUEGO
    private Pacman pacman; // INICIALIZAMOS EL PERSONAJE PRINCIPAL DEL JUEGO
    private Bolita[] bolitas; // INICIALIZAMOS DE LOS PUNTOS DEL JUEGO
    private Fruta fruta; // INICIALIZAMOS LOS PUNTOS EXTRA DEL JUEGO

    // AQUI EMPEZAMOS A INICIALIZAR LOS GETTERS AND SETTERS
    public Elemento[][] getMapa() {
        return mapa;
    }

    public void setMapa(Elemento[][] mapa) {
        this.mapa = mapa;
    }

    public Fantasma[] getFantasma() {
        return fantasma;
    }

    public void setFantasma(Fantasma[] fantasma) {
        this.fantasma = fantasma;
    }

    public Pacman getPacman() {
        return pacman;
    }

    public void setPacman(Pacman pacman) {
        this.pacman = pacman;
    }

    public Bolita[] getBolita() {
        return bolitas;
    }

    public void setBolita(Bolita[] bolita) {
        this.bolitas = bolitas;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    // ACABAMOS DE GENERAR GETTERS AND SETTERS
    // EJECUTAMOS LAS FUNCIONES
    /*
    * @return devuelve el mapa con todos los elementos incluidos
     */
    public void inicializarMapa() {
    }

    /*
    * @return devuelve el final del juego
     */
    public boolean finJuego() {
        if(numeroVidas=0||bolitas=0){
            return true;
        }else{
            return false;
        }
    }

    public Laberinto() {
    }

}
