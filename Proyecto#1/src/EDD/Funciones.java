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
    
}
