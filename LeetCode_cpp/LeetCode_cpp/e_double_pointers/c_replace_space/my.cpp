#include<vector>
#include<string>
using namespace std;
class Solution {
public:
	string replaceSpace(string s) {
		int spaceCount = 0;
		for (auto c : s) {
			if (c == ' ') {
				spaceCount++;
			}
		}
		int oldsize = s.size();
		s.resize(oldsize + spaceCount * 2);
		int j = s.size() - 1;
		for (int i = oldsize - 1; i >= 0; i--) {
			if (s[i] == ' ') {
				s[j] = '0';
				s[j - 1] = '2';
				s[j - 2] = '%';
				j -= 2;
			} else {
				s[j] = s[i];
			}
			j--;
		}
		return s;
	}
};