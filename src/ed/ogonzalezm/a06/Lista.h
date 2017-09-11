#pragma once
#include "Nodo.h"
class list {
public:
	nodo* first;
	nodo* last;
	nodo* pointer;

	list();
	list(int);
	bool isEmpty();
	void insertFirst(int n);
	void insertLast(int n);
	void deleteFirst();
	void deleteLast();
};
