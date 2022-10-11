#include<vector>
#include<algorithm>
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
		int oldSize = s.size();
		int newSize = oldSize + spaceCount * 2;
		s.resize(newSize);
		int j = newSize - 1;
		for (int i = oldSize - 1; i >= 0; i--) {
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