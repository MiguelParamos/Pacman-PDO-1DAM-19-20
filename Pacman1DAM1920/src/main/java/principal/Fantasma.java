/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

/**
 * Clase que representa a fantasma
 * @author salva
 * @author hgonz
 */
public class Fantasma extends Elemento {
   
    //VARIABLES INTERNAS
    private boolean azul;                                   //Color cuando el Pacman se come una bolita grande
    private boolean estaVivo;                           //Estado del fantasma 
    private int velocidad;                                 //La velocidad del fantasma
    private char color;                                      //Color del fantasma, hay 4 colores (Rojo, Celeste, Amarillo, Morado)
    private final int tiempoEspera=10;          //Tiempo que espera el fantasma después de morir
    private char simboloAzul; //simbolo que representa el simbolo cuando huye del pacman
  
    
    //CONSTRUCTORES
    
    /**
     * Constructor de la clase fantasma con todos sus datos.
     *
     * @param azul Color que se activa si Pacman come una bolita grande
     * @param estaVivo Estado del fantasma
     * @param velocidad velocidad del fantasma
     * @param color color del fantasma
     * @param posX posición x del fantasma 
     * @param posY posición y del fantasma
     * @param simbolo simbolo que representa al fantasma
     *  @param simboloAzul simbolo que representa al fantasma de color azul, cuando pacman puede comerle
     */
    public Fantasma(boolean azul, boolean estaVivo, int velocidad, char color, int posX, int posY, char simbolo,char simboloAzul) {
        super(posX, posY, simbolo);
        this.azul = azul;
        this.estaVivo = estaVivo;
        this.velocidad = velocidad;
        this.color = color;
        this.simboloAzul=simboloAzul;
    }
    
    
    //GETTER
    /**
     * Getter de la variable azul
     * @return variable azul 
     */
    public boolean isAzul() {
        return azul;

    }

    /**
     * Getter de la variable estaVivo
     * @return variable estaVivo
     */
    public boolean isEstaVivo() {
        return estaVivo;
    }

    /**
     * Getter de la variable velocidad
     * @return variable velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Getter de la variable color
     * @return variable color
     */
    public char getColor() {
        return color;
    }
    /**
     * Getter de la variable simboloAzul
     * @return simbolo char cuando el fantasma se vuelve azul
     */
    public char getSimboloAzul() {
        return simboloAzul;
    }
    
    //SETTER

    /**
     * Setter de la variable azul
     * @param azul color del fantasma cuando el pacam se come una bolita grande
     */
    public void setAzul(boolean azul) {
        this.azul = azul;
    }

    /**
     * Setter de la variable estaVivo
     * @param estaVivo es el estado del fantasma cuando no es comido 
     */
    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

      public int getTiempoEspera() {
        return tiempoEspera;
    }

    /**
     * Setter de la variable velocidad
     * @param velocidad es el atributo del fantasma a lo largo de la partida
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Setter de la variable color
     * @param color es el que pertence a cada uno de los fantasmas, cada uno tiene un color diferente
     */
    public void setColor(char color) {
        this.color = color;
    }
     /**
     * Setter de la variable simboloAzul
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
    public Fantasma(int posX, int posY, char simbolo) {
        super(posX, posY, simbolo);
    }

    /**
     * Representa el choque entre pacman y el fantasma. Pacman gana si la variable azul es true y Fantasma gana si la variable azul es false.
     */
    public void chocarConPacman() {

    }

    /**
     * Función que representa el movimiento del fantasma
     * @return devuelve un array con la dirección del movimiento del fantasma.
     */
    public int[] moverse() {

        int[] array = new int[0];
        
        return array;
    }

    /**
     * Función que se ejecuta si el fantasma está muerto. Si es así, volverá a la posición de inicio y tendrá un tiempo de espera para volver a salir.
     * @param tiempoEspera variable que representa el tiempo que espera el fantasma cuando muere
     */
    public void morir(int tiempoEspera) {

    }

    /**
     * Función que representa el sonido del movimiento del Fantasma
     */
    public void sonidoMoverse() {

    }

    /**
     * Función que representa el sonido cuando muere el Fantasma
     */
    public void sonidoMorir() {

    }
   
}
