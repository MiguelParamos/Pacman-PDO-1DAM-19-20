/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import constantes.Constantes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *  Clase que representa a Pacman
 * @author Rafa Carrion
 * @author Kevin Rääk
 */
public final class Pacman extends Personaje{
    private byte direccionQueMira;      //Direccion a la que mira Pacman 2 Abajo 4 Izquierda 6 derecha 8 Arriba
    private int numeroVidas;        //Numero de vidas de Pacman 
    private int puntuacion;     //Puntos que consigue Pacman 0
    private byte turnosPowerup; //turnosPowerup definido a 0 por defecto
    
    
    
    /**
     * Getter de la variable direccionQueMira
     * @return 
     */
    public byte getDireccionQueMira(){
        return this.direccionQueMira;
    }
    
    /**
     * Getter de la variable estaVivo
     * @return 
     */
    public int getNumeroVidas(){
            
        return this.numeroVidas;
    }
    
    /**
     * Getter de la variable estaVivo
     * @return 
     */
    public int getPuntuacion(){
        return this.puntuacion;
    }
    
    /**
     * 
     * Setter de direccion que mira
     * @param d direccion
     */
    public void setDireccionQueMira(byte d){
        this.direccionQueMira = d;
    }
    
    /**
     * Setter de numero de vidas
     * @param n numero de vidas
     */
    public void setNumeroVidas(int n){
        this.numeroVidas = n;
    }
    
    /**
     * Setter de puntuacion
     * @param p velocidad
     */
    public void setPuntuacion(int p){
        this.puntuacion = p;
    }

    
    
    //FUNCIONES
    
    /**
     *  Constructor de Pacman con sus posicion generada aleatoriamente
     *  Lo coloca por defecto en la posición 9,17
     */
    public Pacman(){
        //le pongo una posición predeterminada, he escogido 9,17 como podría haber escogido cualquier otra.
        super(true,1,9,17,Constantes.amarilloPacman+"P"+Constantes.reset);
        this.numeroVidas=3;
        this.puntuacion=0;
        this.turnosPowerup=0;
    } 
    
        
        
        
   /* public Pacman (int posX, int posY,boolean pacman){
            super(posX,posY,'¢');
            this.estaVivo = pacman;
            
    }*/
    
    
    /**
     * Constructor de la clase Pac-Man con todos sus datos
     * 
     * @param numeroVidas
     * @param puntuacion
     * @param direccionQueMira
     * @param estaVivo
     * @param velocidad
     * @param x
     * @param y
     * @param s 
     * @param turnosPowerup
     */
    public Pacman(int numeroVidas,int puntuacion ,byte direccionQueMira, boolean estaVivo, int velocidad, int x, int y, String s){
        super(estaVivo, velocidad, x, y, s);
        this.direccionQueMira = direccionQueMira;
        this.numeroVidas = numeroVidas;    
        this.puntuacion = puntuacion; 
        this.turnosPowerup=0;
    }
    /**
     *  Funcion para el movimiento de Pacman
     * @param p pacman
     * @param f fantasma
     * @param b bolita
     * @param fr fruta
     * @param direccion por donde se mueve Pacman
     */
    public void moverse(Pacman p,Laberinto l) {
            //Falta el movimiento
        /*
            if(p.getPosX()==b.getPosX()&& p.getPosY()==b.getPosY()){ //CUANDO ENCUENTRA UNA BOLITA
                p.chocarConBolita(b);
                p.powerUp();
            }
        
            if(p.getPosX()==f.getPosX()&& p.getPosY()==f.getPosY()){ //CUANDO ENCUENTRA UN FANTASMA
                p.chocarConFantasma(f);
                f.chocarConPacman();    
            }
               if(p.getPosX()==fr.getPosX()&& p.getPosY()==fr.getPosY()){ //CUANDO ENCUENTRA UNA FRUTA
                p.chocarConFruta();   
                p.sumarPuntos(puntuacion);
            }
        */
    }
    
    /**
     * Funcion para cuando Pacman se choca con un fantasma
     * @param f se refiere al fantasma
     */
    
    public void chocarConFantasma(Fantasma f){
        if (!f.isAzul()) {
            this.morir();
        }
    }
    
        /**
     * Funcion para cuando Pacman se come una bolita
     * @param b bolita que se come
     */
    public void chocarConBolita(Bolita b){
        this.puntuacion+=b.sumarPuntos();
        b.desaparecer();
        if(b.getSimbolo().equals("O")){
            powerUp();
        }
    }
        /**
     * Funcion para cuando Pacman se come una fruta,esto suma a  la puntacion  200 puntos y además 
     * hace que la fruta desaparezca
     * @param fr es la fruta que se come el pacman (de tipo Fruta)
     */
    public void chocarConFruta(Fruta fr){
         this.puntuacion+=fr.darPuntos();
         fr.desaparecer();
    }
        /**
     * Sonido que hace Pacman
     */
    public void sonidoMoverse()  throws FileNotFoundException {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
        String bip = "./pacman.mp3";
        Media hit = new Media(new File(bip).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }
    /**
     * Funcion al morir Pacman resta una vida, y vuelve al pacman a la posición inicial
     *
     */
    public void morir(){
        this.numeroVidas--;
        this.setPosX(9);
        this.setPosY(17);
    }
    
    /**
     * Funcion al conseguir una bolita con poderes
     */
    public void powerUp(){
        turnosPowerup = 5;
    }
    
    public void powerUp(byte turnos){
         turnosPowerup=turnos;
    }

    /**
     *  Funcion para contar los puntos
     * @param cantidad numero de puntos que consigue Pacman
     */
    public void sumarPuntos(int cantidad){
        this.puntuacion+=cantidad;
    }

    @Override
    public void sonidoMorir() throws FileNotFoundException {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
        String bip = "./pacman-dies.mp3";
        Media hit = new Media(new File(bip).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }


    
    
}
