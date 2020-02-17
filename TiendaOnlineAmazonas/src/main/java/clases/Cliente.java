/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Clase con los constructores, getters, setters y funciones de cliente.
 * @author Javier Muñoz
 */
public class Cliente {
    
    private String nombreCliente;
    private String apellidoCliente;
    private byte edadCliente;
    private int idCliente;
    private String direccionCliente;
    private String usuarioPaypal;
    private Carrito c;
    private Factura [] facturas;
    
    
    //Aquí los Getters
    public String getNombreCliente() {
        return nombreCliente;
    }
    
    public String getApellidoCliente() {
        return apellidoCliente;
    }
    
    public byte getEdadCliente() {
        return edadCliente;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    
    public String getDireccionCliente() {
        return direccionCliente;
    }
    
    public String getUsuarioPaypal() {
        return usuarioPaypal;
    }
    
    public Carrito getC() {
        return c;
    }
    
    public Factura [] getFacturas() {
        return facturas;
    }
    
    //Aquí los Setters
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }
    
    public void setEdadCliente(byte edadCliente) {
        this.edadCliente = edadCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
    
    public void setUsuarioPaypal(String usuarioPaypal) {
        this.usuarioPaypal = usuarioPaypal;
    }
    
    public void setC(Carrito c) {
        this.c = c;
    }
    
    public void setFacturas(Factura [] facturas) {
        this.facturas = facturas;
    }
    
        //Estas son las funciones
    
    /**
     * Funcion para saber si el cliente está registrado o no
     * @return true si está registrado y false si no lo está. 
     * Por defecto no estará registrado
     */
    public boolean registrarse() {
        return false;
    }
    
     /**
     * Funcion para saber si el cliente está logueado o no.
     * @return true si está logueado y false si no lo está. 
     * Por defecto no estará logueado
     */
    public boolean loguearse(){
        return false;
    }
    
    /**
     * Esta función sirve para buscar un producto en la tienda.
     */
    public void buscarProducto(){
        
    }
    
    /**
     * Esta funcion añade los productos al carrito.
     */
    public String[] añadirAlCarrito(){
    }
    
    /**
     * Esta función comprueba el modo por el que vamos apagar nuestros productos.
     */
    public void comprobarFormaDePago(){
        
    }
    
    /**
     * Esta funcion comprueba si la direccion introducida es correcta o no.
     * @return true si la direccion es correcta, false si no lo es.
     * Por defecto estará incorrecta
     */
    public boolean comprobarDireccion(){
        return false;
    }
    
    /**
     * Esta funcion sirve para realizar las comprar que el cliente realize en la tienda.
     */
    public void comprar(){
        
    }
    
    /**
     * Esta funcion sirve para que el cliente puedo introducir una reseña con estrellas.
     * @return el número de estrellas que el cliente ha puesto al comprar un producto
     * He optado por un byte en lugar de un float, ya que las reseñas suelen ser de 1 a 5.
     */
    public byte añadirValoracion(){
        return 0;
        
    }
    
    /**
     * Funcion para que el cliente pueda cerrar su sesión en la tienda
     * @return false si sigue logueado y true si ha finalizado su sesión.
     * Por defecto estará en false, que significa que está logueado.
     */
    public boolean desloguearse(){
        return false;
        
    }
    
    //Este es el constructor
    
    /**
     * Este es el constructor de la clase cliente.
     * @param nombreCliente Hace referencia al nombre del cliente
     * @param apellidoCliente Hace referencia al apellido del cliente
     * @param edadCliente Hace referencia a la edad del cliente
     * @param idCliente Hace referencia al ID del cliente
     * @param direccionCliente Hace referencia a la dirección del cliente
     * @param usuarioPaypal Hace referencia al usuario de Paypal del cliente
     * @param c Esto es el carrito
     * @param facturas Hace referencia a las facturas del cliente
     */
    public Cliente(String nombreCliente,String apellidoCliente, byte edadCliente, int idCliente, String direccionCliente, String usuarioPaypal, Carrito c, Factura [] facturas ){
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;    
        this.edadCliente = edadCliente; 
        this.idCliente = idCliente; 
        this.direccionCliente = direccionCliente; 
        this.usuarioPaypal = usuarioPaypal; 
        this.c = c; 
        this.facturas = facturas; 
    }
    
    
    
    
    
}

