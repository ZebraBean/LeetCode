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
int main() {
	int* a = new int[1024 * 1024];
	a[0] = 1;
	cout << a[0] << endl << a[1];

	return 0;
}