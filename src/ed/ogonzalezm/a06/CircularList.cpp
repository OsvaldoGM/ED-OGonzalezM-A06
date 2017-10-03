#include "CircularList.h"

template <typename T>
CircularList<T>::CircularList() {
	pivote = pointer = NULL;
	length = 0;
}

template <typename T>
CircularList<T>::CircularList(T d) {
	nodo<T> *node = new nodo<T>(d);
	pivote = node->next = node;
	length++;
}

template <typename T>
CircularList<T>::~CircularList(){}

template <typename T>
bool CircularList<T>::isEmpty() {
	return length == 0;
}

template <typename T> 
void CircularList<T>::insert(T d) {
	nodo<T> node* = new nodo<T>(d);
	if (isEmpty()) {
		pivote = node->next = node;
	}else{ 
		node->next = pivote->next;
		pivote->next = node;
	}
	length++;
}

template <typename T>
void CircularList<T>::deleteNodo(T d){
	if (!isEmpty()) {
		pointer = pivote;
		for (int i = 1; i <= length; i++) {
			if (pointer->data == d) {
				pointer -> next = pointer->next->next;
				if (pivote->data == d) {
					pivote = pointer;
				}
				length--;
				pointer = NULL;
				i = length + 1;
			}
			pointer = pointer->next;
		}
	}
}

template <typename T>
void CircularList<T>::deleteList(){
	pivote = pointer = NULL;
}

template <typename T>
void CircularList<T>::showList() {
	std::cout()
}
