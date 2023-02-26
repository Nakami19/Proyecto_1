/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *Esta clase contiene funciones auxiliares 
 * @author Kevin Li, Tomás Gil y Natalia Rivas
 * @version 22/02/23
 */
public class Funciones {
    
    
  /**
   * Método que verifica si un string contiene solo caracteres alfabeticos
   * @param palabra el parametro palabra define el string a verificar
   * @return true si el string contiene solo letras, false si contiene algun numero
   */
  public boolean isalpha(String palabra) {
        palabra=palabra.toLowerCase();
        return palabra.matches("[a-z]*");
    }
  
  
  
  
  /**
   * Metodo que guarda en un mismo string los nombres de todos los almacenes
   * @param grafo el parametro grafo define la estructura grafo desde la cual se accedera al nombre de los almacenes
   * @return string que contiene el nombre de todos los almacenes
   */
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
  
  
  
  /**
   * Metodo que crea una lista donde se encuentran todos los productos de todos los almacenes 
   * @param grafo el parametro grafo define la estructura grafo desde el cual se accedera al primer nodo del tipo almacen
   * @return lista de productos que contiene el nombre y la cantidad total del producto en todos los almacenes existentes
   */
  public ProductList mostrar_disponible(Grafo grafo) {
      
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
           
        
        return agregados;
  
  
  }
}
