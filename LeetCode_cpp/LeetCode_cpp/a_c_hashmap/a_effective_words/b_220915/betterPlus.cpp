#include<iostream>
#include<vector>
#include<unordered_map>
#include<algorithm>
using namespace std;
class Solution {
public:
	vector<vector<string>> groupAnagrams(vector<string>& strs) {
		vector<vector<string>> ans;
		unordered_map<string, vector<string>> hashMap;
		for (auto str : strs) {
			string hash = string(26, 0);
			for (auto c : str) {
				hash[c - 'a']++;
			}
			hashMap[hash].emplace_back(str);
		}
		for (auto vec : hashMap) {
			ans.emplace_back(vec.second);
		}
		return ans;
	}
};