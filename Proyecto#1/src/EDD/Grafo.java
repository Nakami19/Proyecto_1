/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Interfaz.Global;

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
        public Grafo BFS(String entrada){
        Grafo grafo = Global.getGrafo();
        Grafo cola = new Grafo();
        Grafo bfs = new Grafo();
        Almacen origen= grafo.getVertice(entrada);
        String visitado = origen.getName();
        Route destino = origen.getListaAdyacencia().getFirst();
        bfs.insertFinal(origen);

        while (origen !=null && destino !=null){
            if (!visitado.contains(destino.getDestiny().getName())){
            cola.insertFinal(destino.getDestiny());}
            destino = destino.getSiguiente();
         
            
            if (destino == null && cola.getFirst()!=null){
                origen = grafo.getVertice(cola.getFirst().getName());
                destino = origen.getListaAdyacencia().getFirst();
                if (!visitado.contains(origen.getName())){
                bfs.insertFinal(origen);}
                visitado += bfs.getLast().getName();                    
                
                cola.deleteBegin();

            }
            }
            System.out.println(bfs.printGrafo());
        return bfs;  
    }
    
        public Grafo DFS(String entrada){
        Grafo grafo = Global.getGrafo();
        Grafo pila = new Grafo();
        Grafo dfs = new Grafo();
        Almacen origen= grafo.getVertice(entrada);
        String visitado = origen.getName();
        Route destino = origen.getListaAdyacencia().getFirst();
        dfs.insertFinal(origen);

        while (origen !=null && destino !=null){
            if (!visitado.contains(destino.getDestiny().getName())){
            pila.insertFinal(destino.getDestiny());}
            destino = destino.getSiguiente();
            
            if (destino == null && pila.getLast()!=null){
                origen = grafo.getVertice(pila.getLast().getName());
                destino = origen.getListaAdyacencia().getFirst();
                dfs.insertFinal(origen);
                visitado += dfs.getLast().getName();
                pila.deleteFinal();

            }
            }
        return dfs;  
    }
        
    public void grafoDijsktra(String entrada){
        Grafo grafo = Global.getGrafo();
        grafo.pesoDijsktrra();
        Grafo orden = grafo.BFS(entrada);
        Almacen origen = orden.getVertice(entrada);
        Route destino = grafo.getVertice(origen.getName()).getListaAdyacencia().getFirst();
        origen.setdPrevious(entrada);
        origen.setdPeso(0);
        grafo.getVertice(entrada).setdPrevious(entrada);
        grafo.getVertice(entrada).setdPeso(0);

        while (origen!=null && destino !=null){
            if (origen.getdPeso()==0){  
                grafo.getVertice(destino.getDestiny().getName()).setdPeso(destino.getWeight());
                orden.getVertice(destino.getDestiny().getName()).setdPeso(grafo.getVertice(destino.getDestiny().getName()).getdPeso());
                grafo.getVertice(destino.getDestiny().getName()).setdPrevious(entrada);
                orden.getVertice(destino.getDestiny().getName()).setdPrevious(grafo.getVertice(entrada).getName());
                
            }
            if (origen.getdPeso() + destino.getWeight() < grafo.getVertice(destino.getDestiny().getName()).getdPeso() && origen.getdPeso()!=0){
                grafo.getVertice(destino.getDestiny().getName()).setdPeso(origen.getdPeso()+ destino.getWeight());
                orden.getVertice(destino.getDestiny().getName()).setdPeso(grafo.getVertice(destino.getDestiny().getName()).getdPeso());
                grafo.getVertice(destino.getDestiny().getName()).setdPrevious(origen.getName());
                orden.getVertice(destino.getDestiny().getName()).setdPrevious(grafo.getVertice(origen.getName()).getName());
                
            }
            
            destino = destino.getSiguiente();
            if (destino == null){
                origen = origen.getSiguiente();
            if (origen!=null){
                destino = grafo.getVertice(origen.getName()).getListaAdyacencia().getFirst();}
}
        } 
    }        
        
    public void pesoDijsktrra(){
        Grafo grafo = Global.getGrafo();
        Almacen nodito = grafo.getFirst();
        int peso= 0;
        Route destino = nodito.getListaAdyacencia().getFirst();
        while (nodito != null && destino!=null){
            peso+=destino.getWeight();
            destino = destino.getSiguiente();
            if (destino == null){
                nodito = nodito.getSiguiente();
            if (nodito!=null){
                destino = nodito.getListaAdyacencia().getFirst();
            }
        }}
        if (nodito == null){
        nodito = grafo.getFirst();
        while (nodito!=null){
            nodito.setdPeso(peso);
            nodito = nodito.getSiguiente();
        }
  
    }
    }
    
    public String printDijkstra(){
        return "en espera aun";
    }
        
    public void insertFinal(Almacen dato) {
        Almacen node = new Almacen(dato.getName());
        
        if (grafoEmpty()) {
            setFirst(node);
            setLast(node);
        } else { 
        Almacen aux =getLast();
        aux.setSiguiente(node);
        setLast(node);
        } 
}
    public void deleteFinal(){
        if (!grafoEmpty()){
            Almacen pointer = getFirst();
            if (getFirst() == getLast()) {
                setFirst(null);
                setLast(null);

            } else {
                while (pointer.getSiguiente() != null && pointer.getSiguiente().getSiguiente() != null){
                    pointer = pointer.getSiguiente();
                }
                pointer.setSiguiente(null);
                setLast(pointer);

            }
        }
        
    }

    public void deleteBegin(){
        if (!grafoEmpty()){
            Almacen pointer = getFirst();
            setFirst(pointer.getSiguiente());
            pointer.setSiguiente(null);
        if (getFirst() == getLast()) {
                setFirst(null);
                setLast(null);}
        }
    }  
    
    public String printBFS_DFS(){
        Grafo grafo = Global.getGrafo();
        String cadena ="";
        Almacen temp = getFirst();
        while (temp != null){
            cadena += "Almacen "+grafo.getVertice(temp.getName()).getName()+":"+"\n"+grafo.getVertice(temp.getName()).getListaProductos().mostrar()+"\n";
            temp = temp.getSiguiente();
        } 
        return cadena;
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
