/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import EDD.Grafo;

/**
 * Clase "global" que permite que la interfaz gráfica acceda al grafo de una forma más sencilla
 * @author: Kevin Li, Tomás Gil y Natalia Rivas
 */
public class Global {
    //Parámetros de la clase Global
    private static Grafo grafo = new Grafo();

    /**
     * @return the grafo
     */
    public static Grafo getGrafo() {
        return grafo;
    }

    /**
     * @param aGrafo the grafo to set
     */
    public static void setGrafo(Grafo aGrafo) {
        grafo = aGrafo;
    }
    
    
}
