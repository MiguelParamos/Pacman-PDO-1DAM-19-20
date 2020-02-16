/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Cristina
 */
public class Proveedor { 

    private String nombre; //nombre del proveedor
    private String contacto; //contacto del proveedor
    private Producto[] producto;  //productos que se venden en la tienda online
    private int volumenMax; //volumen maximo de ventas

    /**
     * Constructor de la clase proveedor con todos sus datos.     *       
     * @param nombre nombre del proveedor
     * @param contacto contacto del proveedor
     * @param producto nombre de los productos que se venden en la tienda online. 
     * @param volumenMax volumen maximo de las ventas
    */ 
    public Proveedor(String nombre, String contacto, Producto[] producto, int volumenMax) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.producto = producto;
        this.volumenMax = volumenMax;
    }
    

    /**
     * getter de producto
     * @return producto que se venden en la tienda online
    */ 
    public Producto[] getProducto() {
        return producto;
    }

    
   /**
    * setter de producto
    * @param producto producto que se venden en le tienda online
   */ 
    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

        
    /**
     * getter de nombre 
     *
     * @return nombre del proveedor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter de nombre
     *
     * @param nombre nombre del provedor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter de contacto
     *
     * @return datos de contactos del proveedor
     */
    public String getContacto() {
        return contacto;
    }

    /**
     *setter de contacto
     * @param contacto datos de contactos del proveedor
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * getter de volumenMax
     * @return volumen maximo de ventas
     */
    public int getVolumenMax() {
        return volumenMax;
    }

    /**
     * setter de volumenMax
     * @param volumenMax  volumen maximo de ventas
     */
    public void setVolumenMax(int volumenMax) {
        this.volumenMax = volumenMax;
    }

}
