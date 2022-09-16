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
		vector<int> hashP(26, 0);
		vector<int> hashWin(26, 0);
		for (auto c : p) {
			hashP[c - 'a']++;
		}
		for (int i = 0; i < pLen; i++) {
			hashWin[s[i] - 'a']++;
		}
		int left = 0;
		int right = pLen - 1;
		while (right < sLen) {
			if (hashP == hashWin) {
				ans.emplace_back(left);
			}
			hashWin[s[left] - 'a']--;
			left++;
			right++;
			if (right >= sLen) {
				break;
			}
			hashWin[s[right] - 'a']++;
		}
		return ans;
	}
};