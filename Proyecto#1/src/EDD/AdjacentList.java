/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**

 * Esta clase son las listas de adyacencias de los almacenes

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 19/02/2023

 */  
public class AdjacentList {
    //Campos de la Clase
    private Route first;
    private Route last;
    
    //Constructor de la clase
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
    
    /**
     * Método que determina si la lista adyacencia está vacía o no
     * @return Retorna un booleano de si la lista adyacencia está vacía o no
     */
    public boolean isEmpty() {
        return getFirst()==null;
    }
    
    /**
     * Funcion que determina si la adyacencia entre un Almacen de origen y un almacen de destino ya existe
     * @param dato Nombre del almacén de destino
     * @return un Booleano que nos indicará si esta adyacencia ya existía de desde antes o si es una adyacencia nueva
     */
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
    
    /**
     * Método que crea una nueva adyacencia entre un Almacen de origen y un almacen de destino junto al peso de esa adyacencia
     * @param destiny Indica hacia dónde va a ir el elemento de origen
     * @param weight Indica el peso que va a tener la conexión
     */
    public void newAdjacency(Almacen destiny, int weight){
        if(!Adyacente(destiny.getName())){
            Route node = new Route(destiny ,weight); 
            Insert(node, destiny);
        }
    }
    
    
    /**
     * Clase que va a insertar la adyacencia creada previamente en la lista adyacencia, manteniendo el orden en la lista adyacencia al comparar los nombres
     * @param nodo La ruta que se va a insertar en la lista adyacencia
     * @param destiny El destindo de esa ruta, utilizado para mantener un orden en los destinos
     */
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
    
    /**
     * Metodo que guarda en un String todos los caminos de la lista adyacencia
     * @return String que contiene todos los datos en toda la lista Adyacencia
     */
    public String Imprimir(){
        String cadena ="";
        Route temp = getFirst();
        while (temp != null){
            cadena = cadena + temp.getDestiny().getName()+" ; "+ Integer.toString(temp.getWeight())+" "+"/"+" ";
            temp = temp.getSiguiente();
        }
        return cadena;
    }
    
    
    /**
     * Metodo que guarda en un String todos los destinos que contiene el almacen de origen
     * @param name el parametro name define el nombre del almacen de origen 
     * @return String que contiene todas las rutas que posee el almacen de origen
     */
    public String saveroute(String name) {
            String cadena ="";
        Route temp = getFirst();
        while (temp != null){
            cadena = cadena+name+","+temp.getDestiny().getName()+","+ Integer.toString(temp.getWeight())+"\n";
            temp = temp.getSiguiente();
        }
        return cadena;

    }
    
    
    
}
  
