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
    
    public boolean empty() {
        return getHead()==null;
    
    }
    
    
    public Nodo insertEnd(Product producto){
        Nodo<Product> node = new Nodo<Product>(producto);
        if (isEmpty()) {
            setHead(node);
        } else {
            Nodo <Product>pointer = getHead();
            while (pointer.getNext() != null) {
                if(pointer.getData().getName().equalsIgnoreCase(node.getData().getName())) {
                    pointer.getData().setQuantity(pointer.getData().getQuantity()+node.getData().getQuantity());
                    return node;
                }
                
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
            if(i==getSize()-1) {
                cadena+=aux.getData().show()+";"+"\n";
    
            }
            else{
            cadena+=aux.getData().show()+"\n";}
            aux=aux.getNext();
        }
        
        return cadena;
    }
     
       public Product searchproduct(String name) {

        if (!empty()) {

         for (Nodo<Product> aux=getHead();aux!=null; aux=aux.getNext()) {
             
             if (aux.getData().getName().equalsIgnoreCase(name)) {
                 
                 return aux.getData();
             }
            }
           }
            
         return null;
           
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
