/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Tomas
 */
public class Nodo<T> {
    private T data;
    private Nodo<T> next;

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
    
    @Override
    public String toString(){
        return getData() + " (" + getNext() + ")";
    }
}   
