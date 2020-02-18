/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.Laberinto;

/**
 * Clase principal del pacman de 1ºDAM 19-20
 * @author Miguel Páramos
 */
public class Main {

    /**
     * función inicial que lanza una partida de pacman
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear e imprimir laberinto: 
        //Zona de pruebas de Antonio Calvente
        //NO TIENE QUE ESCRIBIR NADA AQUI, solo hacer que funcionen los métodos
        Laberinto laberinto=new Laberinto();
        System.out.println(laberinto);
        //Fin de zona de pruebas de Antonio Calvente
        
        short turno=0;
        
        do{
            turno++;
            //Zona de escritura de Francisco España
            
            //Fin de zona de escritura de Francisco España
            
        }while(!laberinto.finJuego());
    }
    
}
