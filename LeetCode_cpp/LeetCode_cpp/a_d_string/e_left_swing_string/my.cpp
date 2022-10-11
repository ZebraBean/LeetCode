#include<string>
using namespace std;
class Solution {
public:
	string reverseLeftWords(string s, int n) {
		string temp = s.substr(0, n);
		int j = 0;
		for (int i = n; i < s.size(); i++) {
			s[j++] = s[i];
		}
		for (int i = 0; i < n; i++) {
			s[s.size() - n + i] = temp[i];
		}
		return s;
	}
};