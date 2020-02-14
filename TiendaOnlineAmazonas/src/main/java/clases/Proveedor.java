/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author cenec
 */
public class Proveedor {

    private String nombre; //nombre del proveedor
    private String contacto; //contacto del proveedor
    // private Productos[] productos;
    private int volumenMax; //volumen maximo del proveedor

    
    
    /**
     * Constructor de la clase proveedor con todos sus datos.
     * @param nombre nombre del proveedor
     * @param contacto contacto del proveedor
     * @param volumenMax  volumen maximo del proveedor
     */
    public Proveedor(String nombre, String contacto, int volumenMax) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.volumenMax = volumenMax;
    }

    /**
     * getter de nombre
     * @return nombre del proveedor
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getVolumenMax() {
        return volumenMax;
    }

    public void setVolumenMax(int volumenMax) {
        this.volumenMax = volumenMax;
    }

    
}
