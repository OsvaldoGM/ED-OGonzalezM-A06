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
public class Dequeue <T> {
    NodoDL<T> front;
    NodoDL<T> rear;
    int size;
    
    Dequeue(){
        front = rear = null;
        size=0;
    }
    
    Dequeue(T d){
        NodoDL<T> node = new NodoDL<>(d);
        front = rear = node;
        size = 1;
    }
    
    boolean isEmpty(){
        return size==0;
    }
    
    void enqueueFront(T d){
        NodoDL<T> node = new NodoDL<>(d);
        if (isEmpty()) {
		front = rear = node;
	}else{
		node.next = front;
		front.back = node;
		front = node;
	}
	size++;
    }
    
    void enqueueRear(T d){
         NodoDL<T> node = new NodoDL<>(d);
	if (isEmpty()) {
		front = rear = node;
	} else { 
		rear.next = node;
		rear.back = rear;
		rear = node;
	}
	size++;
    }
    
    T dequeueFront(){
        if (!isEmpty()) {
		NodoDL<T> fd = front;
		if (size == 1) {
			clearDequeue();
		}else {
			front = front.next;
			front.back = null;
			fd.next = null;//No es necesario pero esta mas chodori
			size--;
		}
		return fd.data;
	}else{
		return null;
	}
    }
    
    T dequeueRear(){
        if (!isEmpty()) {
		NodoDL<T> rd = rear;
		if (size == 1) {
			clearDequeue();
		} else {
			rear = rear.back;
			rear.next = null;
			rd.back = null;//Tampoco se ocupa veda pero esta mejor si lo eliminamos por completo
			size--;
		}		
		return rd.data;
	}else{ 
		return null;
	}
    }
    
    T getFront(){
        return front.data;
    }
    
    T getRear(){
        return rear.data;
    }
    
    int getSize(){
        return size;
    }
    
    void clearDequeue(){
        front = rear = null;
        size = 0;
    }
    
    void showDequeue(){
        NodoDL<T> f=front;
        while (f!=null){
            System.out.print(f +" ->");
            f =f.next;
        }
        System.out.print("null");
    }
}
