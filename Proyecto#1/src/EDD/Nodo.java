/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * Clase Nodo de tipo general que va a ser utilizada para almacenar los datos de Almacenes y productos para sus respectivas listas
 * 
 * @author Kevin Li, Tomás Gil y Natalia Rivas
 */

public class Nodo<T> {
    //Campos de la Clase
    private T data;
    private Nodo<T> next;
    
    //Constructor de la clase
    public Nodo(T data) {
        this.data = data;
        this.next = null;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public Nodo<T> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo<T> next) {
        this.next = next;
    }
    
}   
