#include<vector>
#include<algorithm>
#include<string>
using namespace std;
class Solution {
public:
	string replaceSpace(string s) {
		for (int i = 0; i < s.size(); i++) {
			//if (isspace(s[i])) {
			if (s[i] == ' ') {
				s.replace(s.begin() + i, s.begin() + i + 1, "%20");
			}
		}
		return s;
	}
};