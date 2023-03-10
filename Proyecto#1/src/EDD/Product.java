/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**

 * Esta clase es el producto que irán dentro de los nodos para la lista de productos

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 19/02/2023

 */  
public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    
    /**
     * Metodo para mostrar los atributos del producto
     * @return String que contiene todos los atributos de la clase
     */
    public String show() {
        return this.name+","+Integer.toString(this.quantity);
    
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
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
