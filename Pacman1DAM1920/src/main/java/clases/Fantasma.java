/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
public class Fantasma extends Personaje {

    //VARIABLES INTERNAS
    private boolean azul;                                   //Color cuando el Pacman se come una bolita grande
    private char color;                                      //Color del fantasma, hay 4 colores ,puede ser: r->rojo, a->amarillo, p->rosa, b->azul
    private final int tiempoEspera;          //Tiempo que espera el fantasma después de morir   El tiempo de espera es 10 int tiempoEspera=10;
    private char simboloAzul; //simbolo que representa el simbolo cuando huye del pacman

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
    public Fantasma(int tiempoEspera, boolean azul, char color, boolean estaVivo, int velocidad, int posX, int posY, char simbolo) {
        super(estaVivo, velocidad, posX, posY, simbolo);
        this.azul = azul;
        this.color = color;
        this.simboloAzul = '▼';
        this.tiempoEspera = tiempoEspera;
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
        super(true, 1, -1, -1, 'F');
        this.azul = false;
        this.color = color;
        this.simboloAzul = 'f';
        this.tiempoEspera = 10;
        switch (color) {
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
    public int[] moverse(Laberinto l, Pacman p) {
        Random rand = new Random();

        int[] array = new int[2];

        if (p.getPosX() != this.getPosX() && p.getPosY() != this.getPosY()) {       //Si la posición del fantasma y el pacman es distinta
            if (azul && l.getMapa() != null) {          //Si azul es true y la casilla del mapa es distinta de null

                this.setPosX(rand.nextInt());           
                this.setPosY(rand.nextInt());           

                array[0] = this.getPosX();
                array[1] = this.getPosY();

            } else { //Si azul es false
                if (l.getMapa() != null) {              //Si la casilla del mapa es distinta de null
                    this.setPosX(rand.nextInt((p.getPosX() - this.getPosX()) + 1));         
                    this.setPosY(rand.nextInt((p.getPosX() - this.getPosX()) + 1));         

                    array[0] = this.getPosX();
                    array[1] = this.getPosY();
                }
            }
        }

        return array;
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
