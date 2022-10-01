#include <algorithm>
#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <typeinfo>
#include <assert.h>
using namespace std;
int cmp(int a, int b) {
	return a > b;
}
string func() {
	return "av,";
}
void test(string& s) {
}
int main() {
	//string a = "a";
	char* a = new char[3];
	char* b = a;
	int* n;
	cout << sizeof(a) << endl;
	cout << sizeof(b) << endl;
	cout << sizeof(n) << endl;
	return 0;
}