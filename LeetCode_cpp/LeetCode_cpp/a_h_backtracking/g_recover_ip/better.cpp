#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
private:
	vector<string> result;// 记录结果
	string path;
	// startIndex: 搜索的起始位置，pointNum:添加逗点的数量
	void backtracking(string& s, int startIndex, int pointNum) {
		if (pointNum == 3) { // 逗点数量为3时，分隔结束
			// 判断第四段子字符串是否合法，如果合法就放进result中
			if (isValid(s, startIndex, s.size() - 1)) {
				path += s.substr(startIndex, s.size() - startIndex);
				result.emplace_back(path);
			}
			return;
		}
		for (int i = startIndex; i < s.size(); i++) {
			if (isValid(s, startIndex, i)) { // 判断 [startIndex,i] 这个区间的子串是否合法
				string tmp = s.substr(startIndex, i - startIndex + 1);
				int prePos = path.size();
				path += tmp;
				path += '.';
				pointNum++;
				backtracking(s, i + 1, pointNum);
				pointNum--;                         // 回溯
				path.erase(prePos);         // 回溯删掉
			} else return; // 不合法，直接返回
		}
	}
	// 判断字符串s在左闭又闭区间[start, end]所组成的数字是否合法
	bool isValid(const string& s, int start, int end) {
		if (start > end) {
			return false;
		}
		if (s[start] == '0' && start != end) { // 0开头的数字不合法
			return false;
		}
		int num = 0;
		for (int i = start; i <= end; i++) {
			if (s[i] > '9' || s[i] < '0') { // 遇到非数字字符不合法
				return false;
			}
			num = num * 10 + (s[i] - '0');
			if (num > 255) { // 如果大于255了不合法
				return false;
			}
		}
		return true;
	}
public:
	vector<string> restoreIpAddresses(string s) {
		result.clear();
		if (s.size() < 4 || s.size() > 12) return result; // 算是剪枝了
		backtracking(s, 0, 0);
		return result;
	}
};