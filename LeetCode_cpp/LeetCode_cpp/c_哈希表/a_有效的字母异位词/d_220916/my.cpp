#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
	vector<int> findAnagrams(string s, string p) {
		int sLen = s.length();
		int pLen = p.length();
		vector<int> ans;
		if (sLen < pLen) {
			return ans;
		}
		int hash[26] = { 0 };
		int hash_copy[26] = { 0 };
		for (auto c : p) {
			hash[c - 'a']++;
			hash_copy[c - 'a']++;
		}
		int begin = 0;
		int end = pLen - 1;
		while (end < sLen) {
			for (int i = begin; i <= end; i++) {
				hash[s[i] - 'a']--;
			}
			bool isOk = true;
			for (int i = 0; i < 26; i++) {
				if (hash[i] != 0) {
					isOk = false;
				}
			}
			if (isOk) {
				ans.emplace_back(begin);
			}
			for (int i = 0; i < 26; i++) {
				hash[i] = hash_copy[i];
			}
			end++;
			begin++;
		}
		return ans;
	}
};