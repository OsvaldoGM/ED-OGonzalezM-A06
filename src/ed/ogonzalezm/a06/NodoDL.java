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
public class NodoDL <T>{
    T data;
    NodoDL<T> next;
    NodoDL<T> back;
    
    NodoDL (T d) { 
        this.data = d;
        this.next = this.back = null;
    } 
}
