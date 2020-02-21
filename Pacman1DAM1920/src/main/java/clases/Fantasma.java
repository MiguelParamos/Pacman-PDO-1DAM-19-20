/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import constantes.Constantes;
import java.io.*;
import static java.lang.System.in;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 * Clase que representa a fantasma
 *
 * @author salva
 * @author hgonz
 */
public final class Fantasma extends Personaje {

    //VARIABLES INTERNAS
    private boolean azul;                                   //Color cuando el Pacman se come una bolita grande
    private char color;                                      //Color del fantasma, hay 4 colores ,puede ser: r->rojo, a->amarillo, p->rosa, b->azul
    private final int tiempoEspera;          //Tiempo que espera el fantasma después de morir   El tiempo de espera es 10 int tiempoEspera=10;
    private char simboloAzul; //simbolo que representa el simbolo cuando huye del pacman
    private boolean meTocaMovermeEnAzul; //Siempre que se convierte en azul, no se mueve
    
    //CONSTRUCTORES
    /**
     * Constructor de la clase fantasma con todos sus datos.
     *
     * @param tiempoEspera turnos en que tarda en aparecer el fantasma
     * @param azul Color que se activa si Pacman come una bolita grande
     * @param estaVivo Estado del fantasma
     * @param velocidad velocidad del fantasma
     * @param color color del fantasma, puede ser: r->rojo, a->amarillo,
     * p->rosa, b->azul
     * @param posX posición x del fantasma
     * @param posY posición y del fantasma
     * @param simbolo simbolo que representa al fantasma
     */
    public Fantasma(int tiempoEspera, boolean azul, char color, boolean estaVivo, int velocidad, int posX, int posY, String simbolo) {
        super(estaVivo, velocidad, posX, posY, simbolo);
        this.azul = azul;
        this.color = color;
        this.simboloAzul = '▼';
        this.tiempoEspera = tiempoEspera;
        this.meTocaMovermeEnAzul=false;
    }

    /**
     * Constructor de fantasma que pone todos sus datos menos el color
     * predefinidos
     *
     * @param color color del fantasma, puede ser: r->rojo, a->amarillo,
     * p->rosa, b->azul
     */
    public Fantasma(char color) {
        //Primer parámetro true porque un fantasma siempre empieza vivo
        //Segundo parámetro 1 porque fantasma siempre empieza con velocidad 1
        //No puedo poner nada por encima de super, y tengo que decidir la posición, por tanto por ahora la voy a poner a -1,-1 , y luego la cambio con los setter
        //Tampoco puedo establecer color aquí porque no se cual es, y no puedo escribir nada por encima de super. Lo modificaré más tarde
        super(true, 1, -1, -1, "F");
        this.azul = false;
        this.color = color;
        this.simboloAzul = 'f';
        this.tiempoEspera = 10;
        switch (color) {
            case 'r': //Rojo
                this.setPosX(9);
                this.setPosY(9);
                this.setSimbolo(Constantes.rojoFantasma+"F"+Constantes.reset);
                break;
            case 'y': //Amarillo
                this.setPosX(9);
                this.setPosY(10);
                this.setSimbolo(Constantes.amarilloFantasma+"F"+Constantes.reset);
                break;
            case 'b': //Azul
                this.setPosX(10);
                this.setPosY(9);
                this.setSimbolo(Constantes.azulFantasma+"F"+Constantes.reset);
                break;
            case 'p': //pink
                this.setPosX(10);
                this.setPosY(10);
                this.setSimbolo(Constantes.rosaFantasma+"F"+Constantes.reset);
                break;
            default:
                System.err.println("ERROR: COLOR INCORRECTO");
                break;
        }
        this.meTocaMovermeEnAzul=false;

    }

    //GETTER
    /**
     * Getter de la variable azul
     *
     * @return variable azul
     */
    public boolean isAzul() {
        return azul;

    }

    /**
     * Getter de la variable color
     *
     * @return variable color
     */
    public char getColor() {
        return color;
    }

    /**
     * Getter de la variable simboloAzul
     *
     * @return simbolo char cuando el fantasma se vuelve azul
     */
    public char getSimboloAzul() {
        return simboloAzul;
    }

