#include "NodoDL.h"
#include <string>

template <typename T> class NodoDL {
public:
	T data;
	NodoDL* next;
	NodoDL* back;

	NodoDL(T d) {
		data = d;
		next = nullptr;
		back = nullptr;
	}
};
