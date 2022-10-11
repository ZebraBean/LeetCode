#include<iostream>
using namespace std;
class Solution {
public:
	bool isAnagram(string s, string t) {
		int hash[256] = { 0 };
		for (int i = 0; i < s.length(); i++) {
			hash[s[i]]++;
		}
		for (int i = 0; i < t.length(); i++) {
			hash[t[i]]--;
		}
		bool ans = 1;
		for (int i = 0; i < 256; i++) {
			if (hash[i] != 0) {
				ans = 0;
			}
		}
		return ans;
	}
};