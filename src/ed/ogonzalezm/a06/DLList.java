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
public class DLList <T>{
    NodoDL<T> first;
    NodoDL<T> last;
    NodoDL<T> pointer;
    int length;
    
    DLList(){
        first = last = pointer = null;
        length = 0;
    }
    
    DLList(T d){
        NodoDL<T> nodo = new NodoDL(d);
        first = last = nodo;
        nodo.next = nodo.back = null;
        length++;
    }
    
    boolean isEmpty(){
        return length==0;
    }
    
    void insertFirst(T d){
        NodoDL<T> nodo = new NodoDL(d);
        if(isEmpty()){
            first = last = nodo;
        }else{
            nodo.next = first;
            first.back = nodo;
            first = nodo;
        }
        length++;
    }
    
    void insertLast(T d){
        NodoDL<T> nodo = new NodoDL(d);
        if(isEmpty()){
            first = last = nodo;
        }else{
            nodo.back = last;
            last.next = nodo;
            last = nodo;
        }
        length--;
    }
    
    void deleteFirst(T d){
        if(!isEmpty()){
            if(length==1){
                first = last = null;
            }else{
                first = first.next;
                first.back = null;
            }
        }
        length--;
    }
    
    void deleteLast(){
        if(!isEmpty()){
            if(length==1){
                first = last = null;
            }else{
                pointer = first;
                while(pointer.next != last){
                    pointer = pointer.next;
                }
                last = pointer;
                last.next = pointer = null;
            }
            length--;
        }
    }
    
    void deleteNodo(T d){
        pointer = first;
        if(!isEmpty()){
            if(length==1){
                if(first.data == d){
                    first = last = null;
                }
            }else{
                if(first.data == d){
                    first = first.next;
                    first.back = null;
                }else if(last.data == d){
                    last = last.back;
                    last.next = null;
                }else{
                    pointer = first;
                    while(pointer.next != last){
                        if(pointer.next.data == d){
                            pointer.next = pointer.next.next;
                            pointer.next.next.back = pointer;
                        }
                        pointer = pointer.next;
                    }
                }
            }
            length--;
        }
    }
}
