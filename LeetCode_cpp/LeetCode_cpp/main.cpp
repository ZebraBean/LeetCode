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
struct a {
public:
	int b;
};
int cmp(int left, int right) {
	return left < right;
}
struct myCmp {
	bool operator()(int left, int right) {
		return left < right;
	}
};
int main() {
	int a[10] = { 9,8,7,6,5,4,3,2,1,0 };
	sort(a, a + 10, cmp);
	for (auto num : a) {
		cout << num << " ";
	}
}