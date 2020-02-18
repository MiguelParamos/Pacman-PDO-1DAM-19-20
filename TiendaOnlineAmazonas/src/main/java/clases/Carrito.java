/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author fsty
 */
public class Carrito {

    private Producto[] producto; //Array de la clase Producto, en el cuál, se irán agregando los diferentes productos
    private int[] cantidad; //Array de tipo entero de la cantidad de productos que se elijan

    /**
     * Constructor de todos los atributos de Carrito
     */
    public Carrito(Producto[] producto, int[] cantidad) {
        this.producto = producto;
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
     *
     * @param producto Tipo de productos que han sido seleccionados y guardados
     * para su compra
     */
    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    /**
     * Setter de cantidad
     *
     * @param cantidad de cada producto que hay agregado en el Carrito
     */
    public void setCantidad(int[] cantidad) {
        this.cantidad = cantidad;
    }

    //Getters
    /**
     * Getter de Producto
     *
     * @return Producto guardado en el Carrito
     */
    public Producto[] getProducto() {
        return producto;
    }

    /**
     * Getter de Cantidad
     *
     * @return cantidad de productos en la lista del Carrito
     */
    public int[] getCantidad() {
        return cantidad;
    }

//    /**
//     * Función que finaliza la compra (si es true) de los productos almacenados
//     * en el Carrito
//     *
//     * @param compraFin
//     * @return
//     */
//    public boolean finalizarCompra(boolean compraFin) {
//        return false;
//
//    }
}
