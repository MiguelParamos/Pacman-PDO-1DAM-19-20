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
public class Fantasma extends Personaje {
   
    //VARIABLES INTERNAS
    private boolean azul;                                   //Color cuando el Pacman se come una bolita grande
    private char color;                                      //Color del fantasma, hay 4 colores (Rojo, Celeste, Amarillo, Morado)
    private final int tiempoEspera;          //Tiempo que espera el fantasma después de morir   El tiempo de espera es 10 int tiempoEspera=10;
    private char simboloAzul; //simbolo que representa el simbolo cuando huye del pacman
  
    
    //CONSTRUCTORES
    
    /**
     * Constructor de la clase fantasma con todos sus datos.
     * @param tiempoEspera turnos en que tarda en aparecer el fantasma
     * @param azul Color que se activa si Pacman come una bolita grande
     * @param estaVivo Estado del fantasma
     * @param velocidad velocidad del fantasma
     * @param color color del fantasma
     * @param posX posición x del fantasma 
     * @param posY posición y del fantasma
     * @param simbolo simbolo que representa al fantasma
     * @param simboloAzul simbolo que representa al fantasma de color azul, cuando pacman puede comerle
     */
    public Fantasma(int tiempoEspera,boolean azul, char color, char simboloAzul, boolean estaVivo, int velocidad, int posX, int posY, char simbolo) {
        super(estaVivo, velocidad, posX, posY, simbolo);
        this.azul = azul;
        this.color = color;
        this.simboloAzul = simboloAzul;
        this.tiempoEspera=tiempoEspera;
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

      public int getTiempoEspera() {
        return tiempoEspera;
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
   /* public Fantasma(int posX, int posY, char simbolo) {
       super(posX, posY, simbolo);     
    } Si se quiere usar esta hay que pasarle al su per 5 parametros    super(estaVivo, velocidad, posx, posy, simbolo)*/

/**
 * Representa el choque entre pacman y el fantasma. Pacman gana si la variable azul es true y Fantasma gana si la variable azul es false.
 * @param azul 
 */
    public void chocarConPacman(boolean azul) {
        if (azul) {
            morir(tiempoEspera);
        }
        
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
   
    /**
     * Hace que el fantasma muera y lo devuelve a su posicion inicial según el color
     * @param f Fantasma que muere
     */
    public void morir(Fantasma f){
        f.setEstaVivo(false);
        //Rojo
        if (f.color == 'R') {
           //f.setPosX();
           //f.setPosY();
        }
        //Celeste
        if (f.color == 'C') {
            //f.setPosX();
           //f.setPosY();
        }
        //Amarillo
        if (f.color == 'A') {
            //f.setPosX();
           //f.setPosY();
        }
        //Morado
        if (f.color == 'M') {
            //f.setPosX();
           //f.setPosY();
        }     
    } 
}
