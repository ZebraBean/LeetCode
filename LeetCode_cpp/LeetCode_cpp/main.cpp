#include <algorithm>
#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <typeinfo>
#include <assert.h>

using namespace std;
bool isHappy(int n) {
	vector<int> a;
	while (n != 1) {
		long long temp = 0;
		while (n > 0) {
			int r = n % 10;
			temp += r * r;
			n /= 10;
			cout << n << endl;
		}
		if (find(a.begin(), a.end(), temp) == a.end()) {//û�ҵ�
			a.emplace_back(temp);
			n = temp;
			cout << temp << endl;
		} else {
			return false;
		}
	}
	return 1;
}
void test(int a[]) {
	//���ַ����Ǿ��Դ���ģ������ڴ��ε�ʱ������ָ�봫�ݵģ���ʱ��a��ָ�룬���������飬��Χ�ǲ�ȷ���ġ�
	//��ΧforҲû������
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
	//int a = 0x01020304;
	//int ans[5] = { 0 };
	//B b1;
	//int c;
	//fun(0);
	isHappy(2);
	return 0;
}