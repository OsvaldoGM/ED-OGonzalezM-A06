#pragma once
#include <stdio.h>
#include "Nodo.h"

template <class T> class CircularList {
public:
	nodo<T> *pivote;
	nodo<T> *pointer;
	int length;

	CircularList();
	CircularList(T d);
	CircularList();

	bool isEmpty();
	void insert(T d);
	void deleteNodo(T d);
	void deleteList();
	void showList();
	void showListByAdress();
};
