#pragma once
#include "NodoDL.h"
template <class T> class DLList {
public:
	NodoDL<T>* first;
	NodoDL<T>* last;
	NodoDL<T>* pointer;
	int length;

	DLList();
	DLList(T d);
	bool isEmpty();
	void insertFirst(T d);
	void insertLast(T d);
	void deleteFirst();
	void deleteLast();
	void deleteNodo(T d);
	void showListIncioFin();
	void showListFinIncio();
};