    //SETTER
    /**
     * Setter de la variable azul
     *
     * @param azul color del fantasma cuando el pacam se come una bolita grande
     */
    public final void setAzul(boolean azul) {
        this.azul = azul;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    /**
     * Setter de la variable color
     *
     * @param color es el que pertence a cada uno de los fantasmas, cada uno
     * tiene un color diferente, puede ser: r->rojo, a->amarillo, p->rosa,
     * b->azul
     */
    public final void setColor(char color) {
        this.color = color;
    }

    /**
     * Setter de la variable simboloAzul
     *
     * @param simboloAzul char del fantasma cuando se vuelve azul
     */
    public void setSimboloAzul(char simboloAzul) {
        this.color = simboloAzul;
    }

    //FUNCIONES
    /**
     * Función que representa la posición del Fantasma
     *
     * @param posX posición x en el laberinto
     * @param posY posición y en el laberinto
     * @param simbolo representa el simbolo del Fantasma
     */
    /* public Fantasma(int posX, int posY, char simbolo) {
       super(posX, posY, simbolo);     
    } Si se quiere usar esta hay que pasarle al su per 5 parametros    super(estaVivo, velocidad, posx, posy, simbolo)*/
    /**
     * Representa el choque entre pacman y el fantasma. Pacman gana si la
     * variable azul es true y Fantasma gana si la variable azul es false.
     */
    public void chocarConPacman() {
        if (azul) {
            morir();
        }

    }

    /**
     * Función que representa el movimiento de los fantasmas
     *
     * @param l variable que representa al laberinto
     * @param p variable que representa al pacman
     * @return devuelve un vector con la posicion del fantasma
     */
    public void moverse(Laberinto l, Pacman p) {
        
        Random rand = new Random();
        //MovimientosPosibles[0] es el movimiento posible arriba o abajo (posX)
        //MovimientosPosibles[1] es el movimiento posible a izda o dcha (posY)
        String[] movimientosPosibles=new String[2];
        if(!this.azul){
            //Si mi posición x es menor que la de pacman, me puedo mover abajo
            if(p.getPosX()>this.getPosX()){
                    //Compruebo en mapa que la casilla debajo mia no sea null (pared)
                    if(l.getMapa()[this.getPosX()+1][this.getPosY()]!=null){
                        //Si no es nula, puedo moverme abajo
                        movimientosPosibles[0]="abajo";
                    }
            }else if(p.getPosX()<this.getPosY()){
                //Movimiento contrario, hacia arriba si no es nulo
                if(l.getMapa()[this.getPosX()-1][this.getPosY()]!=null){
                        //Si no es nula, puedo moverme abajo
                        movimientosPosibles[0]="arriba";
                    }
            }
            //Lo mismo con la direccion horizontal
            
            //Una vez tenemos las dos direcciones
            if(movimientosPosibles[0]==null&&movimientosPosibles[1]==null){
                //No me puedo mover
            }else if(movimientosPosibles[0]==null){
                //Me tengo que mover en la dirección que diga movimientosPosibles[1]
                if(movimientosPosibles[1].equals("Izquierda")){
                    this.setPosX(this.getPosX()-1);
                }else{
                    this.setPosX(this.getPosX()+1);
                }
            }else if(movimientosPosibles[1]==null){
                //Me tengo que mover en la dirección que diga movimientosPosibles[1]
                if(movimientosPosibles[0].equals("arriba")){
                    this.setPosY(this.getPosY()-1);
                }else{
                    this.setPosY(this.getPosY()+1);
                }
            }else{ //Ninguno de los dos es nulo, elijo el 0 o el 1 aleatoriamente
                
            }
           
        }else{ //Si el fantasma está azul
            if(this.meTocaMovermeEnAzul==true){
                //Moverse al contrario que en el otro caso
                
                //Cuando me mueva
                this.meTocaMovermeEnAzul=false;
            }else{
                this.meTocaMovermeEnAzul=true;
            }
        }
        
    }

    /**
     * Función que representa el sonido del movimiento del Fantasma
     */
    public void sonidoMoverse() throws FileNotFoundException {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
        String bip = "./fantasma.mp3";
        Media hit = new Media(new File(bip).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }

    /**
     * Función que representa el sonido cuando muere el Fantasma
     */
    @Override
    public void sonidoMorir() throws FileNotFoundException {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
        String bip = "./morirFantasma.mp3";
        Media hit = new Media(new File(bip).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }

    /**
     * Hace que el fantasma muera y lo devuelve a su posicion inicial según el
     * color
     *
     * @param f Fantasma que muere
     */
    public void morir() {
        this.setEstaVivo(false);
        switch (this.color) {
            case 'r': //Rojo
                this.setPosX(9);
                this.setPosY(9);
                break;
            case 'y': //Amarillo
                this.setPosX(9);
                this.setPosY(10);
                break;
            case 'b': //Azul
                this.setPosX(10);
                this.setPosY(9);
                break;
            case 'p': //pink
                this.setPosX(10);
                this.setPosY(10);
                break;
            default:
                System.err.println("ERROR: COLOR INCORRECTO");
                break;
        }
    }
}
