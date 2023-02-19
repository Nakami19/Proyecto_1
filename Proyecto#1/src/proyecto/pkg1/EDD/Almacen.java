/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.EDD;

/**
 *
 * @author Tomas
 */
public class Almacen {
    private String name;    
    private ProductList listaProductos;
    private AdjacentList listaAdyacencia;
    private Almacen siguiente;

    public Almacen(String name, ProductList listaProductos) {
        this.name = name;
        this.listaProductos = listaProductos;
        this.listaAdyacencia = new AdjacentList();
        this.siguiente = null;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the listaProductos
     */
    public ProductList getListaProductos() {
        return listaProductos;
    }

    /**
     * @param listaProductos the listaProductos to set
     */
    public void setListaProductos(ProductList listaProductos) {
        this.listaProductos = listaProductos;
    }

    /**
     * @return the listaAdyacencia
     */
    public AdjacentList getListaAdyacencia() {
        return listaAdyacencia;
    }

    /**
     * @param listaAdyacencia the listaAdyacencia to set
     */
    public void setListaAdyacencia(AdjacentList listaAdyacencia) {
        this.listaAdyacencia = listaAdyacencia;
    }

    /**
     * @return the siguiente
     */
    public Almacen getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Almacen siguiente) {
        this.siguiente = siguiente;
    }
    
    
    

    
}
