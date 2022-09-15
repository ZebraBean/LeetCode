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
	int a = 0x01020304;
	int ans[5] = { 0 };
	for (auto& i : ans) {
		i = 1;
	}
	for (auto i : ans) {
		cout << i << endl;
	}
	return 0;
}