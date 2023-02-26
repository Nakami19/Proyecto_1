/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**

 * Esta clase es la lista de almacenes

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 26/02/2023

 */
 
public class AlmacenList {
    //Campos de la Clase
    private Nodo<Almacen> head;
    private int size;

    //Constructor de la Clase
    public AlmacenList() {
        this.head = null;
        this.size = 0;
    }//Cierre del constructor
    
    
    /**
     * @param almacen es un almacen que se va a introducir dentro de un nodo para introducirlo al final de la lista

     */
    public Nodo<Almacen> insertEnd(Almacen almacen){
        /**

        * Método que inserta un Nodo de tipo almacén al final de la lista
        * @return Retorna el Nodo que se insertó en la lista
        */
        Nodo<Almacen> node = new Nodo<Almacen>(almacen);
        if (isEmpty()) {
            setHead(node);
        } else {
            Nodo <Almacen>pointer = getHead();
            while (pointer.getNext() != null) {
                if(pointer.getData().getName().equalsIgnoreCase(node.getData().getName())) {
                    return node;
                }
                
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        size++;
        return node;
    }//Cierre Método
    
    
    
    public String mostrar(){
        /*
         *Método que imprime la lista de Almacenes
         *@return retorna el String de la lista de almacenes
        */
        Nodo<Almacen> aux = getHead();
        String cadena = "";
        for(int i = 0; i < getSize(); i++){
            if(i==getSize()-1) {
                cadena+= aux.getData().getName() + " " +  Integer.toString(aux.getData().getdPesofijo())+";"+"\n";
    
            }
            else{
            cadena+= aux.getData().getName() + " " + Integer.toString(aux.getData().getdPesofijo())+"\n";}
            aux=aux.getNext();
        }
        
        return cadena;
     }//Cierre método
    
        
    /**
     * @return the head
     */
    public Nodo<Almacen> getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Nodo<Almacen> head) {
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
        /*
         *Método que revisa si la lista de almacenes está vacía o está llena
         *@return retonra un booleano de si la lista está vacía o está llena
        */
        return head == null;
    }
    
}
