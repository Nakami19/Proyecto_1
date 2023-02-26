/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**

 * Esta clase es el nodo de la lista de adyacencia

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 19/02/2023

 */  
public class Route {
    //Campos de la clase 
    private Almacen destiny;
    private int weight;
    private Route siguiente;
    
    
    // Constructor para la creacion de grafos

    public Route( Almacen destiny, int weight) {
        this.destiny = destiny;
        this.weight = weight;
        this.siguiente = null;
    }    //Cierre del constructor




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
