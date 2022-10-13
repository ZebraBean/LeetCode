#include <algorithm>
#include <iostream>
#include <map>
#include <string>
#include <vector>
#include <typeinfo>
#include <assert.h>
using namespace std;
struct Goods
{
	string _name;  // 名字
	double _price; // 价格
	int _evaluate; // 评价

	Goods(string str, string price, string evaluate)
	{
		cout << "first";
	}
	Goods(initializer_list<string> l) {
		cout << "second";
	}
};
int main() {
	// C/C++98
	int i = 0;
	double d1 = i;
	const double& d2 = i;

	// C++98
	string str1 = "11111";
	const string& str2 = "11111";

	// C++11
	//Goods g1 = { "苹果", 2.1, 5 };
	Goods g3 = { "苹果", "苹果", "苹果" };

	//const Goods& g2 = { "苹果", 2.1, 5 };

//int a = 0x01020304;
	bool b = 1.1;
	double a = 3.3;
	unsigned c = 4;
	cout << b;
	b = c;
	cout << b;
}