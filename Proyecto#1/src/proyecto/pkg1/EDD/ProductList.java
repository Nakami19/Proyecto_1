/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.EDD;

/**
 *
 * @author Tomas
 */
public class ProductList {
    private Nodo<Product> head;
    private int size;

    public ProductList(Nodo<Product> head, int size) {
        this.head = head;
        this.size = size;
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
    
    public Nodo insertEnd(Product producto){
        Nodo<Product> node = new Nodo<>(producto);
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
    
    public Nodo insertIndex(int index, Product producto){
        Nodo<Product> node = new Nodo<>(producto);
        if (isEmpty()) {
            setHead(node);
        } else {
            if (index > getSize()) {
                System.out.println("The index is bigger than the size");
                return insertEnd(producto);
            } else {
                Nodo pointer = getHead();
                int cont = 0;
                while (cont < (index-1) && pointer.getNext() != null) {
                    pointer = pointer.getNext();
                    cont++;
                }
                node.setNext(pointer.getNext());
                pointer.setNext(node);
            }
        }
        size++;
        return node;
    }
}
