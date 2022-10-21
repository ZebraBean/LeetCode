#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
#include<unordered_map>
using namespace std;
class Solution {
public:
	vector<string> ans;
	string path;
	unordered_map<char, string> hash = { {'2',"abc"},{'3',"def"},{'4',"ghi"},{'5',"jkl"},
	{'6',"mno"},{'7',"pqrs"},{'8',"tuv"},{'9',"wxyz"} };

	void backdfs(int digitsPos, string digits) {
		if (digitsPos == digits.size()) {
			ans.emplace_back(path);
			return;
		}
		string now = hash[digits[digitsPos]];
		for (int i = 0; i < now.size(); i++) {
			path.push_back(now[i]);
			backdfs(digitsPos + 1, digits);
			path.pop_back();
		}
	}
	vector<string> letterCombinations(string digits) {
		if (digits.size() == 0) {
			return ans;
		}
		backdfs(0, digits);
		return ans;
	}
};