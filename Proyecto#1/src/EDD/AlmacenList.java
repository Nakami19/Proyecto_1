/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

 
public class AlmacenList {
    private Nodo<Almacen> head;
    private int size;

    public AlmacenList() {
        this.head = null;
        this.size = 0;
    }
    
    public Nodo<Almacen> insertEnd(Almacen almacen){
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
    }
    
    public String mostrar(){
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
     }
    
        
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
        return head == null;
    }
    
}
