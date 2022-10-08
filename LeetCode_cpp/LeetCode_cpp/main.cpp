#include <algorithm>
#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <typeinfo>
#include <assert.h>
using namespace std;
class B {
public:
	B() : b(4) {
	}
	void funB() {
		//cout << typeid(this).name() << endl;
	}
private:
	int b;
};

class A {
public:
	A() :b(B()) {
	}
	void func() const {
		//b.funB();

		cout << typeid(b).name();
	}

private:
	B b;
};

int main() {
	A a;
	a.func();
}