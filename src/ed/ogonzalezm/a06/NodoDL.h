#pragma once
template <typename T> class NodoDL {
public:
	T data;
	NodoDL* next;
	NodoDL* back;

	NodoDL(T d);
};
