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
		vector<int> hashWin(26, 0);//保存相差的数量
		for (int i = 0; i < pLen; i++) {
			hashWin[s[i] - 'a']++;
			hashWin[p[i] - 'a']--;
		}
		int differ = 0;
		for (auto count : hashWin) {
			if (count != 0) {
				differ++;
			}
		}
		int left = 0;
		int right = pLen - 1;
		while (right < sLen) {
			if (differ == 0) {
				ans.emplace_back(left);
			}
			if (hashWin[s[left] - 'a'] == 1) {//窗口中字母 s[i] 的数量与字符串 p 中的数量从不同变得相同
				differ--;
			} else if (hashWin[s[left] - 'a'] == 0) { //// 窗口中字母 s[i] 的数量与字符串 p 中的数量从相同变得不同
				differ++;
			}
			hashWin[s[left] - 'a']--;
			left++;
			right++;
			if (right >= sLen) {
				break;
			}
			if (hashWin[s[right] - 'a'] == -1) {//窗口中字母 s[i] 的数量与字符串 p 中的数量从不同变得相同
				differ--;
			} else if (hashWin[s[right] - 'a'] == 0) { //// 窗口中字母 s[i] 的数量与字符串 p 中的数量从相同变得不同
				differ++;
			}
			hashWin[s[right] - 'a']++;
		}
		return ans;
	}
};