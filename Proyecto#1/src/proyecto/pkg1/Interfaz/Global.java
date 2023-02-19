/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.Interfaz;

import proyecto.pkg1.EDD.Grafo;

/**
 *
 * @author Tomas
 */
public class Global {
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
