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
public class Nodo <T> {
    T data; 
    Nodo<T> next; 

    Nodo (T d) { 
        this.data = d;
        this.next = null;
    } 
} 
