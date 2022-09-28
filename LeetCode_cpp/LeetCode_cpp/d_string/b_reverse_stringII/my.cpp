#include<vector>
#include<algorithm>
#include<string>
using namespace std;
class Solution {
public:
	void myReverse(string& s, int left, int right) {
		while (left < right) {
			swap(s[left], s[right]);
			left++;
			right--;
		}
	}
	string reverseStr(string s, int k) {
		int len = s.size();
		int i = 0;
		while (i < len) {
			if (i + k < len) {
				myReverse(s, i, i + k - 1);
			} else {
				myReverse(s, i, len - 1);
			}
			i += 2 * k;
		}
		return s;
	}
};