#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
	vector<vector<string>> groupAnagrams(vector<string>& strs) {
		vector<vector<string>> ans;
		for (int i = 0; i < strs.size(); i++) {
			string s = strs[i];
			bool flag = false;//默认不能找到匹配的位置
			for (int j = 0; j < ans.size(); j++) {
				string t = ans[j][0];
				//比较通过，插入，break
				int hash[26] = { 0 };
				for (int k = 0; k < s.length(); k++) {
					hash[s[k] - 'a']++;
				}
				for (int k = 0; k < t.length(); k++) {
					hash[t[k] - 'a']--;
				}
				bool isEqual = true;
				for (int k = 0; k < 26; k++) {
					if (hash[k] != 0) {
						isEqual = false;
						break;
					}
				}
				if (isEqual) {
					flag = true;
					ans[j].push_back(s);
				}
			}
			//比较不通过，新插入一个vector
			if (!flag) {
				vector<string> temp;
				temp.push_back(s);
				ans.push_back(temp);
			}
		}
		return ans;
	}
};