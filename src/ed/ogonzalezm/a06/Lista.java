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
public class Lista <T> {
    Nodo first;
    Nodo last;
    Nodo pointer;
     
    Lista(){
        first = null;
        last = null;
        pointer =null;
    }
     
    Lista(T data){
       Nodo node = new Nodo(data);
       first = node;
       last = node;
       node.next = null;
    }
    
    public boolean isEmpty(){
        return first==null;
    }
    
    public void insertFirst(T n){
        Nodo node = new Nodo(n);
        if(isEmpty()){//Si esta vacia se crea el nuevo nodo
            first = node;
            last = node;
            node.next = null;
        }else{//Si no esta vacia, es decir, tiene elementos
            node.next = first;
            first = node;
        }
    }
    
    public void insertLast(T n){
        Nodo node = new Nodo(n);
        if(isEmpty()){//Si esta vacia se crea el nuevo nodo
            first = node;
            last = node;
            node.next = null;
        }else{//Si no esta vacia, es decir, tiene elementos
            last.next = node;
            last = node;
        }
    }
    
    public void deleteFirst(){
        if(!isEmpty()){
            if(first.next ==null){//Si la lista solo tiene un elemento
                first=null;
                last=null;
            }else{//Si la lista tiene mas elemntos
                first = first.next;
            }
        }
        System.out.println("Esta vacio el nodo krnalito :'v");
    }
    
    public void deleteLast(){
        if(!isEmpty()){
            if(first == last){//Cuando los 2 apuntan al mismo elemento solo hay un elemento en la lista
                first = last = null;
            }else{//Buscamos dentro de la lista
                pointer=first;
                while(pointer.next!=last){
                    pointer = pointer.next;
                }
                last = pointer;
                last.next = pointer = null;
            }
        }
    }
    
    public boolean deleteNode(T n){
        Nodo p = FetchBack(n);
        if(p!=null){
            if(p.data == n){
                deleteFirst();
                return true;
            }else{
                p.next = p.next.next;
                return true;
            }
        } return false;
    }
    
    public Nodo FetchBack(T n){
        pointer = first;
        if(!isEmpty()){
            if(first==last){//Si hay solo un elemento
                if(first.data==n){//Es el elemento que busco
                    return first;
                }else{
                    return null;
                }
            }else{
                if(first.data==n){
                    return first;
                }else{
                    pointer = first;
                    while(pointer.next!=last){
                        if(pointer.next.data == n){
                            return pointer;
                        }pointer = pointer.next;
                    }
                }
            }
            
        }return null;
    }
    
    public Nodo Fetch(T n){
        if(!isEmpty()){
            if(first.data == n){
                return first;
            }else{
                Nodo p = FetchBack(n);
                if(p!=null){ 
                    if(p.data!=n){ 
                        return p.next;
                    }
                }
            }
        }return null;
    }
}
