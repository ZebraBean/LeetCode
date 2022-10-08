#include<vector>
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
				while (s[i] != ' ' && i < s.size()) {
					s[slow++] = s[i++];
				}
			}
		}
		s.resize(slow);
	}
	string reverseWords(string s) {
		removeSpace(s);
		reverse(s.begin(), s.end());
		int begin = 0;
		for (int i = 0; i < s.size(); i++) {
			if (s[i] == ' ') {
				reverse(s.begin() + begin, s.begin() + i);
				begin = i + 1;
			}
		}
		reverse(s.begin() + begin, s.end());
		return s;
	}
};