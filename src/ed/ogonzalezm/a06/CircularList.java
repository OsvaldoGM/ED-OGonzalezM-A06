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
public class CircularList <T> {
    Nodo<T> pivote;
    Nodo<T> pointer;
    int length;
    
    CircularList(){
        pivote = pointer = null;
        length=0;
    }
    
    CircularList(T d){
        Nodo<T> node = new  Nodo<T>(d);
        pivote = node.next = node;
        length++;
    }
    
    boolean isEmpty(){
        return length==0;
    }
    
    void insert(T d){
        Nodo<T> node = new  Nodo<T>(d);
        if(isEmpty()){
            pivote = node.next = node;
        }else{
            node.next = pivote.next;
            pivote.next = node;
        }
        length++;
    }
    
    void deleteNodo(T d){
        if(!isEmpty()){
            pointer = pivote;
            for(int i=1; i<=length;i++){
                if(pointer.data == d){
                    pointer.next =pointer.next.next;
                }
                length--;
                pointer = null;
                i = length + 1;
            }
            pointer = pointer.next;
        }
    }
    
    void deleteList(){
        pivote = pointer = null;
    }
}
