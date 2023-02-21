/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Tomas
 */
public class Grafo {
    private Almacen first;
    private Almacen last;
    
    public Grafo(){
        this.first = null;
        this.last = null;
    }

    
    public boolean existVertice(Almacen dato){
        boolean exist = false;
        if (!grafoEmpty()){
            Almacen temp = getFirst();
            while (temp!= null && !exist){
                if (temp.getName().equals(dato.getName())){
                    exist = true;
                }
                temp = temp.getSiguiente();
            }
        }
    return exist;
    }
    
    public Almacen getVertice(String name){
        if(grafoEmpty()){
            return null;
        }else{
            for (Almacen pointer = getFirst();  pointer != null; pointer = pointer.getSiguiente()) {
                if(pointer.getName().equals(name)){
                    return pointer;
                }
            }
            return null;
        }
    }
    
    public void newArista(Almacen origin, Almacen destiny, int weight){
        if(existVertice(origin) && existVertice(destiny)){
            Almacen position = getFirst();
            while(!position.getName().equals(origin.getName())){
                position = position.getSiguiente();
            }
            position.getListaAdyacencia().newAdjacency(destiny, weight);
        }
    }
    
    public void newNode(Almacen dato){
        if(!existVertice(dato)){
            Almacen nodo = dato;
            if(grafoEmpty()){
                setFirst(nodo);
                setLast(nodo);
            }else{
                if(dato.getName().compareTo(getFirst().getName()) <= 0){
                    nodo.setSiguiente(getFirst());
                    setFirst(nodo);
                }else{
                    if(dato.getName().compareTo(getLast().getName()) >= 0){
                        getLast().setSiguiente(nodo);
                        setLast(nodo);
                    }else{
                        Almacen temp = getFirst();
                        while(dato.getName().compareTo(temp.getName()) < 0){
                            temp = temp.getSiguiente();
                        }
                        nodo.setSiguiente(temp.getSiguiente());
                        temp.setSiguiente(nodo);
                    }
                }
            }
        }
    }
    
    public String printGrafo(){
        String cadena ="";
        Almacen temp = getFirst();
        while (temp != null){
            cadena = cadena + temp.getName()+" -> "+temp.getListaAdyacencia().Imprimir()+"\n";
            temp = temp.getSiguiente();
        } 
        return cadena;
    }
    
   public String saveroute() {
            String cadena ="Rutas;\n";
        Almacen temp = getFirst();
        while (temp != null){
            cadena = cadena+temp.getListaAdyacencia().saveroute(temp.getName());
            temp = temp.getSiguiente();
        } 
        return cadena;
    
    }
   
    public String saveproducts() {
        String almacenes="Almacenes;\n";
        Almacen temp = getFirst();
          while (temp != null){
            if(temp.getListaProductos().getHead()==null) {
                almacenes+="Almacen "+temp.getName()+":"+"\n"+";"+"\n";
            }
            else{ almacenes+="Almacen "+temp.getName()+":"+"\n"+ temp.getListaProductos().mostrar();}
            temp = temp.getSiguiente();
          } 
        return almacenes;
    }
    
    /**
     * @return the first
     */
    public Almacen getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(Almacen first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public Almacen getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(Almacen last) {
        this.last = last;
    }
    
    public boolean grafoEmpty(){
        return getFirst() == null;
    }
    
    
}
