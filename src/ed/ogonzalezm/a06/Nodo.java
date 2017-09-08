/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ogonzalezm.a06;

/**
 *
 * @author HONORIO ZAIBACK
 */
public class Nodo {
    int cargo; 
    Nodo next; 

    void Node () { 
        cargo = 0; 
        next = null; 
    } 

    void Node (int cargo, Nodo next) { 
        this.cargo = cargo; 
        this.next = next; 
    } 
} 

