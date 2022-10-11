#include<string>
using namespace std;
class Solution {
public:
	bool repeatedSubstringPattern(string s) {
		bool ans = false;
		for (int i = 0; i < s.size() / 2; i++) {
			int k = 0;
			bool isbreak = false;
			for (int j = i + 1; j < s.size(); j++) {
				if (s[k] == s[j]) {
					k++;
					if (k > i) {
						k = 0;
					}
				} else {
					isbreak = true;
					break;
				}
			}
			if ((!isbreak) && k == 0) {
				ans = true;
			}
		}
		return ans;
	}
};