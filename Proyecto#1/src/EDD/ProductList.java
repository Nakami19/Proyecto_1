/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**

 * Esta clase es la lista de productos que irá dentro del almacén

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 19/02/2023

 */  
public class ProductList {
    //Campos de la clase
    private Nodo<Product> head;
    private int size;
    
    //Constructor de la clase
    public ProductList() {
        this.head = null;
        this.size = 0;
    }
    
    /**
     * Funcion que verifica si la lista de productos está vacía
     * @return un booleano que indica si la lista está vacía o no
     */
    public boolean empty() {
        return getHead()==null;
    
    }
    
    /**
     * Método que inserta al final de la list
     * @param producto Producto que se va a insertar dentro del nodo producto para introducirse en la lista
     * @return El nodo que se introdujo a la lista de productos
     */
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
    
    /**
     * Función que guarda en una cadena de texto los datos de todos los productos de la lista y los retorna para poder imprimirse
     * @return La cadena de texto con todos los datos de la lista de productos
     */
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
     
     
     
       /**
        * Metodo que se utiliza para buscar un producto especifico en la lista
        * @param name el parametro name define el nombre del profucto que se desea buscar
        * @return en caso de encontrar el producto retornara su objeto, de no encontrarlo retornara null
        */
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
