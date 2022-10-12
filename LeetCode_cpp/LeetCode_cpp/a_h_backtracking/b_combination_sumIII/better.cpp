#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;
class Solution {
public:
	vector<vector<int>> ans;
	vector<int> path;
	void backtracking(int n, int k, int nowSum, int startNum) {
		if (nowSum == n && k == path.size()) {
			ans.push_back(path);
			return;
		} else if (nowSum > n) {
			return;
		} else if (k < path.size()) {
			return;
		}
		for (int i = startNum; i <= 9; i++) {
			if (path.size() + n - i + 1 < k) {
				//如果当前剩余的数全部放入path，加起来都达不到k的话
				break;
			}
			path.push_back(i);
			backtracking(n, k, nowSum + i, i + 1);
			path.pop_back();
		}
	}
	vector<vector<int>> combinationSum3(int k, int n) {
		backtracking(n, k, 0, 1);
		return ans;
	}
};