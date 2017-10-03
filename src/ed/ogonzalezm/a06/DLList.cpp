#include "DLList.h"
#include "NodoDL.h"

template <typename T> class DLList {
	NodoDL<T>* first;
	NodoDL<T>* last;
	NodoDL<T>* pointer;
	int length;

	DLList() {
		first = NULL;
		last = NULL;
		pointer = NULL;
		length = 0;
	}

	DLList(T d) {
		NodoDL<T> nodo = new NodoDL<T>(d);
		first = nodo;
		last = nodo;
		nodo.next = NULL;
		nodo.back = NULL;
		length++;
	}

	bool isEmpty() {
		return length == 0;
	}

	//Insertar al incio 
	//Escenarios: Lista vacia, Lista con elementos
	void insertFirst(T d) {
		NodoDL<T> nodo = new NodoDL<T>(d);
		if (isEmpty()) {//Si la lista ya cuenta con elementos
			*first = nodo;
			*last = nodo;
		}else{
			//El siguiente del nuevo nodo apunta al nodo que apunta first
			node.next* = *first;
			//El nodo que apunta first en su apuntado back apunta al nuevo nodo
			*first->back = nodo;
			// El apuntador first apunta al nuevo nodo
			*first = nodo;
		}length++;
	}

	void insertLast(T d) {
		NodoDL<T> nodo = new NodoDL<T>(d)p;
		if (isEmpty()) {
			*first = nodo;
			*last = nodo;
		} else {
			nodo.back* = *last;
			*last->next = nodo;
			*last = nodo;
		}length++;
	}

	void deleteFirst() {
		if (!isEmpty()) {
			if (length = 1) {
				*first = last* = NULL;
			} else {
				*first = *first->next;
				*first->back = NULL;
			}
		}length--;
	}

	void deleteLast() {
		if (!isEmpty()) {
			if (length = 1) {
				*first = last* = NULL;
			} else {
				*pointer = *first;
				while (*pointer.next != *last) {
					*pointer = pointer->next;
				}
				last* = pointer*;
				last*->next = pointer* = NULL;
			}
		}length--;
	}

	void deleteNodo(T n) {
		*pointer = *first;
		if (!isEmpty()) {
			if (length == 1) {
				if (*first.data == n) {
					*first = *last = NULL;
				}
			} else {
				if (first*.data == n) {
					first* = first*->next;
					first* -> back = NULL;
				}else if (last*.data == n) {
					last* = last*->back;
					last*->next = NULL;
				}else{
					pointer* = first*;
					while (pointer*->next != last*) {
						if (*pointer->next->data == n) {
							*pointer->next = *pointer->next->next;
							*pointer->next->next->back = pointer*
						}
						*pointer = *pointer->next;
					}
				}
			}
		}length--;
	}

	void showListIncioFin() {
		if (!isEmpty()) {
			pointer = first;
			std::cout << "First->";
			while (pointer != nullptr) {
				std::cout << "[" << pointer->data << "]";
				pointer = pointer->next;
				if (pointer != nullptr) std::cout << " -> ";
			}
			std::cout << " <- Last" << std::endl;
		}
	}

	void showListFinIncio() {
		if (!isEmpty()) {
			pointer = last;
			std::cout << "Last->";
			while (pointer != nullptr) {
				std::cout << "[" << pointer->data << "]";
				pointer = pointer->prev;
				if (pointer != nullptr) std::cout << " -> ";
			}
			std::cout << " <- First" << std::endl;
		}
	}
};	
