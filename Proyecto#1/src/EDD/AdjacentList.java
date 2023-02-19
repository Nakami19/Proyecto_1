/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Tomas
 */
public class AdjacentList {
    private Route first;
    private Route last;
    
    public AdjacentList(){
        this.first = null;
        this.last = null;
    }

    /**
     * @return the first
     */
    public Route getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(Route first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public Route getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(Route last) {
        this.last = last;
    }
    
    public boolean isEmpty() {
        return getFirst()==null;
    }
    
    public boolean Adyacente(String dato){
        Route actual = getFirst();
        boolean encontrado = false;
        while(actual != null && !dato.equals(actual.getDestiny().getName())){
            actual=actual.getSiguiente();
        }
        if (actual != null){
            encontrado = true;
        }
        return encontrado;
    }
    
    public void newAdjacency(Almacen destiny, int weight){
        if(!Adyacente(destiny.getName())){
            Route node = new Route(destiny ,weight); 
            Insert(node, destiny);
        }
    }
    
    public void Insert(Route nodo, Almacen destiny) {
        if (isEmpty()){
            setFirst(nodo);
            setLast(nodo);
        }else{
            if(destiny.getName().compareTo(getFirst().getDestiny().getName())<=0){
                nodo.setSiguiente(getFirst());
                setFirst(nodo);
            } else {
                if (destiny.getName().compareTo(getLast().getDestiny().getName())>=0){
                getLast().setSiguiente(nodo);
                setLast(nodo);            
                    }else{
                        Route posicion = getFirst();
                        while(destiny.getName().compareTo(posicion.getDestiny().getName())<0){
                            posicion = posicion.getSiguiente();
                        }
                            nodo.setSiguiente(posicion.getSiguiente());
                            posicion.setSiguiente(nodo);
                    }
                }
        
            }
    
    }
    
    public String Imprimir(){
        String cadena ="";
        Route temp = getFirst();
        while (temp != null){
            cadena = cadena + temp.getDestiny().getName()+" ; "+ Integer.toString(temp.getWeight())+" "+"/"+" ";
            temp = temp.getSiguiente();
        }
        return cadena;
    }
    
    
    
}
  
