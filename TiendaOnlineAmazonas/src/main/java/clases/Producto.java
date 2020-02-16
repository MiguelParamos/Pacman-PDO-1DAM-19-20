/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jaime
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private int precio;
    private int stock;

    
    /**
     * getter de nombre
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * setter de nombre  
     * @param nombre nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * getter de descripcion
     * @return descripcion  del producto
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * setter de descricion
     * @param descripcion descripción de producto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * getter de precio
     * @return precio del producto
     */
    public int getPrecio() {
        return precio;
    }
    /**
     * setter de precio
     * @param precio  del producto
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    /**
     * getter de stock
     * @return stock de los productos
     */
    public int getStock() {
        return stock;
    }
    /**
     * setter de stock
     * @param stock de los
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    /**
     * construtor de producto
     */
    public Producto(){
        
        
    }
}
