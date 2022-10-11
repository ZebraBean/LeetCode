#include<vector>
#include<algorithm>
#include<string>
using namespace std;
class Solution {
public:
	void removeSpace(string& s) {
		int slow = 0;
		for (int i = 0; i < s.size(); i++) {
			if (s[i] != ' ') {
				if (slow != 0) {
					s[slow++] = ' ';
				}
				while (i < s.size() && s[i] != ' ') {
					s[slow++] = s[i++];
				}
			}
		}
		s.resize(slow);
	}
	string reverseWords(string s) {
		removeSpace(s);
		reverse(s.begin(), s.end());
		int start = 0;
		for (int i = 0; i < s.size(); i++) {
			if (s[i] == ' ') {
				reverse(s.begin() + start, s.begin() + i);
				start = i + 1;
			}
		}
		reverse(s.begin() + start, s.end());
		return s;
	}
};