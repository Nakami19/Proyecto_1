/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Tomas
 */
public class ProductList {
    private Nodo<Product> head;
    private int size;

    public ProductList() {
        this.head = null;
        this.size = 0;
    }
    
    public Nodo insertEnd(Product producto){
        Nodo<Product> node = new Nodo<Product>(producto);
        if (isEmpty()) {
            setHead(node);
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        size++;
        return node;
    }
    
    public String mostrar() {
    Nodo<Product> aux=getHead();
    String cadena="";
        for (int i = 0; i < getSize(); i++) {
            //cadena+=aux.getElement().mostrar()+"\n";
            cadena+=aux.getData().show()+"\n";
            aux=aux.getNext();
            
        }
        return cadena;
    
    }

    
    /**
     * @return the head
     */
    public Nodo<Product> getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Nodo<Product> head) {
        this.head = head;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    
    
    
}
