#include <algorithm>
#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <typeinfo>
#include <assert.h>
using namespace std;

//typedef int* a;
class car {
public:
	virtual void drive() = 0 {
		cout << "haha";
	}
	int b;
};
class baoma : public car {
	void drive() {
	}
	int a;
};

int main() {
	//typedef char* a;
	string s;
	s += to_string(1);

	cout << s;
	//a aa;
	//cout << typeid(aa).name();
	//string a = "a";
	//char* a = new char[3];
	//char* b = a;
	//int* n;
	//cout << sizeof(a) << endl;
	//cout << sizeof(b) << endl;
	//cout << sizeof(n) << endl;
	return 0;
}