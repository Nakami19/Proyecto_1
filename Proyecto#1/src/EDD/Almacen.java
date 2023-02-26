/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**

 * Esta clase son el objeto y nodo Almacen

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 19/02/2023

 */  
public class Almacen {
    //Campos de la clase 
    private String name;    
    private ProductList listaProductos;
    private AdjacentList listaAdyacencia;
    private String dPrevious; 
    private int dPeso;
    private int dPesofijo;
    
    private Almacen siguiente;//nodo
    // Constructor para la creacion de grafos

    public Almacen(String name) {
        this.name = name;
        this.listaProductos = new ProductList();
        this.listaAdyacencia = new AdjacentList();
        this.siguiente = null;
        this.dPrevious= "";
        this.dPeso=0;
        this.dPesofijo=0;
    //Cierre del constructor
    }

    public int getdPesofijo() {
        return dPesofijo;
    }

    public void setdPesofijo(int dPesofijo) {
        this.dPesofijo = dPesofijo;
    }

    public String getdPrevious() {
        return dPrevious;
    }

    public void setdPrevious(String dPrevious) {
        this.dPrevious = dPrevious;
    }

    public int getdPeso() {
        return dPeso;
    }

    public void setdPeso(int dPeso) {
        this.dPeso = dPeso;
    }

    /**
     * @return the name
     */
   public String getName() {
       return this.name;
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
