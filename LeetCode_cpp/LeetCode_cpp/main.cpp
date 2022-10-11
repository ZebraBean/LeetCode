#include <algorithm>
#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <typeinfo>
#include <assert.h>
using namespace std;

int main() {
	//int a = 0x01020304;
	bool b = 1.1;
	double a = 3.3;
	unsigned c = 4;
	cout << b;
	b = c;
	cout << b;
}