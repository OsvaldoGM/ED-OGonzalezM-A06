#include "List.h"
#include "Nodo.h"

list::list() {
	first = nullptr;
	last = nullptr;
	pointer = nullptr;
}

list::list(int d) {
	nodo* node = new nodo(d);
	first = node;
	last = node;
	pointer = nullptr;
}

bool list::isEmpty() {
	return first == nullptr;
}

void list::insertFirst(int d) {
	nodo* node = new nodo(d);
	if (isEmpty()) {//Si esta vacia se crea el nuevo nodo
		first = node;
		last = node;
		node->next = nullptr;
	}
	else {//Si no esta vacia, es decir, tiene elementos
		node->next = first;
		first = node;
	}
}

void list::insertLast(int d) {
	nodo* node = new nodo(d);
	if (isEmpty()) {//Si esta vacia se crea el nuevo nodo
		first = node;
		last = node;
		node->next = nullptr;
	}
	else {//Si no esta vacia, es decir, tiene elementos
		last->next = node;
		last = node;
	}
}

void list::deleteFirst() {
	if (!isEmpty()) {
		if (first->next == nullptr) {//Si la lista solo tiene un elemento
			first = nullptr;
			last = nullptr;
		}
		else {//Si la lista tiene mas elemntos
			first = first->next;
		}
	}
}

void list::deleteLast() {
	if (!isEmpty()) {
		if (first == last) {//Cuando los 2 apuntan al mismo elemento solo hay un elemento en la lista
			first = last = nullptr;
		}
		else {//Buscamos dentro de la lista
			pointer = first;
			while (pointer->next != last) {
				pointer = pointer->next;
			}
			last = pointer;
			last->next = pointer = nullptr;
		}
	}
}
