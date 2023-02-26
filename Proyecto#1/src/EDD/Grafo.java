/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Interfaz.Global;

/**

 * Esta clase es el grafo; Realiza las funciones del grafo

 * @author: Kevin Li, Tomás Gil y Natalia Rivas

 * @version: 19/02/2023

 */  
public class Grafo {
    //Campos de la clase 
    private Almacen first;
    private Almacen last;
    
    // Constructor para la creacion de grafos
    
    public Grafo(){
        this.first = null;
        this.last = null;
    }  //Cierre del constructor
    /**
     * @param dato es un almacen que se utiliza para comparar si está dentro de un grafo en especifico

     */
    public boolean existVertice(Almacen dato){
    /**

     * Método que verifica si el grafo existe
     * @return Retorna booleano para verificar si el grafo existe
     */
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
    }//Cierre metodo
    
    /**

     * @param name es el String del atributo almacen, para buscar un nodo de acuerdo a su atributo nombre

     */
    public Almacen getVertice(String name){
    /**

     * Método que busca un nodo existente de un grafo en especifico
     * @return retorna el Nodo Almacen con un mismo atributo nombre
     */
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
    }//Cierre metodo
    
    /**

     * @param origin es para asignar el origen de la ruta. 
     * @param destiny es para asignar el destino de la ruta. 
     * @param weight es para asignar la distancia de la ruta. 

     */
    public void newArista(Almacen origin, Almacen destiny, int weight){
    /**

     * Método que asigna la ruta de un almacen hacia otro
     * 
     */
        if(existVertice(origin) && existVertice(destiny)){
            Almacen position = getFirst();
            while(!position.getName().equals(origin.getName())){
                position = position.getSiguiente();
            }
            position.getListaAdyacencia().newAdjacency(destiny, weight);
        }
    } //cierre metodo
    

    /**

     * @param dato define el almacen al que se añadira al grafo

     */ 
    
    public void newNode(Almacen dato){
    /**

     * Método que asigna la ruta de un almacen hacia otro
     * 
     */
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
    } //cierre metodo
    
    public String printGrafo(){
    /**

     * Método que retorna un string y dicho string es una representacion del grafo con origen y posteriormente su lista de adyacencia
     * @return String que contiene origen y lista adyacencia de cada nodo
     */
        String cadena ="";
        Almacen temp = getFirst();
        while (temp != null){
            cadena = cadena + temp.getName()+" -> "+temp.getListaAdyacencia().Imprimir()+"\n";
            temp = temp.getSiguiente();
        } 
        return cadena;
    } //cierre metodo
    
    

   public String saveroute() {
    /**
     * Metodo para guardar todas las rutas de los almacenes en un mismo string con formato para ser leido al cargar txt
     * @return String que contiene las rutas de todos los almacenes 
     */
            String cadena ="Rutas;\n";
        Almacen temp = getFirst();
        while (temp != null){
            cadena = cadena+temp.getListaAdyacencia().saveroute(temp.getName());
            temp = temp.getSiguiente();
        } 
        return cadena;
    
    }//cierre metodo
   
   
   
    public String saveproducts() {
   /**
    * Metodo para guardar todos los almacenes y sus productos en un mismo string para ser leido al cargar txt
    * @return String que contiene el nombre de los almacenes junto a sus respectivos productos
    */
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
    }//cierre metodo
    
    
    /**

     * @param entrada entrada define el nodo origen del BFS

     */ 
    public Grafo BFS(String entrada){
   /**
    * Metodo que crea un nuevo grafo ordenado de manera BFS
    * @return retorna un grafo ordenado de manera BFS
    */
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
        return bfs;  
    }//cierre metodo
    
    /**

     * @param entrada entrada define el nodo origen del DFS

     */ 
    public Grafo DFS(String entrada){
   /**
    * Metodo que crea un nuevo grafo ordenado de manera DFS
    * @return retorna un grafo ordenado de manera DFS
    */
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
    }//cierre metodo
    
    
    
    /**

     * @param entrada  define el nodo origen que realizara todos los recorridos posibles
     * @param llegada  define el string del nodo destino que se le pidio los productos

     */ 
    public void datosSalidaDijsktra(String entrada, String llegada){
   /**
    * Metodo que asigna los valores en atributos almacenes de la distancia mas corta de un origen en especifico a todas las distancias posibles
    */
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
                if (destino.getDestiny().getName().equals(llegada)){
                    grafo.getVertice(entrada).setdPesofijo(destino.getWeight());
                } 
                
            }
            if (origen.getdPeso() + destino.getWeight() < grafo.getVertice(destino.getDestiny().getName()).getdPeso() && origen.getdPeso()!=0){
                grafo.getVertice(destino.getDestiny().getName()).setdPeso(origen.getdPeso()+ destino.getWeight());
                orden.getVertice(destino.getDestiny().getName()).setdPeso(grafo.getVertice(destino.getDestiny().getName()).getdPeso());
                grafo.getVertice(destino.getDestiny().getName()).setdPrevious(origen.getName());
                orden.getVertice(destino.getDestiny().getName()).setdPrevious(grafo.getVertice(origen.getName()).getName());
                if (destino.getDestiny().getName().equals(llegada)){
                grafo.getVertice(entrada).setdPesofijo(origen.getdPeso()+ destino.getWeight());
                } 
                
            }
            
