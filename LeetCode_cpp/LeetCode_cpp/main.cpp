#include <algorithm>
#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <typeinfo>
#include <assert.h>
using namespace std;

void test(int a[]) {
	for (int i = 0; i < sizeof(a) / sizeof(int); i++) {
		cout << a[i];
	}
}
int main() {
	int a = 0;
	map<int*, int> map;
	map[&a] = 1;
	cout << map[&a];
	return 0;
}