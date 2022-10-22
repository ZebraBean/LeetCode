#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	vector<vector<string>> ans;
	vector<string> path;
	bool isAllOk = true;
	bool isOk(const string& s, int left, int right) {
		while (left < right) {
			if (s[left++] != s[right--]) {
				return false;
			}
		}
		return true;
	}
	void backdfs(string s, int startPos) {
		if (startPos >= s.size()) {
			ans.emplace_back(path);
			return;
		}
		for (int i = startPos; i < s.size(); i++) {
			//i决定切到哪个位置，遍历同层结点
			if (isOk(s, startPos, i)) {
				path.emplace_back(s.substr(startPos, i - startPos + 1));
				backdfs(s, i + 1); //递归纵向遍历，i+1,也就是参数startPos，表示剩余子串的起始位置
				path.pop_back();
			} else {
				continue;
			}
		}
	}
	vector<vector<string>> partition(string s) {
		backdfs(s, 0);
		return ans;
	}
};