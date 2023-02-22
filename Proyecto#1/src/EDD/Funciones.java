/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Natalia
 */
public class Funciones {
    
  public boolean isalpha(String palabra) {
        palabra=palabra.toLowerCase();
        return palabra.matches("[a-z]*");
    }
  
  public String nombres_almacenes(Grafo grafo){
      String nombres="";
      for (Almacen almacen=grafo.getFirst(); almacen!=null; almacen=almacen.getSiguiente()) {
          if (almacen.getSiguiente()==null){
            nombres+=almacen.getName();
          }
          else {
          nombres+=almacen.getName()+",";
          }
            
        }
      
     return nombres;
  }
  
  public String mostrar_disponible(Grafo grafo) {
              
        ProductList agregados=new ProductList();
         
        
        for (Almacen almacen=grafo.getFirst(); almacen!=null; almacen=almacen.getSiguiente()) {
            for ( Nodo<Product> aux=almacen.getListaProductos().getHead(); aux!=null; aux=aux.getNext()) {
                Product producto=agregados.searchproduct(aux.getData().getName());

                if (producto!=null) {
                    producto.setQuantity(producto.getQuantity()+aux.getData().getQuantity());
                
                }
                else{
                    Product producto2=new Product(aux.getData().getName(),aux.getData().getQuantity());
                    agregados.insertEnd(producto2);
                }
            }   
        }
           
        String productos=agregados.mostrar();
        
        return productos;
  
  
  }
}
