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
public class Stack <T>{
    private Nodo<T> top;
    private int size;
    
    Stack(){
        top=null;
        size=0;
    }
    
    Stack(T d){
        Nodo<T> node = new Nodo<T>(d);
        top = node;
        size=1;
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public void push (T d){
        Nodo<T> node = new Nodo<T>(d);
        node.next = top;
        top = node;
        size++;
    }
    
    public T pop(){
        T d;
        if(!isEmpty()){
            d = top.data;
            top =  top.next;
            size--;
        } else {
            d = null;
        }
        return d;
    }
    
    public T getTop(){
        if(!isEmpty()){
            return top.data;
        } else{
            return null;
        }
    }
    
    public void showStack(){
        Nodo<T> t = top;
        while(t!=null){
            System.out.println(t);
            t = t.next;
        }
        System.out.println("NULL");
    }
}