            destino = destino.getSiguiente();
            if (destino == null){
                origen = origen.getSiguiente();
            if (origen!=null){
                destino = grafo.getVertice(origen.getName()).getListaAdyacencia().getFirst();}
}
        } 
    }//cierre metodo
    
    /**

     * @param llegada  define el almacen destino a los que se les hara llegar los productos

     */ 
    public void datosLlegadaDijsktra(String llegada){
   /**
    * Metodo que asigna los valores en atributos almacenes de la distancia mas corta de todos los origenes a 1 destino llegada en especifico
    */
        Grafo grafo = Global.getGrafo();
        Almacen entrada = grafo.getFirst();
        while(entrada !=null){
        datosSalidaDijsktra( entrada.getName(),  llegada);
        entrada = entrada.getSiguiente();
        }
    }//cierre metodo
    
    /**

     * @param llegada  define el almacen destino a los que se les hara llegar los productos

     */ 
    public Grafo ordenDijsktra(String llegada){
   /**
    * Metodo que asigna los valores en atributos almacenes de la distancia mas corta de todos los origenes a 1 destino llegada en especifico
    * @return retorna un grafo ordenado de acuerdo al camino mas corto hacia un destino especifico (destino constante, origenes variables)
    */
        Grafo grafo = Global.getGrafo();
        grafo.datosLlegadaDijsktra(llegada);
        Grafo grafod = new Grafo();
        Almacen nodito = grafo.getFirst();
        while (nodito != null){
            
            grafod.insertFinal(nodito);
            grafod.getVertice(nodito.getName()).setListaProductos(nodito.getListaProductos());
            grafod.getVertice(nodito.getName()).setdPeso(nodito.getdPeso());
            grafod.getVertice(nodito.getName()).setdPesofijo(nodito.getdPesofijo());
            grafod.getVertice(nodito.getName()).setdPrevious(nodito.getdPrevious());
            grafod.getVertice(nodito.getName()).setListaAdyacencia(nodito.getListaAdyacencia());
            grafod.getVertice(nodito.getName()).setSiguiente(nodito.getSiguiente());
            grafod.getVertice(nodito.getName()).setName(nodito.getName());


            nodito= nodito.getSiguiente();
        }
        grafod = grafod.nodeByWeight(grafod);
        
        return grafod;

        }//cierre metodo
    
    public String printRoute(){
    
   /**
    * Metodo que retorna un string de la ruta
    * @return retorna un String que representa la ruta uniderccional de un nodo a otro
    */
        String cadena = "";
        for(Almacen pointer = getFirst(); pointer != null; pointer = pointer.getSiguiente()){
            if(cadena.isBlank()){
                cadena += pointer.getName() + " -> ";
            }else if(pointer.getSiguiente() == null){
                cadena +=  " " + pointer.getName();
            }else{
                cadena += " " + pointer.getName() + " -> ";
            }
            
        }
        return cadena;
    }//cierre metodo
    
    
    /**

     * @param entrada  define el almacen origen
     * @param llegada  define el almacen destino a los que se les hara llegar los productos

     */ 
    public Grafo grafoDijsktra(String entrada, String llegada){
   /**
    * Metodo que retorna al grafo candidato del dijsktra
    * @return grafo seleccionado a partir de la ruta mas corta de un origen en especifico determinado por la funcion ordenDijsktra
    */
        Grafo grafo = Global.getGrafo();
        datosSalidaDijsktra( entrada,  llegada);
        Grafo grafod = new Grafo();
        Almacen lastone = grafo.getVertice(llegada);
        Almacen firstone = grafo.getVertice(entrada);
        while (lastone!= firstone){
            
            grafod.InsertBegin(lastone);
            grafod.getVertice(lastone.getName()).setListaProductos(lastone.getListaProductos());
            grafod.getVertice(lastone.getName()).setdPrevious(lastone.getdPrevious());
            grafod.getVertice(lastone.getName()).setName(lastone.getName());
            
            if (grafo.getVertice(lastone.getdPrevious()) == firstone){
                grafod.InsertBegin(firstone);    
                grafod.getVertice(firstone.getName()).setListaProductos(firstone.getListaProductos());
                grafod.getVertice(firstone.getName()).setdPrevious(firstone.getdPrevious());
                grafod.getVertice(firstone.getName()).setName(firstone.getName());
            }
            
            lastone=grafo.getVertice(lastone.getdPrevious());
        }
        Almacen inicio = grafod.getFirst();
        Route destino = grafo.getVertice(inicio.getName()).getListaAdyacencia().getFirst();
        while (inicio.getSiguiente() != null && destino != null){
            
            if (destino.getDestiny().getName() == inicio.getSiguiente().getName()){ 
            grafod.newArista(inicio, inicio.getSiguiente(),destino.getWeight() );
            }
            destino = destino.getSiguiente();
            
            if (destino == null){
                inicio = inicio.getSiguiente();
                destino= grafo.getVertice(inicio.getName()).getListaAdyacencia().getFirst();
                
            }

            }
        
        return grafod;
    }//cierre metodo
        
    public void pesoDijsktrra(){
   /**
    * Metodo que suma todos los pesos y los guarda en un atributo para aplicar el calculo de distancias 
    * 
    */
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
    }//cierre metodo
    
    
    /**

     * @param grafod  define el almacen a ordenar por peso

     */ 
    public Grafo nodeByWeight(Grafo grafod){

   /**
    * Metodo que ordena el grafo por peso y lo retorna
    * @return grafo ordenado por peso
    * 
    */
        Almacen temp = null;
        AlmacenList lista = new AlmacenList();
        for(Almacen node = grafod.getFirst(); node != null; node = node.getSiguiente()){
            lista.insertEnd(node);
        }
        
        Grafo grafo2 = new Grafo();
        
        for(Nodo<Almacen> pointer = lista.getHead(); pointer != null; pointer = pointer.getNext()){
            for(Nodo<Almacen> index = pointer.getNext(); index != null; index = index.getNext()){
                if(pointer.getData().getdPesofijo() > index.getData().getdPesofijo()){
                    temp = pointer.getData();
                    pointer.setData(index.getData());
                    index.setData(temp);
                }
            }
        }
        
        for(Nodo<Almacen> pointer = lista.getHead(); pointer != null; pointer = pointer.getNext()){
            grafo2.insertFinal(pointer.getData());
            
        }
        
        for (Almacen pointer = grafo2.getFirst(); pointer != null; pointer = pointer.getSiguiente()){
            for(Nodo<Almacen> index = lista.getHead(); index != null; index = index.getNext()){
                if(pointer.getName().equalsIgnoreCase(index.getData().getName())){
                    pointer.setdPesofijo(index.getData().getdPesofijo());
                    pointer.setListaAdyacencia(index.getData().getListaAdyacencia());
                }
            }
        }
        return grafo2;
    }//cierre metodo
    
    /**

     * @param dato  define el almacen a insertar por inicio

     */ 
    public void InsertBegin(Almacen dato){
   /**
    * Inserta un almacen al inicio del grafo
    * 
    */
        Almacen nodo = new Almacen(dato.getName());
        if (grafoEmpty()) {
            setFirst(nodo);
            setLast(nodo);
        } else {
            Almacen aux=getFirst();
            nodo.setSiguiente(aux);
            setFirst(nodo);
        }}//cierre metodo
    
    /**

     * @param dato  define el almacen a insertar al final

     */ 
    public void insertFinal(Almacen dato) {
   /**
    * Inserta un almacen al final del grafo
    * 
    */
        Almacen node = new Almacen(dato.getName());
        
        if (grafoEmpty()) {
            setFirst(node);
            setLast(node);
        } else { 
        Almacen aux =getLast();
        aux.setSiguiente(node);
        setLast(node);
        } 
}//cierre metodo
    

    public void deleteFinal(){
   /**
    * Elimina el ultimo almacen del grafo
    * 
    */
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
        
    }//cierre metodo

    public void deleteBegin(){
   /**
    * Elimina el primer almacen del grafo
    * 
    */
        if (!grafoEmpty()){
            Almacen pointer = getFirst();
            setFirst(pointer.getSiguiente());
            pointer.setSiguiente(null);
        if (getFirst() == getLast()) {
                setFirst(null);
                setLast(null);}
        }
    }  //cierre metodo

    
    public String printBFS_DFS(){
   /**
    * Retorna el string de almacenes y productos ordenados de manera BFS y tambien para el caso DFS
    * @return retorna el string de la representacion del BFS y DFS
    * 
    */
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
        /**
        * Revisa si el grafo está vacío
        * @return Retorna un booleano de si el grafo está vacío o no
        */
        return getFirst() == null;
    }
    
    
}
