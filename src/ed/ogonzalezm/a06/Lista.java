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
    int length;
     
    Lista(){
        first = null;
        last = null;
        pointer =null;
        length = 0;
    }
     
    Lista(T data){
       Nodo node = new Nodo(data);
       first = node;
       last = node;
       node.next = null;
       length++;
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
        length++;
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
        length++;
    }
    
    public void deleteFirst(){
        if(!isEmpty()){
            if(first.next ==null){//Si la lista solo tiene un elemento
                first=null;
                last=null;
            }else{//Si la lista tiene mas elemntos
                first = first.next;
            }length--;
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
        length--;
    }
    
    public boolean deleteNode(T n){
        Nodo p = FetchBack(n);
        if(p!=null){
            if(p.data == n){
                deleteFirst();
                length--;
            /*}else if(last.data==n){
                deleteLast();
                length--;*/
            }else{
                p.next = p.next.next;
                length--;
            }
            return true;
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
                /*}else if(last.data ==  n){
                    return last;*/
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
    
    public void showList(){
        pointer = first;
        System.out.print("first --> ");
        for (int i=0; i<length; i++){
            System.out.print("[ " +pointer.data.toString() +" ]");
            pointer = pointer.next;
        }
        System.out.println("<-- last" );
    }
}
