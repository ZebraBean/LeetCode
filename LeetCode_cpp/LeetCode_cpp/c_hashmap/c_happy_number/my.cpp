#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
	bool isHappy(int n) {
		vector<int> a;
		while (n != 1) {
			long long temp = 0;
			while (n > 0) {
				int r = n % 10;
				temp += r * r;
				n /= 10;
			}
			if (find(a.begin(), a.end(), temp) == a.end()) {//√ª’“µΩ
				a.emplace_back(temp);
				n = temp;
			} else {
				return false;
			}
		}
		return 1;
	}
};