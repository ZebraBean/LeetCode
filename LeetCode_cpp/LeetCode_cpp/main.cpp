#include <algorithm>
#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <typeinfo>
#include <assert.h>

using namespace std;

void test(int a[]) {
	//这种方法是绝对错误的，数组在传参的时候是用指针传递的，此时的a是指针，而不是数组，范围是不确定的。
	//范围for也没法遍历
	for (int i = 0; i < sizeof(a) / sizeof(int); i++) {
		cout << a[i];
	}
}
void fun(int* a) {
	cout << "int*";
}
void fun(int a) {
	cout << "int";
}

class A {
public:
	A(int a = 10) {
		this->a = a;
	}
	void print() {
		cout << "aaaaaaa";
	}
private:
	int a;
};
class B {
public:
	B() {
		val = 15;
	}
private:
	int val;
	A a1;
	A a2;;
};
int main() {
	int a = 0x01020304;
	int ans[5] = { 0 };
	B b1;
	int c;
	fun(0);
	return 0;
}