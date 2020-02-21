/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Clase que almacena los productos elegidos por el cliente para su posterior compra
 * @author javi R
 */
public class Carrito {
    private Producto productos[]; //Array de productos de la clase Producto
    private int cantidad; //Cantidad de productos

    
    /**
     * Constructor de todos los atributos de Carrito
     * @param productos que hay en el carrito
     * @param cantidad que hay en el carrito
     */
    public Carrito(Producto[] productos, int cantidad) {
        this.productos = productos;
        this.cantidad = cantidad;
    }

    /**
     * Constructor vacio de Carrito
     */
    public Carrito() {

    }

    //Setters
    /**
     * setter de Producto
     * @param productos Tipo de productos que han sido seleccionados y guardados
     * para su compra
     */
    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    /**
     * Setter de cantidad
     * 
     * @param cantidad de cada producto que hay agregado en el Carrito
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Getters
    /**
     * Getter de Producto
     * @return Productos guardado en el Carrito
     */
    public Producto[] getProductos() {
        return productos;
    }

    /**
     * Getter de Cantidad
     * 
     * @return cantidad de productos en la lista del Carrito
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Función que finaliza la compra (si es true) de los productos almacenados
     * en el Carrito
     *
     * @param compraFin
     * @return true al finalizar la compra
     */
    public boolean finalizarCompra(boolean compraFin) {
        return true;

    }
}
