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
int main() {
	vector<int> a;
	a.push_back(1);
	a.push_back(2);
	a.push_back(9);
	a.push_back(4);
	a.push_back(5);
	a.push_back(6);
	a.push_back(3);

	for (auto num : a) {
		cout << num << " " << endl;
	}
	cout << "ok";
	sort(a.begin(), a.end(), cmp);
	for (auto num : a) {
		cout << num << " " << endl;
	}

	return 0;
}