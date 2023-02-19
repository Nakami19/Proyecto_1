/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.EDD;

/**
 *
 * @author Tomas
 */
public class Route {
    //private Almacen source;
    private Almacen destiny;
    private int weight;
    private Route siguiente;

    public Route(/*Almacen source,*/ Almacen destiny, int weight) {
        //this.source = source;
        this.destiny = destiny;
        this.weight = weight;
        this.siguiente = null;
    }

    /**
     * @return the source
     */
    /*public Almacen getSource() {
        return source;
    }*/

    /**
     * @param source the source to set
     */
    /*public void setSource(Almacen source) {
        this.source = source;
    }*/

    /**
     * @return the destiny
     */
    public Almacen getDestiny() {
        return destiny;
    }

    /**
     * @param destiny the destiny to set
     */
    public void setDestiny(Almacen destiny) {
        this.destiny = destiny;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the siguiente
     */
    public Route getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Route siguiente) {
        this.siguiente = siguiente;
    }
    
    
        
   
}
