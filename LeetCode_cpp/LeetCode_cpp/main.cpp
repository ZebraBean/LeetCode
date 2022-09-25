#include <algorithm>
#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <typeinfo>
#include <assert.h>
using namespace std;
void Func(int a = 10, int b = 20, int c = 30) {
	cout << "a = " << a << endl;
	cout << "b = " << b << endl;
	cout << "c = " << c << endl;
}
template<class T> T Add(const T& left, const T& right) {
	return left + right;
}
int main() {
	string s;
	s.resize(1000);
	cout << s.size() << endl << s.capacity();
	return 0;
}