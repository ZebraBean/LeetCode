#include<string>
using namespace std;
class Solution {
public:
	string reverseWords(string s) {
		int left = 0;
		int right = s.size() - 1;
		while (left < right) {
			while (left < right && s[left] == ' ') {
				left++;
			}
			while (left < right && s[right] == ' ') {
				right--;
			}
			while (left < right && s[right] != ' ') {
				right--;
			}
			right++;
		}
	}
};