#include<string>
using namespace std;
class Solution {
public:
	int strStr(string haystack, string needle) {
		int sLen = haystack.size();
		int pLen = needle.size();
		int ans = -1;
		for (int i = 0; i < sLen - pLen + 1; i++) {
			if (haystack[i] == needle[0]) {
				int pos = i;
				int j = 0;
				while (j < pLen && haystack[i] == needle[j]) {
					i++;
					j++;
				}
				if (j == pLen) {
					ans = pos;
					break;
				} else {
					i = pos;
				}
			}
		}
		return ans;
	}
};