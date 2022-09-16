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
		vector<int> hashWin(26, 0);//������������
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
			if (hashWin[s[left] - 'a'] == 1) {//��������ĸ s[i] ���������ַ��� p �е������Ӳ�ͬ�����ͬ
				differ--;
			} else if (hashWin[s[left] - 'a'] == 0) { //// ��������ĸ s[i] ���������ַ��� p �е���������ͬ��ò�ͬ
				differ++;
			}
			hashWin[s[left] - 'a']--;
			left++;
			right++;
			if (right >= sLen) {
				break;
			}
			if (hashWin[s[right] - 'a'] == -1) {//��������ĸ s[i] ���������ַ��� p �е������Ӳ�ͬ�����ͬ
				differ--;
			} else if (hashWin[s[right] - 'a'] == 0) { //// ��������ĸ s[i] ���������ַ��� p �е���������ͬ��ò�ͬ
				differ++;
			}
			hashWin[s[right] - 'a']++;
		}
		return ans;
	}
};