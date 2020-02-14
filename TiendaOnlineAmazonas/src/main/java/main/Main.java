/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 * La clase principal del programa TiendaOnlieAmazonas
 * 
 * @author Adrian mata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        
        //Menu que da a elegir diferentes acciones que sera capaz de realizar el programa
        System.out.println("Bienvenido a la tienda online Amazonas.Pulse un numero para elegir una opcion:" +"\n\t1-Buscar articulos\n\t-"+"\n\t2-Ver mis compras\n\t-"+"\n\t3-Ver mi informacion de usuario\n\t-"+"\n\t4-Editar mi usuario\n\t-");
        byte opcion=Byte.parseByte(sca.nextLine());
        
        switch(opcion){
        
            case 1:
                System.out.println("Ha elegido buscar articulos en nuestra tienda");
                break;
                
            case 2:
                System.out.println("Ha elegido ver las compras que ha realizado");
                break;
                
            case 3:
                System.out.println("Ha accedido a su informacion personal");
                break;
                
                case 4:
                System.out.println("Va editar su informacion personal");
                break;
                
                default:
                    System.out.println("ERROR.Opcion no valida");
                    break;
                    
        }
    }
    
}
